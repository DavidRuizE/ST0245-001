from huffman import HuffmanCom
import os

ruta_carpetas    = 'rutas/' #Aquí va la ruta de donde se extrae el archivo
nombres_carpetas = os.listdir(ruta_carpetas) 
print(nombres_carpetas)

for carpeta in nombres_carpetas: 
	ruta_completa = ruta_carpetas + carpeta 
	print('ruta completa de cada archivo: ',ruta_completa)
	h = HuffmanCom(ruta_completa)
	ruta_salida = h.compress()
	print("Ruta de archivo comprimido: " + ruta_salida)
	
	ruta_decodificacion = h.decompress(ruta_salida) 
	print("Ruta de archivo comprimido: " + ruta_decodificacion)

