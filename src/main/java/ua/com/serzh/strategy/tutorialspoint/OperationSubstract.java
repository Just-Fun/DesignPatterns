package ua.com.serzh.strategy.tutorialspoint;

/**
 * Created by Serzh on 9/30/16.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}