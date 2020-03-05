import java.util.*;

public class Graph{
    Set<Node> setOfNodes=new HashSet<Node>();  
    
    // pas besoin de constructeur
    
    public Set<Node> getNodes(){return setOfNodes;}
    
    public void add(Node node){
        setOfNodes.add(node);    
    }
    
    public void add(Node node1,Node node2){
        node1.addNode(node2);
        node2.addNode(node1);
        add(node1);
        add(node2);  
    }

    ///////////////////////////////////////////
    
    public void updateVelocities(double dt){
        for (Node node : setOfNodes){
            node.updateVelocity(dt);    
        }
    }
    
    public void updatePositions(double dt){
        for (Node node : setOfNodes){
            node.updatePosition(dt);    
        }
    }
    
    public void update(double dt){
        updateVelocities(dt);
        updatePositions(dt);
    }
    
}