import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        noStroke();
        translate(width / 2, height / 2);
        scale(4);
        rotate(frameCount / 50);
        circle1(0, 226, 226);
    }

    public void circle1(int i, int sizex, int sizey) {
        // j is the amount shifted in translation
        int j;

        // base case
        if (i == 15) {
            return;
        }
        // ternary operators
        // fill the even indexes with black, otherwise white
        fill(i % 2 == 0 ? 255 : 237, i % 2 == 0 ? 255 : 55, i % 2 == 0 ? 255 : 64);

        // as time(i) goes on, if it is over 7, then switch over to negative quadrant
        // vice versa
        if (i > 7) {
            j = -5;
        } else {
            j = 5;
        }

        // translate by j shift value
        translate(j, 0);
        // draw an ellipse
        // x, y , width, height
        // the x and y are centered at the origin
        // width is determined by the max width of a circle subtract the current index *
        // 10
        // width is determined by the max height of a circle subtract the current index
        // * 10
        ellipse(0, 0, sizex - (i * 10), sizey - (i * 10));
        circle1(i + 1, sizex, sizey);
    }
}