package projects;

public class App extends StoreData{
    public static void main(String[] args) {
      App app = new App();
      app.booking();
        System.out.println("your flight Number : "+flightNumber());
       System.out.println("your seat number : "+seatnumber ());
      app.WriteData();
//      app.ReadData();
    }
}
