package com.lambton;

public class LambtonStringTools
{
public  static String reverse(String s)
{
    String revs = " ";

    for(int i = s.length()-1; i >=0; i--)
    {
        revs = revs + s.charAt(i);
    }
    System.out.println("Reverse String: " + revs);

    return s;
}


}

