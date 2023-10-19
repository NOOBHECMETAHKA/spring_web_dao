package com.example.pracktwo.dao;

import com.example.pracktwo.models.Human;
import com.example.pracktwo.models.Pencil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class PencilDao {
    public static int PENCIL_COUNT;

    public List<Pencil> pencils;
    {
        pencils = new ArrayList<>();
        pencils.add(new Pencil(PENCIL_COUNT++, "Красный карандаш", "Красный", 200));
    }

    public List<Pencil> index(){
        return pencils;
    }

    public Pencil show(int id){
        return pencils.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public int getKeyList(Pencil el){
        int key = -1;
        List<Pencil> collection = this.index();
        for (int i = 0; i < collection.size(); i++) {
            if(el.getId() == collection.get(i).getId()){
                key = i;
                break;
            }
        }
        return key;
    }
}
