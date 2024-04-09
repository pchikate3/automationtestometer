package automationtestometer;

public class TempScale {
	public static void main(String args[])
	{
		double input = 0.0;
		double Fahrenheit;
		double Kelvin;
		Fahrenheit = 1.8*input + 32;
		int Kelvin1 = (int) (input +273);
		System.out.println (input+ " " + "Celsius"+ " "+"=" +" "+  Fahrenheit+ " " +"Fahrenheit");
		System.out.println(input+" "+"Celsius"+" "+"=" +" "+Kelvin1 );
	}}
