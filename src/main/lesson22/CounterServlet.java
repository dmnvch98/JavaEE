package lesson22;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;


@WebServlet(name = "counter", value = "/counter")
public class CounterServlet extends HttpServlet{
    AtomicInteger counter = new AtomicInteger();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(counter);
        printWriter.println(req.getLocalAddr());
        printWriter.println(req.getPathInfo());
        printWriter.println(req.getMethod());
        printWriter.println(req.getHeaderNames());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        counter.incrementAndGet();
        doGet(req, resp);
    }
}
