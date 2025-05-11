public class findPaths {
    public static int CountPaths(int i, int j, int n, int m){
        if (i == m-1 || j == n-1){
            return 1;
        }
        return CountPaths(i+1, j, n, m) + CountPaths(i, j+1, n, m);
    }
    public static void main(String[] args) {
        int n = 4 , m = 5 ;
        int Paths = CountPaths(0, 0, n, m);
        System.out.println("The total Paths : " + Paths);
    }
    
}
