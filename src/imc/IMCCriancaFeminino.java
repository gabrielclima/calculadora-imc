package imc;

import control.LimiteIMC;
import mensagem.MensagemCrianca;

public class IMCCriancaFeminino implements IMCStrategy{

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {
LimiteIMC.LimiteIMCBuilder limiteBuilder;
		
		if(idade <= 2){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.99)
					.pesoNormal(18.00)
					.sobrePeso(19.80);
		}else if(idade <= 4){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.10)
					.pesoNormal(16.99)
					.sobrePeso(18);
		}else if(idade <= 6){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(13.88)
					.pesoNormal(16.99)
					.sobrePeso(18.89);		
		}else if(idade <= 8){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(13.72)
					.pesoNormal(18)
					.sobrePeso(19.60);	
		}else if(idade <= 10){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.39)
					.pesoNormal(19.95)
					.sobrePeso(23);	
		}else if(idade <= 12){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(15.05)
					.pesoNormal(21.19)
					.sobrePeso(24.97);	
		}else if(idade <= 14){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(16)
					.pesoNormal(23.11)
					.sobrePeso(26.99);	
		}else if(idade <= 16){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(17.45)
					.pesoNormal(24.29)
					.sobrePeso(29.92);	
		}else if(idade <= 18){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(17.99)
					.pesoNormal(23.27)
					.sobrePeso(30.10);	
		}else{
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(18.50)
					.pesoNormal(26.20)
					.sobrePeso(31.13);	
		}
				
		LimiteIMC limite = limiteBuilder.estabelecerLimiteIMCCrianca();
		
		MensagemFactory msg = new MensagemCrianca(imc, limite);
		
		return msg.emitirMensagem();
	}

}
