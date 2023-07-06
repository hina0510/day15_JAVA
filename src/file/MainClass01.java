package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass01 {
public static void main(String[] args) throws Exception {
	/*
		file Input Out
		파일에 특정 데이터를 저장하고 불러오는 것
		영구적으로 데이터를 사용할 수 있다
	 */
	File path = new File("D:\\코딩\\0_국비 핀테크\\test\\test.txt");
	//File : 특정 경로를 설정하는 역할
	//FileOutputStream : 해당 파일과 연결을 시켜주고, 해당 파일이 존재하지 않으면 새롭게 만들어준다
	//만약 해당하는 파일이 존재하면 기존 파일은 삭제하고 새롭게 만든다
	FileOutputStream fos = new FileOutputStream(path);
	fos.write(97);
	fos.write('A');
	fos.write("test".getBytes());
	
	
}
}
