
    public class Car{
        private String make;
        private String model;
        private String color;
        private int year;

        public Car(String make, String model, String color , int year){
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
        }
        public void displayinfo(){
            System.out.println("Car make = "+make);
            System.out.println("Car model = "+model);
            System.out.println("Car color = "+color);
            System.out.println("Car year = "+year);
        }
    }
