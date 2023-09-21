# CVDS_LAB05

## INTEGRANTES
- Juan Pablo Daza Pereira.
- Yeferson Estiben Mesa Vargas.
-------------------------------------
## PARTE I. - JUGANDO A SER UN CLIENTE HTTP:

-------------------------------------

## PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC:

- **¿Por qué MVC obtiene ese nombre?**

**RESPUESTA:** El patrón de diseño MVC (Modelo-Vista-Controlador) obtiene su nombre de la división de una aplicación en tres componentes principales, cada uno con una responsabilidad específica:
1. **Modelo (Model, representa la parte subyacente de datos y lógica):** El Modelo representa los datos y la lógica de negocio de la aplicación. Es responsable de gestionar y mantener los datos, así como de realizar las operaciones relacionadas con esos datos. En otras palabras, el Modelo encapsula la información y las reglas que rigen cómo se manipulan esos datos.
2. **Vista (View, representa la parte visible y gráfica de la aplicación):** La Vista se encarga de la presentación de los datos al usuario. Representa la interfaz de usuario y muestra los datos del Modelo de una manera comprensible para el usuario. La Vista es responsable de la interfaz gráfica y de cómo se muestran los datos en la pantalla.
3. **Controlador (Controller, actúa como un control central que coordina la interacción entre el Modelo y la Vista):** El Controlador actúa como intermediario entre el Modelo y la Vista. Recibe las interacciones del usuario y decide cómo debe responder la aplicación. Luego, se comunica con el Modelo para realizar las operaciones necesarias en los datos y actualiza la Vista para reflejar los cambios.

- **¿Cuáles son las ventajas de usar MVC?**

**RESPUESTA:** El Patrón de diseño MVC ofrece varias ventajas a la hora de desarrollar. Entre esas ventajas se encuentran las siguientes:

1. **Reutilización de código:** La separación de la lógica de negocio (Modelo) y la interfaz de usuario (Vista) permite reutilizar el código de manera más efectiva. Puedes cambiar la Vista o el Modelo sin afectar necesariamente al otro, lo que facilita la adaptación de la aplicación a diferentes interfaces de usuario o cambios en los datos subyacentes.
2. **Mantenibilidad:** Debido a la separación de preocupaciones y la estructura modular, las aplicaciones MVC son más fáciles de mantener y escalar con el tiempo. Los cambios en una parte de la aplicación son menos propensos a tener un impacto no deseado en otras partes, lo que reduce los riesgos de errores y fallos inesperados.
3. **Pruebas más sencillas:** La estructura de MVC facilita la realización de pruebas unitarias y de integración. Puedes probar cada componente de forma independiente. El Modelo puede probarse sin preocuparse por la interfaz de usuario, y la Vista puede probarse sin tocar la lógica de negocio. Esto contribuye a la calidad del software al permitir la detección temprana de errores.
4. **Adaptabilidad y flexibilidad:** La arquitectura MVC hace que las aplicaciones sean más adaptables a cambios en los requisitos del negocio o en la tecnología subyacente. Puedes realizar cambios en la interfaz de usuario o en la lógica de negocio sin afectar drásticamente otras partes de la aplicación.

- **¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?**

**RESPUESTA:** La diferencia estructural en los directorios, a los pasados laboratorios, es que ahora los directorios en src/main, se van a dividir en dos. El primero src/main/java, donde están todas las clases y controladores. Y el segundo src/main/resources donde están nuestros archivos estáticos CSS y las estructuras HTML de nuestro proyecto.

- **¿Qué anotaciones usaste y cuál es la diferencia entre ellas?**

**RESPUESTA:**
1. **@Controller:** La anotación @Controller en el contexto de Spring Framework es una etiqueta que se coloca en una clase Java para indicar que esa clase actúa como un controlador en una aplicación web basada en Spring MVC.
2. **@GetMapping:** es una anotación en Spring Framework que se utiliza para mapear una solicitud HTTP GET a un método de controlador en una aplicación web.
3. **@RequestParam:** La anotación @RequestParam se utiliza en Spring Framework (un framework de desarrollo de aplicaciones Java) para obtener datos específicos de los parámetros de una solicitud HTTP, como parámetros de consulta en una URL o campos de un formulario HTML.
4. **@SpringBootApplication:** es una anotación en Spring Boot, un proyecto de Spring Framework, que se coloca en la clase principal de una aplicación Spring Boot para indicar que es una aplicación Spring Boot y para habilitar una serie de configuraciones y funcionalidades automáticas.

-------------------------------------
## PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful:

- **¿Qué es RESTful?**

**RESPUESTA:** El enfoque RESTful se utiliza ampliamente en el desarrollo de servicios web y API debido a su simplicidad, escalabilidad y flexibilidad. Permite a los desarrolladores crear sistemas distribuidos que son fáciles de entender, mantener y escalar, lo que lo convierte en una elección popular para aplicaciones web y servicios que funcionan a través de internet.


- **Si utilizo un framework como Boostrap CSS para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?**

**RESPUESTA:** En nuestro caso lo realizamos en la capa **src/main/java/resources/static/css/style.css**.

-------------------------------------
## PARTE IV. - APLICACIÓN MVC JUEGO:

- **¿Qué pasa si abro el sitio de juegos en dos navegadores diferentes?** Hago en uno se ve reflejado en otro
- **¿Qué habría que hacer?** Almacenar cada guess en un array