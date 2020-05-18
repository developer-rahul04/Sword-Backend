package springframework.autowiringdemo.cons;

public class ElectricMotor1 implements Motor {

	@Override
	public void start() {
		System.out.println("ELECTRIC MOTOR 1");
	}

}
