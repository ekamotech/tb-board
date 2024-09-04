package com.example.board.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.board.entity.Post;

/**
 * 投稿のリポジトリー
 */
public interface PostRepository extends JpaRepository<Post, String> {
    public Optional<Post> findById(String id);
}
