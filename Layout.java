import java.awt.*;

public class Layout {
    public static void main(String[] args) {
        Frame f = new Frame("Flow Layout");
        f.setLayout(new FlowLayout());

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));

        f.setSize(300, 100);
        f.setVisible(true);
    }
}