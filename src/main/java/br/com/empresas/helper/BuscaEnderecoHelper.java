package br.com.empresas.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.empresas.mapper.BuscaEnderecoMapper;
import br.com.empresas.modelos.request.DataApiRequest;
import br.com.empresas.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.modelos.response.DataApiResponse;
import br.com.empresas.service.BuscaEnderecoService;
import br.com.empresas.view.ViaCepBuscaEnderecoResponse;
import br.com.empresas.view.ApiDataViewModel;

@Component
public class BuscaEnderecoHelper {

	@Autowired
	private BuscaEnderecoService buscaEnderecoService;

	public ApiDataViewModel<ViaCepBuscaEnderecoResponse> mapearbuscaEnderecoViaCep(DataApiRequest dataApiRequest) {
		DataApiResponse<EnderecoViaCepDTO> retornoApiResponse = buscaEnderecoService.buscaEnderecoViaCep(dataApiRequest);
		return BuscaEnderecoMapper.mapearEndereco(retornoApiResponse.getData());
	}

}
