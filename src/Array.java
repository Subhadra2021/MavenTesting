//given test  and no of characters
import java.io.FileReader;
import java.io.BufferedReader;
public class Array {

		public static void main(String[] args) {
			//System.out.println("Text is: ");
					int count = 0,count1=0;
				try {
					FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\Java Fullstack\\as1.txt"); 
					BufferedReader br = new BufferedReader(fr);
					String str =br.readLine();
					//count1 += str.split(" ").length;
					 while(str!=null) {
						 
						 String s = new String(str);
						 for(int i=0;i<s.length();i++) {
							 char ch = s.charAt(i);
							 if((ch>='a' & ch<='z')||(ch>='A' & ch<='Z')||(ch>='0' & ch<='9')||(ch==' ')) {
								 count++; 
								
							 }
							 
						 }
						 str = br.readLine();
						 count++;
						}
					 System.out.print("count od char is:"+count);
					// System.out.print(count1);
					 
					 
				}catch(Exception e) {
					
				}
				
		}
}