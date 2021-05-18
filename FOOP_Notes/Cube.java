public class Cube extends Square{
private double Depth;

    Cube(double Height, double Width, double SurfaceArea, double Depth){
	super(Height, Width, SurfaceArea);
	this.Depth=Depth;
}
public double getDepth(){
	return this.Depth=Depth;
}
public double computeSurfaceArea(){
	return this.Height*this.Width*this.Depth;
	
}
public void setDepth(double Depth){
	this.Depth=Depth;
	
}

}