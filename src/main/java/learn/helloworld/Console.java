package learn.helloworld;

public class Console implements Publisher {

	@Override
	public void publishText(String toPublish) {
		System.out.println(toPublish);
	}
}