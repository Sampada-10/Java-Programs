package javaProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ComputerStore c=null;
        System.out.println("Enter mouse quantity available in store");
        int m=sc.nextInt();
        System.out.println("Enter keyboard quantity available in store");
        int k=sc.nextInt();
        System.out.println("Enter Computer quantity available in store");
        int comp=sc.nextInt();
        System.out.println("Enter CPU quantity available in store");
        int cpu=sc.nextInt();
        c=new ComputerStore(m,k,comp,cpu);

        Customer1 c1=new Customer1(c);
        c1.start();

        Customer2 c2=new Customer2(c);
        c2.start();

        Customer3 c3=new Customer3(c);
        c3.start();

    }
}
