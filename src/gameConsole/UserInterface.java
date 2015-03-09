package gameConsole;

import java.util.*;

import Game.*;

public class UserInterface {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		LifeGrid grid = new LifeGrid(25, 65);
		grid.Randomize();

		ShowGrid(grid.currentState);

		while (!new Scanner(System.in).nextLine().equals("q"))
		{
				grid.UpdateState();
				ShowGrid(grid.currentState);
		}
	}

	private static void ShowGrid(CellState[][] currentState)
	{
		System.out.print("");
		
		int x = 0;
		int rowLength = currentState[0].length;

		StringBuilder output = new StringBuilder();

		for (CellState[] states : currentState)
		{
			for (CellState state: states )
			{
				output.append(state == CellState.Alive ? "O" : "-");
				x++;
				if (x >= rowLength)
				{
					x = 0;
					output.append("\r\n");
				}
			}
		}
		System.out.print(output.toString());
	}
}
