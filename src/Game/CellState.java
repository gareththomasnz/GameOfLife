package Game;

public enum CellState {
	Alive,
	Dead;
	public int getValue()
	{
		return this.ordinal();
	}

	public static CellState forValue(int value)
	{
		return values()[value];
	}
}
