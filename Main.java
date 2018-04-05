class Main {
  public static void main(String[] args) {
    Main obj = new Main();

    boolean[] arr = new boolean []{false, false, false, false, false, false, false, false};

    int index = obj.buildFailure(arr);

    System.out.println("index: " + index);
  }

  public int buildFailure (boolean[] arr) {

    int l = 0;
    int h = arr.length-1;

    while (l < h) {

      // calculate mid (prevent overflow)
      int mid = l + (h - l) / 2;

      // if true find in right half
      if (arr[mid]) {
        l = mid + 1;
      }

      // if false find first instance of false in left half
      else if (!arr[mid]) {
        h = mid;
      }
    }

    // return -1 if no false
    if (arr[l]) {
      return -1;
    }

    return l;
  }
}
