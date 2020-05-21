package autowire.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HarleyDavidson {

	public HarleyDavidson() {

	}

	@Autowired
	private Bullet_350 engine350;

	@Autowired
	private Bullet_500 engine500;

	@Autowired
	private Bullet_500 engine505;

	public int oilCapacity() {
		return engine350.getOilCapacity() + engine500.getOilCapacity() + engine505.getOilCapacity();
	}

	public Bullet_350 getEngine350() {
		return engine350;
	}

	public void setEngine350(Bullet_350 engine350) {
		this.engine350 = engine350;
	}

	public Bullet_500 getEngine500() {
		return engine500;
	}

	public void setEngine500(Bullet_500 engine500) {
		this.engine500 = engine500;
	}

	public Bullet_500 getEngine505() {
		return engine505;
	}

	public void setEngine505(Bullet_500 engine505) {
		this.engine505 = engine505;
	}
}
