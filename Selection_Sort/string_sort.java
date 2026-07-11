package Selection_Sort;

public class string_sort {
    public static void sortFruits(String fruits[]){
        for(int i=0;i<fruits.length;i++){
            for(int j=i+1;j<fruits.length;j++){
                if (fruits[j].compareTo(fruits[i]) < 0) {
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String fruits[] = {"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
}
