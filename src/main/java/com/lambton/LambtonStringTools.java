package com.lambton;

public class LambtonStringTools {
    public static String reverse(String s) {
        String revs = " ";

        for (int i = s.length() - 1; i >= 0; i--) {
            revs = revs + s.charAt(i);
        }
        System.out.println("Reverse String: " + revs);

        return s;
    }

    public static int binaryToDecimal(String s) {
        int a = Integer.parseInt(s);
        return a;
    }


    public static String initials(String s) {
        String initial = "";
        String[] parts = s.split(" ");
        char ini;
        for (int i = 0; i < parts.length; i++) {
            ini = parts[i].charAt(0);
            initial += ini;
        }
        return (initial.toUpperCase());
    }
    public static char mostFrequent(String s)
    {
       char[] a=s.toCharArray();
       for(int i=0;i<a.length;i++)
       {

       }
    }

}

