
public class BujurSangkar extends BangunDatar {
    BujurSangkar(int s){
        super (s);
    }
    
    int getLuas(){
        int s = super.getSisi();
        return s * s;
    }
    
    int getKeliling(){
        int s = super.getSisi();
        return s + s + s + s;
    }
}
