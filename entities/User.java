package entities;

public class User {
	// Variáveis de instância
	private static int countUsers;
	private String userName;
	private String password;	

	public User() {
		// a cada usuário criado incrementa 1
		User.countUsers++;
	}
	
	// metodos gets 
	public static int getQuantUsers() {
		return User.countUsers;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	// metodos sets
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
