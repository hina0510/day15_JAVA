package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass04 {
public static void main(String[] args) throws Exception {
	File path = new File("D:\\코딩\\0_국비 핀테크\\test\\test.txt");
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	for(char ch ='0';ch<='9';ch++) {
		Thread.sleep(1);
		//fos.write(ch);
		bos.write(ch);
	}
	bos.flush();
	bos.write('A');
	bos.flush();
	bos.write('B');
	bos.close();
	bos.write('C');
}
}
