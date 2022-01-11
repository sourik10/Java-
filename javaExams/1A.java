class EMP{
    int id;
    String name;
  EMP(String name,int id){
      this.name=name;
      this.id=id;
  }
  public String toString(){
       return "Name: "+name+" "+",ID: "+id;
  }
}
class Scientist extends EMP{
    int noPublication,experience;
    Scientist(String name,int id,int noPublication,int experience){
        super(name,id);
        this.noPublication=noPublication;
        this.experience=experience;
    }
    public String toString(){
       return "Name: "+name+" "+",ID: "+id+" "+ ",No. Of Publication: "+noPublication+" "+",Experience: "+experience;
  }
}
class Dscientist extends Scientist{
    String award;
    Dscientist(String name,int id,int noPublication,int experience,String award){
        super(name,id,noPublication,experience);
        this.award=award;
    }
     public String toString(){
      return "Name: "+name+" "+",ID: "+id+" "+ ",No. Of Publication: "+noPublication+" "+",Experience: "+experience+" "+",Award: "+award;
  }
    
}
public class driver
{
   public static void main(String args[])
   {
       EMP e1=new EMP("RAM",10);
       System.out.println(e1.toString());
       Scientist e2=new Scientist("Shyam",20,5,15);
       System.out.println(e2.toString());
       Dscientist e3=new Dscientist("Sourav",30,8,20,"BALLON D'OR");
       System.out.println(e3.toString());
       
    }
}
