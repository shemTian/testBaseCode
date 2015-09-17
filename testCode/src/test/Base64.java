package test;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	public static String entryBase64(byte[] data){
		return (new BASE64Encoder()).encode(data);
	}
	public static byte[] detryBase64 (String data) throws IOException{
		return (new BASE64Decoder()).decodeBuffer(data);
	}
}
