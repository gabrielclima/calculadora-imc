package imc;

import control.LimiteIMC;
import mensagem.MensagemCrianca;

public class IMCCriancaFeminino implements IMCStrategy{

	@Override
	public String calcularIMC(double imc, String sexo, int idade) {
		
		LimiteIMC limite = new LimiteIMC.LimiteIMCBuilder()
				.baixoPeso(10)
				.pesoNormal(27)
				.sobrePeso(32)
				.obesidade(37)
				.estabelecerLimiteIMCCrianca();
		
		MensagemFactory msg = new MensagemCrianca(imc, limite);
		
		return msg.emitirMensagem();
	}

}
