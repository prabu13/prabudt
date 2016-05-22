package DAOController;

import model.ProductModel;
import java.util.*;

public class ProductDAO implements ProductInterface{

	List<ProductModel> products;
	
	public ProductDAO() 
	{	}
		
	public List<ProductModel> getProduct(String name)
	{
		products = new ArrayList<ProductModel>();
		
		ProductModel pm1 = null;
		
		if("img1".equals(name))
			pm1 = new ProductModel(10001,"Red Rose","Heart Touching Flower",45);
		if("img2".equals(name))
			pm1 = new ProductModel(10002,"Rose","Flower",50);
		if("img3".equals(name))
			pm1 = new ProductModel(10003,"Rose","Flower - Bokkay",75);
		
		products.add(pm1);
		
		return products;
	}
	
	public List<ProductModel> getAllProducts()
	{
		products = new ArrayList<ProductModel>();
		
		ProductModel pm1 = new ProductModel(10001,"Red Rose","Heart Touching Flower",45);
		ProductModel pm2 = new ProductModel(10002,"Rose","Flower",50);
		ProductModel pm3 = new ProductModel(10003,"Rose","Flower - Bokkay",75);
		
		products.add(pm1);
		products.add(pm2);
		products.add(pm3);
		
		return products;
	}
}