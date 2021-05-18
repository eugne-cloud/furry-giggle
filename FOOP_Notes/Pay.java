public class Pay{
	private double WorkHours,RatePerHour, HoldingRate, GrossPay, NetPay;
	Pay(double WorkHours, double RateHour, double HoldingRate, double GrossPay, double NetPay){
		this.WorkHours=WorkHours;
		this.RatePerHour=RatePerHour;
		this.HoldingRate=HoldingRate;
		this.GrossPay= this.WorkHours*this.RatePerHour;
		this.NetPay=NetPay;
	}
	public void computeNetPay(double WorkHours,double RatePerHour,double HoldingRate){
		this.NetPay= ((WorkHours*RatePerHour)-((WorkHours*RatePerHour) * (HoldingRate)));
		System.out.println("Net Pay is:" +NetPay);
	}
	public void computeNetPay(double WorkHours,double RatePerHour){
		this.NetPay=((WorkHours*RatePerHour)-((WorkHours*RatePerHour) * (0.15)));
		System.out.println("Net Pay is:" +NetPay);
	}
	public void computeNetPay(double WorkHours){
		this.NetPay=((WorkHours*(4.65))-((WorkHours*(4.65)) * (0.15)));
		
	}
}