package TestNG;

import org.testng.annotations.*;

public class Test3 {
    @Parameters({"ID"}) //to the particular test method - LionCaseOpen
    @Test
    public void LionCaseOpen(String id) {
        System.out.println("Hellos, LionCaseOpen " + id );
    }
    @Test(groups = {"Smoke"},dependsOnMethods = {"CartLionCaseOpenCart"})
    public void LionCaseClose() {
        System.out.println("Hellos, LionCaseClose");
    }
    @Test(dependsOnMethods = {"LionCaseOpen"})
    public void CartLionCaseOpenCart() {
        System.out.println("Hellos, CartLionCaseOpen");
    }
    @BeforeSuite
    public void SuitBefore() {
        System.out.println("Test didn't yet begun\n");
    }
    @BeforeMethod
    public void MethodBefore() {
        System.out.println("AAAAAAAAAAAAAAAAA BEFORE METHOD IN TEST3 AAAAAAAAAAAAAAAA");
    }
}
