package br.com.empresas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.empresas.modelos.request.RequestCep;
import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.modelos.response.RetornoApiResponse;
import br.com.empresas.service.BuscaEnderecoService;

@Service
public class BuscaEnderecoServiceImpl implements BuscaEnderecoService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public RetornoApiResponse<EnderecoViaCepDTO> buscaEnderecoViaCep(RequestCep requestCep) {
		String cep = requestCep.getCep();
		String url = "https://viacep.com.br/ws/" + cep + "/json/";

		try {
			EnderecoViaCepDTO enderecoViaCep = restTemplate.getForObject(url, EnderecoViaCepDTO.class);
			return new RetornoApiResponse<>(enderecoViaCep);
		} catch (HttpClientErrorException ex) {
			HttpStatus statusCode = ex.getStatusCode();

			return new RetornoApiResponse<EnderecoViaCepDTO>(statusCode.value());

		}
	}
}
