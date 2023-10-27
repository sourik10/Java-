
class HelloWorld {
    public static void main(String[] args) {
        
        // String vs Strinigbuffer  -> immutable vs mutable 
        StringBuffer sb = new StringBuffer("Sourik");
        sb.append("Titli");
        System.out.println(sb);
        
        sb.insert(6,"Pan");
        System.out.println(sb);
        sb.replace(6,9,"Puku");
        System.out.println(sb);
        System.out.println(sb.delete(0,6));
        System.out.println(sb);
        System.out.println(sb.reverse());
       
    }
}
