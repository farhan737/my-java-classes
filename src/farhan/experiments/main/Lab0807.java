package farhan.experiments.main;

import farhan.experiments.ZoomCar;

public class Lab0807 {
    public static void main(String[] args) {
        ZoomCar c1 = new ZoomCar();
        c1.greet();
        System.out.println("enter company name: ");
        c1.takeCompany();
        System.out.println("enter days to rent for the rental: ");
        c1.takeDays();
        c1.printInvoice();
    }
}
