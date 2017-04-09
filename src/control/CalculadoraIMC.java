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
				tipoIMC = TipoIMC.values()[0];
			} else {
				tipoIMC = TipoIMC.values()[1];
			}
		} else if (idade <= 65) {
			tipoIMC = TipoIMC.values()[2];
		} else {
			if (sexo.equals("masculino")) {
				tipoIMC = TipoIMC.values()[3];
			} else {
				tipoIMC = TipoIMC.values()[4];
			}
		}

		IMCStrategy imcStrategy = tipoIMC.obterIMC();

		return imcStrategy.calcularIMC(imc, sexo, idade);
	}

	public static double converterDoubleDoisDecimais(double precoDouble) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		String string = fmt.format(precoDouble);
		String[] part = string.split("[,]");
		String string2 = part[0] + "." + part[1];
		double preco = Double.parseDouble(string2);
		return preco;
	}
}
