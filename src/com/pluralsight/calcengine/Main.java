package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

      MathEquation[] equations = new MathEquation[4];
      equations[0] = create(100.0d,50.0d, 'd');
      equations[1] = create(25.0d,92.0d, 'a');
      equations[2] = create(225.0d,17.0d, 's');
      equations[3] = create(11.0d,3.0d, 'm');

        //the line below is a foreach statement like c# but uses ":" instead of "in"
        //So in english it reads "For each theResult (individual result) in results print... " result = (theResult)"
        for(MathEquation equation : equations) {
          equation.execute();
          System.out.print("results = ");
          System.out.println(equation.getResult());
        }
      }

      public static MathEquation create(double leftVal, double rightVal, char opCode){
      MathEquation equation = new MathEquation();
      //the 3 lines below creates the instances of the math equation and sets the values
      equation.setLeftVal(leftVal);
      equation.setRightVal(rightVal);
      equation.setOpCode(opCode);

      return equation;
      }
    }




