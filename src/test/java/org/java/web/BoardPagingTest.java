package org.java.web;


import com.mufasa.springmvc.domain.BoardVO;
import com.mufasa.springmvc.persistence.BoardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class BoardPagingTest {

    private static Logger logger = LoggerFactory.getLogger(BoardPagingTest.class);

    @Inject
    BoardDAO boardDAO;

    @Test
    public void pagingTest() throws Exception {
        int page = 2;
        List<BoardVO> boardList = boardDAO.listPage(page);
        for(BoardVO board : boardList) {
            logger.info(board.getBno() + ", " + board.getContent());
        }
    }
}
