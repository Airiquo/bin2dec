import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args){
        Scanner bin = new Scanner(System.in);
        int binaryNum;

        int [] bit8 = {128, 64, 32, 16, 8, 4, 2, 1}; 

        int trueInt = 1;
        int decimal = 0;

        boolean isValid = true;

        
        while(true){

        System.out.print("Enter Byte (8 Digits): ");
        binaryNum = bin.nextInt();
        
        
        //quit
            if(binaryNum == 0){
                break;
            }

        //convert into string
        String byteString = Integer.toString(binaryNum);

        //check length            
            if(byteString.length() > 8){
                System.out.println("Error! Please only enter up to 8 digits");
                continue;
            }

        //check if only contains 0's and 1's
            for(int i = 0; i < byteString.length(); i++){
                char check = byteString.charAt(i);
                if (check != '0' && check != '1'){
                    System.out.println("Error Invalid Number! Please only enter 0's and 1's");
                    isValid = false;
                    break;
                }
            }
            
            //check each char and match with byte array
            for(int i = 0; i < byteString.length(); i++){
                char check = byteString.charAt(i);
                if (check == '1'){
                    decimal += bit8[i];
                }
            }

            if(isValid == true){ 
                System.out.println("Decimal: " + decimal);
                decimal -= decimal;
            }
        }
    }
}