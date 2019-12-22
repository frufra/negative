import javax.swing.JOptionPane; 
public class main{
	public static void main(String[] args) {
		String richiesta;
		richiesta=JOptionPane.showInputDialog("inserire cosa si vuole ottenere \"negativo\"o \"riflesso\"");
		String negativo="negativo";
		String riflesso="riflesso";
		String nome=JOptionPane.showInputDialog("inserire il nome de file");
		ManipolatoreDiImmagine a =new ManipolatoreDiImmagine(nome);
		// a.aggiungiTrasformazione(new CambioColore());
		if(richiesta.equals(negativo))
		{
			a.aggiungiTrasformazione(new Negativo());
		}
		if(richiesta.equals(riflesso))
		{
			a.aggiungiTrasformazione(new Riflessione(true));
		}
		a.trasforma();
		a.scriviSuFile("risultato.jpg");
	}
}
