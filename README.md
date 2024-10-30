# AppWebNominas
Desarrollo de una aplicación web de gestión de nóminas.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Desarrolla una aplicación Web, preferentemente con Maven (si no, como Dynamic Web Project),que muestre una página principal estática con un menú en el que aparezcan las siguientes opciones (suponemos ya existente la base de datos de Empleados y Nóminas desarrollada en el primer ejercicio de repaso del primer curso) (0,25 puntos):

Mostrar la información existente en la base de datos de todos los empleados (nombre, dni, sexo, categoría y años trabajados) (2 puntos).
Esta opción del menú llamará a un servlet que consultará la base de datos y mostrará la información de los empleados en una página jsp.
Mostrar el salario existente en la base de datos de un empleado.(2 puntos).
Esta opción del menú redirigirá la petición a una página jsp en la que existirá un formulario con un campo para insertar el DNI del empleado a buscar y cuyo salario se desea mostrar por pantalla. Este formulario redirigirá la petición a un servlet controlador que conectará con la base de datos para obtener la información y la mostrará en una página jsp.
Modificar los datos de un empleado existente en la base de datos. El sueldo del empleado es un campo calculado y no es posible modificarlo, debiendo actualizarse automáticamente al modificar la categoría o los años trabajados de un empleado.(2,5 puntos)
Esta opción del menú redirigirá la petición a una página jsp en la que existirá un formulario que permita al usuario realizar una búsqueda de los empleados por cualquiera de sus datos existentes en la base de datos, mostrando los registros obtenidos en una página jsp habilitada para tal fin. En este ejercicio no es necesario implementar la funcionalidad para modificar a los empleados, aunque no se impide su desarrollo.
En todos los casos, la información debe mostrarse por pantalla de forma tabulada y ordenada:

En una primera fase, implementa la funcionalidad desarrollando las páginas jsp y los servlets necesarios (6,5 puntos según la puntuación de los apartados anteriores)
En una segunda fase, utiliza hojas de estilos y otras tecnologías de la parte de cliente que conozcas para mejorar el aspecto de la página Web (si quieres y puedes) (1,5 puntos, a razón de 0,5 puntos por apartado de los anteriores).
Mejora tu aplicación añadiendo páginas y mensajes de información y error (0,5 puntos).

En todas las páginas debe existir un botón "volver" que permita volver a la pantalla anterior (0,5 puntos).

El contexto de la aplicación será /empresa (0,25 puntos).

Como resultado de este ejercicio deberás entregar en esta tarea el código fuente del proyecto desarrollado a la finalización del tiempo de clase (antes de la fecha de entrega definida, así como la url de tu repositorio en el que deberás subir también el proyecto, y en el que deberás realizar las modificaciones necesarias para cumplir con la funcionalidad solicitada hasta su revisión el lunes día 19 en clase.

Para el desarrollo, aplica los conceptos expuestos y utiliza como soporte los ejemplos incluidos entre el material de clase. No partas de cero.

Ante cualquier duda, toma las decisiones que consideres oportunas de forma justificada. Haz uso de los comentarios de código y del javadoc (0,5 puntos) para completar tu proyecto. Incluye en el proyecto una carpeta para dicha documentación, tal y como viste el curso pasado en el módulo de Programación.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
