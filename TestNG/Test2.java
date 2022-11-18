package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
    @Test(enabled = false) //u don't need the main to run it
    public  void CatsCase() {
        System.out.println("Hello, CatsCase");
    }
    @Test(groups = {"Smoke"})
    public  void DogsCase() {
        System.out.println("Hello, DogsCase");
    }
    @Test(timeOut = 4000)
    public  void DogsCaseBone() {
        System.out.println("Hello, DogsCaseBone");
    }
    @BeforeTest
    public void TestBefore() {
        System.out.println("Before test executed in LogIn");
    }
}
