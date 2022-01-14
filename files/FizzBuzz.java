
public class FizzBuzz {

    public FizzBuzz(){
    
    }
    
    public String answer(int number) {
        if(number % 3 == 0)
           return "Fizz";
        if(number % 5 == 0)
            return "Buzz";
        if((number % 15 === 0))
            return "FizzBuzz";
        return String.valueOf(number);
    }
}
