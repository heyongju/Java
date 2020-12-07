package Generic;

public class ThreeDPrinter {
	private Object material;
	
	public void setMaterial(Object material) {
	this.material = material; 
	}
	
	public Object getMaterial() {
		return material;
	}


	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial("ÆÄ¿ì´õ");
		System.out.println(printer.getMaterial());
}
}