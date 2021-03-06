package ro.ase.csie.cts.g1094.dp.flyweight;

public class TesstFlyweight {

	public static void main(String[] args) {
		
		       ScreenData coordsSoldier1 = new ScreenData(100,10,10,"Green");
		       ScreenData coordsSoldier2 = new ScreenData(100,10,10,"Brown");
		       ScreenData coordsTree1 = new ScreenData(50,50,0,"Green");
		       ScreenData coordsTree2 = new ScreenData(50,100,0,"Green");
		  	 
	 
			
				ModelFlyweightActions soldier =
						Model3DFactory.getModel(ModelTypes.SOLDIER);
				soldier.display(coordsSoldier1);
				soldier.display(coordsSoldier2);
				
				ModelFlyweightActions tree= Model3DFactory.getModel(ModelTypes.TREE);
				tree.display(coordsTree2);
				tree.display(coordsTree1);
				
	}
			

}
