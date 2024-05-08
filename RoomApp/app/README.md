# HeroesDB App

Esta aplicación permite a los usuarios visualizar un listado de héroes de Marvel y DC. Implementa Clean Architecture para la estructura del proyecto, utilizando Room para gestionar la persistencia de datos en una tabla llamada "Hero" que incluye campos para Id, nombre e imagen. La inyección de dependencias está manejada mediante Dagger Hilt, y la interfaz de usuario consiste en un RecyclerView para mostrar los héroes. Al iniciar la aplicación, los datos son insertados desde una clase estática a la base de datos y se utilizan Flows para gestionar estos datos de manera reactiva.

## Arquitectura

El proyecto sigue el patrón de arquitectura Clean Architecture, que se compone de las siguientes capas:

- **Capa de Presentación (UI)**: Contiene las actividades, fragmentos y vistas de la aplicación. En esta capa se encuentra el RecyclerView para mostrar los héroes.

- **Capa de Dominio**: Contiene los casos de uso (Use Cases) y las entidades del dominio. Aquí se definen las operaciones que puede realizar la aplicación sobre los datos.

- **Capa de Datos**: Incluye los repositorios y fuentes de datos. Aquí se maneja la lógica para obtener y almacenar los datos, utilizando Room para la persistencia.

## Dagger Hilt

Dagger Hilt se utiliza para la inyección de dependencias en todo el proyecto. Se configura para proporcionar las instancias necesarias de ViewModels, Use Cases, DAOs y repositorios.

## Room

Room se emplea para gestionar la persistencia de datos en la aplicación. Se define una base de datos con una tabla llamada "Hero" que contiene campos para Id, nombre e imagen. Además, se realiza una inserción inicial de datos al cargar la aplicación.

## Interfaz de Usuario

La interfaz de usuario es limpia y funcional, utilizando un RecyclerView para mostrar la lista de héroes. Se sigue las mejores prácticas de diseño de UI en Android para asegurar una experiencia de usuario óptima.

## Documentación (README)

Este README proporciona una descripción detallada del proyecto, incluyendo la arquitectura utilizada, las librerías implementadas y los pasos necesarios para ejecutar la aplicación. También se documenta la estructura del proyecto y se ofrecen detalles sobre cada componente clave.

## Uso de Flows

Se emplean Flows eficientemente para permitir la programación reactiva y asegurar que los héroes se actualicen en tiempo real de manera óptima.

---
Este README proporciona una visión general del proyecto HeroesDB App, detallando su arquitectura, herramientas utilizadas y otros aspectos importantes. Para más información sobre la implementación y detalles específicos del código, por favor, consulta la documentación y comentarios en el código fuente.~~~~~~~~