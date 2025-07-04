# Prueba Técnica

## Descripción del proyecto
Automatización de pruebas para cubrir algunos escenarios de verificación y validación del Login para el sitio web http://the-internet.herokuapp.com/login

## Tecnologías utilizadas
- **IDE**: Eclipse
- **Lenguaje de programación**: Java
- **Framework**: Selenium
- **Framework BDD**: Cucumber
- **Manejador de dependencias**: Maven

## Estructura del proyecto


## Pasos de instalación y ejecución
### Pre-requisitos
- Haber instalado versión más reciente de Java (JDK).
- Haber instalado Eclipse IDE.
- Haber descargado e instalado Maven en la pc local.

### Instalación
1. Descargar o clonar el proyecto desde GitHub.
2. Abrir Eclipse IDE e importar el proyecto Maven en la opción Existing Maven Projects. Seleccionar la ruta donde se encuentra el proyecto, luego seleccionar el /pom.xml para tener las dependencias de Maven necesarias y click en Finish.
<img width="602" alt="image" src="https://github.com/user-attachments/assets/7e1285a2-aac0-4841-a581-ea5ab023d837" />
<img width="658" alt="image" src="https://github.com/user-attachments/assets/6de4fe3e-5e26-49f1-9295-b2bc1f9093f2" />

3. Descargar el plugin **Cucumber Eclipse Plugin** desde el Eclipse Marketplace.
<img width="1079" alt="image" src="https://github.com/user-attachments/assets/abfbc743-1498-4de3-9d47-c143a7ecfa77" />


### Ejecución de prueba
La prueba se puede ejecutar de 3 formas distintas:
#### 1. Desde el feature ```Login```.
- Abrir el archivo ```login.feature```. Dentro de este están cada uno de los escenarios a ejecutarse en la prueba.
<img width="1187" alt="image" src="https://github.com/user-attachments/assets/8b608b15-b943-4e7b-9b90-34e59a3a0a86" />

- Dar click derecho y luego click en Run As > Cucumber Feature.
<img width="1049" alt="image" src="https://github.com/user-attachments/assets/80457d30-a041-4885-86fe-d23def911f13" />

- Luego el programa procede a ejecutar los escenarios y al finalizar se muestran los resultados en la consola.
<img width="1331" alt="image" src="https://github.com/user-attachments/assets/ea7e46ac-707f-4e6c-a90c-8ee558e28c3f" />
<img width="1359" alt="image" src="https://github.com/user-attachments/assets/014f51a6-967f-4a5d-a6c8-df931d839e72" />

#### 2. Desde el TestRunner.
- Abrir el archivo ```TestRunner.java```.
<img width="1261" alt="image" src="https://github.com/user-attachments/assets/1479af51-6896-4cb2-a53c-ad478cd35c2e" />

- Dar click derecho y luego click en Run As > JUnit Test.
<img width="1224" alt="image" src="https://github.com/user-attachments/assets/557fa064-427b-4dda-9a9e-5cb0081970a8" />

- Luego el programa procede a ejecutar los escenarios y al finalizar se muestran los resultados en la consola de JUnit.
<img width="1429" alt="image" src="https://github.com/user-attachments/assets/5b3987a8-c5a2-40a7-be39-5e11457d5eb6" />


#### 3. Desde la línea de comando local utilizando Maven.
- Abrir la linea de comando en la pc local y moverse a la carpeta donde se encuentra el proyecto
![image](https://github.com/user-attachments/assets/e3bc3dff-92a0-43c8-9d9c-3426b8c97b5f)

- Ejecutar el comando ```mvn clean verify```. Este comando ejecuta la prueba, genera el archivo del reporte Cucumber en formato .json y luego se genera el archivo ```cucumber-report-html``` basado en el ```cucumber.json```.
<img width="1422" alt="image" src="https://github.com/user-attachments/assets/da3bfbc4-6922-460e-b602-72dc38dd555e" />
<img width="767" alt="image" src="https://github.com/user-attachments/assets/e84970ac-49d7-4720-a477-7f153e0dda57" />
<img width="744" alt="image" src="https://github.com/user-attachments/assets/7736a1fc-739a-4b1d-bf24-be95b697c357" />







## Generación y visualización de reportes
Para la generación de los reportes, se debe ejecutar en el command line el siguiente comando ```mvn clean verify```. Este comando ejecuta la prueba, genera el archivo del reporte Cucumber en formato .json y luego se genera el archivo ```cucumber-report-html``` basado en el ```cucumber.json```.

Luego en la carpeta target/cucumber-report-html/cucumber-html-reports, se pueden visualizar los reportes generados en el navegador.

<img width="1439" alt="image" src="https://github.com/user-attachments/assets/4f91a8d7-ebb9-43f6-a206-3f14d9b599d8" />
<img width="1439" alt="image" src="https://github.com/user-attachments/assets/884a1693-31b6-4f5a-adef-b21228bd03f0" />
<img width="1433" alt="image" src="https://github.com/user-attachments/assets/0b7018e4-9eab-4f4e-b911-ab57cddf139c" />

