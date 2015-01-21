import java.io.IOException;


public class MainProgram {

	public static void main(String[] args) {
		
		try {
			CSVBuilder.saveObjects("users", new User("Nedim",32,true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//test CSVbuilder

	}

}
