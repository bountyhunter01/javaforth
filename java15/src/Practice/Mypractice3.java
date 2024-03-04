package Practice;

import java.util.Scanner;

interface Car {
    void getDetails();
}

class Sedan implements Car {
    String name;
    int price;
    String manufacturer;

    public Sedan(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void getDetails() {
        System.out.println("모델명: " + name + ", 가격: " + price + ", 제조사: " + manufacturer);
    }
}

class SUV implements Car {
    String name;
    int price;
    String manufacturer;

    public SUV(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void getDetails() {
        System.out.println("모델명: " + name + ", 가격: " + price + ", 제조사: " + manufacturer);
    }
}

public class Mypractice3 {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 자동차 정보를 입력하세요.");
            System.out.print("모델명: ");
            String name = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();  // 줄바꿈 문자 제거
            System.out.print("제조사: ");
            String manufacturer = sc.nextLine();

            if (i == 0) {
                cars[i] = new Sedan(name, price, manufacturer);
            } else {
                cars[i] = new SUV(name, price, manufacturer);
            }
        }

        for (Car car : cars) {
            car.getDetails();
        }//모델명: 세단, 가격: 1000, 제조사: 현대     출력값임
        //모델명: 에스유브이, 가격: 100, 제조사: 기아

        sc.close();
    }
}
