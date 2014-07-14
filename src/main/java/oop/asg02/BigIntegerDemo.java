public class BigIntegerDemo{
	public static void main(String args[]){
		BigInteger a = new BigInteger(1);
		BigInteger b = new BigInteger("2");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		//Tinh tong 2 so
		BigInteger c = a.add(b);
		
		System.out.println("Tong 2 so la: " + c.toString());
		
		//Tinh hieu 2 so
		BigInteger d = b.subtract(a);
		
		System.out.println("Hieu 2 so la: " + d.toString());
		
		//use compareTo() method
		
		System.out.println("Result return: " + b.compareTo(a));
		
		//use clone() method
		BigInteger e = a.clone();
		
		System.out.println("Tong 2 so la: " + e.add(b).toString());
	}
}