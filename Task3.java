class Task3{
	public static void main(String[] args){
	
     //Q1
	double Km;
        Km = 0.621371;                                 //Miles=Km×0.621371
        double Miles;
        Miles = 10 * Km;
	
    //Q2
	double Pi;
        Pi = 3.14;					//v=pi R2 h
        double Radius;
        Radius = 2;
        int h= 10;
        double Volume = Pi * Radius * h;

   //Q3
	int Base = 10;
        int height = 20;                              //A= 1/2(base*height)
        int Area = (1 / 2) * (Base * height);

   //Q4
	double USD = 280.96;                           //The conversion rate from USD to INR.
        float INR = 5;
        double Output = (INR * USD);
	
   //Q5
	int Celcius = 25;
        int Fh = 59;                                   //Fahrenheit=(Celsius×59​)+32
        int Cg = 32;
        int Farn = (Celcius * Fh) + Cg;

   //Q6
	int Cgrade = 77;
        int Frnht = 95;                                  //Celsius=(Fahrenheit−32)×95​ Example: Convert 77°F to Celsius
        int Cv = 32;
        int Celsius = (Cgrade - Cv) * Frnht;
	
   //Q7
	int Centigrade = 25;
        double Farenheit = 273.15;                            //Kelvin=Celsius+273.15
        double Kelvin =  (Centigrade + Farenheit);

	
        System.out.println("Miles = " + Miles);
	System.out.println("Volume = " + Volume);
	System.out.println("Area = " + (Area));
	System.out.println("Output = " + (Output) + " INR");
	System.out.println("Fahrenheit = " + (Farn));
	System.out.println("Celsius = " + (Celsius));
	System.out.println("Kelvin = " + (Kelvin));
	}
}