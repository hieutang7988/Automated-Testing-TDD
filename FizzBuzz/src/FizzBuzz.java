public class FizzBuzz {
    public int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    public int getNumber() {
        return this.num;
    }

    public boolean getStringNumber() {
        String numberString = Integer.toString(num);
        for ( int i = 0; i < numberString.length(); i++) {
            if (numberString[i] =="3" )
                return true;
            if (numberString[i] == "5")
                return true;
        }
        return false;

    }

    public boolean checkIfHasNumber3(int num) {
        for (String i : getStringNumber(num)) {
            if (i == "3") {
                return true;
            }
             return false;
        }
      return false;
    }

    public boolean checkIfHasNumber5(int num) {
        for (String i : getStringNumber()) {
            if (i == "5") {
                return true;
            }
            return false;

        }
        return false;
    }

    public boolean checkFizz(int i) {
        if (i % 3 == 0)
            return true;
         return false;
    }

    public boolean checkBuzz(int num) {
        if (this.num % 5 == 0)
            return true;
         return false;
    }

    public boolean checkFizzBuzz() {
        if (checkFizz(num) && checkBuzz(num)) {
            return true;
        } return false;
    }

    public String output() {
        if (checkFizz(num) && checkBuzz(num)) {
            return "FizzBuzz";
        } if (checkBuzz(num) || checkIfHasNumber5(num)) {
            return "Buzz";
        }  if (checkFizz(num) || checkIfHasNumber3(num)) {
            return "Fizz";
        } else
            return Integer.toString(this.num);

    }

    @Override
    public String toString() {
        return output();
    }
}


