  import java.util.ArrayList;


public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
		Data.add(new Mahasiswa("ROSALINA KONDE", "D0217012","B","MAMASA"));
		Data.add(new Mahasiswa("NILASARI", "D0217322","B","SENDANA"));
		Data.add(new Mahasiswa("ASWANDI", "D0217011","B","SENDANA"));
		Data.add(new Mahasiswa("NADRA", "D0217512","B","TINAMBUNG"));
		Data.forEach(data -> {
			System.out.println("Nama : " + data.getNama() + "NIM :" + data.getNim() + "Kelas :" + data.getKelas() + "Alamat :" + data.getAlamat()) ;
		});

	}
}


