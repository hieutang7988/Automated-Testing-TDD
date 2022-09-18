import static org.junit.jupiter.api.Assertions.*;

class MyDateTest {

    @org.junit.jupiter.api.Test
    void getNextDate() {
        MyDate myDate = new MyDate(1,1,2018);
        MyDate myDate1 = new MyDate(2,1,2018);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate1() {
        MyDate myDate = new MyDate(31,1,2018);
        MyDate myDate1 = new MyDate(1,2,2018);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate2() {
        MyDate myDate = new MyDate(31,1,2018);
        MyDate myDate1 = new MyDate(1,2,2018);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate3() {
        MyDate myDate = new MyDate(30,4,2018);
        MyDate myDate1 = new MyDate(1,5,2018);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate4() {
        MyDate myDate = new MyDate(28,2,2018);
        MyDate myDate1 = new MyDate(1,3,2018);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate5() {
        MyDate myDate = new MyDate(29,2,2020);
        MyDate myDate1 = new MyDate(1,3,2020);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }

    @org.junit.jupiter.api.Test
    void getNextDate6() {
        MyDate myDate = new MyDate(31,12,2018);
        MyDate myDate1 = new MyDate(1,1,2019);

        MyDate actualResult = myDate.getNextDate();

        assertEquals(myDate1.toString(),actualResult.toString());
    }
}