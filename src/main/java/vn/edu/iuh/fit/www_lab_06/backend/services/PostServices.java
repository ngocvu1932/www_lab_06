package vn.edu.iuh.fit.www_lab_06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_06.backend.models.Post;
import vn.edu.iuh.fit.www_lab_06.backend.repositories.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostServices {
    @Autowired
    private PostRepository postRepository;

    public void savePost (Post post) {
        postRepository.save(post);
    }

    public void deletePost (Long id) {
        postRepository.deleteById(id);
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
