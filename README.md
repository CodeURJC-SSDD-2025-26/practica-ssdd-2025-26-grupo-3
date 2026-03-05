# PostCredits

## 👥 Members of the team
| Name | URJC e-mail | GitHub user |
|:--- |:--- |:--- |
| Mario Sauce Soriano | m.sauce.2023@alumnos.urjc.es | TabokGit |
| Demelza Santamaría Gil | d.santamaria.2020@alumnos.urjc.es | QuantumAndromeda |
| Alma Lucía Vázquez Beltrán | al.vazquez.2022@alumnos.urjc.es | soulieOG |
| Sergio Muñoz Laureiro | s.munozl.2023@alumnos.urjc.es | SergioMunozLaureiro
---

## 🎭 **Preface**

### **Description of the topic**
PostCredits is a reviews website that allows users to rate and see others' ratings of various media (such as video games and books).

### **Entities**

1. **User**: it represents the people who use the app.
2. **Book**: it represents the books available to be rated.
3. **Videogame**: it represents the games available to be rated.
4. **Review**: central entity of the system.

**Connection between entities:**
- User-Review: a user can write many reviews, a review belongs to a single user (1:N).
- Book-Review: a book can have many reviews, a review is associated with a single book (1:N).
- Videogame-Review: a videogame can have many reviews, a review is associated with a single videogame (1:N).
- User-Book: a user can like many books, a book can have many users that like it (N:M).
- User-Videogame: a user can like many videogames, a videogame can have many users that like it (N:M).
- User-Review: a user can like many reviews, a review can have many likes (N:M).

  ![ER Diagram](https://github.com/user-attachments/assets/f57be15c-f93d-4083-ba59-4ee6893f0b5d)

### **User Permits**

* **Anonymous user**: 
  - Permits: create account, search books and video games (media in general), view reviews.
  - Does not own any entity.

* **Registered User**: 
  - Permits: log in, log out, write review, view profile, like a book, like a video game, edit review, like a review, remove the option to send e-mails, change profile picture
  - Owns: their reviews, their content likes, their profile data

* **Administrator**: 
  - Permits: add new books, add new videogames, delete book, delete videogame
  - Owns: books and video games.

### **Images**

- **User**: one avatar image per user.
- **Videogame**: multiple images for videogames.
- **Book**: multiple images for books.

### **Charts**

- **Chart 1**: products with the most reviews - Histogram

### **Complementary Technology**

- Automatic e-mail notifications when creating an account and someone likes your review

### **Algorithm or advanced query**
Indicar cuál será el algoritmo o consulta avanzada que se implementará:

- **Algoritmo/Consulta**: [Ej: Sistema de recomendaciones basado en el historial de compras del usuario]
- **Descripción**: [Ej: Analiza los productos comprados previamente y sugiere productos similares o complementarios utilizando filtrado colaborativo]
- **Alternativa**: [Ej: Consulta compleja que agrupe ventas por categoría, mes y región, con cálculo de tendencias]

---

## 🛠 **Practice 1: Web page layout with HTML and CSS**

### **Navigation diagram**

![Navigation diagram](https://github.com/user-attachments/assets/787b2ae4-3430-4254-8fc3-e797329492d4)

> [From the home page, an administrator can access the admin panel and the forms to create a book or game. A registered user can access their profile, and all users, including unregistered users, can access the create account and sign in forms, along with the product page. From the product page, a registered user can access the form to upload a review, while an administrator can access the product editing form.]

### **Screenshots and Page Descriptions**

#### **1. Home Page**
![Home](https://github.com/user-attachments/assets/26944c9b-0086-4055-ba18-0a5c7d54fd26)

> [Home page displaying all products and a histogram of the most liked items. Includes search bar, login access for unauthenticated users, an image that access the user profile and a button to switch from light to dark mode.]

#### **2. Create account**
![Create account](https://github.com/user-attachments/assets/6d800ff9-41ad-4858-8324-f7efbd130cbb)

> [Form to create an account with the fields email, username and password.]

#### **3. Sign in**
![Sign in](https://github.com/user-attachments/assets/81ac11e9-a7c2-4f45-a9a7-674374ed2dda)

> [Form to sign in with username and password]

#### **4. Product Page**
![Product page](https://github.com/user-attachments/assets/21a9448c-b004-42a3-9367-347ecd6cc513)

> [Product page, showing all the information filled in the forms, an edit product button(only for admin) and a delete review button, includes an image of the cover of the product. Also show the reviews that the product has with an option to add review.]

#### **5. Form book**
![Form Book](https://github.com/user-attachments/assets/f9d99866-93e0-424b-b6f1-24486c954387)

> [Form to create a book with the fields title, book cover, author, genre, saga, editorial, date of publication and synopsis.]

#### **6. Form game**
![Form game](https://github.com/user-attachments/assets/bfe175c7-6a1d-4fe7-b2de-c3b77eb13fd8)

> [Form to create a game with the fields title, game cover, company, genre, franchise, date of publication and synopsis.]

#### **7. Form review**
![Form review](https://github.com/user-attachments/assets/d80e2242-9bba-4d72-a6ca-9b047ba9b066)

> [Form to write a review with a rating system display with stars.]

#### **8. Edit product page**
![Edit product](https://github.com/user-attachments/assets/d92c7b90-4ce8-4435-afa9-0f481026248d)

> [Form to edit a book or game with the fields title, book cover, author, genre, saga, editorial, date of publication and synopsis.]

#### **9. User profile**
![User profile](https://github.com/user-attachments/assets/e4730eba-31f0-44a9-8b00-a976c882e0ec)

> [User profile panel with profile picture, name, and password, with buttons to edit them.]

#### **10. Admin panel**
![Admin panel](https://github.com/user-attachments/assets/c10cba10-396a-4ba9-a2c6-092ebf5b0920)

> [Administrator panel where each user can be viewed with buttons to access user profiles and to ban them]

### **Member Participation in Practice 1**

#### **Student 1 - Demelza Santamaría Gil**

Responsible for creating the user profile and admin panel pages along with their functionalities and a histogram on the home page, as well as collaborating with the rest of the team to maintain good practices and the format of the CSS and HTML files.

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [User profile page](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/commit/5e108b74771e37710baf7d05eddfe35e3be520e1)  | [user_profile.html](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/blob/main/views/user_profile.html)   |
|2| [Admin panel page](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/commit/f8c8e0f28a9b4b8ba350fb6207619ac3f4484cdb)  | [admin_panel.html](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/blob/main/views/admin_panel.html)   |
|3| [Histogram in home page](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/commit/fc632b9cae0f4a1cab5e5e36b10a4ff0774c3dd7)  | [home.html](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/blob/main/views/home.html)   |
|4| [Relocated CSS atributes to Bootstrap in HTML](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/commit/3094c8943533375fea7dd7ee2643b7d88bcd60bd)  | [page.css](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/blob/main/styles/page.css)   |
|5| [Some other code refactored](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/commit/e1da5ac74bcf363b1609482215e00f537641cabe)  | [admin_panel.html](https://github.com/CodeURJC-SSDD-2025-26/practica-ssdd-2025-26-grupo-3/blob/main/views/admin_panel.html)   |

---

#### **Alumno 2 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 3 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 4 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

## 🛠 **Práctica 2: Web con HTML generado en servidor**

### **Navegación y Capturas de Pantalla**

#### **Diagrama de Navegación**

Solo si ha cambiado.

#### **Capturas de Pantalla Actualizadas**

Solo si han cambiado.

### **Instrucciones de Ejecución**

#### **Requisitos Previos**
- **Java**: versión 21 o superior
- **Maven**: versión 3.8 o superior
- **MySQL**: versión 8.0 o superior
- **Git**: para clonar el repositorio

#### **Pasos para ejecutar la aplicación**

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/[usuario]/[nombre-repositorio].git
   cd [nombre-repositorio]
   ```

2. **AQUÍ INDICAR LO SIGUIENTES PASOS**

#### **Credenciales de prueba**
- **Usuario Admin**: usuario: `admin`, contraseña: `admin`
- **Usuario Registrado**: usuario: `user`, contraseña: `user`

### **Diagrama de Entidades de Base de Datos**

Diagrama mostrando las entidades, sus campos y relaciones:

![Diagrama Entidad-Relación](images/database-diagram.png)

> [Descripción opcional: Ej: "El diagrama muestra las 4 entidades principales: Usuario, Producto, Pedido y Categoría, con sus respectivos atributos y relaciones 1:N y N:M."]

### **Diagrama de Clases y Templates**

Diagrama de clases de la aplicación con diferenciación por colores o secciones:

![Diagrama de Clases](images/classes-diagram.png)

> [Descripción opcional del diagrama y relaciones principales]

### **Participación de Miembros en la Práctica 2**

#### **Alumno 1 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 2 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 3 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 4 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

## 🛠 **Práctica 3: API REST, docker y despliegue**

### **Documentación de la API REST**

#### **Especificación OpenAPI**
📄 **[Especificación OpenAPI (YAML)](/api-docs/api-docs.yaml)**

#### **Documentación HTML**
📖 **[Documentación API REST (HTML)](https://raw.githack.com/[usuario]/[repositorio]/main/api-docs/api-docs.html)**

> La documentación de la API REST se encuentra en la carpeta `/api-docs` del repositorio. Se ha generado automáticamente con SpringDoc a partir de las anotaciones en el código Java.

### **Diagrama de Clases y Templates Actualizado**

Diagrama actualizado incluyendo los @RestController y su relación con los @Service compartidos:

![Diagrama de Clases Actualizado](images/complete-classes-diagram.png)

### **Instrucciones de Ejecución con Docker**

#### **Requisitos previos:**
- Docker instalado (versión 20.10 o superior)
- Docker Compose instalado (versión 2.0 o superior)

#### **Pasos para ejecutar con docker-compose:**

1. **Clonar el repositorio** (si no lo has hecho ya):
   ```bash
   git clone https://github.com/[usuario]/[repositorio].git
   cd [repositorio]
   ```

2. **AQUÍ LOS SIGUIENTES PASOS**:

### **Construcción de la Imagen Docker**

#### **Requisitos:**
- Docker instalado en el sistema

#### **Pasos para construir y publicar la imagen:**

1. **Navegar al directorio de Docker**:
   ```bash
   cd docker
   ```

2. **AQUÍ LOS SIGUIENTES PASOS**

### **Despliegue en Máquina Virtual**

#### **Requisitos:**
- Acceso a la máquina virtual (SSH)
- Clave privada para autenticación
- Conexión a la red correspondiente o VPN configurada

#### **Pasos para desplegar:**

1. **Conectar a la máquina virtual**:
   ```bash
   ssh -i [ruta/a/clave.key] [usuario]@[IP-o-dominio-VM]
   ```
   
   Ejemplo:
   ```bash
   ssh -i ssh-keys/app.key vmuser@10.100.139.XXX
   ```

2. **AQUÍ LOS SIGUIENTES PASOS**:

### **URL de la Aplicación Desplegada**

🌐 **URL de acceso**: `https://[nombre-app].etsii.urjc.es:8443`

#### **Credenciales de Usuarios de Ejemplo**

| Rol | Usuario | Contraseña |
|:---|:---|:---|
| Administrador | admin | admin123 |
| Usuario Registrado | user1 | user123 |
| Usuario Registrado | user2 | user123 |

### **OTRA DOCUMENTACIÓN ADICIONAL REQUERIDA EN LA PRÁCTICA**

### **Participación de Miembros en la Práctica 3**

#### **Alumno 1 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 2 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 3 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---

#### **Alumno 4 - [Nombre Completo]**

[Descripción de las tareas y responsabilidades principales del alumno en el proyecto]

| Nº    | Commits      | Files      |
|:------------: |:------------:| :------------:|
|1| [Descripción commit 1](URL_commit_1)  | [Archivo1](URL_archivo_1)   |
|2| [Descripción commit 2](URL_commit_2)  | [Archivo2](URL_archivo_2)   |
|3| [Descripción commit 3](URL_commit_3)  | [Archivo3](URL_archivo_3)   |
|4| [Descripción commit 4](URL_commit_4)  | [Archivo4](URL_archivo_4)   |
|5| [Descripción commit 5](URL_commit_5)  | [Archivo5](URL_archivo_5)   |

---
