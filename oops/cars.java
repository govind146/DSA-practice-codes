package oops;

public class cars {
    String brand;  //non-primitive non-static
    double price;  //primitive non-static
    engine e1=new engine(1200.0);     //non-static

    public cars( String brand,double price){
        this.brand=brand;
        this.price=price;
    }
}
