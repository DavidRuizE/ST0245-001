def subconjuntos(t):
    subconjuntosBase("", t)

def subconjuntosBase(base, v):
    if len(v) == 0:
        print(base)
    else:
        t = v[1:]
        subconjuntosBase(base+ v[:1], t)
        subconjuntosBase(base,t) 
