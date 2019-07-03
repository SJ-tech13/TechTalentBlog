package com.techtalentsouth.TechTalentBlog.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class BlogPostController{

@Autowired
private BlogPostRepository blogPostrepository;
@GetMapping(value="/")
public String index(BlogPost blogPost){
return "blogPost/index";
}
//private BlogPost blogPost;
@PostMapping(value = "/")
public String addNewBlogPost(BlogPost blogPost,Model model){
blogPostrepository.save(blogPost);
model.addAttribute("title", blogPost.getTitle());
model.addAttribute("author", blogPost.getAuthor());
model.addAttribute("blogEntry", blogPost.getBlogEntry());
return "blogpost/result";
}
//public BlogPost getBlogPost() {
//	return blogPost;
//}
//public void setBlogPost(BlogPost blogPost) {
//	this.blogPost = blogPost;
//}

}