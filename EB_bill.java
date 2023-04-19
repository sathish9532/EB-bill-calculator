package EB_Bill_Calculator;

import java.util.Scanner;

public class Eb_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eb_bill eb = new Eb_bill();
		eb.check_unit();
		
	}
		private void check_unit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your EB Units consumption: ");
		float no = sc.nextFloat();
		if(no>=0 && no<=100) {
			no=no * 0;
			System.out.println("Government Subsidy Consumption");
			}
		else if(no>=101 && no<=200){
			no = no * 2.25f;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=201 && no<=400) {
			no = no * 4.5f;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=401 && no<=500) {
			no = no * 6;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=501 && no<=600) {
			no = no * 8;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=601 && no<=800) {
			no = no * 9;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=801 && no<=1000) {
			no = no * 10;
			System.out.println("Your EB charges is: "+no);
		}
		else if(no>=1001){
			no = no * 11;
			System.out.println("Your EB charges is: "+no);
		}
		System.out.println();
	}

}

