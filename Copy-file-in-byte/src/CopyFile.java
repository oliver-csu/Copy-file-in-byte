import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// 1,明确源和目的。
		File srcFile = new File("c:\\YesDir\test.JPG");
		File destFile = new File("copyTest.JPG");

		// 2,明确字节流 输入流和源相关联，输出流和目的关联。
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);

		// 3, 使用输入流的读取方法读取字节，并将字节写入到目的中。
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			fos.write(ch);
		}
		// 4,关闭资源。
		fos.close();
		fis.close();

	}

}
