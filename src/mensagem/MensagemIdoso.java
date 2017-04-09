package mensagem;

import control.LimiteIMC;
import control.TipoMensagem;
import imc.MensagemFactory;

public class MensagemIdoso implements MensagemFactory {
	private double imc;
	private LimiteIMC limite;
	
	
	public MensagemIdoso(double imc, LimiteIMC limite){
		this.imc = imc;
		this.limite = limite;
	}

	@Override
	public String emitirMensagem(){
		if(imc <= limite.getSobrePeso()){
			if(imc <= limite.getBaixoPeso()){
				return TipoMensagem.BAIXO_PESO.retornarMensagem();
			}else if(imc <= limite.getPesoNormal()){
				return TipoMensagem.PESO_NORMAL.retornarMensagem();
			}else{
				return TipoMensagem.SOBREPESO.retornarMensagem();
			}
		}else{
			if(imc <= limite.getObesidadeGrauI()){
				return TipoMensagem.OBESIDADE_GRAU_I.retornarMensagem();
			}else if(imc <= limite.getObesidadeGrauII()){
				return TipoMensagem.OBESIDADE_GRAU_II.retornarMensagem();
			}else{
				return TipoMensagem.OBESIDADE_GRAU_III.retornarMensagem();
			}
		}
	}

}
