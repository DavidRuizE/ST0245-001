#!/usr/bin/env python
# coding: utf-8

# In[5]:


from huffman import HuffmanCom
from time import time

path = "rutas"

image = HuffmanCom(path)

inicio1 = time()
compressed = image.compress(path)
fin1 = time()
total1 = fin1-inicio1
print("Compressed:", total1)

'''inicio2 = time()
decompressed = image.decompress(compressed)
fin2 = time()
total2 = fin2-inicio2
print("Decompressed:", total2) '''


# In[ ]:




