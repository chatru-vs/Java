package streamApi;import java.util.Arrays;import java.util.List;import java.util.ArrayList;import java.util.stream.Collectors;import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a List and Filter all even number from list
    List<Integer> list1 = List.of(2,4,50,21,22,67);
     List<Integer> list2 = new ArrayList<>();
     list2.add(11);
     list2.add(15);
     System.out.println(list1);
     List<Integer> list3 = Arrays.asList(23, 567, 12, 677,20);
     List<Integer> listEven=new ArrayList<>();
     for(Integer i:list1){
         if(i %2 == 0 ){
             listEven.add(i);
             System.out.println(listEven);
         }
     }
//    Stream<Integer> stream = list1.stream();
//     List<Integer> NewList= stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(NewList);
        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> newlist1=list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newlist1);;

    }
}
