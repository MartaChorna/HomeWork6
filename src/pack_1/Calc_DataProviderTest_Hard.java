package pack_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc_DataProviderTest_Hard {

	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testAddMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(a, b), expectedResult);
    }
 
    @Test(dataProvider = "subtractMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testSubtractMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(a, b), expectedResult);
    }
 
    @Test(dataProvider = "multiplyMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testMultiplyMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(a, b), expectedResult);
    }
    @Test(dataProvider = "divideMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testDivideMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(a, b), expectedResult);
    }
}
