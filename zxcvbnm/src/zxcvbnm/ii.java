package zxcvbnm;

public class ii {
	    public static void main(String[] args) {
	        Car[] cars;
	        cars = new Car[2];

	        cars[0] = new Car();
	        cars[1] = new RacingCar();

	        for (int i = 0; i < cars.length; i++) {
	            Class c = cars[i].getClass();
	            System.out.println(c);
	        }
	    }
	}

	class Car {
	    protected int num;
	    protected double gas;

	    public Car() {
	        num = 0;
	        gas = 0.0;
	        System.out.println("生產了車子");
	    }
	}

	class RacingCar extends Car {
	    public RacingCar() {
	        System.out.println("生產了賽車");
	    }
	}
