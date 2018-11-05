import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BrbbTest {

    private String [] argsArray;

    @Before
    public void setUp() throws Exception {
        argsArray = new String[]{};
    }

    @Test
    public void test_1() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        Brbb.main(argsArray);
    }

    @Test
    public void test_2() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        Brbb.main(argsArray);
    }



    @Test
    public void test_3() {
        ByteArrayInputStream in = new ByteArrayInputStream("-1".getBytes());
        System.setIn(in);
        Brbb.main(argsArray);
    }

    @After
    public void tearDown() throws Exception {
        Scanner scanner = new Scanner(System.in);
    }
}