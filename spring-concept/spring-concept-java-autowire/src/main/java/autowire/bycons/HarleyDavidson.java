package autowire.bycons;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HarleyDavidson {
	
	public HarleyDavidson(@Qualifier(value="Bullet_350")RoyalEnfield engine350,
			@Qualifier(value="Bullet_500")RoyalEnfield engine500,@Qualifier(value="Bullet_500")Bullet_500 engine505){
		this.engine350 = engine350;
		this.engine500 = engine500;
		this.engine505 = engine505;
		
	}
	
	private RoyalEnfield engine350;
	
	private RoyalEnfield engine500;
	
	private Bullet_500 engine505;
	
	public int oilCapacity() {
		return engine350.getOilCapacity() + engine500.getOilCapacity() + engine505.getOilCapacity();
	}

}
