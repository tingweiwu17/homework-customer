package fju.edu;

public class Customer {
    String number;
    int money;
    int discount;
    
   

    public Customer(String number,int money,int discount){
        this.number = number;
        this.money = money;
        this.discount = discount;
    }

    public Customer(String number, String s, String s1) {
    }

    public int total(){
        return (money-discount);
    }

    public void print(){
        System.out.println(number +"\t" +money+"\t"+discount+"\t"+total());
    }
}
