package ccw.fr_practice.Y2013.Q4;

public class SkyView
{
	/**
	 * A rectangular array that holds the data representing a rectangular area of the sky.
	 */
	private double[][] view;
	private int rows;
	private int cols;

	/**
	 * Constructs a SkyView object from a 1-dimensional array of scan data.
	 *
	 * @param numRows the number of rows represented in the view
	 *                Precondition: numRows > 0
	 * @param numCols the number of columns represented in the view
	 *                Precondition: numCols > 0
	 * @param scanned the scan data received from the telescope, stored in telescope order
	 *                Precondition: scanned.length == numRows * numCols
	 *                <p/>
	 *                Postcondition: view has been created as a rectangular 2-dimensional array
	 *                with numRows rows and numCols columns and the values in
	 *                scanned have been copied to view and are ordered as
	 *                in the original rectangular area of sky.
	 */
	public SkyView(int numRows, int numCols, double[] scanned)
	{
		rows = numRows;
		cols = numCols;
		view = new double[rows][cols];
		int pos = 0;
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < cols; c++)
			{
				view[r][c] = scanned[pos];
				pos++;
			}
		}
	}

	/**
	 * Returns the average of the values in a rectangular section of view.
	 *
	 * @param startRow the first row index of the section
	 * @param endRow   the last row index of the section
	 * @param startCol the first column index of the section
	 * @param endCol   the last column index of the section
	 *                 <p/>
	 *                 Precondition: 0 <= startRow <= endRow < view.length
	 *                 Precondition: 0 <= startCol <= endCol < view[0].length
	 * @return the average of the values in the specified section of view
	 */
	public double getAverage(int startRow, int endRow, int startCol, int endCol)
	{
		double out = 0;
		int count = 0;

		for(int r = startRow; r <= endRow; r++)
		{
			for(int c = startCol; c <= endCol; c++)
			{
				out += view[r][c];
				count++;
			}
		}

		return out / count;
	}

	public String toString()
	{
		String str = "";
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < cols; c++)
			{
				str = str + view[r][c] + "\t";
			}
			str += "\n";
		}

		return str;
	}
}

