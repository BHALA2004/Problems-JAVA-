package com.zoho;

public class balancedParanthesis {
    public static void main(String[] args) {
        String h = "[{}()]";
        while (h.contains("()")){
            h=h.replace("()","");
        }
        while (h.contains("{}")){
            h=h.replace("{}","");
        }
        while (h.contains("[]")){
            h=h.replace("[]","");
        }
        System.out.println(h.isEmpty());

    }
}
