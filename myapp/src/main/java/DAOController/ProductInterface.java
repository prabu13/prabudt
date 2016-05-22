package DAOController;

import java.util.*;
import model.ProductModel;

public interface ProductInterface {

	public List<ProductModel> getAllProducts();
	public List<ProductModel> getProduct(String name);
}
