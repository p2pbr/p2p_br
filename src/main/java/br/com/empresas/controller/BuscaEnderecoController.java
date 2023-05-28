package br.com.empresas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresas.helper.BuscaEnderecoHelper;
import br.com.empresas.modelos.request.RequestCep;
import br.com.empresas.view.ResponseBuscaEnderecoViaCep;
import br.com.empresas.view.ResponseViewModel;

@RestController
public class BuscaEnderecoController {

	@Autowired
	private BuscaEnderecoHelper buscaEnderecoHelper;

	@RequestMapping(value = "/cep", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseViewModel<ResponseBuscaEnderecoViaCep> buscaEnderecoViaCep(@RequestBody RequestCep requestCep) {
		
		return buscaEnderecoHelper.mapearbuscaEnderecoViaCep(requestCep);
	}
}
