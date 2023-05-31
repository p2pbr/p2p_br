package br.com.empresas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresas.helper.BuscaEnderecoHelper;
import br.com.empresas.modelos.request.DataApiRequest;
import br.com.empresas.view.ViaCepBuscaEnderecoResponse;
import br.com.empresas.view.ApiDataViewModel;

@RestController
public class BuscaEnderecoController {

	@Autowired
	private BuscaEnderecoHelper buscaEnderecoHelper;

	@RequestMapping(value = "/cep", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiDataViewModel<ViaCepBuscaEnderecoResponse> buscaEnderecoViaCep(@RequestBody DataApiRequest dataApiRequest) {
		
		return buscaEnderecoHelper.mapearbuscaEnderecoViaCep(dataApiRequest);
	}
}
