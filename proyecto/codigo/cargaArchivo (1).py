#!/usr/bin/env python
# coding: utf-8

# In[7]:


import csv
import numpy as np

nombreArchivo = input()
datos = open(filename)
carga = np.loadtxt(datos, delimiter=",")

