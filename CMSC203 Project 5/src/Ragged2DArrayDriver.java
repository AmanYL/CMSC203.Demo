import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ragged2DArrayDriver {

	public static void main(String[] args) throws IOException {
		double[][] dataS1;  /*{	{12,  -3,  4,  5},
								{472, -41, 54},  
								{10,  -10, -14,-100, 12},
								{1110}};*/
		TwoDimRaggedArrayUtility raggedArr2D = new TwoDimRaggedArrayUtility();
		File meFile = new File("district3.txt");
		dataS1 = raggedArr2D.readFile(meFile);		
		
		
		System.out.println("Total: "+raggedArr2D.getTotal(dataS1));
		System.out.println("Average: "+raggedArr2D.getAverage(dataS1));
		System.out.println();
		
//		System.out.println("RowTotal: "+raggedArr2D.getRowTotal(dataS1, 2));
//		System.out.println("ColumnTotal: "+raggedArr2D.getColumnTotal(dataS1, 3));
//		System.out.println();
//		
//		System.out.println("HighestInRow: "+raggedArr2D.getHighestInRow(dataS1,1));
//		System.out.println("HighestInRow Indx: "+raggedArr2D.getHighestInRowIndex(dataS1,1));
//		System.out.println("LowestInRow: "+raggedArr2D.getLowestInRow(dataS1,2));
//		System.out.println("LowestInRow Indx: "+raggedArr2D.getLowestInRowIndex(dataS1,2));
//		System.out.println();
		
		System.out.println("HighestInCol: "+raggedArr2D.getHighestInColumn(dataS1,5));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getHighestInColumnIndex(dataS1,5));
		
		System.out.println();
		System.out.println("LowestInCol: "+raggedArr2D.getLowestInColumn(dataS1,0));
		System.out.println("LowestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,0));
		System.out.println("HighestInCol: "+raggedArr2D.getLowestInColumn(dataS1,1));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,1));
		System.out.println("HighestInCol: "+raggedArr2D.getLowestInColumn(dataS1,2));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,2));
		System.out.println("HighestInCol: "+raggedArr2D.getLowestInColumn(dataS1,3));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,3));
		System.out.println("HighestInCol: "+raggedArr2D.getLowestInColumn(dataS1,4));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,4));
		System.out.println("HighestInCol: "+raggedArr2D.getLowestInColumn(dataS1,5));
		System.out.println("HighestInCol Indx: "+raggedArr2D.getLowestInColumnIndex(dataS1,5));
		System.out.println();
		
		System.out.println("HighestInArr: "+raggedArr2D.getHighestInArray(dataS1));
		System.out.println("LowestInArr: "+raggedArr2D.getLowestInArray(dataS1));
		
		//Checking if the readFile method works.
		File file = new File("dataSet4.txt");
		File file2 = new File("names23.txt");
		File file3 = new File("ካሥማሠUno.txt");
		double[][] newArr = null;
		try {
			newArr = raggedArr2D.readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(double[] row : newArr)
		{
			for(double elemn : row)
				System.out.print(elemn+" ");
			System.out.println();
		}
		
		raggedArr2D.writeToFile(dataS1, file3);
		
		System.out.println();
		System.out.println();
		System.out.println();
		double[] bonusArray = HolidayBonus.calculateHolidayBonus(dataS1);
		double totalFinalBonus = HolidayBonus.calculateTotalHolidayBonus(dataS1);
		
		System.out.println();
		System.out.println();
		for(double xyz : bonusArray)
			System.out.print(xyz+" ");
		System.out.println();
		
		System.out.println(totalFinalBonus);
			

	}

}
