package recursive.importantRecursiveProblem;

public class FormNumber {
    public static void main(String[] args) {
        //formNumber("",4);
        formNumber("",4,4);
    }
    public static void formNumber(String p,int target,int face){
        if(target==0){
            System.out.println(p);return;
        }
        for(int i=1;i<=face && i<=target;i++){
            formNumber(p+i,target-i,face);
        }
    }

    public static void formNumber(String p,int target){
        if(target==0){
            System.out.println(p);return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            formNumber(p+i,target-i);
        }
    }
}
