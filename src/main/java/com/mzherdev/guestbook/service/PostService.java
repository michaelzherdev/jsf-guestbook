package com.mzherdev.guestbook.service;

import com.mzherdev.guestbook.model.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzherdev on 26.09.16.
 */

@ApplicationScoped
public class PostService {

    Logger log = LoggerFactory.getLogger(PostService.class);

    private List<Post> posts;

    public PostService() {
        if (posts == null) {
            posts = new ArrayList<Post>();
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


    public void addPost(Post post) {
        log.info("addPost " + post);
        posts.add(post);
    }
}
