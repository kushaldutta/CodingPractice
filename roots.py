def roots(num):
  y = 2
  c = 0
  while y <= 1000:
    s = int(pow(num,1/y))
    if pow(s,y) == num:
      c += 1
    y += 1
  return c