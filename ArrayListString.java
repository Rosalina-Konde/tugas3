import java.util.ArrayList;


public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("ROSALINA KONDE");
		Mahasiswa.add("KARLINA");
		Mahasiswa.add("HERMIN");
		Mahasiswa.add("ROLANDIAZ");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa.toString());
		Mahasiswa.remove(1);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa.toString());

	}

}
