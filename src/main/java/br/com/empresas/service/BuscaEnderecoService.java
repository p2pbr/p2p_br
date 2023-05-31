package br.com.empresas.service;

import br.com.empresas.modelos.request.DataApiRequest;
import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.modelos.response.DataApiResponse;

public interface BuscaEnderecoService {

	public DataApiResponse<EnderecoViaCepDTO> buscaEnderecoViaCep(DataApiRequest dataApiRequest);

}
