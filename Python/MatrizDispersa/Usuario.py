class Usuario(object):
	def __init__(self):
		self.Nombre=None
		self.Usuario=None
		self.Contrasena=None
		self.x=None
		self.y=None
		self.Arbol=None
		

	def setNombre(self,nombre):
		self.Nombre=nombre
	def setUsuario(self,usuario):
		self.Usuario=usuario
	def setContrasena(self,contrasena):
		self.Contrasena=contrasena
	def setArbol(self,arbol):
		self.Arbol=arbol
	def setX(self,x):
		self.x=x
	def setY(self,y):
		self.y=y


	def getNombre(self):
		return self.Nombre
	def getUsuario(self):
		return self.Usuario
	def getContrasena(self):
		return self.Contrasena
	def getArbol(self):
		return self.Arbol
	def getX(self):
		return self.x
	def getY(self):
		return self.y

