import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i;
        int k = 0; //count
        int[] company = new int[7];
        int[] player = new int[7];
        System.out.print("совпали номера элементов -> ");
        for(i = 0; i<= company.length-1;i++){
            company[i] = (int)( Math.random()*10);
            player[i] = (int)( Math.random()*10);
            if(player[i] == company[i]){
                System.out.print(i + " ");
                k++;

            }

        }
        System.out.println("");

        System.out.println("компания - " + Arrays.toString(company));
        System.out.println("игрок - " + Arrays.toString(player));
        System.out.println("количество совпадений: " + k);
    }
}