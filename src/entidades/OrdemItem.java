package entidades;

public class OrdemItem {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public OrdemItem() {
		
	}

	public OrdemItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto=produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		double soma= preco* quantidade;
		return soma;
		
		}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Produto: "+produto);
		sb.append("Quantidade: "+quantidade);
		sb.append(", Subtotal: "+subTotal());
		return sb.toString();
	}
	

}
