import java.util.*;

public class RollTwoDice{
    public static void main(String[] args){
        int desiredSum = GetInput();
        RollTwoDice(desiredSum);
    }

    static void RollTwoDice(int desiredSum){
        boolean found = false;
        Random rand = new Random();
        int a, b, i = 0;

        while(!found){
            a = rand.nextInt(6 - 1) + 1;
            b = rand.nextInt(6 - 1) + 1;
            System.out.println("Dice 1 = " + a + ". Dice 2 = " + b + ".");
            if(a + b == desiredSum){
                found = true;
                System.out.println("Found! Took " + i + " rolls.");
            }
            i++;
        }
    }

    static int GetInput(){
        int input;
        Scanner kb = new Scanner(System.in);

        try{
            System.out.print("Desired Sum?: ");
            input = kb.nextInt();
            kb.close();
            return input;
        }catch(Exception e){
            return GetInput();
            //e.printStackTrace();
        }
    }
}
