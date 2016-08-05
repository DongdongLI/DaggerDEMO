import javax.inject.Inject;

import dagger.Lazy;

public class CoffeeMaker {
	private final Lazy<Heater> heater;
	private final Pump pump;

	@Inject
	public CoffeeMaker(final Lazy<Heater> heater, final Pump pump) {
		this.heater = heater;
		this.pump = pump;
	}

	public void brew(){
		heater.get().on();
		pump.pump();
		System.out.println("[_]p ~~~ Coffee is ready.");
		heater.get().off();
	}
}
