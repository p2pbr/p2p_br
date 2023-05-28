package br.com.empresas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import br.com.empresas.modelos.request.RequestCep;
import br.com.empresas.service.BuscaEnderecoService;

public class BuscaEnderecoServiceImpl implements BuscaEnderecoService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public String buscaEnderecoViaCep(RequestCep requestCep) {

		String cep = requestCep.getCep();
		String url = "https://viacep.com.br/ws/" + cep + "/json/";

		String response = restTemplate.getForObject(url, String.class);

		return response;
	}

}
