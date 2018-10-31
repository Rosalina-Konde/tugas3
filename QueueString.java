import java.util.ArrayList;

public class QueueString {

	ArrayList<String> kelasb = new ArrayList<String>();
	 int rosalina = -1;
	 
	 public void insert(String value) {
		 rosalina++;
		 kelasb.add(rosalina,value);
	 }
	 public String get(){
		 String value ="KOSONG";
		 if(rosalina>-1){
			 	value = kelasb.get(0);
			 	kelasb.remove(0);
			 	rosalina--;
		 }
		 return value;
	}
	 public void cetak(){
		 System.out.println("ECOR :" + rosalina + ">kelas b :" + kelasb.toString());
	 }

}
