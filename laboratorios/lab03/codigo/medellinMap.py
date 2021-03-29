#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import networkx as nx
import matplotlib.pyplot as plt
import pandas as pd

map_city = nx.Graph()                                                    

vertix = pd.read_csv('vertices.csv', sep=",", keep_default_na=True)          
print(vertix)                                                                
print(vertix["ID"])                                                          

arc = pd.read_csv('arcos.csv', sep=",", keep_default_na=True)            
print(arc)                                                               
print(arc["ID_origen"])                                                  

for i in range(len(vertix["ID"])):                                           
    map_city.add_node(vertix['ID'].values[i])                                
    
for j in range(len(arc)):                                                
    map_city.add_edge(arc['ID_origen'].values[j], arc['ID_destino'].values[j])  
    map_city[arc['ID_origen'].values[j]][arc['ID_destino'].values[j]]["weight"] = arc['distancia'].values[j]  


nx.draw_shell(map_city, node_color = "red", edge_color = "blue", font_size = 5, width = 2, with_labels = True, node_size = 350, arrows = True, arrowsize = 20)
plt.show()

