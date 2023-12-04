
public class Driver {

	public static void main(String[] args) {
		
		CreateFile f = new CreateFile();
		f.openFile();
		f.addRecords();
		f.closeFile();

	}

}
