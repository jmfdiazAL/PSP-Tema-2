# PSP-Tema-2
## Cronómetro
Este ejemplo muestra el uso de *Threads* con *Swing*. Están las siguientes variaciones:

 - **Cronometro.** Este ejemplo muestra el uso de un *Thread* en el *dispatcher* del evento del botón. Como comentamos en clase, si no ponemos la comprobación ` if (t==null)`, se instanciará un nuevo objeto `Thread t` cada vez que pulsemos el botón *Start*. También podríamos haber hecho:
   - Deshabilitar el botón *Start*.
   - Controlar el bucle *While* con la variable *isRunning*.
 - **Cronometro2.**
 - **CronometroT.** Se usa la clase *javax.swing.Timer* que nos permite usar los métodos `start()`y `stop()` en los *listeners* de los botones.
 - **CronometroT2.** El método anterior también tiene que llevar la comprobación ` if (t==null)`,  por lo que se mueve la creación del objeto `Timer t` al constructor de la clase.



<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE0OTc4MDA0NSwxMDgyNTE1OTY4LC0yMT
M5NjY3MjcyLDExNjc2MDEyMzVdfQ==
-->