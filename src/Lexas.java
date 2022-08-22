import java.util.List;

public class Lexas extends Car{
	private List<Model> carModel;
	private FuelType fuelType;
	
	private Brand brandName;


	public Lexas(List<Model> carModel, FuelType fuelType,Brand brandName) {
		super();
		this.carModel = carModel;
		this.fuelType = fuelType;
		this.brandName = brandName;
	}

	public List<Model> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<Model> carModel) {
		this.carModel = carModel;
	}

	@Override
	public boolean hasGps() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hasElectric() {
		// TODO Auto-generated method stub
		return false;
	}


	public void run() {
		System.out.println("run your BMW car with ldeal speed of 200 Km/hr");
	}
	
	public void getCarDetails() {
		
	}

	@Override
	public void setFuel(FuelType fuelType) {
		this.fuelType=fuelType;
		
	}

	public Brand getBrandName() {
		return brandName;
	}

	public void setBrandName(Brand brandName) {
		this.brandName = brandName;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

}
