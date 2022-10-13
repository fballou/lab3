

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) { //copies the elements inside arr[]
      temp[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = temp[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }

    double[] temp = new double[arr.length];
    int index = 0;
    for (int i = 0; i < temp.length; i++) {
      if (arr[i] == lowest) {
        break;
      }
      else {
        temp[i] = arr[i];
        index += 1;
      }
    }

    for (int i = index; i < temp.length; i++) {
      temp[i] = arr[i];
    }

    double sum = 0;
    for(double num: temp) {
      sum += num;
    }
    return sum / (temp.length-1);
  }


}

