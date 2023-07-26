package Tranning;

public class Overlodding {
    public int cal(int a){
        return a*a;
    }
    public  int cal(int a,int b){
        return a*b;
    }
    public String cal(String name){


        String reversedString = "";
        for(int i=name.length(); i>0; i--) {
            reversedString += name.charAt(i-1);
        }
       /* String reversedString = new StringBuffer(name).reverse().toString();
        System.out.println(reversedString);*/




        return reversedString;
    }

    public static void main(String[] args) {
        Overlodding ex=new Overlodding();
       System.out.println(ex.cal("aaditi"));
    }
}
