public class TriangularPrism extends RightAngledTriangle {

    @Override
    public double Area() {
        super.Area();
        return this.area;
    }

    @Override
    public double Perimeter() {
        super.Perimeter();
        this.perimeter = 2 * this.perimeter + 3 * this.getHeight();
        return this.perimeter;
    }

    @Override
    public double SurfaceArea() {
        this.surfaceArea = 2 * this.Area()
                + this.getHeight() * (this.getTriangleBase() + this.getTriangleHeight() + this.hypotenuse);
        return this.surfaceArea;
    }

    @Override
    public double Volume() {
        this.volume = this.Area() * this.getHeight();
        return this.volume;
    }

    @Override
    public void ShowResult() {
        System.out.println("Base area\t: " + this.Area());
        System.out.println("Perimeter\t: " + this.Perimeter());
        System.out.println("Surface area\t: " + this.SurfaceArea());
        System.out.println("Volume\t\t: " + this.Volume());
    }

}
