# language: es
Característica: Contacto
  Como usuario
  Necesito poder contactar a la instucion no solo por su pagina
  con el fin de acceder a informacion pertinente.

  Antecedentes:
    Dado el usario navego hasta la pagina y entro al incio

  Escenario:   contactar por la pagina
    Cuando el usario esta en inicio da click en la opcion contacto y el usario entra a contacto llena los campos y le da enviar
    Entonces se le muestra un mensaje inidcando que proximamente se comunicaran

  Escenario: contactar por la pagina datos incorrectos
    Cuando  : el usario esta en inicio da click en la opcion contacto y el usario entra a contato llena los campos y coloca el correo errado
    Entonces se muestra un mensaje inicando que el correo esta incorrecto