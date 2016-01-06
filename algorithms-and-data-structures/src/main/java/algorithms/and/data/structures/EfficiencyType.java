package algorithms.and.data.structures;

public interface EfficiencyType {

	/**
	 * Calculates efficiency for this type of sorting algorithm.
	 * 
	 * @param numberOfIterations
	 *            The number of iterations we are calculating efficiency for.
	 * @return the efficiency.
	 * 
	 *         TODO: are we really calculating "efficiency" here or do we really
	 *         mean we are calculating the time taken for this algorithm to
	 *         return a result.
	 */
	Double calculateEfficiencyForCandN(int numberOfIterations);

}