public class Point3d extends Point2d {
	private double zCord;
	public Point3d (double x, double y, double z) {
		super(x,y);
		zCord=z;
	}
	public Point3d (){
		super();
		zCord=0;
	}
	public double getZ () {
		return zCord;
	}
	public void setZ (double val){
		zCord=val;
	}
	public boolean eq3d (Point3d a){
		return ((a.getZ()==this.getZ())&(a.getX()==this.getX())&(a.getY()==this.getY()));
	} 
	public double  distanceTo (Point3d a){
		return Math.sqrt(Math.pow(a.getX()-this.getX(), 2) + Math.pow(a.getY()-this.getY(), 2) + Math.pow(a.getZ()-this.getZ(), 2));
	}
}