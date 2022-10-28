package com.example.jobposting.repository;

import com.example.jobposting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
