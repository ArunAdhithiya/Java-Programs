package com.adhithiya.lab2;

public class stringBufferOperations {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Arun");
        StringBuffer s1=new StringBuffer("Adhithiya");
        System.out.println("strings are: "+s+","+s1);
        System.out.println("length: "+s.length());
        System.out.println("length2: "+s1.length());
        System.out.println("firstCharacter: "+s.charAt(0));
        System.out.println("substring: "+s1.substring(2,7));
        System.out.println("reverse: "+s.reverse());
        System.out.println("append: "+s1.append("xyx"));
        System.out.println("insert: "+s1.insert(2,"zzz"));
        System.out.println(s1.delete(2,5));
        System.out.println(s1.delete(9,13));
        System.out.println("equals: "+s.equals(s1));

    }
}
