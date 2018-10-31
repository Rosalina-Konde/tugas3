public class MainStackString {

	public static void main(String[] args) {
	StackString Nama = new StackString();
	Nama.cetak();
	
	
	Nama.push("Rosalina"); Nama.cetak();
	Nama.push("YULIANA"); Nama.cetak();
	Nama.push("NILASARI"); Nama.cetak();
	 
	
	String nm = Nama.pop(); Nama.cetak();
	System.out.println(nm);
	
}

}
