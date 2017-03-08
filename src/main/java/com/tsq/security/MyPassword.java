package com.tsq.security;

import java.security.MessageDigest;
import java.util.Random;

public class MyPassword {

	private String website;// 百度，淘宝，支付宝，QQ,15618977071微信(3SDly=k~),有利网(6v(@+7In)

	MyPassword(String website) {
		this.website = website;
	}

	public static void main(String[] args) throws Exception {
		MyPassword pwdBuilder = new MyPassword("15618977071百度");
		String password = pwdBuilder.getRealPassword(4);
		String password2 = pwdBuilder.getNumFirstPassword(4);
		System.out.println(password);
		System.out.println(password2);
	}

	public String getMD5() throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] result = md5.digest(website.getBytes());
		String origMD5 = byteArray2HexStr(result);
		return origMD5;
	}

	/**
	 * 处理字节数组得到MD5密码的方法
	 */
	private String byteArray2HexStr(byte[] bs) {
		StringBuffer sb = new StringBuffer();
		for (byte b : bs) {
			sb.append(byte2HexStr(b));
		}
		return sb.toString();
	}

	/**
	 * 字节标准移位转十六进制方法
	 */
	private static String byte2HexStr(byte b) {
		String hexStr = null;
		int n = b;
		if (n < 0) {
			// 若需要自定义加密,请修改这个移位算法即可
			n = b & 0x37 + 128;
		}
		hexStr = Integer.toHexString(n / 16) + Integer.toHexString(n % 16);
		return hexStr.toUpperCase();
	}

	private String getNumFirstPassword(int Digit) throws Exception {
		char[] tempPwd = getRealPassword(Digit).toCharArray();
		if (!isNumber(tempPwd[0])) {
			for (int i = 1; i < tempPwd.length; i++) {
				char charStr = tempPwd[0];
				if (isNumber(tempPwd[i])) {
					tempPwd[0] = tempPwd[i];
					tempPwd[i] = charStr;
					return new String(tempPwd);
				}
			}
			tempPwd[0] = (String.valueOf(new Random().nextInt(9))).charAt(0);
		}
		return new String(tempPwd);
	}

	private boolean isNumber(char charStr) {
		if (Numbers.checkIn(charStr)) {
			return true;
		}
		return false;
	}

	private String getRealPassword(int Digit) throws Exception {
		String MD5String = getMD5();
		StringBuilder sb = new StringBuilder();
		int letterExist = 0;
		int numberExist = 0;
		int symbolExist = 0;
		int[] intNumS = new int[32 / Digit];
		int index = 0;
		for (int i = 0; i < intNumS.length; i++) {
			intNumS[i] = Integer.parseInt(
					MD5String.substring(index, index + Digit), 16);
			int asciiCode = getRangeInt(intNumS[i]);
			if (Letters.checkIn(asciiCode)) {
				sb.append(Letters.getCharStr(asciiCode));
				letterExist++;
			}
			if (Numbers.checkIn(asciiCode)) {
				sb.append(Numbers.getCharStr(asciiCode));
				numberExist++;
			}
			if (Symbols.checkIn(asciiCode)) {
				sb.append(Symbols.getCharStr(asciiCode));
				symbolExist++;
			}
			index = index + Digit;
		}
		if (letterExist > 0 && numberExist > 0 && symbolExist > 0) {
			System.out.println("success!");
		} else {
			//TODO 不包含某种类字符
			
		}
		return sb.toString();
	}

	private String getNone(int letterExist,int numberExist,int symbolExist){
		if(letterExist==0) 
			return "letter";
		else if(numberExist==0) 
			return "number";
		else
			return "symbol";
	}
	private String getMax(int letterExist,int numberExist,int symbolExist){
		if(letterExist>=numberExist&&numberExist>=symbolExist)
			return "letter";
		else if(numberExist>=letterExist&&letterExist>=symbolExist)
			return "number";
		else
			return "symbol";
	}
	// 被除数
	private int getRangeInt(int dividend) {
		while (dividend > 126) {
			dividend = dividend / 126 + dividend % 126;
		}
		if (dividend < 33) {
			dividend = dividend + 33;
		}
		return dividend;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
