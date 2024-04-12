package geometrie;

/**
* Represents a point in 2D space.
* @author Tomas Proano
* @version 1.0
*/

public class Punkt {

   private float x;
   private float y;

   /**
    * Constructs a Punkt object with the given coordinates.
    *
    * @param x The x-coordinate of the point.
    * @param y The y-coordinate of the point.
    */
   public Punkt(float x, float y) {
       this.x = x;
       this.y = y;
   }

   /**
    * Returns a string representation of the Punkt object.
    *
    * @return The string representation of the point in the format (x, y).
    */
   @Override
   public String toString() {
       return "(" + x + ", " + y + ")";
   }

   /**
    * Returns the x-coordinate of the point.
    *
    * @return The x-coordinate of the point.
    */
   public float getX() {
       return x;
   }

   /**
    * Returns the y-coordinate of the point.
    *
    * @return The y-coordinate of the point.
    */
   public float getY() {
       return y;
   }

   /**
    * Moves the point by the specified displacement in the x and y direction.
    *
    * @param vx The displacement in the x direction.
    * @param vy The displacement in the y direction.
    */
   public void verschiebe(float vx, float vy) {
       this.x += vx;
       this.y += vy;
   }
}