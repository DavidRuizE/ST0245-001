import os 

ruta_carpetas    = 'rutas/' #Aqui iria la direccion de la carpeta en la que tengan los csv
nombres_carpetas = os.listdir(ruta_carpetas) #me extrae una lista con el nombre de los archivos dentro de esa carpeta
print(nombres_carpetas)

for carpeta in nombres_carpetas: #Un ciclo para iterar atraves de la lista con elnombre de cada archivo
	ruta_completa = ruta_carpetas + carpeta #la direccion o path de cada archivo completo
	print('ruta completa de cada archivo: ',ruta_completa)
	with open(ruta_completa, 'r')as original, open(ruta_completa[:-4] + '_Codificado' + ruta_completa[-4:], 'wb') as codificado: #abrimos el archivo csv y creamos una copia que contendra la info codificda

		print('archivo :{} cargado en memoria; se ha creado {} '.format(original,  codificado)) #se imprime el archivo que esta cargado en memoria

