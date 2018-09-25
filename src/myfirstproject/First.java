
package myfirstproject;

import java.util.ArrayList;
import java.util.Scanner;

public class First {
    static private String searchWord,addWord,addwordFromInput;    
   static private int post ;
    static private boolean chek = false;

  
    
    
    public static void searchTitel()
    {
         ArrayList <String> doc = new ArrayList <String>();
     
     doc.add("constructor");doc.add("Page 11");     
     doc.add("switch");     doc.add("Page 12");
     doc.add("if");     doc.add("Page 12");
     doc.add("infinite loop");     doc.add("Page 14");
     doc.add("while");     doc.add("15");
     doc.add("do while");     doc.add("15");
     doc.add("chart");     doc.add("Page 17");
     doc.add("arrays");     doc.add("Page 21");
     doc.add("for each");     doc.add("Page 25");
     doc.add("short");     doc.add("Page 30");
     doc.add("long");     doc.add("Page 30");
     doc.add("boolean");     doc.add("Page 31");
     doc.add("byte");     doc.add("Page 32");
     doc.add("main");     doc.add("Page 32");
     doc.add("inheritance");     doc.add("Page 34");
     doc.add("super class");     doc.add("Page 35");
     doc.add("sub class");     doc.add("Page 35");
     doc.add("object class");     doc.add("Page 36");
     doc.add("super");     doc.add("Page 37");
     doc.add("acces modifier");     doc.add("Page 40");
     doc.add("static");     doc.add("Page 45");
     doc.add("overloding");     doc.add("Page 49");
     doc.add("overriding");     doc.add("Page 51");
     doc.add("final");     doc.add("Page 52");
     doc.add("final static");     doc.add("Page 54");
     doc.add("composition");     doc.add("Page 39");
     doc.add("exceptions");     doc.add("Page 60");
     doc.add("finally");     doc.add("Page 65");
     doc.add("exception catcher");     doc.add("Page 68");
     doc.add("exception propagator");     doc.add("Page 70");
     doc.add("runtime exception");     doc.add("Page 73");
     doc.add("assert");     doc.add("Page 77");
     doc.add("polymorphisme");     doc.add("Page 80");
     doc.add("recursive methode");     doc.add("Page 84");
     doc.add("abstract");     doc.add("Page 89");
     doc.add("interface");     doc.add("Page 95");
     doc.add("type casting");     doc.add("Page 104");
     doc.add("empty interface");     doc.add("Page 108");
     doc.add("enum");     doc.add("Page 110");     
     doc.add("instans of");     doc.add("Page 126");
     doc.add("nested class");     doc.add("Page 128");
     doc.add("inner class");     doc.add("Page 131");
     doc.add("local inner class");     doc.add("Page 133");
     doc.add("anonymous inner class");     doc.add("Page 135");
     doc.add(addwordFromInput);
     
     Scanner sc = new Scanner(System.in);
     
       System.out.println("Welcome");
       System.out.print("For Search enter [s], for add enter [a] : ");
       String choise = sc.next();
       sc.nextLine();
    if(choise.equals("s"))
    {
     System.out.print("Enter your search words : ");     
     searchWord = sc.nextLine();
     
     
     for (int i=0 ; i<doc.size();i++)
     {
         if(doc.contains(searchWord))         
             chek = true;            
         
         if(chek == true)
         {             
           // get me the place number on arrayList
          post = doc.indexOf(searchWord);  
          // for print page number
          post = post +1;  
        
          System.out.println("Is her go to -> " + doc.get(post));          
          break;      
          
         }
         else 
        {
          System.out.print("Not found try again " ); 
         break;
        }                 
     }        
    }
     else if(choise.equals("a"))
       {
           
           System.out.print("Enter titel : ");
           doc.add(sc.nextLine());
           
         
       }
    else
         System.out.println("Your enter a wrong carchter please try again ");        
 }      
}
