class Constructor{
    double cubeSide,coneRad,coneHeight;

    Constructor(double cubeS){  //constructor overloading
        cubeSide=cubeS;
    }
    Constructor(double coneRad,double coneHeight){
        this.coneRad=coneRad;
        this.coneHeight=coneHeight;
    }
    
    double volumeCube(){
        return cubeSide*cubeSide*cubeSide;
    }
    double volumeCone(){
        return 3.14*coneRad*coneRad*coneHeight;
    }
}
public class MyClass {
    public static void main(String args[]) {
        Constructor cube=new Constructor(3);
        System.out.println("volume for cube "+cube.volumeCube());
        
        Constructor cone=new Constructor(4,5);
        System.out.println("volume for cone "+cone.volumeCone());
    }
}
