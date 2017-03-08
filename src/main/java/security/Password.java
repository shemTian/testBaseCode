package security;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {
	  private static MessageDigest digest = null;
	  public static void main(String[] args) throws IOException {
		  try {
			digest = MessageDigest.getInstance("MD5");
			digest.update("1".getBytes());
			byte[] bytes = digest.digest();
			StringBuffer buf = new StringBuffer(bytes.length * 2);
		    for (int i = 0; i < bytes.length; i++)
		    {
		      if ((bytes[i] & 0xFF) < 16)
		        buf.append("0");
		      buf.append(Long.toString(bytes[i] & 0xFF, 16));
		    }
			System.out.println(buf.toString());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
