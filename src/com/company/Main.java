package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        HashSet<String>h_set=new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        System.out.println("Original hash set contains:"+h_set);
        h_set.clear();
        System.out.println("HashSet content:"+h_set);
	// write your code here
    }
}
