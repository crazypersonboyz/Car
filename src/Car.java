
public abstract class Car implements Electric,GPS,Fuel,Gas {

	
	@Override
	public boolean hasGps() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasElectric() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasGas() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void run() {
		System.out.println("run your car with ldeal speed of 40 Km/hr");
	}

}
