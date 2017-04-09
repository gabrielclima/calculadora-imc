package imc;

import control.LimiteIMC;
import mensagem.MensagemCrianca;

public class IMCCriancaMasculino implements IMCStrategy {

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {
		LimiteIMC.LimiteIMCBuilder limiteBuilder = null;
		
		if(idade <= 2){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.99)
					.pesoNormal(18)
					.sobrePeso(19.05);
		}else if(idade <= 4){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.59)
					.pesoNormal(16.99)
					.sobrePeso(17.98);
		}else if(idade <= 6){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(13.99)
					.pesoNormal(16.99)
					.sobrePeso(18.10);		
		}else if(idade <= 8){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.10)
					.pesoNormal(18)
					.sobrePeso(19.99);	
		}else if(idade <= 10){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.39)
					.pesoNormal(19.10)
					.sobrePeso(21.99);	
		}else if(idade <= 12){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(15.10)
					.pesoNormal(21.19)
					.sobrePeso(24.99);	
		}else if(idade <= 14){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(16.38)
					.pesoNormal(22.40)
					.sobrePeso(26);	
		}else if(idade <= 16){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(17.89)
					.pesoNormal(24.08)
					.sobrePeso(26.67);	
		}else if(idade <= 18){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(18.90)
					.pesoNormal(25.50)
					.sobrePeso(28.90);	
		}else{
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(19.90)
					.pesoNormal(27)
					.sobrePeso(30.16);	
		}
		
		
		LimiteIMC limite = limiteBuilder.estabelecerLimiteIMCCrianca();
		

		MensagemFactory msg = new MensagemCrianca(imc, limite);

		return msg.emitirMensagem();
	}
}
