package autowire.autowirebyname;

public class Tesla {
	    private Motor motor;

	    // bean with electricMotor1 is passed
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
