package org.amazon.workspace;

/*
* Find the index of the closing bracket for a given opening bracket in an expression.
Example 1:

Input: string = [PQR[23]][49][20], index = 0

Output: 8
*
*
* */

public class QBDemo {
    public static int getIndexForExpression(String input,int index){
        int open=0;
        int outputIndex=0;
        char[] inputArray=input.toCharArray();
        char c;
        char openBracket='[';
        char closeBracket=']';
        if(inputArray[index]==openBracket){
            for(int i=index;i<inputArray.length;i++){
                c = inputArray[i];
                //System.out.println("Char is ::::"+c);
                if(c==openBracket){
                    open++;
                }else if(c==closeBracket){
                    open--;
                }
                //System.out.println("Open :::::::"+open);
                if(open==0){
                    System.out.printf("The closing index for the bracket  is ::::"+i);
                    outputIndex=i;
                    return outputIndex;
                }
            }
        }else{
            System.out.printf("The given index "+index+" not having the opening bracket!");
        }

        return outputIndex;
    }

    public static void main(String[] args) {
        /*
        * Input:
          string = [[ABC]Y[23]], index = 7
          Output: 10
        *
        * */
      /*  String input = "[PQR[23]][49][20]";
        int index=0;*/

        String input = "[[ABC]Y[23]]";
        int index=7;
        getIndexForExpression(input,index);
    }
}
