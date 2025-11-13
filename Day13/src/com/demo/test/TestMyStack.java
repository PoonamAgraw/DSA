package com.demo.test;
import com.demo.service.*;
import java.util.*;
public class TestMyStack {

	public static void main(String[] args) {
		MyStack mlist = new MyStack();
		Scanner sc = new Scanner(System.in);
		String str1;
		System.out.println("Enter a String:");
		str1=sc.next();
		char[] str = str1.toCharArray();
		for(int i=0;i<str.length;i++) {
			mlist.push(str[i]);
		}
        System.out.println("---------");
        mlist.displayStack();
        char [] arr = new char[str.length];
        for(int i=0;i<str.length;i++) {
        	System.out.println(arr[i]=mlist.pop());
        }
       for(int i=0;i<str.length;i++) {
    	   if(str[i]!=arr[i]) {
    		   System.out.println("String is not Palindrome");
    		   break;
    	   }else {
    		   System.out.println("String is  Palindrome");
    	   }
       }
      
	}

}
