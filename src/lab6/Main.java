package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch(taskNum) {
            case 1:
                // TODO: uncomment for Task1
                // Car mercedes1 = new Car(20000, Car.CarType.MERCEDES, 2019);
                // System.out.println(mercedes1);

                // Car fiat1 = new Car(7000, Car.CarType.FIAT, 2020);
                // System.out.println(fiat1);

                // Car skoda1 = new Car(12000, Car.CarType.SKODA, 2022);
                // System.out.println(skoda1);

                // Dealership dealership1 = new Dealership();
                // System.out.println(dealership1);

                break;
            case 2:
                // TODO: uncomment for Task2
                // List<Car> cars2 = new ArrayList<>();

                // cars2.add(new Car(20000, Car.CarType.MERCEDES, 2011));
                // cars2.add(new Car(35000, Car.CarType.MERCEDES, 2016));
                // cars2.add(new Car(3500, Car.CarType.FIAT, 2009));
                // cars2.add(new Car(7000, Car.CarType.FIAT, 2011));
                // cars2.add(new Car(12000, Car.CarType.SKODA, 2016));
                // cars2.add(new Car(25000, Car.CarType.SKODA, 2022));

                // Dealership dealership2 = new Dealership();

                // for (Car car : cars2) {
                //     System.out.println("The price for " + car + " after applying discounts: " + dealership2.getDiscountedPrice(car) + "\n");
                // }

                break;
            case 3:
                // TODO: uncomment for Task3
                // Car mercedes3 = new Car(20000, Car.CarType.MERCEDES, 2020);
                // Dealership dealership3 = new Dealership();

                // System.out.println("Final price for " + mercedes3 + " " + dealership3.getFinalPrice(mercedes3));

                break;
            case 4:
                // TODO: uncomment for Task4
                // List<Car> cars4 = new ArrayList<>();

                // TODO: Add cars here

                // System.out.println("Before filtering");
                // for (Car car : cars4) {
                //     System.out.println(car);
                // }

                // TODO: Remove expensive cars here

                // System.out.println("After filtering");
                // for (Car car : cars4) {
                //     System.out.println(car);
                // }

                break;
        }
    }
}

// TODO: Add your classes here