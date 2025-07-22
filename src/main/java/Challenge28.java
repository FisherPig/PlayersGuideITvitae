public class Challenge28 {
    static class Point {
        private int x;
        private int y;

        private int getY() {
            return y;
        }

        private void setY(int y) {
            this.y = y;
        }

        private int getX() {
            return x;
        }

        private void setX(int x) {
            this.x = x;
        }

        private Point(){
            this.x = 0;
            this.y = 0;
        }

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point pointZero = new Point();
        Point pointOne = new Point(2, 3);
        Point pointTwo = new Point(-4, 0);
        System.out.println(pointZero.x + ", " + pointZero.y);
        System.out.println(pointOne.x + ", " + pointOne.y);
        System.out.println(pointTwo.x + ", " + pointTwo.y);
    }
}
