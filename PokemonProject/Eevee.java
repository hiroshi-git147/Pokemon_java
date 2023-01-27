package PokemonProject;

public class Eevee extends Pokemon {
	public Eevee(int hp, int atk, String nickname) {
		super(hp, atk, nickname);
	}

	public void evolution() {
		System.out.println(getNickname() + "はエーフィに進化した！");
		setHp(getHp() + 80);
		setAtk(getAtk() + 40);
	}

	public void psychic(Pokemon target) {
		int damage = (int)(getAtk()*1.7);
		System.out.println(getNickname() + "のサイコキネシス！\t" + damage + "のダメージ！");
		target.setHp(target.getHp() - damage);
	}

}
