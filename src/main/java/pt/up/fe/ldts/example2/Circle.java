package pt.up.fe.ldts.example2;

public class Circle extends Shape {
    private int r;
    public Circle(int x, int y, int r) {
        super(x, y); this.r = r;
    }
    @Override
    public double getArea(){
        return r*r*Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * r * Math.PI;
    }
    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, r);
    }
}
