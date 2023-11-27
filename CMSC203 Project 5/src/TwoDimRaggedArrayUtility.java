import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility
{
	public TwoDimRaggedArrayUtility() {
		
	}
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		Scanner inputFile = new Scanner(file);
		String[] strTemp = new String[10];
		ArrayList<String[]> tempArrLst = new ArrayList<>();
		
		if(file.exists()) 
		{
			while(inputFile.hasNextLine())
			{
				String strLine = inputFile.nextLine();
				strTemp = strLine.split(" ");
				tempArrLst.add(strTemp);
			}
		}
		//Creating a new ragged-array with the intended length for both the rows and columns.
		double[][] finalArr = new double[tempArrLst.size()][];
		for(int i=0; i<finalArr.length; i++)
		{
			int currentLngth = tempArrLst.get(i).length;
			finalArr[i] = new double[currentLngth];
		}
		//Assigning the values as doubles to the final array.
		for(int i=0; i<finalArr.length; i++)
		{
			for(int j=0; j<finalArr[i].length; j++)
			{
				String currStr = tempArrLst.get(i)[j];
				finalArr[i][j] = Double.parseDouble(currStr.trim());
			}
		}
		inputFile.close();
		return finalArr;	
	}
	public static void writeToFile(double[][] data, File outputFile) throws IOException
	{
		FileWriter fileWriter = new FileWriter(outputFile,true);
		PrintWriter magicPen = new PrintWriter(fileWriter);
		for(double[]row : data)
		{
			for(int i=0; i<row.length; i++)
			{
				magicPen.print(row[i]+" ");
			}
			magicPen.println();
		}
		magicPen.close();
	}
	public static double getTotal(double[][] data) 
	{
		double sum = 0;
		for(double[] row : data)
		{
			for(int i=0; i<row.length; i++)
				sum += row[i];
		}
		return sum;
	}
	public static double getAverage(double[][] data)
	{
		int count = 0;
		double aver;
		for(double[] row : data)
		{
			for(int i=0; i<row.length; i++)
				count++;
		}
		aver = getTotal(data)/count;
		return aver;
	}
	public static double getRowTotal(double[][] data, int row)
	{
		double sum = 0;
		if(row < data.length)
		{
			for(int i=0; i<data[row].length; i++)
				sum += data[row][i];
		}
		return sum;
	}
	public static double getColumnTotal(double[][] data, int col)
	{
		double sum = 0;
		for(double[] row : data)
		{
			if(col < row.length)
				sum += row[col];
		}
		return sum;
	}
	public static double getHighestInRow(double[][] data, int row)
	{
		double highestInRow = 0;
		if(row < data.length)
		{
			highestInRow = data[row][0];
			for(double currentNum : data[row])
			{
				if(currentNum > highestInRow)
					highestInRow = currentNum;
			}
		}
		return highestInRow;
	}
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int highestRowIndx = -1;
		if(row < data.length)
		{
			double highestNum = data[row][0];
			for(int i=0; i<data[row].length; i++)
			{
				if(data[row][i] >= highestNum)
				{
					highestRowIndx = i;
					highestNum = data[row][i];
				}
			}
		}
		return highestRowIndx;
	}
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowestInRow = 0;
		if(row < data.length)
		{
			lowestInRow = data[row][0];
			for(double currentNum : data[row])
			{
				if(currentNum < lowestInRow)
					lowestInRow = currentNum;
			}
		}
		return lowestInRow;
	}
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int lowestRowIndx = -1;
		if(row < data.length)
		{
			double lowestNum = data[row][0];
			for(int i=0; i<data[row].length; i++)
			{
				if(data[row][i] <= lowestNum)
				{
					lowestRowIndx = i;
					lowestNum = data[row][i];
				}
			}
		}
		return lowestRowIndx;
	}
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highestInCol = Double.NEGATIVE_INFINITY;
		for(double[] row : data)
		{
			if(col < row.length)
			{
				if(row[col] > highestInCol)
					highestInCol = row[col];
			}
		}
		return highestInCol;
	}
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int highestColIndx = -1;
		double highestInCol = Double.NEGATIVE_INFINITY;
		int count = 0;
		for(double[] row : data)
		{
			if(col < row.length)
			{
				if(row[col] >= highestInCol)
				{
					highestColIndx = count;
					highestInCol = row[col];
				}
			}
			count++;
		}
		return highestColIndx;
	}
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowestInCol = Double.MAX_VALUE;
		for(double[] row : data)
		{
			if(col < row.length)
			{
				if(row[col] < lowestInCol)
					lowestInCol = row[col];
			}
		}
		return lowestInCol;
	}
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int lowestColIndx = -1;
		double lowestInCol = Double.MAX_VALUE;
		int count = 0;
		for(double[] row : data)
		{
			if(col < row.length)
			{
				if(row[col] < lowestInCol)
				{
					lowestColIndx = count;
					lowestInCol = row[col];
				}
			}
			count++;
		}
		return lowestColIndx;
	}
	public static double getHighestInArray(double[][] data)
	{
		double highestNum = data[0][0];
		for(double[] row : data)
		{
			for(double currentNum : row)
			{
				if(currentNum > highestNum)
					highestNum = currentNum;
			}
		}
		return highestNum;
	}
	public static double getLowestInArray(double[][] data)
	{
		double lowestNum = data[0][0];
		for(double[] row : data)
		{
			for(double currentNum : row)
			{
				if(currentNum < lowestNum)
					lowestNum = currentNum;
			}
		}
		return lowestNum;
	}	
}
