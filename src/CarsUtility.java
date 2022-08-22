import java.util.ArrayList;
import java.util.List;

public class CarsUtility {
	
	public static Tesla getTeslaModelDetails() {
		List<Model> modelList=new ArrayList<>();
		
		Model modelX=new Model(CarsUtilConstants.TESLA_MODEL_Y, CarsUtilConstants.TESLA_MODEL_Y_PRICE, Color.RED);
		Model model3=new Model(CarsUtilConstants.TESLA_MODEL_3, CarsUtilConstants.TESLA_MODEL_3_PRICE, Color.GREEN);
		
		modelList.add(modelX);
		modelList.add(model3);
		
		Tesla tesla=new Tesla(modelList, FuelType.ELECTRIC, Brand.TESLA);
		
		return tesla;
	}
	
	public static BMW getBMWModelDetails() {
		List<Model> modelList=new ArrayList<>();
		
		Model model1=new Model(CarsUtilConstants.BMW_X1, CarsUtilConstants.BMW_X1_PRICE, Color.RED);
		Model model2=new Model(CarsUtilConstants.BMW_X3, CarsUtilConstants.BMW_X3_PRICE, Color.GREEN);
		Model model3=new Model(CarsUtilConstants.BMW_X5, CarsUtilConstants.BMW_X5_PRICE, Color.BLUE);
		modelList.add(model1);
		modelList.add(model2);
		modelList.add(model3);
		
		BMW bmw=new BMW(modelList, FuelType.ELECTRIC, Brand.TESLA);
		
		return bmw;
	}
	
	public static Lexas getLexasModelDetails() {
		List<Model> modelList=new ArrayList<>();
		
		Model model1=new Model(CarsUtilConstants.LEXAS_ES, CarsUtilConstants.LEXAS_ES_PRICE, Color.RED);
		Model model2=new Model(CarsUtilConstants.LEXAS_LS, CarsUtilConstants.LEXAS_LS_PRICE, Color.GREEN);
		Model model3=new Model(CarsUtilConstants.LEXAS_NX, CarsUtilConstants.LEXAS_NX_PRICE, Color.BLUE);
		modelList.add(model1);
		modelList.add(model2);
		modelList.add(model3);
		
		Lexas lexas=new Lexas(modelList, FuelType.ELECTRIC, Brand.TESLA);
		
		return lexas;
	}
}
