package com.example.spring_gpt.message;

import com.example.spring_gpt.session.ChatSession;
import com.example.spring_gpt.mask.Mask;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ChatMessage {
    @Id
    private String id;

    private String role;

    @Column(length = 2000)
    private String content;

    private String date;

    @ManyToOne
    @JoinColumn(name = "mask_id")
    @JsonIgnore
    private Mask mask;

    @ManyToOne
    @JoinColumn(name = "session_id")
    @JsonIgnore
    private ChatSession session;

}