package baseTest;

import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void setup(){
        System.out.println("i am setup test");
    }
}
