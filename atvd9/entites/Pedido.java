package atvd9.entites;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Enum status;

	List<ItemPedido> itens = new ArrayList<>();
	private ItemPedido subTotal;

	public Pedido() {

	}

	public Pedido(Enum status) {
		this.status = status;
	}
	

	public Pedido(Enum status, ItemPedido subTotal) {
		this.status = status;
		this.subTotal = subTotal;
	}

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void addItens(ItemPedido item) {
		itens.add(item);
	}

	public void removeItens(ItemPedido item) {
		itens.remove(item);
	}
	
}
