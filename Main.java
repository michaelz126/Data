public class Main {
    public static void main(String[] args) {
        Data d = new Data(7, 5);
        int[][] grid = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        d = new Data(grid);
        System.out.println(d);
        d.repopulate();
        System.out.println(d);
    }
}