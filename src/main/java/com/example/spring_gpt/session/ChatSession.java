package com.example.spring_gpt.session;

import com.example.spring_gpt.mask.Mask;
import com.example.spring_gpt.message.ChatMessage;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class ChatSession {
    @Id
    private String id;

    private String topic;

    @OneToMany(mappedBy = "session", cascade = CascadeType.PERSIST)
    private List<ChatMessage> messages;

    private long createTime;

    private long lastUpdate;

    @OneToOne
    @JoinColumn(name = "mask_id", referencedColumnName = "id")
    private Mask mask;
}