package control;

public enum TipoMensagem {
	BAIXO_PESO_MUITO_GRAVE {
		@Override
		public String retornarMensagem() {
			return "Baixo peso muito grave";
		}
	},
	BAIXO_PESO_GRAVE {
		@Override
		public String retornarMensagem() {
			return "Baixo peso grave";
		}
	},
	BAIXO_PESO {
		@Override
		public String retornarMensagem() {
			return "Baixo Peso";
		}
	},
	PESO_NORMAL {
		@Override
		public String retornarMensagem() {
			return "Peso Normal";
		}
	},
	SOBREPESO {
		@Override
		public String retornarMensagem() {
			return "Sobrepeso";
		}
	},
	OBESIDADE {
		@Override
		public String retornarMensagem() {
			return "Obesidade";
		}
	},
	OBESIDADE_GRAU_I {
		@Override
		public String retornarMensagem() {
			return "Obesidade grau I";
		}
	},
	OBESIDADE_GRAU_II {
		@Override
		public String retornarMensagem() {
			return "Obesidade grau II";
		}
	},
	OBESIDADE_GRAU_III {
		@Override
		public String retornarMensagem() {
			return "Obesidade grau III";
		}
	};

	
	public abstract String retornarMensagem();
}
