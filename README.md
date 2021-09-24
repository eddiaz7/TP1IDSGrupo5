# TP1IDSGrupo5
Integrantes:
Brau, Fabián
Díaz, Edwin
Riboldi, Rodrigo
Urresti, Alejandro

-----------------------------------------------------------------------------------------------------------
Versionado README
Version 1.0.0






-----------------------------------------------------------------------------------------------------------
Respuestas consignas TP1:
2)	Subir al repositorio un software de su elección (preferentemente en Java pero pueden utilizar el lenguaje y framework que deseen). Sobre este software:

b.	¿Cómo hacemos para no subir cambios de configuraciones locales? Configurar el repositorio para ignorar estos archivos.
Rta: Para no subir los cambios de las configuraciones locales debemos editar el archivo .gitignore para agregar en el mismo los path de las carpetas que queremos ignorar, en este caso “.settings”

g.	Llevar al entorno productivo Release 1. ¿Cómo lo hace siguiendo Gitflow?
    Según lo hablado con Matías en consulta 24/09/2021 hacemos aclaraciones al respecto de este item.
    Nostros habíamos interpretado que cuando mergeamos la rama "Release1" a master se generaba automaticamente un publicación de la versión.
    Los pasos que nos faltaron hacer son:
      1) Ir a la opción "Crear nuevo Release" en gitflow
      2) Seleccionar como Target "master"
      3) Crear un tag. "v1.0.0" 
      4) Hacer un "Publish Release"
      
     Rta: Con Gitflow primero debemos hacer un Git-request de Release1 a Master (Producción) y en el caso que también se tenga una rama de desarrolo (dev) también  hacer un Git-request desde Release2 hacia desarrollo.

h.	Lograr un merge de ambas ramas con master. Publicar una nueva versión.
Según lo hablado con Matías en consulta 24/09/2021 hacemos aclaraciones al respecto de este item.
  * Nostros habíamos interpretado que cuando mergeamos las ramas "Release1" y "Release2" a master se generaba automaticamente un publicación de la versión.
  * Los pasos que nos faltaron hacer son:
      1) Ir a la opción "Crear nuevo Release" en gitflow
      2) Seleccionar como Target "master"
      3) Crear un tag. "v1.1.0" 
      4) Hacer un "Publish Release"

i.	Crear otra rama para incorporar una nueva funcionalidad.
   Rta:Se creó una rama de desarrollo (dev)

k.	Llevar los cambios de la rama creada en el punto i a producción. ¿Cómo lo hace siguiendo Gitflow?
Rta: Nosotros en este item no seguimos Gitflow, seguimos los siguientes pasos:
  1) Realizamos "Pull-request" desde "dev" directamentea a la rama "master"
  2) Confirmar Pull-Request en master
  3) "Crear nuevo Release" en gitflow
  4) Seleccionar como Target "master"
  5) Crear un tag. "v1.2.0" se seleccionó este tag contienando la lógica de las omisiones descriptas en los item "g" y "h".
  6) Hacer un "Publish Release"

Siguiendo Gitflow debemos seguir los siguietes pasos:
  1) Realizar un merge desde la rama "dev" generada en el punto i a la rama “ReleaseN”
  2) Desde “ReleaseN” hacemos un Pull-Request a master
  3) Confirmar Pull-Request en master
  4) "Crear nuevo Release" en gitflow
  5) Seleccionar como Target "master"
  6) Crear un tag. "v1.2.0" 
  7) Hacer un "Publish Release"

3)	¿Cómo podemos documentar con git? 
a.	Realizar un readme para el código subido. ¿Qué documentarían allí? Versionar el README en el repositorio.
Rta: Documentaríamos:
  * Descripción de las funcionalidades
  * Contexto donde fue desarrollado
  * Los problemas de desarrollo que se resolvieron
  * Guia de instalación
  * Autores de la documentación

b.	Si un externo realiza una modificación, necesitamos entender el cambio realizado (PR o Pull Request). ¿Qué datos le pediría a esa persona que complete? ¿Qué nos ofrece GitHub para ayudarnos con esto?
Al la persona que lo publicó le pediría: 
 * ¿cuál es el motivo que motivó el cambio?
 * ¿qué problema intentó resolver y cómo?
 * ¿quén solicitó el cambio?
 Github nos ofrece información detallada tanto del autor como del código de los cambios realizados, el momento en que lo hizo y sobre que rama del proyecto.
 


