package imc;

import control.LimiteIMC;
import mensagem.MensagemIdoso;

public class IMCIdosoFeminino implements IMCStrategy {

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {
		
		LimiteIMC limite = new LimiteIMC.LimiteIMCBuilder()
				.baixoPeso(21.99)
				.pesoNormal(27)
				.sobrePeso(32)
				.obesidadeGrauI(37)
				.obesidadeGrauII(41.99)
				.obesidadeGrauIII(Double.MAX_VALUE)
				.estabelecerLimiteIMCIdoso();
		
		MensagemFactory msg = new MensagemIdoso(imc, limite);
		
		return msg.emitirMensagem();

	}


}
