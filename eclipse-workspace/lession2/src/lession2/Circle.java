package lession2;

public class Circle {
	private float radius;
	private float diametr;

	Circle (float radius, float diametr) {
		this.radius=radius;
		this.diametr=diametr;
	};
	public float area() {
		return (float) Math.PI*diametr*diametr/4;
	}
	public float perimetr () {
		return (float) Math.PI*radius*2; 
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diametr=" + diametr 	+ "]";
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getDiametr() {
		return diametr;
	}
	public void setDiametr(float diametr) {
		this.diametr = diametr;
	}
	
}
