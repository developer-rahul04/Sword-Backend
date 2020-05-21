package springframework.autowiringdemo.cons;

public class Tesla {
	    private Motor motor;

	    public Tesla(Motor electricMotor1)
	    {
	        motor=electricMotor1;
	    }

	    public void goForward()
	    {
	        motor.start();
	        System.out.println("Going Forward.");
	    }
}
