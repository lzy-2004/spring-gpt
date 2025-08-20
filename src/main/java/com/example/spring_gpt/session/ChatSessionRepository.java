package com.example.spring_gpt.session;

import com.example.spring_gpt.session.ChatSession;
import org.springframework.data.repository.CrudRepository;

public interface ChatSessionRepository extends CrudRepository<ChatSession,String> {
}
