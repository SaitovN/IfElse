package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
//        if (a>b){
//            var result = "a > b";
//            System.out.println(result);
//        }
//
//
//        if (a<b){
//            var result = "a<b";
//            System.out.println(result);
//        }
//
//        if (a==b);{
//            var result = "a==b";
//            System.out.println(result);
//        }
        if (a>b){
            var result = "a > b";
            System.out.println(result);
        }else{
            if(a<b){
                System.out.println("a < b");
            }else{
                System.out.println(a = b);
            }
        }
//        if (a>b){
//            System.out.println("a > b");
//        } else if (a < b){
//            System.out.println("a < b");
//        } else {
//            System.out.println"(a = b");
//        }
//
        boolean condition = a > b;
        if (a > b){
            System.out.println("condition=true");
        }

        if (condition|| a<b && a>1 || !(b<7)){
            System.out.println("ошибка");
        }
            }


}
