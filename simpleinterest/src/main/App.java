import java.util.Scanner;
import java.util.logging.Logger;

public class App {
	public static void main(String[] args) {
		double principle_amount,rate,time;
	    Scanner sc=new Scanner (System. in);
	    Logger logger = Logger.getLogger(App.class.getName());
	    SimpleInterest sim = new SimpleInterest();
	    CompoundInterest cin = new CompoundInterest();
	    logger.info("Calculation of Simple Interest and Compound Interest!!!");
	    logger.info("Enter the principle amount:"); 
	    principle_amount=sc.nextDouble();
	    logger.info("Enter the Time period:");
	    time=sc.nextDouble();
	    logger.info("Enter the Rate of Interest");
	    rate=sc.nextDouble();
	    logger.info("Simple Interest="+sim.simpleinterest(principle_amount,time,rate));
	    logger.info("Compound Interest="+cin.compoundinterest(principle_amount,rate,time));
	}

}
