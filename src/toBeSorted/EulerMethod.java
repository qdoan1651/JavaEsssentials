package toBeSorted;

 /** The calculation program for item ZillDiffEQ8_09.R.001
 * Euler, Improved Euler and RK4 methods
 * includes run for seed 26700 
 * @author Aleksandr Ageev 
 *
 */

public class EulerMethod
{

   public static void main(String[] args)
   {
      // constants 
      // Seed 26700
      double h = 0.8;
      int n5 = 5, n10 = 10;
      double x0 = 1;
      double y0 = 2;
      
      // Euler 5
      double[] resultArray = new double[n5+1];
      resultArray = euler(h, n5, x0, y0);
      printResult("Euler method n=5", resultArray);
      
      // Euler 10
      System.out.println();
      resultArray = new double[n10+1];
      resultArray = euler(h/2, n10, x0, y0);
      printResult("Euler method n=10", resultArray);

      // ImpEuler 5
      resultArray = new double[n5+1];
      resultArray = impEuler(h, n5, x0, y0);
      printResult("Improved Euler method n=5", resultArray);
      
      // ImpEuler 10
      
      System.out.println();
      resultArray = new double[n10+1];
      resultArray = impEuler(h/2, n10, x0, y0);
      printResult("Improved Euler method n=10", resultArray);
      
   // RK4 5
      resultArray = new double[n5+1];
      resultArray = fourthOrderRungeKutta(h, n5, x0, y0);
      printResult("RK4 method n=5", resultArray);
      
      // RK4 10
      resultArray = new double[n10+1];
      resultArray = fourthOrderRungeKutta(h/2, n10, x0, y0);
      printResult("RK4 method n=10", resultArray);
   }
   
   public static void printResult(String str, double[] resultArray) {
      System.out.println();
      System.out.println(str);
      
      for (int i = 0; i < resultArray.length; i++ ) {
         System.out.format("n= %d; y= %.4f%n", i, resultArray[i]);
      }
   }
   
   // Fourth-Order Runge-Kutta
   
   public static double[] fourthOrderRungeKutta(double h, int n, double x0, double y0){
      double[] result = new double[n+1];
      double x = x0;
      double y = y0; 
      double k1, k2, k3, k4;
      result[0] = y0;
      
      for (int i = 0; i < n; i++) {
         
         k1 = fun2LnXY( x, y );
         k2 = fun2LnXY( x + h/2 , y + (h/2) * k1 );
         k3 = fun2LnXY( x + h/2 , y + (h/2) * k2 );
         k4 = fun2LnXY( x + h , y + h * k3);
         
         y = y + ( h/6 ) * ( k1 + 2*k2 + 2*k3 + k4);
         x += h;
         result[(i+1)] = y;
      }
      
      return result;
   }
   
   // Immproved Euler method
   public static double[] impEuler(double h, int n, double x0, double y0){
      double[] result = new double[n+1];
      double x = x0;
      double y = y0, y_imp = 0;
      result[0] = y0; 
      for (int i = 0; i < n; i++) {
        
         y_imp = y + h*fun2LnXY(x, y);
        
         y = y + (h/2)*(fun2LnXY(x, y)+fun2LnXY(x+h, y_imp)); 
         
         x += h;
         
         result[(i+1)] = y;
      }
      
      return result;
   }
   
   // Euler Method 
   public static double[] euler(double h, int n, double x0, double y0){
      double[] result = new double[n+1];
      double x = x0;
      double y = y0;
      result[0] = y0; 
      for (int i = 0; i < n; i++) {
         y += h*fun2LnXY(x, y);
         x += h;
         result[(i+1)] = y;
      }
      
      return result;
   }
   
   public static double fun2LnXY(double x, double y) {
      return 2 * Math.log(x*y);
   }

}

/* Run for seed 26700
 
Euler method n=5
n= 0; y= 2.0000
n= 1; y= 3.1090
n= 2; y= 5.8644
n= 3; y= 10.2235
n= 4; y= 15.9010
n= 5; y= 22.6233


Euler method n=10
n= 0; y= 2.0000
n= 1; y= 2.5545
n= 2; y= 3.5740
n= 3; y= 5.0632
n= 4; y= 6.9915
n= 5; y= 9.3117
n= 6; y= 11.9756
n= 7; y= 14.9409
n= 8; y= 18.1722
n= 9; y= 21.6402
n= 10; y= 25.3207

Improved Euler method n=5
n= 0; y= 2.0000
n= 1; y= 3.9322
n= 2; y= 7.8261
n= 3; y= 13.2455
n= 4; y= 19.8091
n= 5; y= 27.2668


Improved Euler method n=10
n= 0; y= 2.0000
n= 1; y= 2.7870
n= 2; y= 4.1086
n= 3; y= 5.9212
n= 4; y= 8.1607
n= 5; y= 10.7666
n= 6; y= 13.6886
n= 7; y= 16.8863
n= 8; y= 20.3276
n= 9; y= 23.9861
n= 10; y= 27.8406

RK4 method n=5
n= 0; y= 2.0000
n= 1; y= 4.1794
n= 2; y= 8.2911
n= 3; y= 13.8587
n= 4; y= 20.5250
n= 5; y= 28.0581

RK4 method n=10
n= 0; y= 2.0000
n= 1; y= 2.8272
n= 2; y= 4.1900
n= 3; y= 6.0383
n= 4; y= 8.3069
n= 5; y= 10.9363
n= 6; y= 13.8774
n= 7; y= 17.0911
n= 8; y= 20.5457
n= 9; y= 24.2157
n= 10; y= 28.0802

 */
