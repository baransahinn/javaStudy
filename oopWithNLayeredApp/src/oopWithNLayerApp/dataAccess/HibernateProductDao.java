package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;
// implements ProductDao yani ProductDao nun kurallarına uyucaksın!!
public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // Hibetnate ile veritabanına ekleme işlemi yapılır
        // sadece ve sadece db erişim kodları yazılır
        System.out.println(" Hibernate ile veritabanına ekleme işlemi yapıldı");
    }
}
