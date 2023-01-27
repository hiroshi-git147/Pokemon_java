package PokemonProject;

public class Pokemon {
	private int hp, atk;
	private String nickname;

	public Pokemon(int hp, int atk, String nickname) {
		this.hp = hp;
		this.atk = atk;
		this.setNickname(nickname);
		System.out.println(nickname + "が現れた！　" + "体力:" + hp + "\t攻撃力:" + atk);
	}


	public void printStatus() {
		System.out.println(getNickname() + " "  + "\t体力:" + hp + "\t攻撃力:" + atk);
	}

	public void attack(Pokemon target) {
		System.out.println(getNickname() + "の攻撃！\t" + target.getNickname() + "に" + atk + "のダメージ！");
		target.hp = target.hp - atk;
	}


	public String getNickname() { return nickname; }
	public void setNickname(String nickname) { this.nickname = nickname; }

	public int getHp() { return hp; }
	public void setHp(int hp) { this.hp = hp; }

	public int getAtk() { return atk; }
	public void setAtk(int atk) { this.atk = atk;}


}