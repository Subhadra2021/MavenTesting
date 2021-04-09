
// given text and length
import java.io.FileReader;
import java.io.BufferedReader;
public class StringArray {
	public static void main(String[] args) {
		System.out.println("Text is: ");
				int count = 0;
			try {
				FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\Java Fullstack\\as1.txt");
			      //int wc=0;  
				BufferedReader br = new BufferedReader(fr);
				String line =br.readLine();
				
				 while(line!=null) {
					//String words[]=line.split(" "); //1st method //String words[]=line.split(" ");//wc += words.length;
					 System.out.println(line);
					 //wc += words.length;
					//wc += line.split(" ").length; //2nd method
					count += line.split(" ").length; //3rd method
					 line =br.readLine();
					 
					}
				 System.out.println();
			      //System.out.println("Number of words in the file:" +wc);
				 System.out.println("Number of words in the file:" +count);
			      
			
				 } catch(Exception e) {
				 System.out.println("ERROR");	
				}
			
	}
}

	