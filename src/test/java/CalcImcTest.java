package tests;

import org.junit.Before;
import org.junit.Test;

import control.CalculadoraIMC;
import junit.framework.Assert;

public class CalcImcTest {

	CalculadoraIMC cal;

	@Before
	public void setup() {

		cal = new CalculadoraIMC();
	}

	// IMC ADULTO MASCULINO E FEMININO

	// Teste com Valor imc Limite Maximo para Peso Muito Grave

	// idade 65
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteMaximo() {
		Assert.assertEquals("Baixo peso muito grave", cal.calcularIMC(2.10, 70.49, "masculino", 65));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Muito Grave

	// idade 20
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteMaximoIdade() {
		Assert.assertEquals("Baixo peso muito grave", cal.calcularIMC(2.10, 70.49, "masculino", 20));

	}

	// Teste com Valor imc Limite Minimo para Adulto Peso Grave

	// idade 20
	@Test
	public void testeAdultoBaixoPesoGraveLimiteMinimo() {
		Assert.assertEquals("Baixo peso grave", cal.calcularIMC(2.10, 71, "feminino", 20));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Grave

	// idade 65

	@Test
	public void testeAdultoBaixoPesoGraveLimiteMaximoIdade() {
		Assert.assertEquals("Baixo peso grave", cal.calcularIMC(2.05, 71.39, "feminino", 65));

	}

	// Teste com Valor imc Limite Minimo para Adulto Baixo Peso

	// idade 20

	@Test
	public void testeAdultoBaixoPesoMinimoIdadeLimiteMinimo() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.58, 42.44, "feminino", 20));

	}

	// Teste com Valor imc Limite Maximo para Adulto Baixo Peso

	// idade 65

	@Test
	public void testeAdultoBaixoPesoMaximoLimiteMaximo() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.58, 46, "masculino", 65));

	}

	// Teste com Valor imc Limite Minimo para Adulto Peso Normal

	// idade 20

	@Test
	public void testeAdultoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(2.03, 76.6, "masculino", 20));

	}

	// Teste com Valor imc Limite Maximo para Adulto Peso Normal

	// idade 65

	@Test
	public void testeAdultoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(2.10, 108, "feminino", 65));

	}

	// Teste com Valor imc Limite Minimo para Adulto Sobrepeso

	// idade 20

	@Test
	public void testeAdultoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.46, 54, "feminino", 20));

	}

	// Teste com Valor imc Limite Maximo para Adulto Sobrepeso

	// idade 65

	@Test
	public void testeAdultoSobrePesoLimiteMaximoIdade() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.46, 63.9, "masculino", 65));

	}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade I

	// idade 65

	@Test
	public void testeAdultoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.90, 109, "feminino", 65));

	}

	// Teste com Valor imc Limite Maximo para Adulto Obesidade I

	// idade 65
	@Test
	public void testeAdultoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.90, 126.28, "feminino", 21));

	}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade II

	// idade 65

	@Test
	public void testeAdultoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.46, 75, "masculino", 65));

	}

	// Teste com Valor imc Limite Maximo para Adulto Obesidade I

	// idade 20
	@Test
	public void testeAdultoObesidadeIIMaximoLimite() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.46, 85.2, "masculino", 20));

	}

	// Teste com Valor imc Limite Minimo para Adulto Obesidade III

	// idade 65
	@Test
	public void testeAdultoObesidadeIIIMinimoIdade() {
		Assert.assertEquals("Obesidade grau III", cal.calcularIMC(1.64, 108, "masculino", 21));

	}

	@Test
	public void testeAdultoObesidadeIIIMaximoIdade() {
		Assert.assertEquals("Obesidade grau III", cal.calcularIMC(1.64, 110, "feminino", 21));

	}

	// IMC IDOSOS FEMININO

	// Teste com Valor imc Limite Minimo para Baixo Peso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoBaixoPesoLimiteMaximo() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.79, 68, "feminino", 66));

	}

	// Teste com Valor imc Limite Minimo para Peso Normal em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.55, 53, "feminino", 66));

	}

	// Teste com Valor imc Limite Maximo para Peso Normal em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.56, 65.5, "feminino", 66));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.80, 88, "feminino", 66));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoSobrePesoLimiteMaximo() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.80, 103.61, "feminino", 66));

	}

	// Teste com imc Valor Limite Minimo para Obesidade I em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.65, 88, "feminino", 66));

	}

	// Teste com imc Valor Limite Maximo para Obesidade em Idosos sexo Feminino
	@Test
	public void testeIdosoFemininoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.77, 100.7, "feminino", 66));

	}

	// Teste com imc Valor Limite Minimo para Obesidade II em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.88, 132, "feminino", 66));

	}

	// Teste com imc Valor Limite Maximo para Obesidade II em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIILimiteMaximo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.58, 104.6, "feminino", 66));

	}

	// Teste com imc Valor Limite Minimo para Obesidade grau III em Idosos sexo
	// Feminino
	@Test
	public void testeIdosoFemininoObesidadeIIILimiteMenor() {
		Assert.assertEquals("Obesidade grau III", cal.calcularIMC(1.60, 108, "feminino", 66));

	}

	// IMC IDOSOS MASCULINO

	// Teste com imc Valor Maximo para Baixo Peso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoBaixoPeso() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.64, 59, "masculino", 66));

	}

	// Teste com imc Valor Minimo para Peso Normal em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteMinimo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.46, 47, "masculino", 66));

	}

	// Teste com imc Valor Maximo para Peso Normal em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteMaximo() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.46, 57.5, "masculino", 66));

	}

	// Teste com imc Valor Minimo para Sobrepeso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoSobrePesoLimiteMinimo() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.65, 74, "masculino", 66));

	}

	// Teste com imc Valor Maximo para Sobrepeso em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoSobrePesoLimiteMaximo() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.65, 81.67, "masculino", 66));

	}

	// Teste com imc Valor Minimo para Obesidade grau I em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoObesidadeILimiteMinimo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.90, 109, "masculino", 66));

	}

	// Teste com imc Valor Maximo para Obesidade grau I em Idosos sexo Masculino
	@Test
	public void testeIdosoMasculinoObesidadeILimiteMaximo() {
		Assert.assertEquals("Obesidade grau I", cal.calcularIMC(1.90, 126.35, "masculino", 66));

	}

	// Teste com imc Valor Minimo para Obesidade grau II em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIILimiteMinimo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.46, 75, "masculino", 66));

	}

	// Teste com imc Valor Maximo para Obesidade grau II em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIILimiteMaximo() {
		Assert.assertEquals("Obesidade grau II", cal.calcularIMC(1.46, 85.25, "masculino", 66));

	}

	// Teste com imc Valor Minimo para Obesidade grau III em Idosos sexo
	// Masculino
	@Test
	public void testeIdosoMasculinoObesidadeIII() {
		Assert.assertEquals("Obesidade grau III", cal.calcularIMC(1.80, 130, "masculino", 66));

	}

	// TESTE MENOR DE IDADE FEMININO

	// ******************** 2 ANOS FEMINIMO ******************
	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDoisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(0.85, 10.2, "feminino", 2));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDoisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(0.85, 10.83, "feminino", 2));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDoisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.05, 16.55, "feminino", 2));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDoisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.05, 19.84, "feminino", 2));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDoisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.15, 24, "feminino", 2));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDoisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.15, 26.18, "feminino", 2));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDoisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.18, 27.58, "feminino", 2));

	}

	// ******************** 4 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.25, 21.42, "feminino", 4));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.26, 22.38, "feminino", 4));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.21, 20.8, "feminino", 4));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.23, 25.71, "feminino", 4));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.23, 25.8, "feminino", 4));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.27, 29, "feminino", 4));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.22, 26.8, "feminino", 4));

	}

	// ******************** 6 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoSeisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.30, 22.31, "feminino", 6));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoSeisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.30, 23.45, "feminino", 6));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoSeisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.31, 24.05, "feminino", 6));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoSeisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.31, 29.15, "feminino", 6));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoSeisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.33, 30.5, "feminino", 6));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoSeisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.33, 33.4, "feminino", 6));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoSeisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.35, 34.57, "feminino", 6));

	}

	// ******************** 8 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoOitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.35, 24.3, "feminino", 8));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoOitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.35, 25, "feminino", 8));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoOitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.35, 25.75, "feminino", 8));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoOitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.35, 32.8, "feminino", 8));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoOitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.35, 33.18, "feminino", 8));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoOitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.34, 35.19, "feminino", 8));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoOitoAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.34, 35.3, "feminino", 8));

	}

	// ******************** 10 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDezAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.38, 26.7, "feminino", 10));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDezAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.38, 27.4, "feminino", 10));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDezAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.38, 27.65, "feminino", 10));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDezAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.38, 38, "feminino", 10));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDezAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.38, 38.4, "feminino", 10));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDezAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.38, 43.8, "feminino", 10));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDezAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.38, 44, "feminino", 10));

	}

	// ******************** 12 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDozeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.40, 28.6, "feminino", 12));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDozeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.40, 29.5, "feminino", 12));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDozeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.40, 29.9, "feminino", 12));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDozeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.40, 41.54, "feminino", 12));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDozeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.40, 41.8, "feminino", 12));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDozeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.40, 48.95, "feminino", 12));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDozeAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.40, 49.5, "feminino", 12));

	}

	// ******************** 14 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.50, 34.15, "feminino", 14));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.50, 36, "feminino", 14));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.50, 36.3, "feminino", 14));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.50, 52, "feminino", 14));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.50, 52.3, "feminino", 14));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.50, 60.7, "feminino", 14));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.50, 61, "feminino", 14));

	}

	// ******************** 16 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.65, 44, "feminino", 16));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.65, 47.5, "feminino", 16));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.68, 49.5, "feminino", 16));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.70, 70.18, "feminino", 16));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.70, 70.6, "feminino", 16));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.72, 88.5, "feminino", 16));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.75, 92.7, "feminino", 16));

	}

	// ******************** 18 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.78, 54.5, "feminino", 18));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.78, 57, "feminino", 18));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.78, 57.5, "feminino", 18));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.78, 73.7, "feminino", 18));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.78, 80.18, "feminino", 18));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.78, 95.36, "feminino", 18));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.78, 95.75, "feminino", 18));

	}

	// ******************** 19 ANOS FEMINIMO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMinimoDezenove() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.95, 65.8, "feminino", 19));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoBaixoPesoLimiteMaximoDezenove() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.80, 59.93, "feminino", 19));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMinimoDezenove() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.78, 58.95, "feminino", 19));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoPesoNormalLimiteMaximoDezenove() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.68, 73.93, "feminino", 19));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMinimoDezenove() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.98, 103.15, "feminino", 19));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoSobrepesoLimiteMaximoDezenove() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.77, 97.5, "feminino", 19));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeFemininoObesidadeLimiteMinimoDezenove() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.58, 78.18, "feminino", 19));

	}

	// TESTE MENOR DE IDADE MASCULINO

	// ******************** 2 ANOS MASCULINO ******************
	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDoisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(0.85, 10.6, "masculino", 2));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDoisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(0.85, 10.83, "masculino", 2));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDoisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.05, 16.6, "masculino", 2));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDoisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.05, 19.84, "masculino", 2));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDoisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.15, 24, "masculino", 2));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDoisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.15, 25.2, "masculino", 2));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDoisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.18, 26.8, "masculino", 2));

	}

	// ******************** 4 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.25, 21.65, "masculino", 4));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.26, 23, "masculino", 4));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.21, 21.38, "masculino", 4));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.23, 25.71, "masculino", 4));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 2 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.23, 25.8, "masculino", 4));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoQuatroAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.27, 29, "masculino", 4));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 4 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoQuatroAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.22, 26.95, "masculino", 4));

	}

	// ******************** 6 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoSeisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.30, 23.5, "masculino", 6));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoSeisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.30, 23.64, "masculino", 6));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoSeisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.31, 24.05, "masculino", 6));

	}

	// Teste com imc Valor Limite Maximo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoSeisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.31, 29.15, "masculino", 6));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoSeisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.33, 30.5, "masculino", 6));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoSeisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.33, 32, "masculino", 6));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 6 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoSeisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.35, 33.2, "masculino", 6));

	}

	// ******************** 8 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoOitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.35, 24.8, "masculino", 8));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoOitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.35, 25.69, "masculino", 8));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoOitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.35, 25.8, "masculino", 8));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoOitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.35, 32.8, "masculino", 8));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoOitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.35, 34.5, "masculino", 8));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoOitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.34, 35.89, "masculino", 8));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoOitoAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.34, 36.1, "masculino", 8));

	}

	// ******************** 10 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 8 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDezAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.38, 26.7, "masculino", 10));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDezAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.38, 27.4, "masculino", 10));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDezAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.38, 27.5, "masculino", 10));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDezAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.38, 36.34, "masculino", 10));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDezAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.38, 36.5, "masculino", 10));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDezAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.38, 41.88, "masculino", 10));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 10 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDezAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.38, 42.15, "masculino", 10));

	}

	// ******************** 12 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDozeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.40, 28.6, "masculino", 12));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDozeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.40, 29.5, "masculino", 12));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDozeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.40, 29.9, "masculino", 12));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDozeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.40, 41.54, "masculino", 12));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDozeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.40, 41.8, "masculino", 12));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDozeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.40, 48.95, "masculino", 12));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 12 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDozeAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.40, 49.5, "masculino", 12));

	}

	// ******************** 14 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.50, 35.8, "masculino", 14));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.50, 36.85, "masculino", 14));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.50, 37.16, "masculino", 14));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.50, 50.39, "masculino", 14));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.50, 50.65, "masculino", 14));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoQuatorzeAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.50, 58.49, "masculino", 14));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 14 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoQuatorzeAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.50, 58.8, "masculino", 14));

	}

	// ******************** 16 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.65, 46.1, "masculino", 16));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.65, 48.7, "masculino", 16));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.68, 50.9, "masculino", 16));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.70, 69.6, "masculino", 16));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.70, 70, "masculino", 16));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDezesseisAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.72, 78.89, "masculino", 16));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDezesseisAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.75, 84.5, "masculino", 16));

	}

	// ******************** 18 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.78, 57.5, "masculino", 18));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.78, 59.85, "masculino", 18));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.78, 60.2, "masculino", 18));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.78, 80.78, "masculino", 18));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.78, 81.2, "masculino", 18));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 16 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDezoitoAnos() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.78, 91.55, "masculino", 18));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo feminino
	// idade igual a 18 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDezoitoAnos() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.78, 91.75, "masculino", 18));

	}

	// ******************** 19 ANOS MASCULINO ******************

	// Teste com imc Valor Limite Minimo para Baixo Peso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMinimoDezenove() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.95, 72.25, "masculino", 19));

	}

	// Teste com imc Valor Limite Maximo para Baixo Peso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoBaixoPesoLimiteMaximoDezenove() {
		Assert.assertEquals("Baixo Peso", cal.calcularIMC(1.80, 64.4, "masculino", 19));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMinimoDezenove() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.80, 65, "masculino", 19));

	}

	// Teste com imc Valor Limite Minimo para Peso Normal
	// em idades menor que 20 anos sexo masculino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoPesoNormalLimiteMaximoDezenove() {
		Assert.assertEquals("Peso Normal", cal.calcularIMC(1.68, 76.2, "masculino", 19));

	}

	// Teste com imc Valor Limite Minimo para Sobrepeso
	// em idades menor que 20 anos sexo masculino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMinimoDezenove() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.98, 106.3, "masculino", 19));

	}

	// Teste com imc Valor Limite Maximo para Sobrepeso
	// em idades menor que 20 anos sexo feminino
	// idade igual a 19 anos

	@Test
	public void testeMenorIdadeMasculinoSobrepesoLimiteMaximoDezenove() {
		Assert.assertEquals("Sobrepeso", cal.calcularIMC(1.77, 94.5, "masculino", 19));

	}

	// Teste com imc Valor Limite Maximo para Obesidade
	// em idades menor que 20 anos sexo masculino
	// idade igual a 20 anos

	@Test
	public void testeMenorIdadeMasculinoObesidadeLimiteMinimoDezenove() {
		Assert.assertEquals("Obesidade", cal.calcularIMC(1.58, 75.8, "masculino", 19));

	}

	@Test
	public void testeValorInvalido() {
		Assert.assertEquals("Valor Inválido", cal.calcularIMC(-1, 0, "masculino", 0));

	}

}
