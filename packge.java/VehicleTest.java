package packge.java;

    public class VehicleTest {
        public static void main(String[] args) {
            Car car = new Car();
            car.setSpeed(60.0);
            car.setFuelLevel(100.0f);
            car.drive(50000); 
    
            System.out.println("Car Speed (mph): " + car.getSpeedMph());
            System.out.println("Car Distance (km): " + car.getDistanceKm());
            System.out.println("Car Remaining Fuel: " + car.calculateRemainingFuel(50.0));
    
            ElectricCar electricCar = new ElectricCar();
            electricCar.setSpeed(60.0);
            electricCar.setFuelLevel(100.0f);
            electricCar.setBatteryLevel(100.0);
            electricCar.drive(50000); 
    
            System.out.println("\nElectric Car Speed (mph): " + electricCar.getSpeedMph());
            System.out.println("Electric Car Distance (km): " + electricCar.getDistanceKm());
            System.out.println("Electric Car Remaining Fuel: " + electricCar.calculateRemainingFuel(50.0));
            System.out.println("Electric Car Remaining Battery: " + electricCar.getBatteryLevel());
        }
    }
    
    
    
    
}
