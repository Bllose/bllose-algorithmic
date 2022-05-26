def L(nums, i) -> int:

    if i == len(nums) - 1:
        return 1

    max_len = 1
    for j in range(i+1, len(nums)):
        if nums[j] > nums[i]:
            max_len = max(max_len, L(nums, j) + 1)
    return max_len


def length_of_LIS(nums) -> int:
    return max(L(nums, i) for i in range(len(nums)))


if __name__ == '__main__':
    nums = [1,5,2,4,3]
    print(length_of_LIS(nums))