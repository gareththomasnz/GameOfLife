package Game;

public class LifeRules {
	public static CellState GetNewState(CellState currentState, int liveNeighbors)
	{
		switch (currentState)
		{
			case Alive:
				if (liveNeighbors < 2 || liveNeighbors > 3)
				{
					return CellState.Dead;
				}
				break;
			case Dead:
				if (liveNeighbors == 3)
				{
					return CellState.Alive;
				}
				break;
		}

		return currentState;
	}
}
