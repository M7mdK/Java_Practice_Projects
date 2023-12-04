import java.util.Formatter;
import java.lang.*;
import java.util.*;

public class CreateFile {
	
	private Formatter f;
	
	public void openFile(){
		try{
			f = new Formatter("chinese.txt");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	
	public void addRecords(){
		f.format("%s %s %s", "20 " , "m7 " , " k ");
	}
	
	public void closeFile(){
		System.out.println("closing");
		f.close();
	}
}
