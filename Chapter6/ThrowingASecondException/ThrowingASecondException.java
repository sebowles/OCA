import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowingASecondException {
	
	public static void main(String[] args){
		FileReader reader = null;
		
		try{
			reader = read();
		}
		catch(IOException e){
			try{
				if(reader != null) reader.close();
			}catch(IOException inner){
			}
		}	
	}
	
	private static FileReader read() throws IOException{
		File file = new File("Hello1.txt");
		return new FileReader(file);
	}

}
