import java.util.ArrayList;
import java.util.List;

class BulletAdapter implements ShotsTypes {

    private DeadlyBullet adaptee;
    
    public int BULL_W = 34;
    public int BULL_H = 10;

    public BulletAdapter(DeadlyBullet adaptee) {
        this.adaptee = adaptee;
    }
       



@Override
public int getX() {
    return adaptee.xPos;
}

@Override
public int getY() {
    return adaptee.yPos;
}
    
}  