import java.util.ArrayList;


public class ArrayListFloat {

	public static void main(String[] args) {
		ArrayList<Float> TinggiBadan = new ArrayList<Float>();	
		TinggiBadan.add ((float) 160.10);
		TinggiBadan.add ((float) 158.23);
		TinggiBadan.add ((float) 165.45);
		TinggiBadan.add ((float) 170.00);
		
		System.out.println("Berapa Banyak Data :" + TinggiBadan.size());
		System.out.println("Tinggi Badan :" + TinggiBadan);
		TinggiBadan.set(1, (float) 38.10);
		TinggiBadan.set(2, (float) 38.25);
		System.out.println("Tinggi Badan :" + TinggiBadan);

	}

}
