package Extra3_Lab06;

public abstract class Shape {
    protected double a;
    protected double b;
    public Shape() { this(0.0, 0.0); }
    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /** calcArea
    * 计算形状的面积
    * @return 面积
    */
    abstract public double calcArea();
    
    /*getter a*/
    public double getA(){
		return a;
	}
    /*getter b*/
    public double getB() {
    	return b;
    }
    /*setter a*/
    public void setA(double a) {
    	if(a>0) {
    		this.a=a;
    	}else {
    		this.a=0.0;
    	}
    }
    /*setter b*/
    public void setB(double b) {
    	if(b>0) {
    		this.b=b;
    	}else {
    		this.b=0.0;
    	}
    }
}
