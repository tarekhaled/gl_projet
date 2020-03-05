public class Vector{
    public final double x;
    public final double y;
    
    Vector(double initX,double initY){
        this.x=initX;
        this.y=initY;   
    }
    
    public double getX(){return this.x;}
    
    public double getY(){return this.y;}
    
    public Vector add(Vector vec){
        return new Vector(this.x+vec.x,this.y+vec.y);
    }
    
    public Vector subtract(Vector vec){
        return new Vector(this.x-vec.x,this.y-vec.y);
    }
    
    public Vector scale(double factor){
        return new Vector(factor*this.x,factor*this.y);
    }
    
    public double dotProduct(Vector vec){
        return (x*vec.x+y*vec.y);    
    }
    
    public Vector symmetric(){
        return new Vector(x,-y);    
    }
}