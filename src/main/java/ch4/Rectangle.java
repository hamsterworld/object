package ch4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {

    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    // 추가
    public void enlarge(int multiple){
        right *= multiple;
        bottom *= multiple;
        left *= multiple;
        top *= multiple;
    }
}
