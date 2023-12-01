package vn.edu.iuh.fit.www_lab_06.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_06.backend.models.Post;
import vn.edu.iuh.fit.www_lab_06.backend.models.PostComment;
import vn.edu.iuh.fit.www_lab_06.backend.models.User;
import vn.edu.iuh.fit.www_lab_06.backend.services.PostCommentService;
import vn.edu.iuh.fit.www_lab_06.backend.services.PostService;
import vn.edu.iuh.fit.www_lab_06.backend.services.UserService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private PostCommentService postCommentService;
    @GetMapping("/")
    public String homePage(Model model) {
        List<Post> postList = postService.getAll();
        List<User> userList = userService.getAll();
        List<PostComment> postCommentList = postCommentService.getAll();

        model.addAttribute("postList", postList);
        model.addAttribute("userList", userList);
        model.addAttribute("postCommentList", postCommentList);
        return "home";
    }
}
