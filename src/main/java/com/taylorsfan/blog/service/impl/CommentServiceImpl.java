package com.taylorsfan.blog.service.impl;

import com.github.pagehelper.PageInfo;
import com.taylorsfan.blog.model.Comment;
import com.taylorsfan.blog.repository.CommentMapper;
import com.taylorsfan.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author taylorsfan
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAll(Map<String, Integer> map) {
        return null;
    }

    @Override
    public boolean update(Comment comment) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Comment comment) {
        return false;
    }
}
