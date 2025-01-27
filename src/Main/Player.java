package Main;

public class Player {
	protected String name;
	protected int money;
	 private static Player instance;
	
	public Player(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public static Player getInstance() {
        if (instance == null) {
            instance = new Player("Player", 100); 
        }
        return instance;
    }

    public static void setInstance(Player player) {
        instance = player; 
    }
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
