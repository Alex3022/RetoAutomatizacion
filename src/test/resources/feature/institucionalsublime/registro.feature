# language: es
Característica: registrar
  como usuario
  deseo poder registrarme la pagina para poder tener acceso a los diferentes cursos que ofrecen

  Antecedentes:
    Dado  el usuario navego hasta la pagina y entro al inicio

  Escenario: Registro por la pagina
    Cuando el usuario da click a la opcion ingresar y da clik a opcion registro procedio a llenar los datos requerimientos
    Entonces se muestra un mensaje indicando que ya el usurio quedo correctamente registrado

  Escenario: Registro datos incorrectos
    Cuando el usuario da click a la opcion ingresar y da clik a opcion registro procedio a llenar los datos y puso claves incorrectas
    Entonces se muestra un mensaje indicando y que la clave no coincide