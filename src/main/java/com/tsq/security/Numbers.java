package com.tsq.security;
/**
 * 数字
 * @author tsq
 *
 */
public enum Numbers {
	
	number_0(48,'0'),
	number_1(49,'1'),
	number_2(50,'2'),
	number_3(51,'3'),
	number_4(52,'4'),
	number_5(53,'5'),
	number_6(54,'6'),
	number_7(55,'7'),
	number_8(56,'8'),
	number_9(57,'9');
	
	private int asciiCode;
	private char charStr;
	
	Numbers(int asciiCode,char charStr){
		this.asciiCode = asciiCode;
		this.charStr = charStr;
	}
	public int getAsciiCode() {
		return asciiCode;
	}
	/**
	 * 根据ascii码值返回字符
	 * @param index
	 * @return ascii值在此枚举中,返回对应值;否则返回 0 
	 * @author tsq
	 */
	public static char getCharStr(int index) {
		for(Numbers number : Numbers.values()){
            if(index==number.asciiCode){
            	return number.charStr;
            }
        }
		return 0;
	}

	/**
	 * 判断传入的值 是否在此枚举中
	 * @param equalIndex
	 * @return 存在返回true,不存在返回false
	 * @author tsq
	 */
	public static boolean checkIn(int equalIndex){
		for(Numbers number : Numbers.values()){
            if(equalIndex==number.asciiCode){
            	return true;
            }
        }
		return false;
	}
}
