package ru.proffen;

public class BackSpaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        String repS = s.replaceAll("[a-z]#", "");
        String repT = t.replaceAll("[a-z]#", "");

        String temp;

        do {
            temp = repS;
            repS = repS.replaceAll("[a-z]#", "");

        } while (!temp.equals(repS));

        do {
            temp = repT;
            repT = repT.replaceAll("[a-z]#", "");

        } while (!temp.equals(repT));

        repS = repS.replaceAll("#", "");
        repT = repT.replaceAll("#", "");


        return repS.equals(repT);
    }

    public static void main(String[] args) {
        String test = "ab##";

        System.out.println(test.replaceAll("[a-z]#", ""));
    }
}


