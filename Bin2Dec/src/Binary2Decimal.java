import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args){
        Scanner bin = new Scanner(System.in);
        int binaryNum;

        int [] bit8 = {128, 64, 32, 16, 8, 4, 2, 1}; 

        int trueInt = 1;

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
           
        //store into an array
        int[] byteArray = new int[byteString.length()];

        //inserting into array
        for(int i = 0; i < byteString.length(); i++){
            byteArray[i] = byteString.charAt(i) - '0';
        }

        int decimal = 0;     

        for(int i = 0; i < byteString.length(); i++){
            if(byteArray[i] == trueInt){
                decimal += bit8[i];
                //System.out.println(decimal);
            }
        }       
            if(isValid == true){ 
                System.out.println("Decimal: " + decimal);
            }
        }
    }
}