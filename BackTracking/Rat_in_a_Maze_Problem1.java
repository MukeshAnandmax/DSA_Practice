public class Rat_in_a_Maze_Problem1 {
//https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> dir = new ArrayList<>();
        if(m[0][0]==0){
            res.add("-1");
            return res;
        }
        solve(m,n,res,dir,0,0);

        if( res.size()==0){
            res.add("-1");
            return res;
        }
        return res;

    }

    public static void solve(int[][] m, int n,ArrayList<String> res, ArrayList<String> dir,int i, int j){

        if(i==n-1 && j==n-1){
            res.add( concat( dir));
            return ;
        }

        m[i][j]=0;

        if( isSafe(i+1,j,m,n)){
            //DOWN  side
            dir.add("D");
            solve(m,n,res,dir,i+1,j);
            dir.remove( dir.size()-1);
        }
        
        if( isSafe(i,j-1,m,n)){
            //Left side
            dir.add("L");
            solve(m,n,res,dir,i,j-1);
            dir.remove( dir.size()-1);
        }

        if( isSafe(i,j+1,m,n)){
            //Right side
            dir.add("R");
            solve(m,n,res,dir,i,j+1);
            dir.remove( dir.size()-1);
        }

        if( isSafe(i-1,j,m,n)){
            //UP side
            dir.add("U");
            solve(m,n,res,dir,i-1,j);
            dir.remove( dir.size()-1);
        }

        m[i][j]=1;
        return ;
    }
    public static String concat(  ArrayList<String> dir){
        String str ="";
        for(int i=0;i<dir.size();i++){
            str+=dir.get(i);
        }
        return str;
    }

    public static boolean isSafe( int i,int j,int[][]m,int n){

        return (i<n && j<n && i>=0 && j>=0 && m[i][j]==1);

    }



}
