package Game;
import java.util.Random;

public class LifeGrid
    {
        int gridHeight;
        int gridWidth;

        public CellState[][] currentState;
        private CellState[][] nextState;

        public LifeGrid(int height, int width)
        {
            gridHeight = height;
            gridWidth = width;

            currentState = new CellState[gridHeight][gridWidth];
            nextState = new CellState[gridHeight][gridWidth];

            for (int i = 0; i < gridHeight; i++)
                for (int j = 0; j < gridWidth; j++)
                {
                    currentState[i][j] = (CellState) CellState.Dead;
                }
        }

        public void UpdateState()
        {
            for (int i = 0; i < gridHeight; i++)
                for (int j = 0; j < gridWidth; j++)
                {
                    int liveNeighbors = GetLiveNeighbors(i, j);
                    nextState[i][j] = 
                        LifeRules.GetNewState(currentState[i][j], liveNeighbors);
                }

            currentState = nextState;
            nextState = (CellState[][]) new CellState[gridHeight][gridWidth];
        }

        public void Randomize()
        {
            Random random = new Random();

            for (int i = 0; i < gridHeight; i++)
                for (int j = 0; j < gridWidth; j++)
                {
                    int next = random.nextInt(2);
                     CellState newState = next < 1 ? CellState.Dead : CellState.Alive;
                    currentState[i][j] = newState;
                }
        }

        private int GetLiveNeighbors(int positionX, int positionY)
        {
            int liveNeighbors = 0;
            for(int i = -1; i <= 1; i++)
                for(int j = -1; j <= 1; j++)
                {
                    if (i == 0 && j == 0)
                        continue;

                    int neighborX = positionX + i;
                    int neighborY = positionY + j;

                    if (neighborX >= 0 && neighborX < gridHeight &&
                        neighborY >= 0 && neighborY < gridWidth)
                    {
                        if (currentState[neighborX][neighborY] == CellState.Alive)
                            liveNeighbors++;
                    }
                }

            return liveNeighbors;
        }
    }
