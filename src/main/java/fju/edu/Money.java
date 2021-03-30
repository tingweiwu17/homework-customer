package fju.edu;

import fju.edu.stu.Customer;

public class Money {
    public static void main(String[] args) {
        Customer[] cus = {
                new Customer("0013","490","0"),
                new Customer("0500","1000","100"),
                new Customer("0081","290","0"),
                new Customer("2122","2000","200")
        };
        for (int i = 0;i< cus.length;i++){
            cus[i].print();
        }
    }
}
