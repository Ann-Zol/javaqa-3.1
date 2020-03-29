public class Miles {
    public static void main(String[] args) {
        double ticketPrice = 4801.60; //цена билета
        double bonusMilePrice = 20.0; //цена одной бонусной мили
        int numberOfMiles = (int)(ticketPrice/bonusMilePrice); //начисленные мили за билет
        System.out.println(numberOfMiles);
    }
}
