package com.Revature;
public class Main {

    public static boolean validCard(String cardNo) {
        int cardDigits = cardNo.length(); // Gets the length of the card as a string
        cardDigits = cardDigits - 1; // removes extra digit off the length so it is not account for in cardTotal
        if (cardDigits >= 14 && cardDigits <= 19)
        {
            int cardTotal = 0;

            for (int i = cardDigits; i >= 0; i--) { // Iterators the process backwards and reverses to go from end to beginning

                int d = cardNo.charAt(i) - '0'; // -'0' allows us to convert the String to an integer in ASCII

                if (i % 2 == 0) // if the index of the for loop is an odd number double it
                    d = d * 2; //double the value of it is an odd according to Luhns test

                cardTotal += d / 10; // add the total of the divided value ( 8 / 10 ) will return 0 but (14/10) will return + 1
                cardTotal += d % 10; // Add the remainder of the value to nSum and if above 10 subtract the remainder (8 % 10) will return 8

            }
            return (cardTotal % 10 == 0);
        }
        return false;
    }

    public static void main(String[] args) {
        String cardNum = "1234567890123452";
        String cardNum1 = "583838375987021";
        if (validCard(cardNum))
            System.out.println("valid card");
        else
            System.out.println("Invalid card");
    }
}
