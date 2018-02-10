package learn.helloworld;

public class Console implements Publisher {

	public void publishText(String toPublish) {
		System.out.println(toPublish);
	}
}