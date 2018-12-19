package pack_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Calc_DataProviderTest_Soft {

	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testAddMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(calculator.add(a, b), expectedResult);
        soft.assertAll();
    }
 
    @Test(dataProvider = "subtractMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testSubtractMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(calculator.subtract(a, b), expectedResult);
        soft.assertAll();
    }
 
    @Test(dataProvider = "multiplyMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testMultiplyMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(calculator.multiply(a, b), expectedResult);
        soft.assertAll();
    }
    @Test(dataProvider = "divideMethodDataProvider", dataProviderClass = Calc_DataProvider.class)
    public void testDivideMethod(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(calculator.divide(a, b), expectedResult);
        soft.assertAll();
    }
}