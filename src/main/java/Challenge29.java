public class Challenge29 {
    static class Color {
        int red;
        int green;
        int blue;

        public Color() {
            red = 0;
            green = 0;
            blue = 0;
        }

        public int getRed() {
            return red;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public int getBlue() {
            return blue;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }

        public int getGreen() {
            return green;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        final Color white(){
            Color color = new Color();
            color.setRed(255);
            color.setGreen(255);
            color.setBlue(255);
            return color;
        }

        final Color black(){
            Color color = new Color();
            color.setRed(0);
            color.setGreen(0);
            color.setBlue(0);
            return color;
        }

        final Color red(){
            Color color = new Color();
            color.setRed(255);
            color.setGreen(0);
            color.setBlue(0);
            return color;
        }

        final Color orange(){
            Color color = new Color();
            color.setRed(255);
            color.setGreen(165);
            color.setBlue(0);
            return color;
        }

        final Color yellow(){
            Color color = new Color();
            color.setRed(255);
            color.setGreen(255);
            color.setBlue(0);
            return color;
        }

        final Color green(){
            Color color = new Color();
            color.setRed(0);
            color.setGreen(128);
            color.setBlue(0);
            return color;
        }

        final Color blue(){
            Color color = new Color();
            color.setRed(0);
            color.setGreen(0);
            color.setBlue(255);
            return color;
        }

        final Color purple(){
            Color color = new Color();
            color.setRed(128);
            color.setBlue(0);
            color.setGreen(128);
            return color;
        }
    }

    public static void main(String[] args) {

    }
}
