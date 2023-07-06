package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String path = "D:\\코딩\\0_국비 핀테크\\test\\";
		//File path = new File("D:\\코딩\\0_국비 핀테크\\test");
		//path.mkdir();//파일을 만듬
		//path.delete();//파일 삭제
		//String[] list = path.list();
		//System.out.println(list[0]);//파일 속 목록
		//System.out.println(path.exists());//파일 존재 여부 확인
		System.out.print("파일명 입력 : ");
		String name = input.next();
		path +=name+".txt";
		
		File filepath = new File(path);
		if(filepath.exists()) {
			System.out.println("파일이 존재합니다. 다시...");
		}else {
			FileOutputStream fos = new FileOutputStream(path);
			System.out.println("파일에 출력할 내용 입력");
			String msg = input.next();
			fos.write(msg.getBytes());
			System.out.println("저장되었습니다");
		}
		
		
	}
}
