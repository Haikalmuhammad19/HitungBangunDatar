
public class PersegiPanjang extends BangunDatar{
    
    PersegiPanjang(int p, int l){
        super(p,l);
        
    }
    
    int getLuas(){
        int p = super.getPanjang();
        int l = super.getLebar();
        
        return p * l;
    }
    
    int getKeliling(){
        int p = super.getPanjang();
        int l = super.getLebar();
        return 2 * (p+l);
    }
}
