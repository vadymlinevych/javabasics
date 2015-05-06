package Task_02;

/**
 * Монитор ждет пока указанный файл будет создан,
 * после чего выполнение завершается.
 */
public class Demo {
	public static void main(String[] args) {
		Monitor m = new Monitor("c:\\1.txt", new FileEvent());
		m.start();
	}
}