import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        translate(width / 2, height / 2); // sets the 0,0 point to be the centre of the screen
        background(255);
        triangle(0f, -200f, 173f, 100f, -173f, 100f);
        fill(0);
        textSize(20);
        text(". (0, 0)", 0f, 0f);
        text(" (0, -200)", 0f, -200f);
        text(" (173, 100)", 173f, 100f);
        text(" (-173, 100)", -173f, 100f);

        // x1 y1 x2 y2 x3 y3
        drawTriangles(0f, -200f, 173f, 100f, -173f, 100f, 6);
    }

    public void drawTriangles(float x1, float y1, float x2, float y2, float x3, float y3, int level) {
        noFill();
        // fill(levelColour, 0, 0);
        triangle(x1, y1, x2, y2, x3, y3);

        // recursion ends when level equals 1
        if (level > 1) {
            level--;
            float base = (x2 - x3);
            float midX = base / 2;
            float oneThirdX = base / 3;

            float oneThirdY = (y3 - y1) / 3;
            float twoThirdY = 2 * oneThirdY;

            float Ax;
            float Ay;
            float Bx;
            float By;
            float Cx;
            float Cy;
            float Dx;
            float Dy;
            float Ex;
            float Ey;
            float Fx;
            float Fy;
            float Gx;
            float Gy;

            // left corner offset to the right by 1/3 of base, top - 1/3 of height
            Ax = x3 + base / 3;
            Ay = y1 + (oneThirdY);

            // right corner offset to the left by 1/3 of base, top - 1/3 of height
            Bx = x2 - base / 3;
            By = y1 + (oneThirdY);

            // left corner offset to the right by 1/6 of base, top - 2/3 of height
            Cx = x3 + base / 6;
            Cy = y1 + twoThirdY;

            // center (base/2), top - 2/3 of height
            Dx = x3 + base / 2;
            Dy = y1 + twoThirdY;

            // right corner offset to the left by 1/6 of base, top - 2/3 of height
            Ex = x2 - base / 6;
            Ey = y1 + twoThirdY;

            // center (base/2) offset to the left by 1/6 of base, bottom
            Fx = Dx - base / 6;
            Fy = y3;

            // center (base/2) offset to the right by 1/6 of base, bottom
            Gx = Dx + base / 6;
            Gy = y3;

            // debugging friends
            // text("A", Ax, Ay);
            // text("B", Bx, By);
            // text("C", Cx, Cy);
            // text("D", Dx, Dy);
            // text("E", Ex, Ey);
            // text("F", Fx, Fy);
            // text("G", Gx, Gy);

            drawTriangles(x1, y1, Ax, Ay, Bx, By, level);
            drawTriangles(Ax, Ay, Cx, Cy, Dx, Dy, level);
            drawTriangles(Bx, By, Dx, Dy, Ex, Ey, level);
            drawTriangles(Cx, Cy, Fx, Fy, x3, y3, level);
            drawTriangles(Dx, Dy, Fx, Fy, Gx, Gy, level);
            drawTriangles(Ex, Ey, Gx, Gy, x2, y2, level);
        }
    }
}