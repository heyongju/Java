package sec01.exam02;

public class Television implements RemoteControl{
	//필드
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV의 볼륨: " + this.volume);
	}
	
}
