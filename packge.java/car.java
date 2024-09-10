public class car {
         double speedKph;
        float fuelLevel;
        int distanceTraveled;
    
        public void setSpeed(double speed) {
            speedKph = speed;
        }
    
        public void setFuelLevel(float fuel) {
            fuelLevel = fuel;
        }
    
        public void drive(int distance) {
            distanceTraveled += distance;
            fuelLevel -= (distance / 1000.0) * 0.5; 
        }
    
        public double getSpeedMph() {
            return speedKph / 1.60934; 
        }
    
        public int getDistanceKm() {
            return distanceTraveled / 1000;
        }

        public int calculateRemainingFuel(double distance) {
            double fuelConsumed = (distance / 1000.0) * 0.5;
            return (int) (fuelLevel - fuelConsumed); 
        }
    }
    
    
    
}
