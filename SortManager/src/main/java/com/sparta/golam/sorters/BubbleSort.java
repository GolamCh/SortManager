package com.sparta.golam.sorters;

import com.sparta.golam.testing.App;
import com.sparta.golam.exceptions.EmptyArrayException;
import com.sparta.golam.exceptions.SingleValueException;
import com.sparta.golam.interfaces.Sorter;
import com.sparta.golam.utilities.OrderedChecker;

public class BubbleSort implements Sorter {

        public int[] sortArray(int[] arrayToSort) {
            try {
                int arrayLength = arrayToSort.length;
                if (arrayLength == 0) {
                    throw new EmptyArrayException();
                } else if (arrayLength == 1) {
                    throw new SingleValueException();
                }
                if (OrderedChecker.isOrdered(arrayToSort)) {
                    return arrayToSort;
                } else {
                    for (int i = 0; i < arrayLength - 1; i++) {
                        for (int j = 0; j < arrayLength - 1 - i; j++) {
                            if (arrayToSort[j] > arrayToSort[j + 1]) {
                                int temp = arrayToSort[j + 1];
                                arrayToSort[j + 1] = arrayToSort[j];
                                arrayToSort[j] = temp;
                            }
                        }
                    }
                }
            } catch (EmptyArrayException e) {
                App.logger.error(e.getMessage(), e);
            } catch (SingleValueException e) {
                App.logger.error(e.getMessage(), e);
            } catch (Exception e) {
                App.logger.error(e);
            }
            return arrayToSort;
        }




}







