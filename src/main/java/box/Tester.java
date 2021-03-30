package box;




import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object's length");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter object's width");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter object's height");
        int height = Integer.parseInt(scan.next());


        if(Box3.validate(length,width,height)){
            System.out.println();
        }else if(Box5.validate(length,width,height)){
            System.out.println();
        }
    }



}


    /*if (length<=10 && width <=10 && height<=10){
        System.out.println("Box3"+"60");
    }else if(length<=10 && width<=20 &&height<=20){
        System.out.println("Box5"+"90");
    /*


