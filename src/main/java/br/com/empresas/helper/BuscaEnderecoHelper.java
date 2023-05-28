package br.com.empresas.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.empresas.mapper.BuscaEnderecoMapper;
import br.com.empresas.modelos.request.RequestCep;
import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.modelos.response.RetornoApiResponse;
import br.com.empresas.service.BuscaEnderecoService;
import br.com.empresas.view.ResponseBuscaEnderecoViaCep;
import br.com.empresas.view.ResponseViewModel;

@Component
public class BuscaEnderecoHelper {

	@Autowired
	private BuscaEnderecoService buscaEnderecoService;

	public ResponseViewModel<ResponseBuscaEnderecoViaCep> mapearbuscaEnderecoViaCep(RequestCep requestCep) {
		RetornoApiResponse<EnderecoViaCepDTO> retornoApiResponse = buscaEnderecoService.buscaEnderecoViaCep(requestCep);
		return BuscaEnderecoMapper.mapearEndereco(retornoApiResponse.getData());
	}

}
