public class example2 {
    public static void main(String[] args) {
        C o1=new C();
        D o2=new D();
        o1.start();
        o2.start();


    }
    static class C extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread C: "+i);

            }
        }
    }
    static class D extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread D:" +i);

            }
        }
    }
}
