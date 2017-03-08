package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {

	public static byte[] readFile(String fileName)  {
			byte[] readByte =new byte[1024];
			File read = new File(fileName);
			try{
				FileInputStream reader = new FileInputStream(read);
				reader.read(readByte);
				
			}catch(Exception e1){
				System.out.println(e1);
			}
			return readByte;
		} 
	public static void writeFile(String fileName,byte[] data) throws IOException{
		FileOutputStream write = new FileOutputStream(fileName);
		write.write(data);
	}
}
