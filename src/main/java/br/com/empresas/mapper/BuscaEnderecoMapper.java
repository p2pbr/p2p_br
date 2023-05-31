package br.com.empresas.mapper;

import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.view.ViaCepBuscaEnderecoResponse;
import br.com.empresas.view.ApiDataViewModel;

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
