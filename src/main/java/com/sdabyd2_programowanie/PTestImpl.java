package com.sdabyd2_programowanie;

import java.util.*;

public class PTestImpl {

    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);
    }

    public static int length(List<Integer> aslist) {
        return aslist.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reverseList = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseList.add(numbers.get(i));
        }
        return reverseList;
    }

    public static <T> boolean isPalindrome(List<T> list) {
        List<T> orginal = new ArrayList<T>(list);
        PTestImpl.reverse((List<Integer>) list);
        return Objects.equals(list, orginal);
    }

    public static Object[] removeAt(List<String> list, int k) {
        List<String> input = new ArrayList<String>(list);
        String kth = input.remove(k - 1);
        return new Object[]{input, kth};
    }

//    public static List<String> randomSelect(List<String> strings, int i) {
//        Random random = new Random(System.currentTimeMillis());
//
//        List<String> RandomSelectList = new ArrayList<>();
//        for (int x = 0; x < i; x++) {
//            RandomSelectList.add(strings.get(random.nextInt(random.nextInt(strings.size()))));
//            }
//        return randomSelect();
//    }



}
