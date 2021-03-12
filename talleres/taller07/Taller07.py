{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 1,
   "metadata": {},
   "outputs": [],
   "source": [
    "//NO, la complejidad O(n) significa que el tiempo es muy elevado.\n",
    "// O(n)\n",
    "\n",
    "class Nodo():\n",
    "    def __init__(self, obj = None, nxt = None):\n",
    "        self.obj = obj\n",
    "        self.nxt = nxt\n",
    "        \n",
    "    def __str__(self):\n",
    "        return \"\" + self.obj\n",
    "\n",
    "class Lsimple():\n",
    "\n",
    "    def __init__(self):\n",
    "        self.first_Node = None\n",
    "        self.size = 0\n",
    "\n",
    "    def contains(self,element):\n",
    "        if self.size==0:\n",
    "            return False\n",
    "        else:\n",
    "            nodoactual=self.first_Node\n",
    "            while nodoactual.nxt != None:\n",
    "                if element==nodoactual.obj:\n",
    "                    return True\n",
    "                nodoactual = nodoactual.nxt\n",
    "            return False\n",
    "\n",
    "    def insertion(self, i, dato):\n",
    "        if self.size==0 and i==0:\n",
    "            self.first_Node=Nodo(dato)\n",
    "        elif (self.size==0 and i!=0) or i>self.size:\n",
    "                raise Exception (\"no se puede insertar\")\n",
    "        else:\n",
    "            nodoactual=self.first_Node\n",
    "            b=0\n",
    "            while b<i:\n",
    "                nodoactual=nodoactual.nxt\n",
    "                b+=1\n",
    "            nodoactual.next=Nodo(dato,nodoactual.nxt.nxt)\n",
    "\n",
    "def remove(self, i):\n",
    "    if self.size==0 or i>self.size_:\n",
    "        raise Exception(\"no se puede remover\")\n",
    "    else:\n",
    "        nodo=self.first_node\n",
    "        s=0\n",
    "        while s<i:\n",
    "            nodo=nodo.nxt\n",
    "            s+=1\n",
    "        nodo.nxt=nodo.nxt.nxt"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.8.5"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 4
}
