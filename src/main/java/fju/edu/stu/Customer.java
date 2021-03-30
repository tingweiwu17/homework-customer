package fju.edu.stu;

public abstract class Customer {
    String number;
    int money;
    int discount;
    
   

    public Customer(String number,int money,int discount){
        this.number = number;
        this.money = money;
        this.discount = discount;
    }
    public Customer(String number, int money, int discount, int thesis){
        super();
    }

    public Customer(String number, String s, String s1) {
    }

    public Customer() {

    }

    public int total(){
        return (money-discount);
    }

    public void print(){

        System.out.println(number +"\t" +money+"\t"+discount+"\t"+total());
    }
    public abstract void mail();
}
