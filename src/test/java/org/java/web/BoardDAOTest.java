package org.java.web;

import com.mufasa.springmvc.domain.BoardVO;
import com.mufasa.springmvc.persistence.BoardDAO;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "file:web/WEB-INF/applicationContext.xml"})
public class BoardDAOTest {
    private static Logger  logger = LoggerFactory.getLogger(BoardDAOTest.class);

    @Inject
    private BoardDAO boardDAO;

    @Test
    public void testCreate() throws Exception {
        BoardVO board = new BoardVO();
        board.setTitle("New Title1");
        board.setContent("New Content1");
        board.setWriter("New Writer1");
        boardDAO.create(board);
    }

    @Test
    public void testRead() throws Exception {
        boardDAO.read(1);
    }

    @Test
    public void testUpdate() throws Exception {
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("Update title");
        boardVO.setWriter("Update Writer");
        boardVO.setContent("Update Content");
        boardVO.setBno(1);
        boardDAO.update(boardVO);
    }

    @Test
    public void testListPage() throws Exception {
        int page = 3;
        List<BoardVO> list = boardDAO.listPage(page);

        for(BoardVO boardVO : list){
            logger.info(boardVO.getTitle());
        }
    }
}
