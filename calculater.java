//package in.kgcoding.utils;

public class calculater {
    public static void main(String[] args) {
        circle cir  = new circle(5.5);
        rectanglee react = new rectanglee(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double reactArea = react.breadth * react.length;

        System.out.printf("area of the circle is: %s, area of the reatangle is: %s "+cirArea,reactArea);
    }
    
}
