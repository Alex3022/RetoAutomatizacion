# language: es

Característica:
  como usuario
   deseo que haya un opcion de ingresar para poder a hacer uso de la pagina

  Antecedentes:
   Dado el usuario busco y navego hasta la pagina y dio clik en incio

  Escenario:logueo no  exitoso
  Cuando el usuario dio click en ingresar sumistra  un correo
  Y contraseña que no estan registrados
    Entonces  se muestra un mensaje indicado que el correo y la contraseña no existe

  Escenario: olvide mi clave
  Cuando el usuario dio click en ingresar
  Y da click en olvide mi clave ingresa al correo da enviar
    Entonces se despliega un mensaje que se envia informacion de recuperacion al email
