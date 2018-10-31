public class MainStackDouble {

	public static void main(String[] args) {
		
		StackDouble Berat = new StackDouble();
		Berat.cetak();
		
		Berat.push ((double) 40.20);Berat.cetak();
		Berat.push ((double) 21.10);Berat.cetak();
		Berat.push ((double) 23.45);Berat.cetak();
		Berat.push ((double) 12.14);Berat.cetak();
		
		Double br = Berat.pop(); Berat.cetak();
		System.out.println(br);

	}

}
