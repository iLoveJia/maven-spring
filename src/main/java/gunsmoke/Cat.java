package gunsmoke;

import org.springframework.stereotype.Component;

/**
 * Created by yz on 2020/1/2.
 */
@Component("cat1")
public class Cat {
    private int width;
    private int heigh;

    @Override
    public String toString() {
        return "Cat{" +
                "width=" + width +
                ", heigh=" + heigh +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
}
