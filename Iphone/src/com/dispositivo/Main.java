package com.dispositivo;

import com.funcionabilidades.AparelhoTelefonico;
import com.funcionabilidades.NavegadorNaInternet;
import com.funcionabilidades.reprodutorMusical;

public class Main {
	
	public static void main(String [] args) {		
		
		
		
		AparelhoTelefonico.ligar();
		AparelhoTelefonico.atender();
		AparelhoTelefonico.iniciarCorreioDeVoz();
		
		NavegadorNaInternet.exibirPagina();
		NavegadorNaInternet.AtualizarPagina();
		NavegadorNaInternet.adicionarNovaAba();
		
		reprodutorMusical.selecionarMusica("Musica legal");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
	}
	
}
