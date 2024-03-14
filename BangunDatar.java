
public class BangunDatar {
    private int p;
    private int l;
    private int s;
    
    
    //Konstruktor untuk Persegi
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    //Konstruktor Untuk Bujur Sangkar
    BangunDatar(int s){
        this.s = s;
    }
    
    void setPanjangLebar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setSisi (int s){
        this.s = s;
    }
    
    int getPanjang(){
        return p;
    }
    
    int getLebar(){
        return l;
    }
    
    int getSisi(){
        return s;
    }
}
