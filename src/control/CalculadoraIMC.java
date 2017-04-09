package control;

import java.text.DecimalFormat;

import imc.IMCStrategy;

public class CalculadoraIMC {

	public String calcularIMC(double altura, double peso, String sexo, int idade) {
		double imc = converterDoubleDoisDecimais(peso / (altura * altura));		

		TipoIMC tipoIMC;

		if (idade <= 0 || peso <= 0 || altura <= 0) {
			return "Valor Inválido";
		} else if (idade < 20) {
			if (sexo.equals("masculino")) {
				tipoIMC = TipoIMC.CRIANCA_MASCULINO;
			} else {
				tipoIMC = TipoIMC.CRIANCA_FEMININO;
			}
		} else if (idade <= 65) {
			tipoIMC = TipoIMC.ADULTO;
		} else {
			if (sexo.equals("masculino")) {
				tipoIMC = TipoIMC.IDOSO_MASCULINO;
			} else {
				tipoIMC = TipoIMC.IDOSO_FEMININO;
			}
		}

		IMCStrategy imcStrategy = tipoIMC.obterStrategyIMC();

		return imcStrategy.calcularIMC(imc, sexo, idade);
	}

	public static double converterDoubleDoisDecimais(double imc) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		String string = fmt.format(imc);
		String[] part = string.split("[,]");
		String string2 = part[0] + "." + part[1];
		double resultado = Double.parseDouble(string2);
		return resultado;
	}
}
