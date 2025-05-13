package ru.proffen;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            floodFillRecursive(image, sr, sc, oldColor, color);
        }

        return image;
    }

    public void floodFillRecursive(int[][] image, int sr, int sc, int oldColor, int color) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color;
            if (sr > 0) {
                floodFillRecursive(image, sr - 1, sc, oldColor, color);
            }
            if (sr < image.length - 1) {
                floodFillRecursive(image, sr + 1, sc, oldColor, color);
            }
            if (sc > 0) {
                floodFillRecursive(image, sr, sc - 1, oldColor, color);
            }
            if (sc < image[0].length - 1) {
                floodFillRecursive(image, sr, sc + 1, oldColor, color);
            }
        }
    }
}