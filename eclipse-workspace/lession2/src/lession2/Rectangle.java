package lession2;

public class Rectangle {
	private float length;
	private float width;
	
	Rectangle () {
		this.length = 10;
		this.width = 20;
	};
	
	Rectangle (float length, float width) {
		this.length=length;
		this.width=width;
	};
	
	public float area () {
		return this.length * this.width;
	}
	public float perimetr () {
		return (this.length+this.width)*2;
	}
// generate get/set metod 
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}

