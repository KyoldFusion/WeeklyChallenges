import math

def stepsTaken(a, b):
    stepA = 0
    stepB = 0

    while a != 1:
        if a % 2 == 0:
            a = (a // 2)
        elif a % 2 == 1:
            a = (3 * a + 1)
        stepA += 1
    while b > 1:
        if b % 2 == 0:
            b = (b // 2)
        elif b % 2 == 1:
            b = (3 * b + 1)
        stepB += 1

    if stepA < stepB:
        return "a"
    else:
        return "b"

print(stepsTaken(53782,72534))