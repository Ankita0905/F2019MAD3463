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
    public static char[] mostFrequent (String str)
    {
        int temp = 0;
        int count = 0;
        int current = 0;

        char[] fchar = new char[str.length()];

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                char ch1 = str.charAt(j);

                if (ch != ch1) {
                    count++;
                }
            }

            if (count > temp) {
                temp = count;
                fchar[current] = ch;
                current++;
            }
        }
        return fchar;
    }


    public static String replaceSubString(String s1,String s2, String s3)
    {
        int i = s3.indexOf(s1);
        if (i < 0) {
            return s3;
        }

        String prevst = s3.substring(0, i);
        String afst  = s3.substring(i + s1.length());

        return prevst + s2 + afst;
    }

    }



