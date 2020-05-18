package springframework.autowiringdemo.cons;

public class ElectricMotor2 implements Motor {

	@Override
	public void start() {
		System.out.println("ELECTRIC MOTOR 2");
	}

}
