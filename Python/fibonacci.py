def PerfectSquare(x):
    s = int(pow(x, 1/2))
    return pow(s,2) == x

def fib(n):
  return PerfectSquare(5*pow(n,2) + 4) or PerfectSquare(5*pow(n,2) - 4)