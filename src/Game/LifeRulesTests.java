package Game;
import org.junit.Assert;
import org.junit.Test;


public class LifeRulesTests {

		//Test One
		//Any live cell with fewer than two neighbors dies
		@Test
		public void AnyCellWithLessThanTwoNeighbors_Dies()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 1;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Two
		//Any live cell with two or three live neighbors lives
		@Test
		public void LiveCell_TwoOrThreeLiveNeighbors_Lives()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 3;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Alive, result);
		}
		
		//Test Three
		//Any live cell with more than three live neighbors dies
		@Test
		public void LiveCell_MoreThanThreeNeighbors_Dies()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 4;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Four
		//Any dead cell with exactly three dead neighbors becomes a live cell
		@Test
		public void DeadCell_ExactlyThreeLiveNeighbors_Lives()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 3;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Alive, result);
		}	
		//Test Five
		//Any dead cell with zero live neighbors dies
		@Test
		public void DeadCell_LessThanThreeLiveNeighbors_Lives0()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 0;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Six
		//Any dead cell with one live neighbor dies
		@Test
		public void DeadCell_LessThanThreeLiveNeighbors_Lives1()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 1;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Seven
		//Any dead cell with one live neighbor dies
		@Test
		public void DeadCell_LessThanThreeLiveNeighbors_Lives2()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 2;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Eight
		//Any live cell with more than three live neighbors dies
		@Test
		public void LiveCell_MoreThanThreeNeighbors_Dies5()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 5;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Nine
		//Any live cell with more than three live neighbors dies
		@Test
		public void LiveCell_MoreThanThreeNeighbors_Dies6()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 6;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Ten
		//Any live cell with more than three live neighbors dies
		@Test
		public void LiveCell_MoreThanThreeNeighbors_Dies7()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 7;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Eleven
		//Any live cell with more than three live neighbors dies
		@Test
		public void LiveCell_MoreThanThreeNeighbors_Dies8()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 8;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Twelve
		//Any live cell with fewer than two neighbors dies
		@Test
		public void AnyCellWithLessThanTwoNeighbors_Dies0()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 0;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Thirteen
		//Any dead cell more than 3 live neighbors dies
		@Test
		public void DeadCell_MoreThanThreeLiveNeighbors_Lives4()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 4;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Fourteen
		//Any dead cell more than 3 live neighbors dies
		@Test
		public void DeadCell_MoreThanThreeLiveNeighbors_Lives5()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 5;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Fifteen
		//Any dead cell more than 3 live neighbors dies
		@Test
		public void DeadCell_MoreThanThreeLiveNeighbors_Lives6()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 6;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Sixteen
		//Any dead cell more than 3 live neighbors dies
		@Test
		public void DeadCell_MoreThanThreeLiveNeighbors_Lives7()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 7;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Seventeen
		//Any dead cell more than 3 live neighbors dies
		@Test
		public void DeadCell_MoreThanThreeLiveNeighbors_Lives8()
		{
			//Arrange
			CellState currentState = CellState.Dead;
			int LiveNeighbors = 8;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Dead, result);
		}
		
		//Test Eighteen
		//Any live cell with two or three live neighbors lives
		@Test
		public void LiveCell_TwoOrThreeLiveNeighbors_Lives2()
		{
			//Arrange
			CellState currentState = CellState.Alive;
			int LiveNeighbors = 2;
			
			//Act
			CellState result = LifeRules.GetNewState(currentState, LiveNeighbors);
			
			//Assert
			Assert.assertEquals(CellState.Alive, result);
		}
	}


