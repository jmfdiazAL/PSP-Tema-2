# PSP-Tema-2
## Cronómetro
Este ejemplo muestra el uso de *Threads* con *Swing*. Están las siguientes variaciones:

 - **Cronometro.** Este ejemplo muestra el uso de un *Thread* en el *dispatcher* del evento del botón. Todo funciona bien si no pulsamos el botón *Start* mientras se está ejecutando,  se instanciará un nuevo objeto `Thread t` cada vez que pulsemos el botón *Start*. Una solución rápida es deshabilitar el botón *Start*, tan sólo tenemos que descomentar las líneas que tienen las instrucciones`btnReset.setEnabled()`. También podíamos haber puesto una comprobación del tipo `if (t==null)` antes de instanciar la variable.
 - **Cronometro2.** Una solución más elegante es lanzar el *Thread* desde el constructor de la clase principal. Aquí hemos hecho algunas modificaciones tales como quitar la comprobación `if (t==null)`, ya que al hacerse en el constructor se hace sólo una vez, y cambiar el ciclo por `while (true)`, con lo que el *Thread* nunca terminará, pero se añade un `if (isRunning)` para aumentar o no la cuenta.
 - **CronometroT.** Se usa la clase *javax.swing.Timer* que nos permite usar los métodos `start()`y `stop()` en los *listeners* de los botones. La ejecución del código se hace en un método que recibe `ActionEvent` que se lanza cada cierto tiempo, cantidad junto con el método que se pasa al constructor de la clase *Timer*. En esta solución 
 - **CronometroT2.** El método anterior también tiene que llevar la comprobación ` if (t==null)`,  por lo que se mueve la creación del objeto `Timer t` al constructor de la clase principal.



<!--stackedit_data:
eyJoaXN0b3J5IjpbNTEwMjI5NTk3LDE3NzUzMTczMjMsMTk1OT
MxNTU2MCwtMTM1Mjk2NzkzLC0xNDk3ODAwNDUsMTA4MjUxNTk2
OCwtMjEzOTY2NzI3MiwxMTY3NjAxMjM1XX0=
-->