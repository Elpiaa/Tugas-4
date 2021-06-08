package com;
import java.util.Scanner;
import java.lang.Math;

public class Adding {
    
    public static void main(String[] args){
    
        double jari;
        double tinggi;
        double volume;
        double ls;
        double lp;
        double la;
        double ln;
        double a;
        double p = 0.5 ;
        double n ;
        double s ;
        char ans = 'n';
    
        Scanner t = new Scanner(System.in);

        do{
            System.out.println("-------------    Menghitung Bangun Ruang    -------------");
            System.out.println("               Input dalam satuan centimeter            ");
            
            System.out.println("----------------------------------------------------------");
    
            System.out.println("Menu Pilih : ");
            System.out.println("1. Segitiga");
            System.out.println("2. Tabung"); 
            System.out.println("3. Kerucut");
            System.out.println(" ");
            System.out.print("Pilih ? ");
            int pilih = t.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("-----Segitiga-----");

                    System.out.print("Alas : ");
                    a = t.nextFloat(); 

                    System.out.print("Masukkan tinggi : ");
                    tinggi = t.nextFloat();

                    la = 0.5 * a * tinggi ; 
                    System.out.println("Luas Segitiga = 0.5 * alas * tinggi  = " + (int)Math.ceil(la) + " cm");
                    System.out.println(" ");
                    double x , y , z , Keliling;

                    System.out.println("Keliling Segitiga ");
                    System.out.print("Masukkan x : ");
                    x = t.nextFloat();
                    System.out.print("Masukkan y : ");
                    y = t.nextFloat();
                    System.out.print("Masukkan z : ");
                    z = t.nextFloat();
                    Keliling = x + y + z ;
                    System.out.println("Keliling Segitiga = x + y + z =  " + (int)Keliling + " cm" );
                    break;

                case 2 :

                    System.out.println("-----Tabung-----");

                    System.out.print("Masukkan jari-jari : ");
                    jari = t.nextFloat();
                    
                    System.out.print("Masukkan tinggi : ");
                    tinggi = t.nextFloat();

                    lp = 2 * Math.PI * jari * (jari + tinggi);
            
                    System.out.println("Luas Permukaan Tabung = 2 * PI * r * ( r + t ) = " + (int)Math.ceil(lp) + " cm");
            
                    System.out.println(" ");

                    ls = 2 * Math.PI * jari * tinggi ;
        
                    System.out.println("Luas Selimut Tabung = 2 * PI * r * t = " + (int)Math.ceil(ls) + " cm");
            
                    System.out.println(" ");
                    la = Math.PI * jari * jari;
        
                    System.out.println("Luas Alas Tabung = PI * r * r = " + (int)Math.ceil(la) + " cm");
            
                    System.out.println(" ");
                    ln = la + ls ;
        
                    System.out.println("Luas Tanpa Tutup Tabung = Luas Selimut + Luas Alas = " + (int)Math.ceil(ln) + " cm");
            
                    System.out.println(" ");
                    volume = Math.PI * jari * jari * tinggi ;
        
                    System.out.println("Volume Tabung = PI * r * r * t = " + (int)Math.ceil(volume) + " cm");
            
                    System.out.println(" ");

                    break ;

                case 3: 
                    System.out.println("-----Kerucut-----");

                    System.out.print("Masukkan jari-jari : ");
                    jari = t.nextFloat();
                    
                    System.out.print("Masukkan tinggi : ");
                    tinggi = t.nextFloat();

                    n = tinggi * tinggi + jari * jari ;

                    s = Math.pow(n, p);
                    System.out.println("s ( trigono dari t dan r ) = " + (int)Math.ceil(s) + "");


                    ls =  Math.PI * jari * s ;
        
                    System.out.println("Luas Selimut Kerucut = PI * r * s = " + (int)Math.ceil(ls) + " cm");
            
                    System.out.println(" ");
                    la = Math.PI * jari * jari;
        
                    System.out.println("Luas Alas Kerucut = PI * r * r = " + (int)Math.ceil(la) + " cm");
            
                    System.out.println(" ");

                    lp = la + ls ;

                    System.out.println("Luas Permukaan Kerucut = Luas Alas + Luas Selimut = " + (int)Math.ceil(lp) + " cm");
            
                    System.out.println(" ");
                   
                    volume = 0.33 * Math.PI * jari * jari * tinggi;
        
                    System.out.println("Volume Kerucut = 1/3 PI * r * r * t = " + (int)Math.ceil(volume) + " cm");
            
                    System.out.println(" ");

                    break ;
            
            }
    
            System.out.println("Thank You....");
            System.out.println(" ");

            System.out.print("Apakah anda ingin mengulang[y/n]?  ");
            t.nextLine();
            String yn = t.nextLine();
            ans = yn.charAt(0);

        }while(ans=='y' || ans == 'Y');


        t.close();
    }

}
