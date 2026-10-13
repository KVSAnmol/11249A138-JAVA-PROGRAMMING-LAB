import java.awt.*;

public class ColorPalette {
    public static void main(String[] args) {
        Frame f = new Frame("Color Palette");
        f.setLayout(new GridLayout(2, 3));

        Color[] colors = {
            Color.RED, Color.GREEN, Color.BLUE,
            Color.YELLOW, Color.ORANGE, Color.MAGENTA
        };

        String[] names = {
            "Red", "Green", "Blue",
            "Yellow", "Orange", "Magenta"
        };

        for (int i = 0; i < colors.length; i++) {
            Panel p = new Panel();
            p.setBackground(colors[i]);
            p.add(new Label(names[i]));
            f.add(p);
        }

        f.setSize(400, 200);
        f.setVisible(true);
    }
}