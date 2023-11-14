import processing.core.PApplet;

public class Sketch extends PApplet {
    // global variables
    int level = 6;
    int radius = 280;
    int x;;

    public void settings() {
        size(800, 600); // width, height of sketch

    }

    public void setup() {
        background(152, 190, 100); // rgb
    }

    public void draw() {
        drawCircle(width / 2, radius, level); // width is reserved by canvas
    }

    public void drawCircle(int x, int radius, int level) {
        fill(255, 0, 0);
        text("" + level, x, (height - 100) / level);

        float shade = 126 * level / 4.0f;
        fill(shade);
        ellipse(x, height / 2, radius * 2, radius * 2);

        if (level > 1) {
            level--;
            drawCircle(x - radius / 2, radius / 2, level);
            drawCircle(x + radius / 2, radius / 2, level);
            // drawCircle(x - radius / 2, radius / 2, level);
            // drawCircle(x + radius / 2, radius / 2, level);
            // System.out.println(level + " still running");
        }
    }
}