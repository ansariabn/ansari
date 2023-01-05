package A.skill.com;

 class plane {
     void takeOff() {
         System.out.println("Plane took off");
     }

     void fly() {
     }


    static class cargoPlane extends plane {
         void fly() {
            System.out.println("CargoPlane fly at low heights");
        }

        void carryGood() {
            System.out.println("CargoPlane Carry goods");

        }
    }

    static class PassengerPlane extends cargoPlane {
         void fly() {
            System.out.println("PassengerPlane fly at medium heights");
        }

        void CarryPassenger() {
            System.out.println("PassengerPlane Carry Passengers");
        }

    }

     static class FighterPlane extends PassengerPlane {
         void fly() {
            System.out.println("FighterPlane fly at medium heights");
        }

        void carryWeapons() {
            System.out.println("FighterPlane Carry Weapons");
        }
    }


    public static void main(String[] args) {
         PassengerPlane p1 = new PassengerPlane();
         p1.takeOff();
         p1.fly();
         p1.CarryPassenger();
        System.out.println("--------------------");
         plane p2 = new FighterPlane();
         p2.takeOff();
         p2.fly();

        System.out.println("--------------------");
        cargoPlane p = new cargoPlane();
        p.takeOff();
        p.fly();
        p.carryGood();
    }


 }
