public class IsoscelesTriangle extends Triangle {

    @Override
    public double Area() {
        this.area = (this.getTriangleBase() * this.getTriangleHeight()) / 2;
        return this.area;
    }

    @Override
    public double Perimeter() {
        this.hypotenuse = Math.sqrt(Math.pow(this.getTriangleBase() / 2, 2) + Math.pow(this.getTriangleHeight(), 2));
        this.perimeter = this.getTriangleBase() + 2 * this.hypotenuse;
        return this.perimeter;
    }

    @Override
    public double SurfaceArea() {
        return this.surfaceArea;
    }

    @Override
    public double Volume() {
        return this.volume;
    }

    @Override
    public void ShowResult() {
        System.out.println("Area\t : " + this.Area());
        System.out.println("Perimeter: " + this.Perimeter());
    }
}
