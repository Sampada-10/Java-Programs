package javaProject;

import java.util.Scanner;

public class Customer2 extends Thread{
    ComputerStore c;
    Customer2(ComputerStore c){
        this.c=c;
    }

    Scanner sc=null;
    public void run(){
        System.out.println("Which item you have to purchase\n" +
                "1)Mouse\n2)Keyboard\n3)Computer\n4)CPU");
        System.out.print("Enter choice: ");
        sc=new Scanner(System.in);
        switch (sc.nextInt()){
            case 1->{
                System.out.println("Enter mouse quantity do you want to buy");
                c.sellMouse(sc.nextInt());
            }
            case 2->{
                System.out.println("Enter Keyboard quantity do you want to buy");
                c.sellKeyboard(sc.nextInt());
            }
            case 3->{
                System.out.println("Enter Computer quantity do you want to buy");
                c.sellComputer(sc.nextInt());
            }
            case 4->{
                System.out.println("Enter CPU quantity do you want to buy");
                c.sellCPU(sc.nextInt());
            }
        }
    }
}