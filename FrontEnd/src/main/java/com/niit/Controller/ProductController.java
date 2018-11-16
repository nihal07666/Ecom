package com.niit.Controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.Dao.ProductDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private Product product;
	@Autowired
	private ProductDao productDao;
	
	public ProductController()
	{
		System.out.println("Product Controller bean is created");
	}
	@RequestMapping(value="/all/getallproducts")
	public String getAllProducts(Model model)
	{
		List<Product> products=productService.getAllProducts();
		List<Category> categories=productDao.getAllCategories();
		model.addAttribute("categories",categories);
		model.addAttribute("products", products);
		return "listofproducts";
	}
	@RequestMapping(value="/all/getproduct")
	public String getProduct(@RequestParam int id, Model model)
	{
		Product product=productService.getProduct(id);
		model.addAttribute("ProductAttr", product);
		return "viewproduct";
	}
	@RequestMapping(value="/admin/deleteproduct")
	public String deleteProduct(@RequestParam int id)
	{
		productService.deleteProduct(id);
		return"redirect:/all/getallproducts";
	}
	@RequestMapping(value="/admin/getproductform")
	public String getProductForm(Model model)
	{
		Product p=new Product();
		model.addAttribute("product",p);
		List<Category> categories=productService.getAllCategories();
		model.addAttribute("categories",categories);
		for(Category c:categories)
		{
			System.out.println(" from controller"+c.getCategoryname());
		}
		return"productform";
	}
	@RequestMapping(value="/admin/addproduct")
	public String addProduct(@Valid @ModelAttribute Product product,BindingResult result,Model model,HttpServletRequest request){	
		if(result.hasErrors()){//after validation if any errors
			List<Category> categories=productService.getAllCategories();
			model.addAttribute("categories",categories);
			return "productform";
		}
		productService.addProduct(product);//in dao session.save(product)
		MultipartFile img=product.getImage();
		System.out.println(request.getServletContext().getRealPath("/"));
		Path path=Paths.get(request.getServletContext().getRealPath("/")+"/WEB-INF/Resources/images/"+product.getId()+".jpg");
		
		/*for(Category c:categories)
		{
			System.out.println(" from controller"+c.getCategoryname());
		}
		model.addAttribute("categories",categories);
		productService.addProduct(product);
		*/
		return"redirect:/all/getallproducts";
		
		
	}
	@RequestMapping(value="/admin/getupdateproductform")
public String getUpdateProductForm(@RequestParam int id,Model model)
{
		Product product=productService.getProduct(id);
		model.addAttribute("product", product);
		List<Category> categories=productService.getAllCategories();
		model.addAttribute("categories", categories);
		return "updateproductform";

}
	@RequestMapping(value="admin/updateproduct")
	public String updateProduct(@Valid @ModelAttribute Product product,BindingResult result,Model model,HttpServletRequest request){
		if(result.hasErrors()){
			List<Category> categories=productService.getAllCategories();
			model.addAttribute("categories",categories);
			return "updateproductform";
		}
		productService.updateProduct(product);
		MultipartFile img=product.getImage();
		System.out.println(request.getServletContext().getRealPath("/"));
		
		//Defining a path
		Path path=Paths.get(request.getServletContext().getRealPath("/")+"/WEB-INF/Resources/images/"+product.getId()+".jpg");
		return "redirect:/all/getallproducts";
	}
	

}