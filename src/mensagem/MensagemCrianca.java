package mensagem;

import control.LimiteIMC;
import control.TipoMensagem;
import imc.MensagemFactory;

public class MensagemCrianca implements MensagemFactory {
	private double imc;
	private LimiteIMC limite;
	
	
	public MensagemCrianca(double imc, LimiteIMC limite){
		this.imc = imc;
		this.limite = limite;
	}

	@Override
	public String emitirMensagem(){
		if(imc <= limite.getPesoNormal()){
			if(imc <= limite.getBaixoPeso()){
				return TipoMensagem.BAIXO_PESO.retornarMensagem();
			}else{
				return TipoMensagem.PESO_NORMAL.retornarMensagem();
			}
		}else{
			if(imc <= limite.getSobrePeso()){
				return TipoMensagem.SOBREPESO.retornarMensagem();
			}else{
				return TipoMensagem.OBESIDADE.retornarMensagem();
			}
		}
	}

}
