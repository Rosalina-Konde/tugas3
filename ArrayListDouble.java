import java.util.ArrayList;


public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> BeratBadan = new ArrayList<Double>();	
		BeratBadan.add ((double) 40.20);
		BeratBadan.add ((double) 21.10);
		BeratBadan.add ((double) 23.45);
		BeratBadan.add ((double) 12.14);
		
		System.out.println("Apakah ArrayList ada :" + BeratBadan.size());
		System.out.println("Berat Badan :" + BeratBadan);
		System.out.println("Berapa jumlah data :" + BeratBadan.isEmpty());
		BeratBadan.remove(2);
		System.out.println("Berat Badan :" + BeratBadan);

	}

}
