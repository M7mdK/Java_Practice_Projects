package Driver;

import java.io.*;

public class testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileWriter fout = FileWriter(new File("f.txt"));
		int b1, a1 = 2;
		double b2, a2 = 7.5;
		String b3, a3 = "abc";
		
		DataOutputStream dout;
		
		try {
			dout = new DataOutputStream(new FileOutputStream("g.txt"));
			dout.writeInt(a1);
			dout.writeDouble(a2);
			dout.writeUTF(a3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DataInputStream din;
		
		try {
			din = new DataInputStream(new FileInputStream("g.txt"));
			b1 = din.readInt();
			b2 = din.readDouble();
			b3 = din.readUTF();
			
			System.out.println(b1 + " " + b2 + " " + b3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
