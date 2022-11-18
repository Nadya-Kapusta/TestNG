package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {

    @Test //u don't need the main to run it
    public  void CatsCase2() {
        System.out.println("Hello, CatsCase2");
    }
    @Test(groups = {"Smoke"})
    public  void DogsCase2() {
        System.out.println("Hello, DogsCase2");
    }
    @AfterTest
    public void TestAfter() {
        System.out.println("After test executed in GoToCart");
    }
    @AfterSuite
    public void SuiteAfter() {
        System.out.println("\nSuit is already executed, all done");
    }
}
