import java.util.List;

public class Tesla extends Car{

	private List<Model> carModel;
	private FuelType fuelType;
	
	private Brand brandName;


	public Tesla(List<Model> carModel, FuelType fuelType,Brand brandName) {
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
		return true;
	}


	public void run() {
		System.out.println("run your Tesla car with ldeal speed of 100 Km/hr");
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
