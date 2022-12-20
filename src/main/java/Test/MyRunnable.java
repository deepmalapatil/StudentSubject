package Test;

/*public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("child thred");

        }
    }
}*/

//lambada expretion with multithreding concept
    class Test2{
        public static void main(String[] args) {
            Runnable r= () -> {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("child thred");

                }
            };
            Thread t=new Thread(r);
            t.start();
            for(int i = 0; i <= 10; i++){
                System.out.println("main thred");
            }


        }
    }

