# Spring Boot Properties File

Spring Boot property files (`application.properties` / `application.yml`) are used to manage application configuration such as database, server, security, JWT, and OAuth2 settings.

---

# 📂 File Location

```bash
src/main/resources/application.properties
```

---

# 🚀 Common Spring Boot Properties

## 1️⃣ Server Configuration

```properties
server.port=8080
server.servlet.context-path=/api
```

### Description
- `server.port` → Changes application port
- `server.servlet.context-path` → Adds base URL path

---

## 2️⃣ Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Description
Used to connect Spring Boot with MySQL database.

---

## 3️⃣ JPA & Hibernate Configuration

```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Description
- `update` → Automatically updates tables
- `show-sql` → Shows SQL queries in console
- `format_sql` → Formats SQL output

---

## 4️⃣ Logging Configuration

```properties
logging.level.org.springframework=INFO
logging.level.com.example=DEBUG
```

### Description
Controls logging level for debugging and monitoring.

---

## 5️⃣ JWT Configuration

```properties
jwt.secret=mySecretKey
jwt.expiration=3600000
```

### Description
Used for JWT authentication and token expiration settings.

---

## 6️⃣ OAuth2 Google Configuration

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
```

### Description
Configures Google OAuth2 authentication.

---

## 7️⃣ GitHub OAuth2 Configuration

```properties
spring.security.oauth2.client.registration.github.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_CLIENT_SECRET
```

### Description
Configures GitHub OAuth2 login integration.

---

# 📌 Spring Profiles

## application-dev.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dev_db
```

## application-prod.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/prod_db
```

### Activate Profile

```properties
spring.profiles.active=dev
```

---

# 🔥 Best Practices

- Never expose secrets in public repositories
- Use environment variables for sensitive data
- Separate dev and production configs
- Use profiles for scalability

---

# 📖 Complete Example

```properties
# Server
server.port=8080

# Database
spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
spring.datasource.username=root
spring.datasource.password=root

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# JWT
jwt.secret=mySecretKey
jwt.expiration=3600000

# OAuth2 Google
spring.security.oauth2.client.registration.google.client-id=CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=CLIENT_SECRET

# OAuth2 GitHub
spring.security.oauth2.client.registration.github.client-id=CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=CLIENT_SECRET
```

---

# 🎯 Conclusion

Spring Boot property files make application configuration simple, centralized, and easy to manage. Using profiles and proper configuration practices helps build scalable and secure applications.
