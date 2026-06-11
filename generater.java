package projects;

public class generater extends BookinfProcess {


 static   String flightNumber() {
        String FlightNumber="";
        for (int i=1;i<=3;i++) {
           FlightNumber= FlightNumber +(int)((Math.random()*10)+2);
        }
        return FlightNumber;

    }
   static String seatnumber (){
        String Seatnumber="";
        for (int i=1;i<=2;i++) {
           Seatnumber=Seatnumber +(int)((Math.random()*10)+0);
        }

        return Seatnumber;
    }

//    public static void main(String[] args) {
//        System.out.println(flightNumber());
//        System.out.println(seatnumber());
//    }

}
