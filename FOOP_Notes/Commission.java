public class Commission{
	private double SalesFigure, CommissionRate;
	private int CommissionRate2;
	Commission(double SalesFigure, double CommissionRate, int CommissionRate2){
		this.SalesFigure=SalesFigure;
		this.CommissionRate=CommissionRate;
		this.CommissionRate2=CommissionRate2;
}

	public double getSalesFigure(){
		return this.SalesFigure=SalesFigure;
		
	}
	
public void computeCommission(double SalesFigure, double CommissionRate){
	System.out.println("Commission is:" +(SalesFigure * CommissionRate));
	
	
}
public void computeCommission(double SalesFigure, int CommissionRate2){
	double result= SalesFigure *(CommissionRate2/100.0);
	System.out.println("Commission is: " +result);
	
	 
}
}