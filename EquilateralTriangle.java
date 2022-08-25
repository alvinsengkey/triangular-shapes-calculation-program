public class EquilateralTriangle extends Triangle {

    @Override
    public double Area() {
        this.area = (Math.sqrt(3) / 4) * Math.pow(this.getTriangleBase(), 2);
        return this.area;
    }

    @Override
    public double Perimeter() {
        this.perimeter = 3 * this.getTriangleBase();
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
