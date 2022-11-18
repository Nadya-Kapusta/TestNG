package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void LionCaseOpen() {
        System.out.println("Hellos, LionCaseOpen");
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
