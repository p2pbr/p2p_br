package br.com.empresas.business.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.empresas.business.mapper.BuscaEnderecoMapper;
import br.com.empresas.business.modelos.request.DataApiRequest;
import br.com.empresas.business.modelos.response.DataApiResponse;
import br.com.empresas.business.modelos.response.EnderecoViaCepDTO;
import br.com.empresas.business.service.BuscaEnderecoService;
import br.com.empresas.business.view.ApiDataViewModel;
import br.com.empresas.business.view.ViaCepBuscaEnderecoResponse;

@Component
public class BuscaEnderecoHelper {

	@Autowired
	private BuscaEnderecoService buscaEnderecoService;

	public ApiDataViewModel<ViaCepBuscaEnderecoResponse> mapearbuscaEnderecoViaCep(DataApiRequest dataApiRequest) {
		DataApiResponse<EnderecoViaCepDTO> retornoApiResponse = buscaEnderecoService
				.buscaEnderecoViaCep(dataApiRequest);
		return BuscaEnderecoMapper.mapearEndereco(retornoApiResponse.getData());
	}

}
