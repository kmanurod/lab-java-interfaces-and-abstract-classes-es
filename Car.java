public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getInfo() {
        return String.format("VIN: %s, Make: %s, Model: %s, Mileage: %d", vinNumber, make, model, mileage);
    }

    public class Sedan extends Car {
        public Sedan(String vinNumber, String make, String model, int mileage) {
            super(vinNumber, make, model, mileage);
        }
    }

    public class UtilityVehicle extends Car {
        private boolean fourWheelDrive;
    
        public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
            super(vinNumber, make, model, mileage);
            this.fourWheelDrive = fourWheelDrive;
        }
    
        public boolean isFourWheelDrive() {
            return fourWheelDrive;
        }
    
        @Override
        public String getInfo() {
            return String.format("%s, Four Wheel Drive: %b", super.getInfo(), fourWheelDrive);
        }
    }


    

    public class Truck extends Car {
        private double towingCapacity;
    
        public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
            super(vinNumber, make, model, mileage);
            this.towingCapacity = towingCapacity;
        }
    
        public double getTowingCapacity() {
            return towingCapacity;
        }
    
        @Override
        public String getInfo() {
            return String.format("%s, Towing Capacity: %.2f", super.getInfo(), towingCapacity);
        }
    }
    
}
