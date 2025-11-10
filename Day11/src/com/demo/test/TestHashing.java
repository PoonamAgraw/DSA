package com.demo.test;
import com.demo.service.*;
public class TestHashing {
	public static void main(String[] args) {
		Hashing hlist = new Hashing();
		hlist.insertData(52);
		hlist.insertData(15);
		hlist.insertData(46);
		hlist.insertData(28);
		hlist.insertData(92);
		hlist.insertData(4);
		hlist.displayHashing();
		
	}

}
