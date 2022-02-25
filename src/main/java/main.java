
public class main {
	public static void main(String argv[]) {
        Pile maPile = Pile.CreerPile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (element != 5) System.out.println("NOK");
        
        if (!maPile.est_vide()) System.out.println("NOK");
       
        
        maPile.empiler(10);
        int sommet = maPile.sommet();
        System.out.println("Sommet: " + sommet);
        
        
        maPile.empiler(9);
        sommet = maPile.sommet();
        System.out.println("Nouveau sommet: " + sommet);
        
        maPile.depiler();
        
        sommet = maPile.sommet();
        System.out.println("Ancien sommet: " + sommet);
        

        maPile.vider();
        
        if(maPile.est_vide()) {
        	System.out.println("Pile vide");
        }
        else {
        	System.out.println("NOK");
        }
        
    
    }
}
