package Test;

public class Test {
    /*int a=100;
    public int m1(int a){
        return a;
    }
    public int m2(){
        return a;
    }
    public int m3(int a){
        return this.a;
    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.m1(10));
        System.out.println(t.m2());
        System.out.println(t.m3(20));
    }*/
// 1st
   /* public void chekpassorfail(int a){
        if(a>=50){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.chekpassorfail(56);
    }*/

//2nd cheak even and odd no

/*public void getno(int a){
    if(a%2==0) {
        System.out.print("even");
    }
        else {
        System.out.println("odd");
    }
        System.out.println("bye");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.getno(11);
    }*/

    //3rd nested
   /* public void getno(int a){
        if(a==1){
            System.out.println("one");
        }
        else if(a==2){
            System.out.println("two");
        }
        else if(a==3){
            System.out.println("three");
        }
        else if(a==4){
            System.out.println("four");
        }
        else if(a==5){
            System.out.println("five");
        }
        else if(a==6){
            System.out.println("six");
        }
        else if(a==7){
            System.out.println("seven");
        }
        else {
            System.out.println("eight");
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.getno(8);
    }*/
   /* public void getno(int number){
        switch (number) {
            case 1:
                System.out.println("Sunday");break;
            case 2:
                System.out.println("moday");break;
            case 3:
                System.out.println("tuesday");break;
            case 4:
                System.out.println("wedsday");break;
            case 5:
                System.out.println("thusday");break;
            case 6:
                System.out.println("friday");break;
            case 7:
                System.out.println("saturday");break;
            default:
                System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.getno(5);
    }*/
   /* public int sumandavgofno(){
        int lowno=10;
        int highno=50;

        int avgno;
        int sum=0;
        for(int i = lowno; i<=highno; ++i){
          sum+=i;

        }
        int result=sum;*/
       /* avgno=(lowno+highno)/2;
        return avgno;

    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.sumandavgofno());
    }*/
        /*
        public void sumofevenandodd(){
            int no1=2;
            int no2=10;
            int sumodd=0;
            int sumeven=0;
            int avg;

            for(int i=no1;i<=no2;i++){
                if(i%2==0){
                    System.out.println(sumeven=sumeven+i);
                }
                else{
                   System.out.println(sumodd=sumodd+i);
                }
            }
        }*/
/*public boolean oddno(int no){
    boolean result=true;
    if(no%2==1){
       System.out.println("oddno");
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    return result;
}
    public static void main(String[] args) {
        Test t=new Test();
        t.oddno(10);
    }*/
    /*public boolean findeight(int no,String b){
        boolean result=false;
        boolean a=Integer.toString(no).contains(b);
        if(a==true){
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        Test t=new Test();
        boolean r=t.findeight(17,"7");
        System.out.println(r);
    }*/
    public void printyes() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("yes");
                throw new Exception("not possible");
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.printyes();
    }
}
