package com.example.pracktwo;

import com.example.pracktwo.dao.*;
import com.example.pracktwo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CRUDFunctionsClass {

    private BookDao bookDao;
    private CatDao catDao;
    private HumanDao humanDao;
    private PencilDao pencilDao;
    private UserSystemDao userSystemDao;

    public CRUDFunctionsClass(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public CRUDFunctionsClass(CatDao catDao) {
        this.catDao = catDao;
    }

    public CRUDFunctionsClass(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public CRUDFunctionsClass(PencilDao pencilDao) {
        this.pencilDao = pencilDao;
    }

    public CRUDFunctionsClass(UserSystemDao userSystemDao) {
        this.userSystemDao = userSystemDao;
    }


//    public void insert(Book book){
//        bookDao.books.add(bookDao.BOOKS_COUNT++, book);
//    }

    public void insert(Object object) {
        if (object instanceof Book) {
            bookDao.books.add(BookDao.BOOKS_COUNT++, (Book) object);
        } else if (object instanceof Cat) {
            catDao.cats.add(CatDao.CAT_COUNT++, (Cat) object);
        } else if (object instanceof Human) {
            humanDao.humans.add(HumanDao.HUMAN_COUNT++, (Human) object);
        } else if (object instanceof Pencil) {
            pencilDao.pencils.add(PencilDao.PENCIL_COUNT++, (Pencil) object);
        } else if (object instanceof UserSystem) {
            userSystemDao.usersSystem.add(UserSystemDao.USERS_SYSTEM_COUNT++, (UserSystem) object);
        }
    }

//    public void update(int id, Book bookNEW){
//        Book bookOLD = bookDao.books.stream().filter(x -> x.getId() == bookNEW.getId()).findFirst().orElse(null);
//        if(bookOLD != null){
//            bookOLD = bookNEW;
//            bookDao.books.set(bookDao.getKeyList(bookOLD), bookNEW);
//        }
//    }

    public void update(Object object) {
        int key = 0;
        if (object instanceof Book) {
            Book book = (Book) object;
            key = bookDao.getKeyList(book);
            bookDao.books.set(key, book);
        } else if (object instanceof Cat) {
            Cat cat = (Cat) object;
            key = catDao.getKeyList(cat);
            catDao.cats.set(key, cat);
        } else if (object instanceof Human) {
            Human human = (Human) object;
            key = humanDao.getKeyList(human);
            humanDao.humans.set(key, human);
        } else if (object instanceof Pencil) {
            Pencil pencil = (Pencil) object;
            key = pencilDao.getKeyList(pencil);
            pencilDao.pencils.set(key, pencil);
        } else if (object instanceof UserSystem) {
            UserSystem userSystem = (UserSystem) object;
            key = userSystemDao.getKeyList(userSystem);
            userSystemDao.usersSystem.set(key, userSystem);
        }
    }

    public void delete(Object object) {
        int id = 0;
        if(object instanceof Book){
            id = bookDao.getKeyList((Book)object);
            bookDao.books.remove(id);
        }
        else if(object instanceof Cat){
            id = catDao.getKeyList((Cat)object);
            catDao.cats.remove(id);
        } else if(object instanceof Human){
            id = humanDao.getKeyList((Human) object);
            humanDao.humans.remove(id);
        } else if (object instanceof Pencil) {
            id = pencilDao.getKeyList((Pencil) object);
            pencilDao.pencils.remove(id);
        } else if (object instanceof UserSystem) {
            id = userSystemDao.getKeyList((UserSystem) object);
            userSystemDao.usersSystem.remove(id);
        }
    }
}
