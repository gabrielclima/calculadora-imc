package control;

//Padrão de projeto Builder

public class LimiteIMC {
	private double baixoPesoMuitoGrave;
	private double baixoPesoGrave;
	private double baixoPeso;
	private double pesoNormal;
	private double sobrePeso;
	private double obesidade;
	private double obesidadeGrauI;
	private double obesidadeGrauII;
	private double obesidadeGrauIII;
	
	private LimiteIMC(double baixoPesoMuitoGrave, double baixoPesoGrave, double baixoPeso, double pesoNormal,
			double sobrePeso, double obesidadeGrauI, double obesidadeGrauII, double obesidadeGrauIII) {
		
		this.baixoPesoMuitoGrave = baixoPesoMuitoGrave;
		this.baixoPesoGrave = baixoPesoGrave;
		this.baixoPeso = baixoPeso;
		this.pesoNormal = pesoNormal;
		this.sobrePeso = sobrePeso;
		this.obesidadeGrauI = obesidadeGrauI;
		this.obesidadeGrauII = obesidadeGrauII;
		this.obesidadeGrauIII = obesidadeGrauIII;
	}
	
	private LimiteIMC(double baixoPeso, double pesoNormal,
			double sobrePeso, double obesidadeGrauI, double obesidadeGrauII, double obesidadeGrauIII) {
		
		this.baixoPeso = baixoPeso;
		this.pesoNormal = pesoNormal;
		this.sobrePeso = sobrePeso;
		this.obesidadeGrauI = obesidadeGrauI;
		this.obesidadeGrauII = obesidadeGrauII;
		this.obesidadeGrauIII = obesidadeGrauIII;
	}
	
	private LimiteIMC(double baixoPeso, double pesoNormal,
			double sobrePeso, double obesidade) {
		
		this.baixoPeso = baixoPeso;
		this.pesoNormal = pesoNormal;
		this.sobrePeso = sobrePeso;
		this.obesidade = obesidade;
	}

	public static class LimiteIMCBuilder{
		private double baixoPesoMuitoGrave;
		private double baixoPesoGrave;
		private double baixoPeso;
		private double pesoNormal;
		private double sobrePeso;
		private double obesidade;
		private double obesidadeGrauI;
		private double obesidadeGrauII;
		private double obesidadeGrauIII;				
		
		public LimiteIMCBuilder() {
			
		}

		public LimiteIMCBuilder baixoPesoMuitoGrave(double baixoPesoMuitoGrave){
			this.baixoPesoMuitoGrave = baixoPesoMuitoGrave;
			return this;
		}
		
		public LimiteIMCBuilder baixoPesoGrave(double baixoPesoGrave){
			this.baixoPesoGrave = baixoPesoGrave;
			return this;
		}
		
		public LimiteIMCBuilder baixoPeso(double baixoPeso){
			this.baixoPeso = baixoPeso;
			return this;
		}
		
		public LimiteIMCBuilder pesoNormal(double pesoNormal){
			this.pesoNormal = pesoNormal;
			return this;
		}
		
		public LimiteIMCBuilder sobrePeso(double sobrePeso){
			this.sobrePeso = sobrePeso;
			return this;
		}
		
		public LimiteIMCBuilder obesidade(double obesidade){
			this.obesidade = obesidade;
			return this;
		}
		
		public LimiteIMCBuilder obesidadeGrauI(double obesidadeGrauI){
			this.obesidadeGrauI = obesidadeGrauI;
			return this;
		}
		
		public LimiteIMCBuilder obesidadeGrauII(double obesidadeGrauII){
			this.obesidadeGrauII = obesidadeGrauII;
			return this;
		}
		
		public LimiteIMCBuilder obesidadeGrauIII(double obesidadeGrauIII){
			this.obesidadeGrauIII = obesidadeGrauIII;
			return this;
		}
		
		public LimiteIMC estabelecerLimiteIMCCrianca(){
			return new LimiteIMC(baixoPeso, pesoNormal, sobrePeso, obesidade);
		}
		
		public LimiteIMC estabelecerLimiteIMCAdulto(){
			return new LimiteIMC(baixoPesoMuitoGrave, baixoPesoGrave, baixoPeso, pesoNormal, sobrePeso, obesidadeGrauI, obesidadeGrauII, obesidadeGrauIII);
		}	
		
		public LimiteIMC estabelecerLimiteIMCIdoso(){
			return new LimiteIMC(baixoPeso, pesoNormal, sobrePeso, obesidadeGrauI, obesidadeGrauII, obesidadeGrauIII);
		}	
		
	}

	public double getBaixoPesoMuitoGrave() {
		return baixoPesoMuitoGrave;
	}

	public void setBaixoPesoMuitoGrave(double baixoPesoMuitoGrave) {
		this.baixoPesoMuitoGrave = baixoPesoMuitoGrave;
	}

	public double getBaixoPesoGrave() {
		return baixoPesoGrave;
	}

	public void setBaixoPesoGrave(double baixoPesoGrave) {
		this.baixoPesoGrave = baixoPesoGrave;
	}

	public double getBaixoPeso() {
		return baixoPeso;
	}

	public void setBaixoPeso(double baixoPeso) {
		this.baixoPeso = baixoPeso;
	}

	public double getPesoNormal() {
		return pesoNormal;
	}

	public void setPesoNormal(double pesoNormal) {
		this.pesoNormal = pesoNormal;
	}

	public double getSobrePeso() {
		return sobrePeso;
	}

	public void setSobrePeso(double sobrePeso) {
		this.sobrePeso = sobrePeso;
	}

	public double getObesidadeGrauI() {
		return obesidadeGrauI;
	}

	public void setObesidadeGrauI(double obesidadeGrauI) {
		this.obesidadeGrauI = obesidadeGrauI;
	}

	public double getObesidadeGrauII() {
		return obesidadeGrauII;
	}

	public void setObesidadeGrauII(double obesidadeGrauII) {
		this.obesidadeGrauII = obesidadeGrauII;
	}

	public double getObesidadeGrauIII() {
		return obesidadeGrauIII;
	}

	public void setObesidadeGrauIII(double obesidadeGrauIII) {
		this.obesidadeGrauIII = obesidadeGrauIII;
	}
	public double getObesidade() {
		return obesidade;
	}
	public void setObesidade(double obesidade) {
		this.obesidade = obesidade;
	}
	
	
}