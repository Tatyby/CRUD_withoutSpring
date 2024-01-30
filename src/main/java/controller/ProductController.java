package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products")
public class ProductController extends HttpServlet {
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = new ProductServiceImpl(new ProductRepositoryImpl());
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello");
//        List<ProductDTO> products = productService.getAllProduct();
//        resp.setContentType("application/json");
//        resp.setCharacterEncoding("UTF-8");
//        Gson gson = new Gson();
//        String json = gson.toJson(products);
//        PrintWriter out = resp.getWriter();
//        out.print(json);
    }
}
