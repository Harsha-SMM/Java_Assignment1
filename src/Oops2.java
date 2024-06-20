public class Oops2 {
    public static void main(String[] args) {
        vehicle objvehicle = new vehicle();
        objvehicle.fuel();
        car objcar = new car();
        objcar.fuel();
        vehicle objbike = new bike();
        objbike.fuel();
    }
}

class vehicle {
    public void fuel() {
        System.out.println("Type of fuel used");
    }
}

class car extends vehicle {
    public void fuel() {
        System.out.println("Type of fuel used is diesel");
    }
}

class bike extends vehicle {
    public void fuel() {
        System.out.println("Type of fuel used is petrol");
    }
}