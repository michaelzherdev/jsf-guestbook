package com.mzherdev.guestbook.beans;

import com.mzherdev.guestbook.model.Post;
import com.mzherdev.guestbook.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mzherdev on 26.09.16.
 */

@ManagedBean
@RequestScoped
public class SessionBean implements Serializable {

    Logger log = LoggerFactory.getLogger(SessionBean.class);

    @ManagedProperty(value = "#{postService}")
    PostService postService;

    private Post currentPost = new Post();

    public Post getPost() {
        return currentPost;
    }

    public void setPost(Post post) {
        this.currentPost = post;
    }

    public PostService getPostService() {
        return postService;
    }

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    public void createPost() {
        currentPost.setDate(new Date());
        log.info("createPost " + currentPost);
        postService.addPost(currentPost);
        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary("Post added!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
