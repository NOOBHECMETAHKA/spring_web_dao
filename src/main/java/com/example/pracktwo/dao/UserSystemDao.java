package com.example.pracktwo.dao;

import com.example.pracktwo.models.Pencil;
import com.example.pracktwo.models.UserSystem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class UserSystemDao {
    public static int USERS_SYSTEM_COUNT;

    public List<UserSystem> usersSystem;
    {
        usersSystem = new ArrayList<>();
        usersSystem.add(USERS_SYSTEM_COUNT++, new UserSystem("nick@gmail.com", "nick", "Password123"));
    }

    public List<UserSystem> index(){
        return usersSystem;
    }

    public UserSystem show(int id){
        return usersSystem.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().orElse(null);
    }

    public int getKeyList(UserSystem el){
        int key = -1;
        List<UserSystem> collection = this.index();
        for (int i = 0; i < collection.size(); i++) {
            if(el.getId() == collection.get(i).getId()){
                key = i;
                break;
            }
        }
        return key;
    }
}
