package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

// jdbc veri tabanı erişim yöntemlerinden biri
// implements ProductDao yani ProductDao nun kurallarına uyucaksın!!
public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        // JDBC ile veritabanına ekleme işlemi yapılır
        // sadece ve sadece db erişim kodları yazılır
        System.out.println(" JDBC ile veritabanına ekleme işlemi yapıldı");
    }
}
