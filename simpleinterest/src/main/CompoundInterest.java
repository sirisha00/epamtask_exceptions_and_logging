public class CompoundInterest {
	public double compoundinterest(double principle_amount, double rate, double time) {
		double ci=principle_amount * Math.pow(1.0+rate/100.0,time) - principle_amount;
		return ci;
	}
}
