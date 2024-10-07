package com.zohoPDF;

public class ValidExpr {
    public static boolean ValidString(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            } else if (str.charAt(i)==')') {
                count--;
            }
        }
        return count==0?true:false;
    }
    public static boolean isOperator(char character){
        if(character=='+' || character=='-' || character=='*' || character=='/' || character=='^'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = " ((a+b)";
        int result = 1;
        if(ValidString(str)){
            for(int i = 0;i<str.length()-1;i++){
                if(isOperator(str.charAt(i))){
                    int k = i;
                    if(Character.isLetter(str.charAt(k-1)) && Character.isLetter(str.charAt(k+1))){
                        result=1;
                    }
                    else {
                        result=0;
                    }
                }
            }
        }
        else {
            result =0;
        }
        System.out.println(result ==0?"InValid":"Valid");
    }
}
