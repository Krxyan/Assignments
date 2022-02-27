class Circle {

private double radius = 1;
private double diameter;
private double area;

//Constructor for circle class
public Circle(){
		radius = 1;
		diameter = 2 * radius;
		area = Math.PI * Math.pow(radius, 2);
		}

		public void setRadius(double r) {
		radius = r;
		diameter = 2 * radius;
		area = 3.14 * radius * radius;
		}

		public double getRadius() {
		return radius;
		}

		public void computeDiameter() {
		diameter = 2 * radius;
		}

		public void computeArea() {
		area = Math.PI * Math.pow(radius, 2);
		}

		public double getDiameter() {
		return diameter;
		}

		public double getArea() {
		return area;
		}
		}