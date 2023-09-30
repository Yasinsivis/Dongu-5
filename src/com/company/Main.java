package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int us,Taban,i=1;
     Scanner input =new Scanner(System.in);

        System.out.print("Üs olucak Sayıyı Giriniz Lütfen:");
        us=input.nextInt();
        System.out.print("Taban Olucak Sayıyı Giriniz Lütfen:");
        Taban=input.nextInt();
        int Total=1;
         /*while (i<=us){

         Total*=Taban;
         i++;
        }*/
        for(int j=1; j<=us; j++){
            Total*=Taban;
        }
        System.out.println("Sonuç: " + Total);
    }
}
