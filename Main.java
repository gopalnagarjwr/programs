import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      discount of piceis in retailar =>

//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter name of retailar : ");
//        String s=sc.nextLine();
//        System.out.print("enter total peicies : ");
//        int p=sc.nextInt();
//        System.out.print("enter price of /peiceis : ");
//        int price= sc.nextInt();
//        if(p>0&& p<16){
//            int t=(price*p)*15/100;
//
//            System.out.println("retailar name : "+s+"\n"+"amount : "+(p*price)+"\n"+"discount : "+15+"%"+"\n"+"total pay amount : "+(p*price-t));
//        } else if (p>15&&p<31) {
//            int t=(price*p)*30/100;
//            System.out.println("retailar name : "+s+"\n"+"amount : "+(p*price)+"\n"+"discount : "+30+"%"+"\n"+"total pay amount : "+(p*price-t));
//        }
//        else if (p>30&&p<51) {
//        int t=(price*p)*50/100;
//            System.out.println("retailar name : "+s+"\n"+"amount : "+(p*price)+"\n"+"discount : "+50+"%"+"\n"+"total pay amount : "+(p*price-t));
//        }



//       electricity bill discount =>

//        System.out.print("enter bill user name : ");
//        String name= sc.nextLine();
//        System.out.print("enter unit of electricity : ");
//        int u= sc.nextInt();
//        int amount=u*10;
//        System.out.println();
//        if(u>0&&u<11){
//            int t=amount*10/100;
//
//            System.out.println("name : "+name+"\n"+"your bill unit : "+u+"\n"+"amount : "+amount+"\n"+"discount : "+10+"%"+"\n"+"total pay amount : "+(amount-t));
//        } else if (u>10&&u<21) {
//            int t=amount*15/100;
//            System.out.println("name : "+name+"\n"+"your bill unit : "+u+"\n"+"amount : "+amount+"\n"+"discount : "+15+"%"+"\n"+"total pay amount : "+(amount-t));
//        }
//        else if (u>20&&u<41) {
//        int t=amount*30/100;
//        System.out.println("name : "+name+"\n"+"your bill unit : "+u+"\n"+"amount : "+amount+"\n"+"discount : "+30+"%"+"\n"+"total pay amount : "+(amount-t));
//        }
//        else if (u>49) {
//            int t=amount*50/100;
//            System.out.println("name : "+name+"\n"+"your bill unit : "+u+"\n"+"amount : "+amount+"\n"+"discount : "+50+"%"+"\n"+"total pay amount : "+(amount-t));
//        }


//    salary of holidays basais =>

//        System.out.print("please enter your salary : ");
//        int s=sc.nextInt();
//        System.out.print("enter holidays in month : ");
//        int h=sc.nextInt();
//        if(h==1){
//            System.out.println("your total salary : "+s);
//        }
//        else if(h<6&&h>1){
//            int t=s*5/100;
//            s=s-t;
//            System.out.println("your total salary : "+s);
//        }
//        else if(h<15&&h>5){
//            int t=s*10/100;
//            s=s-t;
//            System.out.println("your total salary : "+s);
//        }
//        else if(h==15){
//            int t=s*50/100;
//            s=s-t;
//            System.out.println("your total salary : "+s);
//        }
//        else {
//            System.out.println("Not salary ");
//        }


//       tree integer max check =>

//        System.out.print("enter input : ");
//        int a=sc.nextInt();
//        System.out.print("enter input : ");
//        int b=sc.nextInt();
//        System.out.print("enter input : ");
//        int c=sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("a is max : "+a);
//        }
//        if(b>a&&b>c){
//            System.out.println("b is max : "+b);
//        }
//        else {
//            System.out.println("c is max : "+c);
//        }


//        student result  =>

//        System.out.print("enter name of student : ");
//        String name=sc.nextLine();
//        System.out.print("enter roll no. of student : ");
//        int roll_no=sc.nextInt();
//        System.out.print("enter marks phy. : ");
//        int phy=sc.nextInt();
//        System.out.print("enter marks chemi. : ");
//        int che=sc.nextInt();
//        System.out.print("enter marks cs : ");
//        int cs= sc.nextInt();
//        float precentage=100*(phy+che+cs)/300;
//        System.out.println();
//        System.out.println("roll no. of student : "+roll_no+"\n"+"name of student : "+name+"\n"+"total subjects marks : "+(phy+che+cs)+"\n"+"precentage : "+precentage+"%");



//       student parcentage and grad  =>

//        final int total =500;
//        System.out.print("enter hindi marks : ");
//        int h= sc.nextInt();
//        System.out.print("enter english marks : ");
//        int e=sc.nextInt();
//        System.out.print("enter phis. marks : ");
//        int p= sc.nextInt();
//        System.out.print("enter bio. marks : ");
//        int b=sc.nextInt();
//        System.out.print("enter chem. marks : ");
//        int c=sc.nextInt();
//        int sum=h+e+p+b+c;
//        float parcentg =100*sum/total;
////        System.out.println(parcentg);
//        if ( 25 > parcentg) {
//            System.out.println("Grad F " + parcentg + "%");
//        } else if (25 < parcentg && 45 > parcentg) {
//            System.out.println("Grad E " + parcentg + "%");
//        } else if ( 45 < parcentg && 50 > parcentg) {
//            System.out.println("Grad D " + parcentg + "%");
//        } else if ( 50 < parcentg && 60 > parcentg) {
//            System.out.println("Grad C " + parcentg + "%");
//        } else if ( 60 < parcentg && 80 > parcentg) {
//            System.out.println("Grad B " + parcentg + "%");
//        } else if (80 < parcentg) {
//            System.out.println("Grad A " + parcentg + "%");
//        } else {
//            System.out.println("invalid parcentag");
//        }



//       check alphabet and digit  =>

//         char var=sc.next().charAt(0);
//         if(var>64&&var<91 ||96<var && 124>var){
//            System.out.println("this is a alphabet : "+var);
//        }
//         else{
//            System.out.println("this is a digit ");
//        }

      
//        area and volume of traingal rectaingal and square =>

//        System.out.print("you wnat to area/volume ");
//        String in =sc.nextLine();
//        if(in.equals("area")){
//            System.out.println("select what you want "+"traingle ractangl square");
//            String se=sc.nextLine();
//            if(se.equals("traingle")){
//                System.out.print("enter height : ");
//                float h= sc.nextFloat();
//                System.out.print("enter weigth : ");
//                float v= sc.nextFloat();
//                double t=(0.5)*v*h;
//                System.out.println("area of traingle : "+t);
//            }
//            if(se.equals("ractangl")){
//                System.out.print("enter height : ");
//                float h= sc.nextFloat();
//                System.out.print("enter weigth : ");
//                float v= sc.nextFloat();
//                double t=h*v;
//                System.out.println("area of ractangl : "+t);
//            }
//            if(se.equals("square")){
//                System.out.println("enter square lenght : ");
//                int a= sc.nextInt();
//                System.out.println("square of area : "+a*a);
//            }
//        }else {
//            System.out.println("select what you want "+"traingle ractangl square");
//            String se=sc.nextLine();
//            if(se.equals("traingle")){
//                System.out.println("does not exist in traingle volume");
//            }
//            if(se.equals("ractangl")){
//                System.out.print("enter ractaingle length : ");
//                int l=sc.nextInt();
//                System.out.print("enter ractaingle weigth : ");
//                int b= sc.nextInt();
//                System.out.println("enter ractaingle heigth : ");
//                int h=sc.nextInt();
//                double t=l*b*h;
//                System.out.println("volume of ractaingle : "+t);
//            }
//            if(se.equals("square")){
//                System.out.print("enter side of square : ");
//                int s=sc.nextInt();
//                System.out.print("enter square heigth : ");
//                int h=sc.nextInt();
//                double t=(s*s)*h;
//                System.out.println("volume of square : "+t);
//            }
//
//        }

              
//        covert to celcius to faranait and faranait to celcius =>

//        System.out.println("celcius to faranait select 1");
//        System.out.println("faranait to celcius select 2");
//        System.out.println("please select option what you want => ");
//        int op= sc.nextInt();
//        if(op==1) {
//            System.out.print("please enter your temperature in calcius : ");
//             int calc = sc.nextInt();
//             double fera=calc*1.8+32;
//            System.out.println("your temperature in faranait : "+fera);
//
//        } else if (op==2) {
//            System.out.print("please enter your temperature in faranait : ");
//            int fara = sc.nextInt();
//            double calc=(fara-32)/1.8;
//            System.out.println("your temperature in celcius : "+calc);
//
//        }
   
        // check leap year programm  =>

//        System.out.print("enter year : ");
//        int a= sc.nextInt();
//        if(a%4==0){
//            System.out.println("this is leap year : "+a);
//        }else {
//            System.out.println("this is not leap year : "+a );
//        }
     }
}