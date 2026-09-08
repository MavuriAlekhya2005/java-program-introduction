package project2examples;


import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bill=0;
		int units = 0;
		System.out.println("choose your connection:");
		String type = sc.next();
		switch(type) {
		case "domestic"->{
			System.out.println("enter units:");
			 units = sc.nextInt();
			
			if(units<=100) {
				bill =units*2;
			}
			else if(units>100 && units<=300) {
				bill = units *3;
			}else {
				bill=units*5;
			}
		}
		case "Commerical"->{
			System.out.println("enter units");
		   units = sc.nextInt();
	
			if(units<=100) {
				bill =units*100;
			}else if(units>100 && units<=300) {
				bill = units *6;
			}else {
				bill=units*8;
			}
			
		}
		default->System.out.println("invalid connection");
		}
	System.out.println("connection type:"+type);
	System.out.println("units connection:"+units);
	System.out.println("total electiy bill:"+bill);

	}

}
