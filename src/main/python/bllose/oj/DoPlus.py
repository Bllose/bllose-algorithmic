'''
5
1 99 98 2 2
'''
def func():
    _ = int(input())
    nums = input().split()
    recorder = {}
    result = 0
    for num in nums:
        cur_num = int(num)
        if cur_num < 0:
            continue
        if 100 - cur_num in recorder:
            result += recorder[100 - cur_num]
        if cur_num not in recorder:
            recorder[cur_num] = 1
        else:
            recorder[cur_num] += 1
    print(str(result))

if __name__ == "__main__":
    func()
