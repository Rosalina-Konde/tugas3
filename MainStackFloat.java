
public class MainStackFloat {

	public static void main(String[] args) {
		
		StackFloat Tinggi = new StackFloat();
		Tinggi.cetak();
		
		Tinggi.push((float) 160.10);Tinggi.cetak();
		Tinggi.push((float) 158.23);Tinggi.cetak();
		Tinggi.push((float) 165.45);Tinggi.cetak();
		Tinggi.push((float) 170.00);Tinggi.cetak();
		
		
		Float tg = Tinggi.pop(); Tinggi.cetak();
		System.out.println(tg);

	}

}
