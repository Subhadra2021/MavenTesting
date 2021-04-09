
import java.io.FileReader;
import java.io.BufferedReader;
public class Class {
	public static void main(String[] args) {
		System.out.print("Text is: ");
		try {
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\Java Fullstack\\as1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line =br.readLine();
			while(line != null) {
				System.out.println(line);
				 line =br.readLine();
			}
			
			} catch(Exception e) {
			 System.out.println("ERROR");	
			}
		}
}
