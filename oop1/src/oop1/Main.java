package oop1;

public class Main {
    public static void main(String[] args) {


    Product product1 = new Product();
    //set
    product1.setName("Delonghi Kahve Makinesi");
    product1.setUnitPrice(7500);
    product1.setDiscount(1500);
    product1.setImageUrl("Delonghi.svg");
    product1.setUnitPrice(10);
    System.out.println(product1.getDiscount());
    //get System.out.println(product1.name);

    Product product2 = new Product();
    product2.name="Kumtel Kahve Makinesi";
    product2.unitPrice =8500;
    product2.discount = 1000;
    product2.imageUrl = "Kumtel.svg";
    product2.unitsInStock=15;

    Product product3 = new Product();
    product3.name="Simens Kahve Makinesi";
    product3.unitPrice =6500;
    product3.discount = 1400;
    product3.imageUrl = "Simens.svg";
    product3.unitsInStock=20;

    Product[] products ={product1,product2,product3};
    for( Product product:products){
        System.out.println(product.getDiscount());
    }
// ///////////////////////////////////////////////////
    İndiviualCustomer i̇ndiviualCustomer = new İndiviualCustomer();
    i̇ndiviualCustomer.setId(1);
    i̇ndiviualCustomer.setPhone("0525222222");
    i̇ndiviualCustomer.setCustomerNumber("1234");
    i̇ndiviualCustomer.setFirstName("Baran");
    i̇ndiviualCustomer.setLastName("Şahin");

    Corporate corporate = new Corporate();
    corporate.setId(2);
    corporate.setPhone("0535333333");
    corporate.setCustomerNumber("5678");
    corporate.setCompanyName("Morning Star");
    corporate.setTaxNumber("1234567890");

    Customer[] customers ={i̇ndiviualCustomer,corporate};
    for( Customer customer:customers){
        System.out.println(customer.getCustomerNumber());
    }




    }
}
