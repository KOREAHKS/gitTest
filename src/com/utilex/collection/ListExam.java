package com.utilex.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;

//게시판을 예로, 게시글을 관리하는 list 사용해 볼게요.
@AllArgsConstructor
@Data
class Board{
	private String subject;
	private String content;
	private String writer;
	
}

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> list = new ArrayList();
		list.add(new Board("1번 제목","내용1","노쌤")); //0번 인덱스
		list.add(new Board("2번 제목","내용2","조은")); //1번 인덱스
		list.add(new Board("3번 제목","내용3","종각")); //2번 인덱스
		
		Board bo = new Board("4번 제목", "내용 4", "서울"); // bo 라는 배열 추가
		
		list.add(0,bo); // bo라는 배열을 0번 인덱스에 갖다두기
		
		System.out.println(list.indexOf(bo)); // bo라는 인덱스 위치 확인 
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		//2번 객체 get
		Board board = list.get(0);  // 0번 인덱스를 불러오기때문에 0번 인덱스의 값이 출력됨
		System.out.println(board);
		
		for(Board brd : list) {
			System.out.println(brd);
		}
		
		//list.clear();
		System.out.println(list.size());

		List vList = new Vector<Board>();
		Board b1 = new Board("벡터제목1", "내용1", "작성자1");
		Board b2 = new Board("벡터제목2", "내용2", "작성자2");
		Board b3 = new Board("벡터제목3", "내용3", "작성자3");
		vList.add(b1);
		vList.add(b2);
		vList.add(b3);
		
		List<Board> merge = new ArrayList<Board>(list);
		merge.addAll(vList);
		
		System.out.println("size --->" + merge.size());
		
		System.out.println(merge.containsAll(vList)); // merge 배열안에 vList 가 존재 하는지 확인
		
		
		//큐 는 인터페이스라서, 구조체를 생성하려면 LinkedList 를 이용해야함
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("출력문" + q); 
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
//		System.out.println(q.peek()); 
//		System.out.println(q);
//		System.out.println(q.poll()); //제일 앞에 있는 인덱스를 지우고 출력
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q);
		
		q.size();
		
		
		
		
		
		
		
		
		
	}

}
