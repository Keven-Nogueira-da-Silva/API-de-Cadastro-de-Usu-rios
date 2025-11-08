# API de Cadastro de Usuários

Este projeto é uma API REST desenvolvida em **Java com Spring Boot**, com foco em operações de cadastro, listagem, busca e remoção de usuários. O objetivo é simular um ambiente real usado no back-end, aplicando boas práticas de desenvolvimento.

---

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **H2 Database** (ambiente de teste)

---

## 📌 Funcionalidades

| Função                 | Descrição                                       |
| ---------------------- | ----------------------------------------------- |
| Listar usuários        | Retorna todos os usuários cadastrados           |
| Buscar usuário por ID  | Retorna um usuário específico, caso exista      |
| Criar novo usuário     | Realiza cadastro validando e-mail duplicado     |
| Deletar usuário por ID | Remove o usuário do banco caso o ID seja válido |

---

## 🗂 Estrutura de Pastas

```
src/main/java/com/register/users
│
├── controller   → Controladores REST
├── servicer     → Regras de negócio (Service)
├── repository   → Interface de acesso ao banco (JPA)
├── model        → Entidades (User)
└── exception    → Exceções customizadas
```

---

## ⚙️ Endpoints

### Listar usuários

```
GET /usuarios
```

### Buscar usuário por ID

```
GET /usuarios/{id}
```

### Criar novo usuário

```
POST /usuarios
Body JSON:
{
  "nome": "Exemplo Nome",
  "email": "exemplo@email.com"
}
```

### Deletar usuário

```
DELETE /usuarios/{id}
```

---

## 🔒 Tratamento de Erros

* `ResourceNotFoundException` → Usuário não encontrado
* `DuplicateResourceException` → E-mail já cadastrado

A API retorna mensagens claras e objetivas para facilitar o consumo pelo cliente.

---

## 💾 Banco de Dados

O projeto utiliza o banco **H2** somente para desenvolvimento e testes.

Painel para visualização:

```
http://localhost:8080/h2-console
```

Driver: `org.h2.Driver`

---

## ▶️ Como Executar o Projeto

1. Clone o repositório

```
git clone <url-do-repositorio>
```

2. Abra no IntelliJ ou VS Code com suporte a Spring
3. Execute a classe principal `Application.java`
4. Teste os endpoints usando Postman, Insomnia ou navegador

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em prática profissional, seguindo camadas organizadas e validações para consolidar conhecimento de back-end com Spring Boot.

Sinta-se à vontade para sugerir melhorias 😊
