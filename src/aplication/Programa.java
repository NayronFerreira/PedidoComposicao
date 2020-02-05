package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.OrdemItem;
import entidades.Pedido;
import entidades.Produto;
import entidades_enum.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat y = new SimpleDateFormat("dd/mm/yyyy");
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Entre com as informações do cliente: ");
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		System.out.println("Email: ");
		String email=leia.nextLine();
		System.out.println("Data de aniversário: ");
		Date niver = y.parse(leia.nextLine());
		
		Cliente cliente = new Cliente(nome, email, niver);
		
		System.out.println("Informe dados do pedido: ");
		System.out.println("Status: ");
		String status=leia.nextLine();
		
		
		System.out.println("Quantos itens possui o pedido? ");
		int itens = leia.nextInt();
		leia.nextLine();
		
		Pedido pedido = new Pedido(new Date(), OrderStatus.valueOf(status), cliente);
		
		
		
		for (int cc=1;cc<=itens;cc++) {
			System.out.println("Entre com informações dos itens ");
			System.out.println("Nome do produto: ");
			String pnome = leia.nextLine();
			System.out.println("Preço: ");
			Double preco = leia.nextDouble();
			leia.nextLine();
			
			Produto prod = new Produto(pnome, preco);
			System.out.println("Quantidade: ");
			int quanti=leia.nextInt();
			leia.nextLine();
			OrdemItem ordemItem = new OrdemItem(quanti, preco, prod);
			pedido.addOrdemItem(ordemItem);
			
		}
			
			System.out.println();
			System.out.println("SUMARIO DO PEDIDO: ");
			System.out.println(pedido);
			
		
		
		

	}

}
