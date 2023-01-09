package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortdemo {

    public static void main(String[] args) {
       /* List<Integer> list= Arrays.asList(9,7,6,5,2,1,4,8);

        List<Integer> l=list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);*/


        List<String> list= Arrays.asList("Deepa","Niraj","Bela","Aaditi");

        List<String> l=list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

    }
}
