import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    /** Тест первого домашнего задания */
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int localNumber = mainClass.getLocalNumber();
        Assert.assertEquals("метод getLocalNumber  должен возвращать число 14", 14, localNumber);
    }

    /** Тест второго домашнего задания */
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int actualNumber = mainClass.getClassNumber();
        int expectedNumber = 45;
        Assert.assertTrue("getClassNumber должен быть > 45", actualNumber > expectedNumber);
    }

    /** Тест третьего домашнего задания */
    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String actualString = mainClass.getClassString();
        String expected1 = "hello";
        String expected2 = "Hello";
        Assert.assertTrue("метод getClassString должен возвращать строку, в которой есть подстрока “hello” или “Hello”",actualString.toLowerCase().contains(expected1) || actualString.contains(expected2));
    }
}









