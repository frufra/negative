
public class Riflessione implements Trasformazione{
	private boolean orizzontale;

	public Riflessione(boolean orizzontale) {
		this.orizzontale = orizzontale;
	}

	public Immagine trasforma(Immagine img){
		int l=img.larghezza();
		int a=img.altezza();
		Immagine m=new Immagine(l,a);

		if(orizzontale){
			for(int i=0;i<img.altezza();i++){
				for(int j=0;j<img.larghezza();j++){
					Colore p=img.getPixel(i, j);
					m.setPixel(i, img.larghezza()-j-1, p);
				}
			}
		}else{
			for(int i=0;i<img.altezza();i++){
				for(int j=0;j<img.larghezza();j++){
					Colore p=img.getPixel(i,j);
					m.setPixel(img.altezza()-i-1, j, p);
				}
			}
		}


		return m;
	}
}
