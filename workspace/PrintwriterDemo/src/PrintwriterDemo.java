import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintwriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Cycle aCycle = new Cycle(5.0,2.0);
			PrintWriter fileWriter = new PrintWriter("write.txt");
			fileWriter.println(aCycle);
			fileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There is a problem to write to the file.");
		}
	}

}
