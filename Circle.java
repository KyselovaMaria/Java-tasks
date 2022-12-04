import java.awt.Point;

public class Circle {

    private Point center;
    private int radius;

    public Circle(){
        this( new Point( 0, 0 ) );
    }

    public Circle( int x, int y, int radius ){
        this( new Point( x, y ), radius );
    }

    public Circle( Point center ){
        this( center, 1 );
    }

    public Circle( Point center, int radius ){
        this.setCenter( center );
        this.radius = radius;
    }

    public int getRadius(){ return this.radius; }
    public Point getCenter(){ return this.center; }

    public double getPerimeter(){ return 2 * Math.PI * this.radius; }
    public double getArea(){ return Math.PI * this.radius * this.radius; }

    public void setCenter( int x, int y ){
        this.setCenter( new Point( x, y ) );
    }

    public void setCenter( Point center ){
        this.center = center;
    }

    public boolean equals( Object o ){

        if ( o == this ){ return true; }
        if ( o == null || o.getClass() != this.getClass() ){ return false; }

        Circle c = (Circle) o;
        return ( ((Circle) o).radius == this.radius && ((Circle) o).center.equals( this.center ) );
    }

    public String toString(){
        return "Circle[" + this.center.toString() + ", " + this.radius + "]";
    }
}