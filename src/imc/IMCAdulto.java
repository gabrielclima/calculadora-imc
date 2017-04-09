package imc;

import control.LimiteIMC;
import mensagem.MensagemAdulto;

public class IMCAdulto implements IMCStrategy{

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {		
		
		
		LimiteIMC limite = new LimiteIMC.LimiteIMCBuilder()
				.baixoPesoMuitoGrave(16.0)
				.baixoPesoGrave(16.99)
				.baixoPeso(18.49)
				.pesoNormal(24.99)
				.sobrePeso(29.99)
				.obesidadeGrauI(34.99)
				.obesidadeGrauII(39.99)
				.obesidadeGrauIII(Double.MAX_VALUE)
				.estabelecerLimiteIMCAdulto();
		
		MensagemFactory msg = new MensagemAdulto(imc, limite);
		
		return msg.emitirMensagem();
		
	}
	
	
}
