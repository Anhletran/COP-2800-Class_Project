class Circle
{

    // TODO 1: Create a Circle class BELOW (outside this class) with:
    // - private double radius;
    // - constructor Circle(double radius)
    // - getRadius(), setRadius(double radius)
    // - getArea(), getCircumference()

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            if (radius >= 0) {
                this.radius = radius;
            } else {
                System.out.println("Radius cannot be negative.");
            }
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        // method to calculate circumference
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }

    public class CircleLab_Starter {
    public  static void main(String[] args) {

        // TODO 2: Create a Circle object with radius 5.0
        // Circle c = new Circle(5.0);
        Circle c = new Circle(5.0);

        // TODO 3: Print radius, area, circumference (2 decimals)
        // System.out.printf("Radius: %.2f%n", c.getRadius());
        System.out.printf(" Radius: %.2f%n", c.getRadius());
        System.out.printf(" Area: %.2f%n", c.getArea());
        System.out.printf(" Circumference: %.2f%n", c.getCircumference());
        // TODO 4: Modify radius to 8.5 using setter, then print again
        c.setRadius(8.5);
        System.out.printf(" \n Updated Radius: %.2f%n", c.getRadius());
        System.out.printf(" Updated Area: %.2f%n", c.getArea());
        System.out.printf(" Updated Circumference: %.2f%n", c.getCircumference());

        // TODO 5 (Challenge): Prevent negative radius in setter
    }
}
