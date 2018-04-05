def findFailure (arr)

  lo = 0
  hi = arr.length - 1

  begin
    # calculate mid (prevent overflow)
    mid = lo + (hi - lo) / 2

    # if true find in right half
    if arr[mid]
      lo = mid + 1

    # if false find first instance of false in left half
    elsif !arr[mid]
      hi = mid
    end

  end while lo < hi

  # return -1 if no false
  if (arr[lo])
    return -1
  end

  return lo
end

array = [true, true, true, true, true, true, true, false]
puts findFailure (array)
