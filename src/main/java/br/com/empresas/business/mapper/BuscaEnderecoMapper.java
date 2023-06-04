package br.com.empresas.business.mapper;

import br.com.empresas.business.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.business.view.ApiDataViewModel;
import br.com.empresas.business.view.ViaCepBuscaEnderecoResponse;

public class BuscaEnderecoMapper {

	public static ApiDataViewModel<ViaCepBuscaEnderecoResponse> mapearEndereco(EnderecoViaCepDTO enderecoViaCepDTO) {

		ApiDataViewModel<ViaCepBuscaEnderecoResponse> responseDataModel = new ApiDataViewModel<>();
		ViaCepBuscaEnderecoResponse viaCepBuscaEnderecoResponse = new ViaCepBuscaEnderecoResponse();

		viaCepBuscaEnderecoResponse.setBairro(enderecoViaCepDTO.getBairro());
		viaCepBuscaEnderecoResponse.setCep(enderecoViaCepDTO.getCep());
		viaCepBuscaEnderecoResponse.setComplemento(enderecoViaCepDTO.getComplemento());
		viaCepBuscaEnderecoResponse.setDdd(enderecoViaCepDTO.getDdd());
		viaCepBuscaEnderecoResponse.setGia(enderecoViaCepDTO.getGia());
		viaCepBuscaEnderecoResponse.setIbge(enderecoViaCepDTO.getIbge());
		viaCepBuscaEnderecoResponse.setLocalidade(enderecoViaCepDTO.getLocalidade());
		viaCepBuscaEnderecoResponse.setLogradouro(enderecoViaCepDTO.getLogradouro());
		viaCepBuscaEnderecoResponse.setSiafi(enderecoViaCepDTO.getSiafi());
		viaCepBuscaEnderecoResponse.setUf(enderecoViaCepDTO.getUf());
		responseDataModel.setData(viaCepBuscaEnderecoResponse);

		return responseDataModel;

	}

}
