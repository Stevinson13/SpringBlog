package com.Stevinson.SpringBlog.repo;

import com.Stevinson.SpringBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
