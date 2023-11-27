public class HolidayBonus {
	final static int HIGH_BONUS = 5000, MID_BONUS = 2000, LOW_BONUS = 1000;
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		//This variable will be used to store the biggest number of column in the ragged array.
		int maxNumOfCol = 0; 
		
		//Creating a ragged array similar to the "data" 2D array for storing the amount of bonuses for each store in each category.
		double[][] bonus2DArr = new double[data.length][];
		for(int i=0; i<data.length; i++)
			bonus2DArr[i] = new double[data[i].length];
		//Setting all the elements to $2000 if the sales in data is positive.
		for(int i=0; i<bonus2DArr.length; i++)
		{
			for(int j=0; j<bonus2DArr[i].length; j++)
			{
				if(data[i][j] > 0)
					bonus2DArr[i][j] = MID_BONUS;
				else
					bonus2DArr[i][j] = 0;
			}
		}
		//Determining the biggest number of column.
		for(double[] row : data)
		{
			if(row.length > maxNumOfCol)
				maxNumOfCol = row.length;
		}
		//Assigning the proper value for stores with the highest and lowest sales in their category.
		int highestSaleIndx, leastSaleIndx; 
		double highestSale, leastSale;
		for(int i=0; i<maxNumOfCol; i++)
		{
			highestSaleIndx = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			leastSaleIndx = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			highestSale =  TwoDimRaggedArrayUtility.getHighestInColumn(data, i);
			leastSale = TwoDimRaggedArrayUtility.getLowestInColumn(data, i);
			
			if(leastSale > 0)
				bonus2DArr[leastSaleIndx][i] = LOW_BONUS;
			if(highestSale > 0 || highestSale == leastSale)
				bonus2DArr[highestSaleIndx][i] = HIGH_BONUS;
		}
		double[] HolidayBonus = new double[data.length];
		for(int i=0; i<HolidayBonus.length; i++)
		{
			HolidayBonus[i] = TwoDimRaggedArrayUtility.getRowTotal(bonus2DArr, i);
		}
		return HolidayBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double[] bonusEachStore = calculateHolidayBonus(data);
		double bonusSum = 0;
		for(double eachStore : bonusEachStore)
		{
			bonusSum += eachStore;
		}
		return bonusSum;
	}
}
