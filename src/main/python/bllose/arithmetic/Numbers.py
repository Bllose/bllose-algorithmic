
def solution(target:str):
    left = target[0:1]
    right = target[1:2]

    target = target[2:]
    while len(target) > 0:
        sum = int(left) + int(right)
        sum = str(sum)
        if target.startswith(sum):
            left = right
            right = sum
            target = target[len(sum):]
        else:
            break

    if len(target) > 0:
        print('False')
    else:
        print('True')

'''
除了第一位数和第二位数以外，
每一位数字都是前两位数字的和。

现在判断输入的一串数字是否符合如上规则，符合则True; 否则 False
'''
if __name__ == '__main__':
    solution('123')
    solution('1236')
    solution('1910')
    solution('19101929')
