package example;

/**
 * Created by Ev_Eraser on 2016/3/18.
 */
public class Myclass {
    public String triangle(int a,int b,int c) {
        if(a + b < c || a + c < b || b+ c < a)
            return "notTriangle";
        if(a == b && b == c)
            return "isosceles";
        if(a == b || b == c || a == c)
            return "equilateral";
        else
            return "scalene";
    }
}
