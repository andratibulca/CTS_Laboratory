package ro.ase.csie.g1094.dp.builder;

public class SuperHero {

	
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isWounded;
	
	WeaponInterface leftWeapon;
	WeaponInterface rightWeapon;
	
	String superPower;
	String superSuperPower;
	
	private SuperHero() {
		
	}

	private SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
			
		}
	
	 public static class SuperHeroBuilder{ 
		 
		private SuperHero superhero = null;
	
		public SuperHeroBuilder(String name, int lifePoints) {
		   superhero = new SuperHero();
		   superhero.name=name;
		   superhero.lifePoints=lifePoints;
		 
	 }
	
		public SuperHeroBuilder isVillain() {
			superhero.isVillain = true;
			return this;
		}
		
		public SuperHeroBuilder isWounded() {
			superhero.isWounded = true;
			return this;
		}
		
		public SuperHeroBuilder addLeftWeapon(WeaponInterface weapon) {
			superhero.leftWeapon = weapon;
			return this;
		}
		
		public SuperHeroBuilder addRightWeapon(WeaponInterface weapon) {
			superhero.rightWeapon = weapon;
			return this;
		}
		
		
		public SuperHeroBuilder addSuperPower(String superSuperPower) {
			superhero.superSuperPower = superSuperPower;
			return this;
		}
		
		//don't forget to provide
		public SuperHero build() {
			return this.superhero;
		}
		
	
}
}