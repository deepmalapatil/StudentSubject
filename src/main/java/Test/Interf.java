package Test;

public interface Interf {
    public void m1();
}

  /*  class Demo implements Interf {
        public void m1() {
            System.out.println("hello");
        }
    }*/
class test1{
    public static void main(String[] args) {
        Interf i= () -> System.out.println("hello....with lamda expretion");
        i.m1();
    }
}




