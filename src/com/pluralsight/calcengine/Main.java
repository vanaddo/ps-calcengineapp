package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
      double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
      double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
      char[] opCodes = {'d', 'a', 's', 'm'};
      double[] results = new double[opCodes.length];

      for (int i = 0; i < opCodes.length; i++) {
        switch (opCodes[i]) {
          case 'a':
            results[i] = leftVals[i] + rightVals[i];
            break;
          case 's':
            results[i] = leftVals[i] - rightVals[i];
            break;
          case 'd':
            results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
            break;
        /*
         * The above line is basically saying...
         ///
           if(rightVals[i] !=0.0d)
          results[i] = leftVals[i] / rightVals[i];
        else results[i] = 0.0d;
        ///
         */
          case 'm':
            results[i] = leftVals[i] * rightVals[i];
            break;
          default:
            System.out.println("Error - invalid opCode");
            break;


        }
      }
        //the line below is a foreach statement like c# but uses ":" instead of "in"
        //So in english it reads "For each theResult (individual result) in results print... " result = (theResult)"
        for (double theResult : results) {
          System.out.print("results = ");
          System.out.println((theResult));
        }
      }
    }




