package br.com.empresas.service;

import br.com.empresas.modelos.request.RequestCep;
import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.modelos.response.RetornoApiResponse;

public interface BuscaEnderecoService {

	public RetornoApiResponse<EnderecoViaCepDTO> buscaEnderecoViaCep(RequestCep requestCep);

}
