package dao;

import model.Board;

public interface BoardDao {
	
	public void insertBoard(Board board);
	
	public void updateBoard(Board board);

	public void deleteBoard(int num);

	public void selectBoard(int num);

	public void selectBoardList(Board board);

}
