public class Square{
protected double Height, Width, SurfaceArea;


Square(double Height, double Width, double SurfaceArea){
	this.Height=Height;
	this.Width=Width;
	this.SurfaceArea=SurfaceArea;
}

public double getHeight(){
	return Height;
}

public double getWidth(){
	return Width;
}

public double getSurfaceArea(){
	return SurfaceArea;
}

public void setHeight(double Height){
	this.Height=Height;
	
}
public void setWidth(double Width){
	this.Width=Width;
	
}
public double SurfaceArea(){
	return this.Height*this.Width;
}

}