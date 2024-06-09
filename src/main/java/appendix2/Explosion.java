package appendix2;

import org.springframework.data.geo.Point;

import java.awt.*;

public class Explosion implements Displayable,Effect{
    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public void update(Graphics graphics) {

    }

    @Override
    public void activate() {

    }

    @Override
    public String getName() {
        return "";
    }
}
