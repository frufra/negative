public class CambioColore implements Trasformazione{

public Immagine trasforma(Immagine img){
	Immagine bianca=new Immagine(img.larghezza(),img.altezza());
	for(int i=0;i<img.altezza();i++)
	{
		for(int j=0;j<img.larghezza();j++)
		{
			Colore p=img.getPixel(i,j);
			int rosso=p.getRed();
			int verde=p.getGreen();
			int blu=p.getBlue();
			if(rosso==255 && verde==0 && blu==0)	//rossosso
			{
				rosso=0;
			}
			Colore nuovo= new Colore(rosso,verde,blu);
			bianca.setPixel(i,j,nuovo);

		}
	}
	return bianca;

}


}