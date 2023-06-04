package br.com.empresas.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.empresas.business.modelos.request.DataApiRequest;
import br.com.empresas.business.modelos.response.DataApiResponse;
import br.com.empresas.business.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.business.service.BuscaEnderecoService;

@Service
public class BuscaEnderecoServiceImpl implements BuscaEnderecoService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public DataApiResponse<EnderecoViaCepDTO> buscaEnderecoViaCep(DataApiRequest dataApiRequest) {
		String cep = dataApiRequest.getCep();
		String url = "https://viacep.com.br/ws/" + cep + "/json/";

		try {
			EnderecoViaCepDTO enderecoViaCep = restTemplate.getForObject(url, EnderecoViaCepDTO.class);
			return new DataApiResponse<>(enderecoViaCep);
		} catch (HttpClientErrorException ex) {
			HttpStatus statusCode = ex.getStatusCode();

			return new DataApiResponse<EnderecoViaCepDTO>(statusCode.value());

		}
	}
}
