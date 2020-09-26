public class LineLength {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program !!");
		int l1x1 = RandomPoint();
		int l1x2 = RandomPoint();
		int l1y1 = RandomPoint();
		int l1y2 = RandomPoint();
		int l2x1 = RandomPoint();
		int l2x2 = RandomPoint();
		int l2y1 = RandomPoint();
		int l2y2 = RandomPoint();
		
		double line1 = CalcLen(l1x1,l1x2,l1y1,l1y2);
		String Length1 = Double.toString(line1);
		double line2 = CalcLen(l2x1,l2x2,l2y1,l2y2);
		String Length2 = Double.toString(line2);
		System.out.println("Length of Line 1 is: "+Length1);
		System.out.println("Length of Line 2 is: "+Length2);
		boolean equalTo = (Length1.equals(Length2));
		
		if (equalTo==true) {
			System.out.println("Two Lines are Equal in Length");
		}
		else {
			System.out.println("Two Lines are unEqual in Length");
		}
		
		int comparison = (Length1.compareTo(Length2));
		
		if(comparison>=1) {
			System.out.println("Line 1 is longer than Line 2");
		}
		else if(comparison==00){
			System.out.println("Both lines are Equal in Length");
		}
		else {
			System.out.println("Line 1 is shorter than Line 2");
		}
	}
	
	public static int RandomPoint() {
		return (int)Math.floor(Math.random()*100);
	}
	public static double CalcLen(int x1,int x2,int y1,int y2) {
		return Math.sqrt(((int)Math.pow((x2-x1), 2)+(int)Math.pow((x2-x1), 2)));
		
	}
}
