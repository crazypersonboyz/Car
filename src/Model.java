
public class Model implements Price {

	private String modelName;
	private double price;
	private Color color;
	
	public Model(String modelName, double price,Color color) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.color=color;
	}
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	

}
