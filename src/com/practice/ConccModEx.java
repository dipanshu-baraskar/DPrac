package com.practice;

import java.util.*;

public class ConccModEx {

    public static void main(String[] args) {
    //    List<Integer> numbers = Arrays.asList(1, 24, -1, 8, -3, 0);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,24,-1,8,-3,0));

//        List<Integer> numbers = new LinkedList<>(Arrays.asList(1, 24, -1, 8, -3, 0));

//        Iterator<Integer> itr= numbers.iterator();
//        while(itr.hasNext()){
//            Integer val=itr.next();
//
//            if(val<0){
//                itr.remove();
//            }
//        }

        for (Integer i : numbers) {
            if (i < 0) {
                numbers.remove(i);
            }
        }

    }
}
