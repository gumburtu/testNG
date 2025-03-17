import org.testng.annotations.*;

public class MyTest {
    @BeforeSuite
    public void test01(){
        System.out.println("1");
    }
    @BeforeTest
    public void test02(){
        System.out.println("2");
    }
    @BeforeClass
    public void test03(){
        System.out.println("3");
    }
    @BeforeGroups
    public void test04(){
        System.out.println("4");
    }
    @BeforeMethod
    public void test05(){
        System.out.println("5");
    }
    @Test
    public void test06(){
        System.out.println("6");
    }
}
