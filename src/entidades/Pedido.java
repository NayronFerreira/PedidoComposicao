package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades_enum.OrderStatus;

public class Pedido {
	
	SimpleDateFormat y = new SimpleDateFormat();
	private Date momento;
	private OrderStatus status;
	private List<OrdemItem> listaPedido=new ArrayList<>();
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(Date momento, OrderStatus status, Cliente cleinte) {
		this.momento = momento;
		this.status = status;
		this.cliente = cleinte;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCleinte(Cliente cleinte) {
		this.cliente = cleinte;
	}

	public List<OrdemItem> getListaPedido() {
		return listaPedido;
	}
	
	public void addOrdemItem(OrdemItem pedidoItem) {
		listaPedido.add(pedidoItem);
	}
	public void removeOrdemItem(OrdemItem pedidoItem) {
		listaPedido.remove(pedidoItem);
	}
	
	public double totalT() {
		double soma=0;
		for(OrdemItem item:listaPedido) {
			soma=soma+item.subTotal();
		}
		
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Horário de Pedido: "+y.format(momento)+ "\n");
		sb.append("Status do pedido: "+ status+ "\n");
		sb.append("Cliente: "+ cliente+ "\n");
		sb.append("Itens do pedido: \n");
		for(OrdemItem item:listaPedido) {
			sb.append(item + "\n");
		}
		sb.append("TOTAL: ");
		sb.append(totalT());
		
		return sb.toString();
		 
	
			
		}
	
	
	
		
	}
	

