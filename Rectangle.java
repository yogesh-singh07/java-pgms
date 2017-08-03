public class Rectangle {
	int length, breadth,area;

	Rectangle(int l, int b) {
		length = l;
		breadth = b;
		area = length * breadth;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob = new Rectangle(11, 20);
		System.out.println("Area of Rectangle=" + ob.area);
	}

}
