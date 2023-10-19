package com.example.pracktwo.dao;

import com.example.pracktwo.models.Cat;
import com.example.pracktwo.models.Human;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class HumanDao {
    public static int HUMAN_COUNT;

    public List<Human> humans;
    {
        humans = new ArrayList<>();
        humans.add(new Human(HUMAN_COUNT++, "Завьялов", "Михаил", LocalDate.now(), 80));
    }

    public List<Human> index(){
        return humans;
    }

    public Human show(int id){
        return humans.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public int getKeyList(Human el){
        int key = -1;
        List<Human> collection = this.index();
        for (int i = 0; i < collection.size(); i++) {
            if(el.getId() == collection.get(i).getId()){
                key = i;
                break;
            }
        }
        return key;
    }
}
