import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BinaryReaderDemo {
	public static void main(String [] args) {
		FileInputStream input;
		try {
			input = new FileInputStream("output.dat");
			ObjectInputStream objInput = new ObjectInputStream(input);
			
			List <Cycle> aCycleList = (List<Cycle>)objInput.readObject();
			
			System.out.println(aCycleList);
			input.close();
			objInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found error.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem reading the file.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem to create a class");
		}
		
	}
}
