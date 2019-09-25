package com.lambton;

public class LambtonStringTools
{
public  static String reverse(String s)
{
    String revs = new String();
    String[] words = s.split(" ");
    for(int i = 0; i < words.length; i++)
    {

        String rev = new StringBuffer(words[i]).reverse().toString();
        revs = revs + rev;
    }
  

    return s;

}
}
