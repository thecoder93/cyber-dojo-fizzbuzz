
public class FizzBuzz {

    public FizzBuzz(){
    
    }
    
    public String answer(int number) {
        if(number == 3)
           return "Fizz";
        else if(number == 5)
            return "Buzz";
        return Integer.toString(number);
    }
}
