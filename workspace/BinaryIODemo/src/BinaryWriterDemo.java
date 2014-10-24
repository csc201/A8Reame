import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BinaryWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream output = new FileOutputStream("output.dat");
			ObjectOutputStream objOutput = new ObjectOutputStream(output);
			List <Cycle> cycleList = new <Cycle>ArrayList();
			Cycle aCycle = new Cycle(5.0,2.0);
			Cycle bCycle = new Cycle(10.0,20.0);
			cycleList.add(aCycle);
			cycleList.add(bCycle);
			
			objOutput.writeObject(cycleList);

			output.close();
			objOutput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot write a file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot write outsream.");
		}
	}

}
