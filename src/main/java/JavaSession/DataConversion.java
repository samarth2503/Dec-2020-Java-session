package JavaSession;

public class DataConversion {

	public static void main(String[] args) {
		
		// String to int:
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String total = "5000";
		int finalTotal = Integer.parseInt(total) + 10 - 20 + 5;
		System.out.println(finalTotal);
		
		if(finalTotal == 4995)
		{
			System.out.println("calculation is correct....");
		}
		
		String y = "100A".replaceAll("A", "");
		System.out.println(y+20);
		
		int j = Integer.parseInt(y);
		System.out.println(j+20);							// Number Format Exception --> NFE
		
		// String to double
		String p = "12.33";
		System.out.println(p+300);
		
		Double d = Double.parseDouble(p);
		System.out.println(d+300);
		
		// int to String
		int marks = 100;
		System.out.println(marks + 20);
		
		//10020
		String m = String.valueOf(marks);
		System.out.println(m+20);
		
		double salary = 34.44;
		String s1 = String.valueOf(salary) + 500;
		System.out.println(s1);
		
		boolean flag = true;
		System.out.println(flag + " Bye");
		
	}

}
