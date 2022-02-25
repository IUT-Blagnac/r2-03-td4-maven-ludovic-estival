
public class Pile {
	int sommet;
	int element[];
	
	/**
	Constructeur
	@param int : nombre d'éléments de la pile
	 */
	public Pile(int i) {
		this.sommet = -1;
		this.element = new int[i];
	}

	/**
	Crée une pile
	@param int : nombre d'éléments de la pile
	@return une pile
	 */
	public static Pile CreerPile(int i) {
		return new Pile(i);
	}

	/**
	Permet de savoir si une pile est vide
	@return true si la pile est vide, false sinon
	 */
	public boolean est_vide() {
		return this.sommet == -1;
	}

	/**
	Empile un élément
	@param int : l'élément à empiler
	 */
	public void empiler(int element) {
		this.sommet++;
		this.element[this.sommet] = element;
	}

	/**
	Depile le sommet de la pile
	@return le sommet dépilé
	 */
	public int depiler() {
		int sommet = this.element[this.sommet];
		this.sommet--;
		return sommet;
	}
	
	/**
	Retourne le sommet de la pile
	@return le sommet
	 */
	public int sommet() {
		return this.element[this.sommet];
	}

	/**
	Vide la pile
	 */
	public void vider() {
		while(this.sommet > -1) {
			this.depiler();
		}
		
	}

}
