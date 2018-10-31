import java.util.ArrayList;


public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> Nilai_Siswa = new ArrayList<Integer>();
		Nilai_Siswa.add(80);
		Nilai_Siswa.add(70);
		Nilai_Siswa.add(86);
		Nilai_Siswa.add(79);
		Nilai_Siswa.add(90);
		
		System.out.println(Nilai_Siswa.isEmpty());
		System.out.println("Nilai_Siswa" + Nilai_Siswa);
		System.out.println("Yang mempunyai nilai 79 :" + Nilai_Siswa.indexOf(79));
		
		ArrayList<Integer> Nilai_Siswa1 = Nilai_Siswa;
		System.out.println("1" + Nilai_Siswa);
		System.out.println("2" + Nilai_Siswa);
		Nilai_Siswa.remove(3);
		System.out.println("1" + Nilai_Siswa);
		System.out.println("2" + Nilai_Siswa);
	}

}
