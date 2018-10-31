import java.util.ArrayList;
public class QueueDouble {

	ArrayList<Double> mamasa = new ArrayList<Double>();
	 int rosalina = -1;
	 
	 public void insert(Double value) {
		 rosalina++;
		 mamasa.add(rosalina,value);
	 }
	 public String get(){
		 Float value =1.2f;
		 if(rosalina>-1){
			 	value = mamasa.get(0);
			 	mamasa.remove(0);
			 	rosalina--;
		 }
		 return value;
	}
	 public void cetak(){
		 System.out.println("ECOR :" + rosalina + ">mamasa :" + mamasa.toString());
		

	}

}
