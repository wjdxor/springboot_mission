//package dev.jt.basicmission;
//
//import dev.jt.basicmission.entity.BoardEntity;
//import dev.jt.basicmission.entity.PostEntity;
//import dev.jt.basicmission.repository.BoardRepository;
//import dev.jt.basicmission.repository.PostRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestComponent {
//    public TestComponent(
//            @Autowired BoardRepository boardRepository,
//            @Autowired PostRepository postRepository
//            ){
//        BoardEntity boardEntity = new BoardEntity();
//        boardEntity.setName("new board");
//        BoardEntity newBoardEntity = boardRepository.save(boardEntity);
//        System.out.println(newBoardEntity.getName());
//
//        PostEntity postEntity = new PostEntity();
//        postEntity.setTitle("Hello");
//        postEntity.setContent("this is hibernate");
//        postEntity.setWriter("JT");
//        postEntity.setBoardEntity(newBoardEntity);
//        PostEntity newPostEntity  = postRepository.save(postEntity);
//    }
//}
