
public class FizzBuzz {

    public FizzBuzz(){
    
    }
    
    public String answer(int number) {
        if(number % 3 == 0)
           return "Fizz";
        else if(number % 5 == 0)
            return "Buzz";
        else if( (number % 3 == 0) && (number % 5 == 0))
            return "FizzBuzz";
        return String.valueOf(number);
    }
}
