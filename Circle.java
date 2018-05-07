
public class Circle {
	private double circumference;
	private double formattedCircumference;
	private double area;
	private double formattedArea;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	public double getCircumference() {
		circumference = Math.PI * 2 * radius;
		return circumference;
	}

	public String getFormattedCircumference() {
		return String.format("%.2f", circumference);
	}

	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public String getFormattedArea() {
		area = Math.PI * radius * radius;
		return String.format("%.2f", area);
	}

	public String formatNumber(double x) {
		return String.format("%.2f", x);
	}

}
