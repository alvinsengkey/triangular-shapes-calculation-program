public class Pyramid extends IsoscelesTriangle {

    @Override
    public double Area() {
        this.area = Math.pow(this.getTriangleBase(), 2);
        return this.area;
    }

    @Override
    public double Perimeter() {
        setTriangleHeight(Math.sqrt(Math.pow(this.getTriangleBase() / 2, 2) + this.getHeight() * this.getHeight()));
        super.Perimeter();
        this.perimeter = 4 * (this.getTriangleBase() + this.hypotenuse);
        return this.perimeter;
    }

    @Override
    public double SurfaceArea() {
        this.surfaceArea = this.Area() + 2 * (this.getTriangleBase()
                * Math.sqrt(Math.pow(this.getTriangleBase() / 2, 2) + this.getHeight() * this.getHeight()));
        return this.surfaceArea;
    }

    @Override
    public double Volume() {
        this.volume = Math.pow(this.getTriangleBase(), 2) * this.getHeight() / 3;
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