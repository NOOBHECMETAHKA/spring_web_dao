package com.example.pracktwo;

public abstract class CRUDFunctions {

//    private BookRepository bookRepository;
//    @Autowired
//    private CatRepository catRepository;
//    @Autowired
//    private HumanRepository humanRepository;
//    @Autowired
//    private PencilRepository pencilRepository;
//    @Autowired
//    private UserSystemRepository userSystemRepository;
//    private Object object;
//
//    public enum actionDataObject{
//        INSERTORUPDATE,
//        DELETE
//    }
//
//    private void insertOrUpdateObject(Object object){
//        if(object instanceof Book){
//            bookRepository.save((Book)object);
//        }
//        else if(object instanceof Cat){
//            catRepository.save((Cat)object);
//        } else if(object instanceof Human){
//            humanRepository.save((Human)object);
//        } else if (object instanceof Pencil) {
//            pencilRepository.save((Pencil)object);
//        } else if (object instanceof UserSystem) {
//            userSystemRepository.save((UserSystem)object);
//        }
//    }
//    private void delete(Object object){
//        this.object = object;
//        if(object instanceof Book){
//            bookRepository.delete((Book)object);
//        }
//        else if(object instanceof Cat){
//            catRepository.delete((Cat)object);
//        } else if(object instanceof Human){
//            humanRepository.delete((Human)object);
//        } else if (object instanceof  Pencil) {
//            pencilRepository.delete((Pencil)object);
//        } else if (object instanceof UserSystem) {
//            userSystemRepository.delete((UserSystem)object);
//        }
//    }
//
//    public void manipulation(Object object,  actionDataObject status){
//        switch (status){
//            case DELETE -> delete(object);
//            case INSERTORUPDATE -> insertOrUpdateObject(object);
//        }
//    }
}
