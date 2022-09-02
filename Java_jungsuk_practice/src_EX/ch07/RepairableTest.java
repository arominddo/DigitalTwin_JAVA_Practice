//package ch07;
//
//class RepairableTest{
//	public static void main(String[] args) {
//		Tank tank = new Tank();
//		Dropship dropship = new Dropship();
//
//		Marine marine = new Marine();
//		SCV	scv = new SCV();
//
//		scv.repair(tank);	// SCV가 Tank를 수리하도록 한다.
//		scv.repair(dropship);
//		scv.repair(marine);	
//	}
//}
//
////class LiftableImpl implements Liftable { }
////
////class Barrack extends Building implements Liftable {
////	LiftableImple l = new LiftableImpl();
////	
////	void liftoff() {
////		l.liftoff();
////	}
////}
////
////interface Liftable {}
//
//interface Repairable {}
//class GroundUnit extends Unit {
//	GroundUnit(int hp) {
//		super(hp);
//	}
//}
//
//class AirUnit extends Unit {
//	AirUnit(int hp) {
//		super(hp);
//	}
//}
//
//class Unit {
//	int hitPoint;
//	final int MAX_HP;
//	Unit(int hp) {
//		MAX_HP = hp;
//	}
//	//...
//}
//
//class Tank extends GroundUnit implements Repairable {
//	Tank() {
//		super(150);		// Tank의 HP는 150이다.
//		hitPoint = MAX_HP;
//	}
//
//	public String toString() {
//		return "Tank";
//	}
//	//...
//}
//
//class Dropship extends AirUnit implements Repairable {
//	Dropship() {
//		super(125);		// Dropship의 HP는 125이다.
//		hitPoint = MAX_HP;
//	}
//
//	public String toString() {
//		return "Dropship";
//	}
//	//...
//}
//
//class Marine extends GroundUnit
//								implements Repairable
//														{
//	Marine() {
//		super(40);
//		hitPoint = MAX_HP;
//	}
//	//...
//}
//
//class SCV extends GroundUnit implements Repairable{
//	SCV() {
//		super(60);
//		hitPoint = MAX_HP;
//	}
//
//	void repair(Repairable r) {
//		if (r instanceof Unit) {
//			Unit u = (Unit)r;
//			while(u.hitPoint!=u.MAX_HP) {
//				/* Unit의 HP를 증가시킨다. */
//				u.hitPoint++;
//			}
//			System.out.println( u.toString() + "의 수리가 끝났습니다.");
//		}
//	}	
//	//...
//}
//
///*
// 
// 
// 
//marine 객체 : Marine, GroundUnit, Unit, Objext
//tank 객체 : Tank, GroundUnit, Unit, Object, Repairable
//dropship 객체 : Dropship, AirUnit, Unit, Object, REpairable
//barraks 객체 : Building, Construct, Object, Repairalbe
//
// 
// 
// 
// 
// 
// */
