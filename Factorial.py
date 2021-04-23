def factorial(n):
    i = f = 1
    while f < n:
        i += 1
        f *= i
    return f == n