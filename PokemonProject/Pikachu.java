package PokemonProject;

public class Pikachu extends Pokemon {
	public Pikachu(int hp, int atk, String nickname) {
		super(hp, atk, nickname);
	}

	public void evolution() {
		System.out.println(getNickname() + "はライチュウに進化した！");
		setHp(getHp() + 120);
		setAtk(getAtk() + 30);
	}

	public void voltTackle(Pokemon target) {
		int damage = (int)(getAtk() * 2);
		System.out.println(getNickname() + "のボルテッカー！\t" + damage + "のダメージ！\tしかし自分にも10のダメージを受けた");
		target.setHp(target.getHp() - damage);
		setHp(getHp() - 10);
	}

}
