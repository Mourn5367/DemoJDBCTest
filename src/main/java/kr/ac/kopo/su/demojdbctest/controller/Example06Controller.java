package kr.ac.kopo.su.demojdbctest.controller;

import kr.ac.kopo.su.demojdbctest.domain.Detail;
import kr.ac.kopo.su.demojdbctest.domain.Product;
import kr.ac.kopo.su.demojdbctest.repository.DetailRepository;
import kr.ac.kopo.su.demojdbctest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/exam06")
public class Example06Controller
{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public String requestInsert(Model model)
    {

        Product product = new Product();
        product.setName("IPhone 17 Pro Max");
        product.setPrice(2590000);

        Detail detail = new Detail();
        detail.setDescription("IPhone 17 Pro Max 1TB");
        detail.setWeight(231);
        detail.setWidth(78.0f);
        detail.setHeight(163.4f);

        detail.setProduct(product);
        detailRepository.save(detail);

        product.setDetail(detail);
        productRepository.save(product);

        List<Product> productList = productRepository.findAll();
        List<Detail> detailList = detailRepository.findAll();
        model.addAttribute("productList", productList);
        model.addAttribute("detailList", detailList);

        return "viewPage06";
    }



}
