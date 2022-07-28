package teste;

import java.time.LocalDateTime;

public class EvtGeracaoEvento {
	
	private String codContato;
	private LocalDateTime dataHoraEvento;
	private Integer idAgente;
	private Integer identificadorEvento;
	private String mensagem;
	private String nomeTipoEvento;
	private String uf;
	private String valorCampoChave;
	
	public EvtGeracaoEvento() {}

	public String getCodContato() {
		return codContato;
	}

	public void setCodContato(String codContato) {
		this.codContato = codContato;
	}

	public LocalDateTime getDataHoraEvento() {
		return dataHoraEvento;
	}

	public void setDataHoraEvento(LocalDateTime dataHoraEvento) {
		this.dataHoraEvento = dataHoraEvento;
	}

	public Integer getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	public Integer getIdentificadorEvento() {
		return identificadorEvento;
	}

	public void setIdentificadorEvento(Integer identificadorEvento) {
		this.identificadorEvento = identificadorEvento;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeTipoEvento() {
		return nomeTipoEvento;
	}

	public void setNomeTipoEvento(String nomeTipoEvento) {
		this.nomeTipoEvento = nomeTipoEvento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getValorCampoChave() {
		return valorCampoChave;
	}

	public void setValorCampoChave(String valorCampoChave) {
		this.valorCampoChave = valorCampoChave;
	}

	@Override
	public String toString() {
		return "EvtGeracaoEvento [codContato=" + codContato + ", dataHoraEvento=" + dataHoraEvento + ", idAgente="
				+ idAgente + "\n, identificadorEvento=" + identificadorEvento + ", mensagem=" + mensagem
				+ ", nomeTipoEvento=" + nomeTipoEvento + "\n, uf=" + uf + ", valorCampoChave=" + valorCampoChave + "]";
	}
	
}
