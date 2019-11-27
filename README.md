# RegistroAlumnos
Aplicación para Android que registra alumnos y los guarda en un RecyclerView

El ejercicio consiste en realizar una aplicación que capture los datos de varios alumnos (Nombre, Apellidos, Número de cuenta y Género). El usuario podrá ingresar tantos alumnos como desee, para posteriormente pasar a otra Activity y ver el listado de todos los alumnos almacenados en un ListView o un contenedor similar, en este caso, se ha optado por usar un RecyclerView, una versión más eficiente que un ListView que, junto con el widget CardView, se le da a la interfaz un listado de los alumnos de una manera sencilla y práctica.

Se debe crear también un prototipo de celda personalizado que distinga de alguna manera el género (masculino o femenino, los cuales son identificables con un ícono de su género respectivo al lado de su nombre en el listado).

Al dar clic en algún elemento del listado se deberá mandar llamar un mensaje Toast que indique el ID del elemento seleccionado. Ejemplo: “El elemento seleccionado tiene el ID: 2354”.


Consideraciones adicionales:

- Se calificará que haya validaciones en todos los campos.
- Se debe implementar una clase Alumno con las propiedades que consideren para usarse en la aplicación.
- Pueden definir todos los elementos gráficos que deseen para hacer más llamativa la interfaz.
- La aplicación debe estar en por lo menos dos idiomas desde el archivo de recursos de texto.
- Habrá puntos extra si le agregan persistencia.

Elementos adicionales:

- Se hizo uso de los widgets RecyclerView y CardView en lugar de emplear una ListView ordinaria, debido a la sencilleza, practicidad, y estética de su implementación y uso.
- Se hizo uso de un RadioGroup y RadioButton para que el usuario solo pudiera seleccionar un género.
- Se realizó un logotipo y botones desde cero con la herramienta de diseño gráfico Illustrator, a fin de darle mayor presentación a la interfaz de usuario.
- Cada que un usuario registra a un alumno, se lanza un Toast indicando que el registro fue exitoso. Otro botón lo lleva al listado completo.
- Las validaciones hechas son que el campo de Nombre y Apellido no pueden estar vacíos, si lo están, el usuario simplemente no puede registrar al alumno, aún si falta uno solo de estos datos. Lo mismo sucede con el número de cuenta, el cual tiene una extensión mínima y máxima de 9 elementos; si el usuario ingresa menos, de igual forma no lo dejará avanzar.
- Se establece el género inicial en masculino para evitar que el usuario no seleccione alguno de los dos.
- No importa la extensión de los nombres y apellidos, cada una de las Card son independientes en su tamaño, por lo que exise un tamaño estándar que es lo que mide el ícono de la foto de perfil, más un márgen de 30, y a partir de ahí se puede expandir lo que sea necesario.
