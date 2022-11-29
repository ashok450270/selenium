package TwoWheeler;


public class TwoWheeler {
	
	int noOfWheeler=2;
	short noOfMirrors=2;
	long chassisNumber=23456L;
	boolean isPunctured=false;
	String bikeName="nijaBike";
	 double runningKm=25000;
	 public static void main(String[] args) {
		
		 
		 TwoWheeler nijaBike=new TwoWheeler();
		 System.out.println(nijaBike.noOfWheeler);
		 System.out.println(nijaBike.chassisNumber);
		 System.out.println(nijaBike.isPunctured);
		 System.out.println(nijaBike.bikeName);
		 System.out.println(nijaBike.runningKm);
		 System.out.println(nijaBike.noOfMirrors);
	}
	

}
