package br.com.empresas.mapper;

import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.view.ResponseBuscaEnderecoViaCep;
import br.com.empresas.view.ResponseViewModel;

public class BuscaEnderecoMapper {

	public static ResponseViewModel<ResponseBuscaEnderecoViaCep> mapearEndereco(EnderecoViaCepDTO enderecoViaCepDTO) {

		ResponseViewModel<ResponseBuscaEnderecoViaCep> responseViewModel = new ResponseViewModel<>();
		ResponseBuscaEnderecoViaCep responseBuscaEnderecoViaCep = new ResponseBuscaEnderecoViaCep();

		responseBuscaEnderecoViaCep.setBairro(enderecoViaCepDTO.getBairro());
		responseBuscaEnderecoViaCep.setCep(enderecoViaCepDTO.getCep());
		responseBuscaEnderecoViaCep.setComplemento(enderecoViaCepDTO.getComplemento());
		responseBuscaEnderecoViaCep.setDdd(enderecoViaCepDTO.getDdd());
		responseBuscaEnderecoViaCep.setGia(enderecoViaCepDTO.getGia());
		responseBuscaEnderecoViaCep.setIbge(enderecoViaCepDTO.getIbge());
		responseBuscaEnderecoViaCep.setLocalidade(enderecoViaCepDTO.getLocalidade());
		responseBuscaEnderecoViaCep.setLogradouro(enderecoViaCepDTO.getLogradouro());
		responseBuscaEnderecoViaCep.setSiafi(enderecoViaCepDTO.getSiafi());
		responseBuscaEnderecoViaCep.setUf(enderecoViaCepDTO.getUf());
		responseViewModel.setData(responseBuscaEnderecoViaCep);

		return responseViewModel;

	}

}
