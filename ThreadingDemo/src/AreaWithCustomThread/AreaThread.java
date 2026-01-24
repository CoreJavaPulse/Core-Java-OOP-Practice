package AreaWithCustomThread;

public class AreaThread implements Runnable {

	Area area;
	float radius;
	float base;
	float height;
	float length;
	float breadth;

	public AreaThread(Area area, float radius, float base, float height,
			float length, float breadth) {

		this.area = area;
		this.radius = radius;
		this.base = base;
		this.height = height;
		this.length = length;
		this.breadth = breadth;

		Thread thread = new Thread(this);
		thread.start();	}

	@Override
	public void run() {
		area.circleArea(radius);
		area.triangleArea(base,height);
		area.rectArea(length,breadth);	
	}
}
