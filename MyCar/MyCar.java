package MyCar;

public class MyCar {
	
public void applyBreak() {
	System.out.println("Apply Break");
	
} 
 
private void applyGear() {
	System.out.println("Apply Gear");

}

private void switchOnAc() {
	System.out.println("Switch On Ac");

}
private void applyAcclerate() {
System.out.println("Apply Acclerate");

}
public static void main(String[] args) {
	
	MyCar Car=new MyCar();
	Car.applyBreak();
	Car.applyGear();
	Car.switchOnAc();
	Car.applyAcclerate();
	
}

}
