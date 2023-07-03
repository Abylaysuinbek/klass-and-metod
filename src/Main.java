import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student();

        System.out.println(stud1.toString());
        Scanner s = new Scanner(System.in);

        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Area of the triangle: " + triangle.getArea());
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());


                Rectangle rectangle1 = new Rectangle(6, 9);
                Rectangle rectangle2 = new Rectangle(10, 14);

                System.out.println("Area of rectangle 1: " + rectangle1.returnArea());
                System.out.println("Area of rectangle 2: " + rectangle2.returnArea());

        Average average = new Average();
        average.calculateAverage(5, 10, 15);

        Movie movie1 = new Movie("Focus", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Protagonist", "20th Century Studios");

        System.out.println("Movie 1:");
        System.out.println("Title: " + movie1.title);
        System.out.println("Studio: " + movie1.studio);
        System.out.println("Rating: " + movie1.rating);

        System.out.println("\nMovie 2:");
        System.out.println("Title: " + movie2.title);
        System.out.println("Studio: " + movie2.studio);
        System.out.println("Rating: " + movie2.rating);
            }
        }








