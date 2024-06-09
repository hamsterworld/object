package appendix2;

import org.springframework.data.geo.Point;

import java.awt.*;

public interface Displayable extends GameObject{
    Point getPosition();
    void update(Graphics graphics);
}
