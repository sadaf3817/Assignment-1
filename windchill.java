import java.util.*;

public class windchill
{
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
      
       double temperature, windSpeed;
      
       System.out.println("New Wind Chill Index Calculator");
       System.out.print("Enter the value of temperature in Farhenheit between -45 to 40:");
       temperature=sc.nextDouble();   
       System.out.print("Enter the value of wind speed in MPH between 5 to 60:");
       windSpeed=sc.nextDouble();
       double windSpeedPower=Math.pow(windSpeed,0.16);
       double newWindChill = 35.74+0.6215*temperature-35.75*windSpeedPower+0.4275*temperature*windSpeedPower;
      
      
       System.out.printf("Wind Chill: %f F",newWindChill);
      
       System.out.println("\nProgrammer: Your Name");
      
   }
}
}
  

