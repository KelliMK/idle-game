package main;

public class Model {
	private final int[] BASE_COSTS = {10, 100, 1000};
	private final int[] BASE_BONUS = {1, 5, 10};
	private final double MULTIPLIER = 1.1;
		
	private Double score;
	private int[] producers;
	private Long lastUpdate;
	
	public Model() {
		score = 0.0;
		producers = new int[BASE_COSTS.length];
		setLastUpdate(System.currentTimeMillis());
	}
	
	public void addScore(Double update) {
		score += update;
	}
	
	public void subScore(Double update) {
		score -= update;
	}
	
	public Double getScore() {
		return score;
	}
 
	public Long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int[] getProducers() {
		return producers;
	}

	public int[] getBASE_BONUS() {
		return BASE_BONUS;
	}
	
	// TODO: create method to add and remove buildings
}
