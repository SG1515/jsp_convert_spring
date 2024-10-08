package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
//	@Test
//	public void test() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 글 4");
//		board.setContent("dfdfdfd");
//		board.setWriter("user01");
//		
//		service.register(board);
//		log.info("글번호 : " + board.getBno());
//	}
//	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testGet() {
//		log.info(service.get(4L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(4L);
//		
//		if(board == null) {
//			return;
//		}
//		
//		board.setTitle("제목을 수정합니다");
//		log.info("modify reuslt : " + service.modify(board));
//	}
	
	@Test
	public void testDelete() {
		log.info("Remove result : " + service.remove(4L));
	}
}// end of class
 