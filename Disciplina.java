
public class Disciplina {

	private ICalcMedia CalcularMedia;
	private double media;
	private String nome;
	private double p1;
	private double p2;
	private String situação;

	public void CalcularMedia() {
		this.media= this.CalcularMedia.CalculaMedia(this.p1, this.p2);
		this.situação = this.CalcularMedia.Situacao(this.media);
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getSituação() {
		return situação;
	}

	public void setSituação(String situação) {
		this.situação = situação;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public Disciplina() {
	}

	public Disciplina(ICalcMedia CalcMedia, String nome, double p1, double p2) {
		this.CalcularMedia = CalcMedia;
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
	}

	
	
	
	
	
}
