package mensagem;

import control.LimiteIMC;
import control.TipoMensagem;
import imc.MensagemFactory;

public class MensagemAdulto implements MensagemFactory {
	private double imc;
	private LimiteIMC limite;
	
	
	public MensagemAdulto(double imc, LimiteIMC limite){
		this.imc = imc;
		this.limite = limite;
	}

	@Override
	public String emitirMensagem(){
		if(imc <= limite.getPesoNormal()){
			if(imc < limite.getBaixoPesoMuitoGrave()){
				return TipoMensagem.BAIXO_PESO_MUITO_GRAVE.retornarMensagem();
			}else if(imc <= limite.getBaixoPesoGrave()){
				return TipoMensagem.BAIXO_PESO_GRAVE.retornarMensagem();
			}else if(imc <= limite.getBaixoPeso()){
				return TipoMensagem.BAIXO_PESO.retornarMensagem();
			}else {
				return TipoMensagem.PESO_NORMAL.retornarMensagem();
			}
		}else{
			if(imc <= limite.getSobrePeso()){
				return TipoMensagem.SOBREPESO.retornarMensagem();
			}else if(imc <= limite.getObesidadeGrauI()){
				return TipoMensagem.OBESIDADE_GRAU_I.retornarMensagem();
			}else if(imc <= limite.getObesidadeGrauII()){
				return TipoMensagem.OBESIDADE_GRAU_II.retornarMensagem();
			}else{
				return TipoMensagem.OBESIDADE_GRAU_III.retornarMensagem();
			}
		}
	}

}
