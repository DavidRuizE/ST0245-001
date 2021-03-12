#!/usr/bin/env python
# coding: utf-8

# In[1]:


(/NO,, la, complejidad, O(n), significa, que, el, tiempo, es, muy, elevado.)
(/, O(n))

class Nodo():
    def __init__(self, obj = None, nxt = None):
        self.obj = obj
        self.nxt = nxt
        
    def __str__(self):
        return "" + self.obj

class Lsimple():

    def __init__(self):
        self.first_Node = None
        self.size = 0

    def contains(self,element):
        if self.size==0:
            return False
        else:
            nodoactual=self.first_Node
            while nodoactual.nxt != None:
                if element==nodoactual.obj:
                    return True
                nodoactual = nodoactual.nxt
            return False

    def insertion(self, i, dato):
        if self.size==0 and i==0:
            self.first_Node=Nodo(dato)
        elif (self.size==0 and i!=0) or i>self.size:
                raise Exception ("no se puede insertar")
        else:
            nodoactual=self.first_Node
            b=0
            while b<i:
                nodoactual=nodoactual.nxt
                b+=1
            nodoactual.next=Nodo(dato,nodoactual.nxt.nxt)

def remove(self, i):
    if self.size==0 or i>self.size_:
        raise Exception("no se puede remover")
    else:
        nodo=self.first_node
        s=0
        while s<i:
            nodo=nodo.nxt
            s+=1
        nodo.nxt=nodo.nxt.nxt

