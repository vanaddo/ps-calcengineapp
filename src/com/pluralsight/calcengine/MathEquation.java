package com.pluralsight.calcengine;

public class MathEquation {

  public double leftVal;
  public double rightVal;
  public char opCode;
  public double result;

  public void execute(){

    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'd':
        result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
        break;
        /*
         * The above line is basically saying...
         ///
           if(rightVal !=0.0d)
          result = leftVals[i] / rightVals[i];
        else results[i] = 0.0d;
        ///
         */
      case 'm':
        result = leftVal * rightVal;
        break;
      default:
        System.out.println("Error - invalid opCode");
        break;


    }
  }
}
