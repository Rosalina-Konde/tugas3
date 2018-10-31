import java.util.ArrayList;
public class QueueFloat {

	ArrayList<Float> informatikab = new ArrayList<Float>();
	 int rosalina = -1;
	 
	 public void insert(Float value) {
		 rosalina++;
		 informatikab.add(rosalina,value);
	 }
	 public String get(){
		 Float value =1.2f;
		 if(rosalina>-1){
			 	value = informatikab.get(0);
			 	informatikab.remove(0);
			 	rosalina--;
		 }
		 return value;
	}
	 public void cetak(){
		 System.out.println("ECOR :" + rosalina + ">informatika b :" + informatikab.toString());

	}

}
