import java.util.Arrays;
import java.util.Scanner;


public class MinMax {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list ={25, 65, 59, 86, 54, 589, 65, 23, 268};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.println("Entered Number : ");
        int number = inp.nextInt();

        Arrays.sort(list);{
        }


        for(int i : list){
            if (i < number){
                min = i;
            }
            if (i > number){
                max = i;
                break;
            }
        }
        System.out.println("Nearest and Min Number to Entered Number : " + min);
        System.out.println("Nearest and Max Number to Entered Number : " + max);

    }



}
