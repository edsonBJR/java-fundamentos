package teste;

import java.time.LocalDateTime;

public class FluxoJbpmGea {

	public static void main(String[] args) {

		boolean temCodigoContato = false;

		EvtGeracaoEvento evtGeracaoEvento = new EvtGeracaoEvento();
		evtGeracaoEvento.setCodContato("");
		evtGeracaoEvento.setDataHoraEvento(LocalDateTime.now());
		evtGeracaoEvento.setIdAgente(1);
		evtGeracaoEvento.setIdentificadorEvento(123);
		evtGeracaoEvento.setMensagem("TESTE DE GERACAO DE EVENTO");
		evtGeracaoEvento.setNomeTipoEvento("NOME TESTE");
		evtGeracaoEvento.setUf("MG");
		evtGeracaoEvento.setValorCampoChave("123456 - BLABLA");

		System.out.println(evtGeracaoEvento.getCodContato());

		if (evtGeracaoEvento.getCodContato() == null) {
			temCodigoContato = false;
		} else if (evtGeracaoEvento.getCodContato().isEmpty() || evtGeracaoEvento.getCodContato().isBlank()) {
			temCodigoContato = false;
		} else {
			temCodigoContato = true;
		}

		System.out.println(temCodigoContato);

	}

}
