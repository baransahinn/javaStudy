package oopWithNLayerApp.business;

import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş kurallarını yazarız
        if(Product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        //ProductDao productDao = new JdbcProductDao();
        // veya ProductDao productDao = new HibernateProductDao();
        //PrdoductDao onu implement eden sınıfın referansını tutabilir.
        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
