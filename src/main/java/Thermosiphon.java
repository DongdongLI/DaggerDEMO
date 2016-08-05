import javax.inject.Inject;

public class Thermosiphon implements Pump{
	private final Heater heater;

	@Inject
	public Thermosiphon(final Heater heater) {
		this.heater = heater;
	}

	@Override
	public void pump() {
		if(heater.isHot()){
			System.out.println("=>=>Pumping=>=>");
		}
	}
}
/*It needs an heater as a component, it will inject the heater
 * *
 */