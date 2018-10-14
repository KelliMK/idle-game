package main;

public class Controller {
	private Model model;
	
	public Controller(Model model) {
		this.model = model;
	}
	
	public void update() {
		Long change = (System.currentTimeMillis() - model.getLastUpdate())/1000;
		model.setLastUpdate(System.currentTimeMillis());
		model.addScore((double)change);
		
		for(int i = 0; i < model.getBASE_BONUS().length; i++) {
			model.addScore((double)(model.getBASE_BONUS()[i]*model.getProducers()[i]));
		}
		
		System.out.println("It has been " + change + " seconds since your last update.");
		System.out.println("Your score is now: " + model.getScore());
	}
	
	public void buy(int id, int amount) {
		// TODO: for loop for amount to buy that many calling buy(id)
	}
	
	public void buy(int id) {
		// TODO: add the producer of id and subScore for the cost, dont let them buy more than they can afford
		// maybe return a bool to tell parent method to break the loop so it doesn't waste clock cycles?
	}
	
	public void sell(int id, int amount) {
		//TODO: opposite of buy, dont let them remove more than they own (potentially?)
	}
	
	public void sell(int id) {
		//TODO: opposite of buy
	}
}
