def gcd_euclid(p, q):
   if p%q == 0:
       return q
   else:
       division = int(p/q)
       sobra = p-(division*q)
       return gcd_euclid(q,sobra)
