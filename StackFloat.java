import java.util.ArrayList;


public class StackFloat {

		ArrayList<Float> TinggiBadan = new ArrayList<Float>();
		int top = -1; 
		
		public void push(Float value) {
			TinggiBadan.add(value);
			top = top + 1;
		}
		public float pop(){
			float value= TinggiBadan.get(top);
			TinggiBadan.remove(top);
			top = top -1;
			return value;
		}
		public void cetak(){
			System.out.println(TinggiBadan.toString());
	}

}
