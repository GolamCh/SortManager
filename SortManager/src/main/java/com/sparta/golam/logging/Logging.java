package com.sparta.golam.logging;

public class Logging {
    public void runExceptions(){
        int number = 20;
        int divisor = 0;

        try{
            int quotient=number/divisor;
        }
        catch(ArithmeticException e) {
            App.logger.error(e.getMessage(), e);
        } catch (Exception e) {
            App.logger.error(e);
        }
    }

}