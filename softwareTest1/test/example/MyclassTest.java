package example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class MyclassTest {
    private Myclass myClass;
    private int input1;
    private int input2;
    private int input3;
    private String expected;

    public MyclassTest(int input1, int input2,int input3,String expected){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.expected = expected;

    }
    @Before
    public void setUp() throws Exception {
        myClass = new Myclass();
    }

@Parameterized.Parameters
    public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
            {2,2,2,"isosceles"},
            {2,2,3,"equilateral"},
            {2,4,3,"scalene"},
            {2,9,2,"notTriangle"}
    });
    }

//    @After
//    public void tearDown() throws Exception {
//
//    }

    @Test
    public void testTriangle() throws Exception {
        assertEquals(this.expected, myClass.triangle(input1,input2,input3));
    }
}