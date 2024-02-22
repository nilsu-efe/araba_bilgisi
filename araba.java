
public class araba {
    
    private String model;
    private int tekerlek;
    private int kapısayısı;

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the tekerlek
     */
    public int getTekerlek() {
        return tekerlek;
    }

    /**
     * @param tekerlek the tekerlek to set
     */
    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    /**
     * @return the kapısayısı
     */
    public int getKapısayısı() {
        return kapısayısı;
    }

    /**
     * @param kapısayısı the kapısayısı to set
     */
    public void setKapısayısı(int kapısayısı) {
        if(kapısayısı<0){
            System.out.println("kapı sayısı 0'dan küçük olamaz");
        }
        else{
            this.kapısayısı=kapısayısı;
        }
    }
    
    
    
}
