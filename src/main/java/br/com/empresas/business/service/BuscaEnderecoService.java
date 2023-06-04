package br.com.empresas.business.service;

import br.com.empresas.business.modelos.request.DataApiRequest;
import br.com.empresas.business.modelos.response.DataApiResponse;
import br.com.empresas.business.modelos.response.EnderecoViaCepDTO;

public interface BuscaEnderecoService {

	public DataApiResponse<EnderecoViaCepDTO> buscaEnderecoViaCep(DataApiRequest dataApiRequest);

}
