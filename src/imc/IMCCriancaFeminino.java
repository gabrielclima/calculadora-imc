package imc;

import control.LimiteIMC;
import mensagem.MensagemCrianca;

public class IMCCriancaFeminino implements IMCStrategy{

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {
LimiteIMC.LimiteIMCBuilder limiteBuilder;
		
		if(idade <= 2){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(14.80)
					.pesoNormal(18.00)
					.sobrePeso(19.20)
					.obesidade(19.50);
		}else if(idade <= 4){
			limiteBuilder = new LimiteIMC.LimiteIMCBuilder()
					.baixoPeso(13.60)
					.pesoNormal(16.90)
					.sobrePeso(18)
					.obesidade(18.70);
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
