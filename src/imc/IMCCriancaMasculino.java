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
					.pesoNormal(17.99)
					.sobrePeso(19.05)
					.obesidade(19.24);
		}else if(idade <= 4){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);
		}else if(idade <= 6){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);		
		}else if(idade <= 8){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else if(idade <= 10){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else if(idade <= 12){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else if(idade <= 14){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else if(idade <= 16){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else if(idade <= 18){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}else{
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(10)
					.pesoNormal(27)
					.sobrePeso(32)
					.obesidade(37);	
		}
		
		
		LimiteIMC limite = limiteBuilder.estabelecerLimiteIMCCrianca();
		

		MensagemFactory msg = new MensagemCrianca(imc, limite);

		return msg.emitirMensagem();
	}
}
