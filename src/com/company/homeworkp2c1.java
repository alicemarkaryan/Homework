package com.company;

import java.util.Scanner;

public class homeworkp2c1 {
    public static void main (String[] arg) {




        String s="madam";
   if(func(s)){
    System.out.println("polindrom");
}
else{
    System.out.println("non polindrom");

}
    }
     static boolean func(String x){
        boolean f=true;
      if(x.length()==1){
      return true;
       }
  if(x.charAt(0)==x.charAt(x.length()-1)){
      return func(x.substring(1,x.length()-1));
  }
  else {
      return false;
  }
}


}
