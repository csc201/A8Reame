import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile pledge = new RandomAccessFile("pledge.txt","rw");
			pledge.seek(124);
			System.out.println(pledge.readLine());
			pledge.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Having problem opening the file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Having problem accessing the file.");
		}
	}

}
