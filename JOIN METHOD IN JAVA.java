class A extends Thread{
    int j=0;
    public void run(){
        disp();
    }
    
    public void disp(){
         j=50;

    }
}
public class Main{
    public static void main(String[] args){
        A a1 = new A();
        
        a1.start();
        try{
        a1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(a1.j);
    }
}
