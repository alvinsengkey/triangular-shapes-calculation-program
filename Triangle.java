abstract class Triangle {
    private double triangleBase;
    private double triangleHeight;
    private double height;
    protected double hypotenuse;

    protected double area;
    protected double perimeter;
    protected double volume;
    protected double surfaceArea;

    public double getTriangleBase() {
        return this.triangleBase;
    }

    public double getTriangleHeight() {
        return this.triangleHeight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    abstract public double Area();

    abstract public double Perimeter();

    abstract public double Volume();

    abstract public double SurfaceArea();

    abstract public void ShowResult();

}
