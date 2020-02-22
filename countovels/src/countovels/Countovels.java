package countovels;

import java.util.Scanner;
 
class CountVowels
{
 public static void main(String...s)
 {
  String str="";
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  str=sc.nextLine();
 
  for(int i=0;i<str.length();++i)
  {
   switch(str.charAt(i))
   {
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U': count++;  
   }
  }
 
  System.out.println("Number of vowels are "+count);
 }
}  
