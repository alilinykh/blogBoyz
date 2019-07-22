package com.blogBoys.blogBoys.repos;

import com.blogBoys.blogBoys.models.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Posts, Integer> {

    Iterable<Posts> getPostsByTag(String tag);

    Iterable<Posts> getAllByContentNotNullOrderByDateDesc();
}
