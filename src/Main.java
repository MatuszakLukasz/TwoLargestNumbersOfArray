public class Main {
    public static int countHighestSumValue(int[] tab) {
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        int z = 0;
        for(int i = 0 ; i < tab.length; i++) {
            if(tab[i] >= y){
                y = tab[i];
                z = i;
            }
        }tab[z] = Integer.MIN_VALUE;
        for(int j = 0; j < tab.length;j++){
            if(tab[j] > x && j != z) {
                x = tab[j];
            }

        }
        //wypełnij
        System.out.println(x);
        System.out.println(y);
        return (x+y);
    }

    public static void main(String[] args) {
        int first[] = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 20, 30, 40, 50};
        int second[] = {-1, -5, -4, -2, 1};
        int third[] = { -10, -50, -40, -20, -100};
        System.out.println(countHighestSumValue(first));
        System.out.println(countHighestSumValue(second));
        System.out.println(countHighestSumValue(third));

    }
}