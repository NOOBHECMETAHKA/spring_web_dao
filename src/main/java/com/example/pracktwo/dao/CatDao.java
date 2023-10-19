package com.example.pracktwo.dao;

import com.example.pracktwo.models.Book;
import com.example.pracktwo.models.Cat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CatDao {
    public static int CAT_COUNT;

    public List<Cat> cats;
    {
        cats = new ArrayList<>();
        cats.add(new Cat(CAT_COUNT++, "Рыжик", 101L, 1000L));
    }

    public List<Cat> index() { return cats; }

    public Cat show(int id){
        return cats.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().orElse(null);
    }

    public int getKeyList(Cat el){
        int key = -1;
        List<Cat> collection = this.index();
        for (int i = 0; i < collection.size(); i++) {
            if(el.getId() == collection.get(i).getId()){
                key = i;
                break;
            }
        }
        return key;
    }
}
