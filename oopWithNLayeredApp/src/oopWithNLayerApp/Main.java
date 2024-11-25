package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "iphone 16 pro max",1000);

        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product1);



    }
}