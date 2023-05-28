package br.com.empresas.service;

import br.com.empresas.modelos.request.RequestCep;

public interface BuscaEnderecoService {

	public String buscaEnderecoViaCep(RequestCep requestCep);

}
