package control;

import imc.IMCAdulto;
import imc.IMCCriancaFeminino;
import imc.IMCCriancaMasculino;
import imc.IMCIdosoFeminino;
import imc.IMCIdosoMasculino;
import imc.IMCStrategy;

public enum TipoIMC {
	CRIANCA_MASCULINO {
		@Override
		public IMCStrategy obterStrategyIMC() {
			return new IMCCriancaMasculino();
		}
	},
	CRIANCA_FEMININO {
		@Override
		public IMCStrategy obterStrategyIMC() {
			return new IMCCriancaFeminino();
		}
	},
	ADULTO {
		@Override
		public IMCStrategy obterStrategyIMC() {
			return new IMCAdulto();
		}
	},
	IDOSO_MASCULINO {
		@Override
		public IMCStrategy obterStrategyIMC() {
			return new IMCIdosoMasculino();
		}
	},
	IDOSO_FEMININO {
		@Override
		public IMCStrategy obterStrategyIMC() {
			return new IMCIdosoFeminino();
		}
	};
	
	public abstract IMCStrategy obterStrategyIMC();

}
