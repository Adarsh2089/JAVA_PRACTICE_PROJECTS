public class Customer {

    String name;
    String phone;
    Car car;

   public Customer(String name,String phone,Car car ){
        this.name=name;
        this.phone=phone;
        this.car=car;
    }

    public String getname(){
        return name;
    }
    public String getphone(){
        return phone;
    }
    public Car getcar(){
        return car;
    }

}