
public class test {
    
    public static void main(String[] args) {
        
        araba araba1 = new araba();
        
        araba1.setModel("renault");
        System.out.println("model:"+araba1.getModel());
       
        araba1.setTekerlek(4);
        System.out.println("tekerlek sayısı:"+araba1.getTekerlek());
       
        araba1.setKapısayısı(2);
        System.out.println("kapı sayısı:"+araba1.getKapısayısı());
    }
    
}
