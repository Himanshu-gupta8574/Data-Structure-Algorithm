public class arraysEample {
    public static void demoArray(){
        int ages[]  =  new int[3];
        ages[0]  = 10;
        ages[1]  = 12;
        ages[2]  = 14;
        System.out.println(ages[0]);

        float number[] = new float[4];
        String  name[] = new  String[5];
        name[0] =  "jai shree ram";
        number[0] = 52;
        for( int i=0; i<ages.length;i++){
            System.out.println(ages[i]);
        }

    }
    public static void main(String[] args) {
        // arraysEample obj = new arraysEample();
        // //obj.demoArray();
        demoArray();
        int age[] =  {1,2,3,4};
    }
}