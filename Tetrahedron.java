public class Tetrahedron extends EquilateralTriangle {

    @Override
    public double Area() {
        super.Area();
        return this.area;
    }

    @Override
    public double Perimeter() {
        this.perimeter = 6 * this.getTriangleBase();
        return this.perimeter;
    }

    @Override
    public double SurfaceArea() {
        this.surfaceArea = this.Area() * 4;
        return this.surfaceArea;
    }

    @Override
    public double Volume() {
        this.volume = Math.pow(this.getTriangleBase(), 3) / (6 * Math.sqrt(2));
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
