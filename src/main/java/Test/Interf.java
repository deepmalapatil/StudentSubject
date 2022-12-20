package Test;

public interface Interf {
    public void add(int a,int b);
}

   /* class Demo implements Interf {
        public void add(int a,int b) {
            System.out.println(a+b);
        }
    }*/
class test1{
    public static void main(String[] args) {
        /*Interf i= new Demo();
        i.add(10,20);*/

//lambada expretion

        Interf i= (a,b)-> System.out.println(a+b);
        i.add(10,20);
    }
}




