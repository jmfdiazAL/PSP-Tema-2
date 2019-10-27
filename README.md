# PSP-Tema-2
## Cronómetro
Este ejemplo muestra el uso de *Threads* con *Swing*. Están las siguientes variaciones:

 - **Cronometro.** Este ejemplo muestra el uso de un *Thread* en el *dispatcher* del evento del botón. Todo funciona bien si no pulsamos el botón *Start* mientras se está ejecutando,  se instanciará un nuevo objeto `Thread t` cada vez que pulsemos el botón *Start*. Una solución rápida es deshabilitar el botón *Start*, tan sólo tenemos que descomentar las líneas que tienen las instrucciones`btnReset.setEnabled()`. También podíamos haber puesto una comprobación del tipo `if (t==null)` antes de instanciar la variable.
 - **Cronometro2.** Una solución más elegante es lanzar el *Thread* desde el constructor de la clase principal.
 - **CronometroT.** Se usa la clase *javax.swing.Timer* que nos permite usar los métodos `start()`y `stop()` en los *listeners* de los botones.
 - **CronometroT2.** El método anterior también tiene que llevar la comprobación ` if (t==null)`,  por lo que se mueve la creación del objeto `Timer t` al constructor de la clase principal.



<!--stackedit_data:
eyJoaXN0b3J5IjpbMTc3NTMxNzMyMywxOTU5MzE1NTYwLC0xMz
UyOTY3OTMsLTE0OTc4MDA0NSwxMDgyNTE1OTY4LC0yMTM5NjY3
MjcyLDExNjc2MDEyMzVdfQ==
-->