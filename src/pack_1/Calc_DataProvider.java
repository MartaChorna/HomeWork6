package pack_1;

import org.testng.annotations.DataProvider;

public class Calc_DataProvider {
	@DataProvider(name = "addMethodDataProvider")
    public static Object[][] addMethodDataProvider() {
        return new Object[][] { { 3, 5, 8 }, { 3, 7, 10 }, { 4, 5, 9 } };
    }
 
    @DataProvider(name = "subtractMethodDataProvider")
    public static Object[][] subtractMethodDataProvider() {
        return new Object[][] { { 2, 5, -3 }, { 3, 7, -4 }, { 24, 5, 19 } };
    }
 
    @DataProvider(name = "multiplyMethodDataProvider")
    public static Object[][] multiplyMethodDataProvider() {
        return new Object[][] { { 2, 5, 10 }, { 3, 7, 21 }, { 4, 5, 20 } };
    }
    @DataProvider(name = "divideMethodDataProvider")
    public static Object[][] divideMethodDataProvider() {
        return new Object[][] { { 10, 5, 2 }, { 9, 3, 3 }, { 21, 3, 7 } };
    }

}
