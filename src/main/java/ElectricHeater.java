public class ElectricHeater implements Heater{

	boolean heating;
	
	@Override
	public void on() {
		System.out.println("~~~h ea ting~~~");
	}

	@Override
	public void off() {
		this.heating = false;
	}

	@Override
	public boolean isHot() {
		return heating;
	}
	
}
