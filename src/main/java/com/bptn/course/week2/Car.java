package com.bptn.course.week2;

public class Car {
	String color;
    String brand;
    int price;

      public Car(String color, String brand, int price) {
        // Fill in the code for Step 4
        this.color = color ;
        this.brand = brand;
        this.price = price;
        //initializing using this keyword 
      }


      void printCarDetails() {
          this.print(); 
    }

    // Fill in the code
     private void print() {
      System.out.println("Car{" +
                  "color='" + color + '\'' +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  '}');}
    


}
