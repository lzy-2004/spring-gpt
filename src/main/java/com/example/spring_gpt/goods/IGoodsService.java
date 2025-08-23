package com.example.spring_gpt.goods;

public interface IGoodsService {

    Iterable<Goods> getAllGoods();

    Goods getGoods(long id);
}
