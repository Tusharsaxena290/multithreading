public class example1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new A());
        Thread t2= new Thread(new B());
        t1.start();
        t2.start();
    }

}
class A implements Runnable{
    @Override
    public void run() {

        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println("Thread A:" + i1);

        }
    }
}
class B implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B:" +i);

        }
    }
}
