import java.util.*;

public class Node{
    Vector position;
    Vector velocity;
    boolean rigidity;
    Set<Node> neighbors;
    
    private static final double FRICTION = -0.8;
    
    Node(Vector initPosition){
        this.position=initPosition;
        this.velocity=new Vector(0,0);
        this.rigidity=false;     
        neighbors = new HashSet<Node>();
    }
    
    public Vector getPosition(){return this.position;}
    
    public boolean isRigid(){return this.rigidity;}
    
    public Set<Node> getNeighbors(){return this.neighbors;}

    public void addNode(Node node){
        neighbors.add(node);
    }

    //////////////////////////////////////////////////////////

    private Vector getForce(){
        Vector force=velocity.scale(FRICTION);
        for (Node neighbor : neighbors){
            force=force.add(neighbor.position.subtract(this.position));
        }
        return force;
    }
    
    public void updateVelocity(double dt){
        velocity=velocity.add(getForce().scale(dt));    
    }
    
    public void updatePosition(double dt){
        if (!isRigid()){
            position=position.add(velocity.scale(dt));
        }
    }      
    
    public void setRigidity(boolean bool){
        this.rigidity=bool;
    }
    
}