package PokemonProject;

public class GameMaster {

	public static void main(String[] args) {
		// ピカチュウとイーブイ生成
		Pikachu pika = new Pikachu(50, 10, "ピカ");
		Eevee sakura = new Eevee(40, 20, "サクラ");
		System.out.println();
		// 互いに攻撃
		pika.attack(sakura);
		sakura.attack(pika);
		System.out.println();
		// その後のステータスを表示
		pika.printStatus();
		sakura.printStatus();
		System.out.println();
		// 進化
		pika.evolution();
		sakura.evolution();
		System.out.println();
		// ステータスを表示
		pika.printStatus();
		sakura.printStatus();
		System.out.println();
		// 必殺技
		pika.voltTackle(sakura);
		sakura.psychic(pika);
		System.out.println();
		// その後のステータスを表示
		pika.printStatus();
		sakura.printStatus();
		System.out.println();
	}

}
