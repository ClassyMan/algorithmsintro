package algorithms.and.data.structures;

import algorithms.and.data.structures.chart.GraphDisplayer;
import algorithms.and.data.structures.sorting.ExponentialSort;
import algorithms.and.data.structures.sorting.InsertionSort;
import algorithms.and.data.structures.sorting.MergeSort;

public class MainClass {
	public static void main(String[] args) {
		GraphDisplayer.generateFor(MergeSort.construct(64d), InsertionSort.construct(100d), ExponentialSort.construct(2));
	}
}
