package br.com.empresas.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresas.business.helper.BuscaEnderecoHelper;
import br.com.empresas.business.modelos.request.DataApiRequest;
import br.com.empresas.business.view.ApiDataViewModel;
import br.com.empresas.business.view.ViaCepBuscaEnderecoResponse;

@RestController
@RequestMapping("/empresas")
public class BuscaEnderecoController {

	@Autowired
	private BuscaEnderecoHelper buscaEnderecoHelper;

	@ResponseBody
	@RequestMapping(value = "/cep", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiDataViewModel<ViaCepBuscaEnderecoResponse> buscaEnderecoViaCep(@RequestParam("cep") String cep) {
		DataApiRequest dataApiRequest = new DataApiRequest();
		dataApiRequest.setCep(cep);
		return buscaEnderecoHelper.mapearbuscaEnderecoViaCep(dataApiRequest);
	}
}
