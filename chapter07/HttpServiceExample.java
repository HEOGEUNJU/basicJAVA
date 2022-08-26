package chapter07;

public class HttpServiceExample {

	public static void main(String[] args) {
		mathod(new LoginServlet());
		mathod(new FileDownloadServlet());
	}

	public static void mathod(HttpServlet servlet) {
		servlet.service();
	}
}
