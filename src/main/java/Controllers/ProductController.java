package Controllers;

import Models.Product;
import Services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class ProductController {
    ProductService productService=new ProductService();
    @RequestMapping({"/home"})
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("Show");
        modelAndView.addObject("ListProduct",productService.ListProduct);
        return modelAndView;
    }
    @RequestMapping("/upload")
    public ModelAndView ViewUpload(){
        return new ModelAndView("upload");
    }
    @PostMapping("/upload")
    public ModelAndView getFileUpload(@RequestParam int id,@RequestParam String name, @RequestParam String theloai,@RequestParam MultipartFile file) throws IOException {
        String Filename=file.getOriginalFilename();
        String FilePath="/upload/"+Filename;
        FileCopyUtils.copy(file.getBytes(),new File("C:\\Users\\Admin\\IdeaProjects\\UploadFile\\src\\main\\webapp\\images\\"+Filename));
        productService.ListProduct.add(new Product(id,name,theloai, FilePath));
        ModelAndView modelAndView=new ModelAndView("Show");
        modelAndView.addObject("ListProduct", productService.ListProduct);
        return modelAndView;
    }
}
