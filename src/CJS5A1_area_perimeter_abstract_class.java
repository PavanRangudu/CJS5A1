public class CJS5A1_area_perimeter_abstract_class {
	public static void main(String []s){

		Circle c = new Circle(10); // say, dim1 = 10
		Rectangle r = new Rectangle(8,6); // say, dim1 = 8, dim2 = 6
		Triangle t = new Triangle(3,4,5); // say, sides dim1 = 3, dim2 = 4 , dim3 = 5
		
		c.findArea(); c.findPerimeter();
		r.findArea(); r.findPerimeter();
		t.findArea(); t.findPerimeter();
		
	}

}

abstract class Figure {
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure {
	
	double area,perimeter;
	Circle(int r){
		dim1 = r;
	}
	void findArea(){
		area = Math.PI*dim1*dim1;
		System.out.println("Area of Circle = "+area);
	}
	void findPerimeter(){
		perimeter = 2*Math.PI*dim1;
		System.out.println("Perimeter of Circle = "+perimeter);
	}
}

class Rectangle extends Figure {
	
	double dim2;
	double area,perimeter;
	Rectangle(int l,int b){
		dim1 = l;
		dim2 = b;
	}
	void findArea(){
		area = dim1*dim2;
		System.out.println("Area of Rectangle = "+area);
	}
	void findPerimeter(){
		perimeter = 2*(dim1 + dim2);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}
}

class Triangle extends Figure {
	
	double dim2,dim3;
	double area,perimeter;
	Triangle(int a,int b,int c){
		dim1 = a;
		dim2 = b;
		dim3 = c;
	}
	void findArea(){
		double p = (dim1+dim2+dim3)/2;
		area = Math.sqrt(p*(p-dim1)*(p-dim2)*(p-dim3));
		System.out.println("Area of Triangle = "+area);
	}
	void findPerimeter(){
		perimeter = dim1+dim2+dim3;
		System.out.println("Perimeter of Triangle = "+perimeter);
	}
}
