package Generic;

public class GenericPrinter <T extends Material>{
	private T material; //T�ڷ������� ������ ����
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); //����� Ŭ���� Material�� �޼��� ȣ��
	}

}