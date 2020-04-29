import java.util.Scanner;

class Lab1 {
	public static void main (String[] args){
		Point3d point1 = new Point3d();
		Point3d point2 = new Point3d();
		Point3d point3 = new Point3d();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vvedite koordinaty tochki #1");
		point1.setX(in.nextDouble());
		point1.setY(in.nextDouble());
		point1.setZ(in.nextDouble());
		
		System.out.println("Vvedite koordinaty tochki #2");
		point2.setX(in.nextDouble());
		point2.setY(in.nextDouble());
		point2.setZ(in.nextDouble());
		
		System.out.println("Vvedite koordinaty tochki #3");
		point3.setX(in.nextDouble());
		point3.setY(in.nextDouble());
		point3.setZ(in.nextDouble());
		
		System.out.printf("point1:(%.2f;%.2f;%.2f) \n", point1.getX(), point1.getY(), point1.getZ());
		System.out.printf("point2:(%.2f;%.2f;%.2f) \n", point2.getX(), point2.getY(), point2.getZ());
		System.out.printf("point3:(%.2f;%.2f;%.2f) \n", point3.getX(), point3.getY(), point3.getZ());
		
		if ((point1.eq3d(point2))&(point2.eq3d(point3))&(point1.eq3d(point3))) {
			System.out.println("Vse tochki ravny");
		} else if (point1.eq3d(point2)) {
			System.out.println("tochki 1 i 2 ravny");
		} else if (point2.eq3d(point3)) {
			System.out.println("tochki 2 i 3 ravny");
		} else if (point1.eq3d(point3)) {
			System.out.println("tochki 1 i 3 ravny");
		} else {
			System.out.printf("Square - %.2f \n", computeArea(point1, point2, point3));
		}
	}
	
	public static double computeArea(Point3d t1, Point3d t2, Point3d t3){
		double a = t1.distanceTo(t2);
		double b = t2.distanceTo(t3);
		double c = t3.distanceTo(t1);
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
