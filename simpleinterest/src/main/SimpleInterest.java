public class SimpleInterest {
	public static double simpleinterest(double principle_amount, double time, double rate) {
		double si = (principle_amount * time * rate)/100;
		return si;
	}
}
