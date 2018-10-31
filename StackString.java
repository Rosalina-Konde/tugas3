 import java.util.ArrayList;
public class StackString {

	
		ArrayList<String> Informatika = new ArrayList<String>();
		int top = -1;
		
		public void push(String value) {
			Informatika.add(value);
			top = top + 1;
		}
		public String pop(){
			String value= Informatika.get (top);
			Informatika.remove(top);
			top = top - 1;
			return value;
		}
		public void cetak(){
			System.out.println(Informatika.toString());
		}
	}


