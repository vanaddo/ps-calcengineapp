package com.pluralsight.calcengine;

public class MathEquation {

  private double leftVal;
  private double rightVal;
  private char opCode;
  private double result;



  public double getLeftVal() {return  leftVal;}
  public void setLeftVal(double leftVal){this.leftVal = leftVal;}
  public double getRightVal() {return rightVal;}
  public void setRightVal(double rightVal){this.rightVal = rightVal;}
  public char getOpcode() {return opCode;}
  public void setOpCode(char opCode) {this.opCode = opCode;}
  public double getResult() {return  result;} //for result since you don't want anyone to modify it you just set the accessor(getter) and not the mutator(setter)


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
