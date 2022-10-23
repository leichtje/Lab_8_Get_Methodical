import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double total=0;
        double itemPrice;
        boolean done=false;


        do {
            itemPrice= SafeInput.getRangedDouble(in,"What is the price of your item: ",0,10);
            done = !SafeInput.getYNConfirm(in,"Do you have another item?");
            total=itemPrice + total;
        }while(!done);

        System.out.printf("Your total price is: %.2f",total);

    }
}
