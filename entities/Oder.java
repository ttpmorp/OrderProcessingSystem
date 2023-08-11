package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OderStatus;

public class Oder {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OderStatus status;
	private Client client;
	
	private List<OderItem>items = new ArrayList<OderItem>();
	
	
	public Oder() {
	}


	public Oder(Date moment, OderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OderStatus getStatus() {
		return status;
	}


	public void setStatus(OderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	
	public void addItem(OderItem item) {
		items.add(item);
	}
	public void removeItem(OderItem item) {
		items.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for (OderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Oder moment: ");
	sb.append(sdf.format(moment) + "\n");
	sb.append("Order status: ");
	sb.append(status + "\n");
	sb.append("Client: ");
	sb.append(client + "\n");
	sb.append("Order items: \n");
	for(OderItem item : items) {
		sb.append(item + "\n");
	}
	sb.append("Total price: $");
	sb.append(String.format("%.2f ", total()));
	return sb.toString();
	}

}
