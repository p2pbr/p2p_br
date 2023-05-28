package br.com.empresas.modelos.response;

public class RetornoApiResponse<T> {

	private T data;

	private int statusCode;

	private boolean error;

	public RetornoApiResponse(T data) {
		this.data = data;
		this.statusCode = 200; // Status code padrão para sucesso
		this.error = false; // Por padrão, não há erro
	}

	public RetornoApiResponse(int statusCode) {
		this.data = null;
		this.statusCode = statusCode;
		this.error = true; // Indica que ocorreu um erro
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
}
