//*****Overriding******

class Shape{  
    void draw(){System.out.println("draw shape");}  
    }  

    class Rectangle extends Shape{  
    void draw(){System.out.println("draw rectangle");}  
    }  

    class Circle extends Shape{  
    void draw(){System.out.println("draw circle");}  
    }  

    class Triangle extends Shape{  
    void draw(){System.out.println("draw triangle");}  
    } 

    class PolymorphismDemo{  
    public static void main(String args[]){  
   
    Rectangle r=new Rectangle();  
    r.draw();  
    Circle c=new Circle();  
    c.draw();  
    Triangle t=new Triangle();  
    t.draw();  
    }  
    }  