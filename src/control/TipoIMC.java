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
		public IMCStrategy obterIMC() {
			return new IMCCriancaMasculino();
		}
	},
	CRIANCA_FEMININO {
		@Override
		public IMCStrategy obterIMC() {
			return new IMCCriancaFeminino();
		}
	},
	ADULTO {
		@Override
		public IMCStrategy obterIMC() {
			return new IMCAdulto();
		}
	},
	IDOSO_MASCULINO {
		@Override
		public IMCStrategy obterIMC() {
			return new IMCIdosoMasculino();
		}
	},
	IDOSO_FEMININO {
		@Override
		public IMCStrategy obterIMC() {
			return new IMCIdosoFeminino();
		}
	};
	
	public abstract IMCStrategy obterIMC();

}
