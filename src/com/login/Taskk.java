package com.login;

public class Taskk {

	public static void main(String[] args) {
	
     int a [][]=new int [2][2];
     a[0][0]=10;
     a[0][1]=20;
     a[1][0]=30;
     a[1][1]=40;
     
     System.out.println("===for loop===");
     
     for(int i=0; i<a.length; i++) {
    	 for(int j=0; j<a.length; j++) {
    		 System.out.print(a[i][j]+ "  ");
    	 }
    	 System.out.println();
     }
    	 System.out.println("===enhance for loop===");
     
     for (int[] b:a) {
    	 for(int c:b)
    	 System.out.println(c);
     }
     System.out.println("Western");
     System.out.println("Folk");
     System.out.println("Freestyle");
	}
}
