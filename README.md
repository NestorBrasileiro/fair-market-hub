# 🌱 MarketHubConnect

MarketHubConnect é uma aplicação Spring Boot com banco de dados SQLite para cadastrar e consultar feiras comunitárias.

## ✅ Funcionalidades
- Cadastro de feiras (nome, endereço, dias de funcionamento)
- Listagem de todas as feiras

## 🛠 Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- SQLite

## 🚀 Como rodar

### 1. Instalar Java e Maven
```bash
sudo apt install openjdk-17-jdk maven -y
```

### 2. Compilar e rodar
```bash
mvn spring-boot:run
```

### 3. Testar endpoints
```bash
POST http://localhost:8080/api/markets
GET  http://localhost:8080/api/markets
```
