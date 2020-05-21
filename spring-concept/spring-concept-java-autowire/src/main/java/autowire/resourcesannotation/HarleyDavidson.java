package autowire.resourcesannotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class HarleyDavidson {

	public HarleyDavidson() {

	}

	@Resource(name = "RoyalEnfield")
	private RoyalEnfield engine500;

	public int oilCapacity() {
		return engine500.getOilCapacity();
	}

}
