import java.util.HashMap;
import java.util.Map;

class ImageObject {
    int top;
    int left;
    int height;
    int width;

    public ImageObject(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return "Top: " + top + ", Left: " + left + ", Height: " + height + ", Width: " + width;
    }
}

public class ImageProcessing {
    public static ImageObject findObject(char[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int top = numRows;
        int left = numCols;
        int bottom = -1;
        int right = -1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 'w') {
                    top = Math.min(top, i);
                    left = Math.min(left, j);
                    bottom = Math.max(bottom, i);
                    right = Math.max(right, j);
                }
            }
        }

        int height = bottom - top + 1;
        int width = right - left + 1;

        return new ImageObject(top, left, height, width);
    }

    public static void main(String[] args) {
        char[][] matrix = {
                          {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'w', 'w', 'w', 'w', 'w', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'w', 'w', 'w', 'w', 'w', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'w', 'w', 'w', 'w', 'w', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'w', 'w', 'w', 'w', 'w', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'w', 'w', 'w', 'w', 'w', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
    			  {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}
		          };

        ImageObject result = findObject(matrix);
        System.out.println(result);
    }
}
