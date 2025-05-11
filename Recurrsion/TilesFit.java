public class TilesFit {
    public static int Placements(int n ,int m){
        if (n == m){
            return 2;
        }
        if  (n < m){
            return 1;
        }
        //Vertical Placements
        int VerticalPlacements = Placements(n-m , m);
        //Horizontal Placements
        int HorizontalPlacements = Placements(n-1, m);

        return VerticalPlacements + HorizontalPlacements;
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        System.out.println(Placements(n, m));
    }
    
}
