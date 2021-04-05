import os 

ruta_carpetas    = 'rutas/' 
nombres_carpetas = os.listdir(ruta_carpetas) 
print(nombres_carpetas)

for carpeta in nombres_carpetas: 
	ruta_completa = ruta_carpetas + carpeta
	print('ruta completa de cada archivo: ',ruta_completa)
	with open(ruta_completa, 'r')as original, open(ruta_completa[:-4] + '_Codificado' + ruta_completa[-4:], 'wb') as codificado:

		print('archivo :{} cargado en memoria; se ha creado {} '.format(original,  codificado)) 

