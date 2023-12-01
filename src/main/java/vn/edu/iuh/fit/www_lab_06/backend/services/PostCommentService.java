package vn.edu.iuh.fit.www_lab_06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_06.backend.models.PostComment;
import vn.edu.iuh.fit.www_lab_06.backend.repositories.PostCommentRepository;

import java.util.List;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public List<PostComment> getAll () {
        return postCommentRepository.findAll();
    }
}
