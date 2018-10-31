import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> BeratBadan = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value) {
		BeratBadan.add(value);
		top = top + 1;
	}
	public Double pop(){
		Double value= BeratBadan.get(top);
		BeratBadan.remove(top);
		top = top - 1;
		return value;
	}
	public void cetak(){
		System.out.println(BeratBadan.toString());
	
	
	}

}
