package javaProject;

public class ComputerStore {
    int mouse_quantity,keyborad_quantity,computer_quantity,cpu_quantity;
    ComputerStore(int mouse_quantity,int keyborad_quantity,int computer_quantity,int cpu_quantity){
        this.mouse_quantity=mouse_quantity;
        this.keyborad_quantity=keyborad_quantity;
        this.computer_quantity=computer_quantity;
        this.cpu_quantity=cpu_quantity;
    }
    synchronized void sellMouse(int mouse){
        this.mouse_quantity-=mouse;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Now the mouse quantity is "+mouse_quantity);
    }
    synchronized void sellKeyboard(int keyborad){
        this.keyborad_quantity-=keyborad;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Now the Keyboard quantity is "+keyborad_quantity);
    }

    synchronized void sellComputer(int comp){
        this.computer_quantity-=comp;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Now the Computer quantity is "+mouse_quantity);
    }
    synchronized void sellCPU(int cpu){
        this.cpu_quantity-=cpu;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Now the Keyboard quantity is "+keyborad_quantity);
    }
}