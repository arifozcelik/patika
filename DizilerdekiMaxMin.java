package siniflar;

public class DizilerdekiMaxMin {
    public static void main(String[] args) {
        int[] list = {1 ,141 , -31, 55, 21, -432, 0 , 3 ,85};

        int max=list[0];
        int min=list[0];

        for (int i : list){
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
