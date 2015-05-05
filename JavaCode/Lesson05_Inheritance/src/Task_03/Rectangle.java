package Task_03;

public class Rectangle extends Figure {

    public int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double square() {

        return height * width;
    }

    public void draw(char symbol, char space) {

        char[][] rectangle = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1)) {
                    rectangle[i][j] = symbol;
                } else if (j == 0 || j == (width - 1)) {
                    rectangle[i][j] = symbol;
                } else {
                    rectangle[i][j] = space;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }

    }

}
