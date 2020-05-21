package autowire.byname;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HarleyDavidson {
	
	public HarleyDavidson(){
		
	}
	
	@Autowired
	@Qualifier(value="Bullet_350")
	private RoyalEnfield engine350;
	
	@Autowired
	@Qualifier(value="Bullet_500")
	private RoyalEnfield engine500;
	
	
	public int oilCapacity() {
		return engine350.getOilCapacity() + engine500.getOilCapacity();
	}

}
