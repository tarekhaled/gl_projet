public class App{
    
    public static void main(String[] args){
        Graph myGraph=Graphs.graph6();
        double tf=10;
        double t0=0;
        SVGAnimation animation=new SVGAnimation(myGraph);
        
        double t=t0;
        double dt=0.1;
        
        for (;;){
            animation.record(t);
            if (t>tf){
                break;
            }
            myGraph.update(dt);
            t=t+dt;
        }
        animation.record(t);
        animation.printToFile("resources/anim.svg");
    }   
}