package com.demo.test;
import com.demo.service.*;
import java.util.*;
public class TestCircularLinkList {

	public static void main(String[] args) {
		CircularLinkList clist =new CircularLinkList();
		int choice =0;
		Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("1.Add before head.");
        	System.out.println("2.Add at particular position.");
        	System.out.println("3.Add the number accordingly.");
        	System.out.println("4.Display data.");
        	System.out.println("Exit.");
        	System.out.println("Enter your choice:");
        	choice =sc.nextInt();
        	switch(choice) {
        	case 1 ->{System.out.println("Enter a number:");
        	           int n = sc.nextInt();
        		clist.addNode(n);
        	}
        	case 2 ->{
        		System.out.println("Enter a position:");
        		int p = sc.nextInt();
        		System.out.println("Enter a number:");
        		int n = sc.nextInt();
        		clist.addByPosition(p, n);
        	}
        	case 3->{
        		System.out.println("Enter a number:");
        		int n = sc.nextInt();
        		clist.addByValue(n);
        	}
        	case 4->{
        		clist.displayData();
        	}
        	case 5->{
        		System.out.println("Thank you for visiting .");
        	}
        	default->{
        		System.out.println("Wrong Choice.");
        	}
        	}
        	
        }
        while(choice !=4);
	}

}
