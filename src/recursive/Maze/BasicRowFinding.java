package recursive.Maze;

import java.util.ArrayList;
import java.util.List;

public class BasicRowFinding {
    static int count=0;
    public static void main(String[] args) {
        routeFind(3,7);
        System.out.println(count);
//      // System.out.println(routeFindReturn(3,3));
////        ArrayList<String> list = new ArrayList<>();
////        findRoute("",3,3,list);
////        System.out.println(list);
////        System.out.println(findRoute("",3,3));
////        System.out.println(findRouteDiagonal("",3,3));
//        boolean[][] arr = {{true,true,true},{true,false,true},{true,true,true},{true,false,true}};
//        findRouteWithRestriction("",0,0,arr);
    }
    public static void routeFind(int r,int c){
        if(r==1 || c==1){
            count++;
            return ;
        }
        routeFind(r-1,c);
        routeFind(r,c-1);

    }

    public static int routeFindReturn(int r,int c){
        if(r==1 || c==1){
             return 1;
        }
        int left = routeFindReturn(r-1,c);
        int right = routeFindReturn(r,c-1);
        return left+right;

    }

    public static void findRoute(String p, int r, int c, List<String> list){
        if(r==1 && c==1){
            list.add(p);return;
        }
        if(r>1){
        findRoute(p+"D",r-1,c,list);}
        if ( c>1) {
            findRoute(p+"R",r,c-1,list);
        }

    }

    //->>>> find Route ArrayList


    public static ArrayList<String> findRoute(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);return list;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if(r>1){
            arrayList.addAll(findRoute(p+"D",r-1,c));}
        if ( c>1) {
            arrayList.addAll(findRoute(p+"R",r,c-1));
        }
        return arrayList;
    }

    //-->>>> Moves Diagonal Also

    public static ArrayList<String> findRouteDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);return list;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if(r>1){
            arrayList.addAll(findRouteDiagonal(p+"V",r-1,c));}
        if ( c>1) {
            arrayList.addAll(findRouteDiagonal(p+"H",r,c-1));
        }
        if(r>1 && c>1){
            arrayList.addAll(findRouteDiagonal(p+"D",r-1,c-1));
        }
        return arrayList;
    }


    //->>> Restriction with row and column starts from Zero r=0,c=0
    public static void findRouteWithRestriction(String p, int r, int c,boolean[][] arr){
        if(r== arr.length-1 && c==arr[0].length-1){
            System.out.println(p);return;
        }
        if(!arr[r][c]){
            return;
        }
        if(r< arr.length-1){
            findRouteWithRestriction(p+"D",r+1,c,arr);}
        if ( c< arr[0].length-1) {
            findRouteWithRestriction(p+"R",r,c+1,arr);
        }

    }
}
