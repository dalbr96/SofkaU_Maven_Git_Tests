package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }

    public float division(Long number1, Long number2) {
        logger.info( "Summing {} / {}", number1, number2 );
        try{

            return number1 / number2;
        }
        catch (ArithmeticException e){

            logger.error("Division by zero is not allowed");
            return 0;
        }
    }

}
