package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo {


    public static void main(String[] args) {
        //find even no from list
       /* List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        List<Integer> l=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(l);*/

        //Convert all words into uppercase
        List<String> list=new ArrayList<String>();
        list.add("niraj");
        list.add("deepa");
        list.add("aaditi");
        list.add("bela");
        System.out.println(list);

        List<String> convertuppercaselist=list.stream().filter(name->name.length()>=5 && name.length()<=5).collect(Collectors.toList());
        System.out.println(convertuppercaselist);
    }
}
