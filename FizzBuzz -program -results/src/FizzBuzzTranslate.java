public class FizzBuzzTranslate {
    int number;
    int num;
    public FizzBuzzTranslate(int number) {
        this.number = number;
    }

    public String converter( ) {
        if (number%3==0 && number%5==0) {
            return "FizzBuzz";
        }
        if (fizz(number) || number%3==0) {
            return "Fizz";
        }
        if (buzz(number)|| number%5==0) {
            return "Buzz";
        }
        return String.valueOf( readTwo(number));
    }

    public boolean fizz(int i) {
        String s = String.valueOf(i);
        if (s.contains("3") == true)
            return true;
        return false;
    }

    public boolean buzz(int i) {
        String s = String.valueOf(i);
        if(s.contains("5") == true)
            return true;
        return false;
    }

    int tens = number/10;
    int one = number%10;

    public static String readOne(int num) {

        switch (num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
      return "";
    }

    public static String readTwo(int num){
        String result = "";
        if(num <10) {
            return readOne(num);
        }

        else if (num <100){
            result = readOne(num/10) + readOne(num%10);
        }
        return result;

    }
}
