/* 
 * Beginners Java Programming by Mike McMillan
 * Chapter 14: Polymorphism
 * Lesson 5: Working With Interfaces
 */
package oop.interfaces.shape;

public class Rectangle implements Shape {
   private int x;
   private int y;
   private int width;
   private int height;

   Rectangle(int xcor, int ycor, int w, int h) {
      x = xcor;
      y = ycor;
      width = w;
      height = h;
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   public void setX(int xcor) {
      x = xcor;
   }

   public void setY(int ycor) {
      y = ycor;
   }

   public void draw() {
      System.out.println("Drawing a rectangle");
   }
}

