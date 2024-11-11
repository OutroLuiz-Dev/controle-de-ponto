
# 📋 Controle de Ponto - Sistema Backend e Frontend Integrado

Este projeto é um Sistema de Controle de Ponto desenvolvido com Java (Spring Boot) no backend e HTML, CSS, e JavaScript no frontend. O sistema permite o gerenciamento de funcionários, incluindo o cadastro, registro de entrada e saída, além de consultas de relatórios de ponto. O banco de dados utilizado é o H2 Database, que é um banco de dados em memória para facilitar o desenvolvimento e testes.

## 📌 Funcionalidades
- **Cadastro de Funcionários**: Registra novos funcionários no sistema.
- **Registro de Entrada**: Marca o horário de entrada de um funcionário.
- **Registro de Saída**: Marca o horário de saída de um funcionário.
- **Listagem de Registros**: Visualiza todos os registros de ponto de um funcionário.
- **Exclusão de Registros**: Permite excluir registros de ponto.
- **Aviso por email**: O funcionário cadastrado recebe um email da sua entrada e saída com data e horário.

## 🚀 Tecnologias Utilizadas
### Backend:
- Java (Spring Boot)
- H2 Database (Banco de dados em memória)
- Postman (para testes de API)
- API para envio de emails: [SENDGRID](https://ahoy.sendgrid.com/email-api-abm-rol-1?utm_source=google&utm_medium=cpc&utm_term=sendgrid%20email&utm_campaign=SendGrid_G_S_LATAM_Brand_(English)&cq_plac=&cq_net=g&cq_pos=&cq_med=&cq_plt=gp&gad_source=1&gclid=Cj0KCQiA88a5BhDPARIsAFj595j5JQ3O_JTsX4mxmdwvnootYpOozF2SVobOZFyqnc9sowWyf3LWpOwaAo52EALw_wcB)


### Frontend:
- HTML5
- CSS3
- JavaScript

## 🛠️ Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas:
- Java JDK 17+
- Maven
- Git
- Postman
- VS Code ( com a extensão Live Server - futuramente faremos deploy do FrontEnd e do Backend)

## 🗂 Estrutura do Projeto
```
controle-de-ponto
├── backend
│   ├── src
│   ├── pom.xml
│   └── ...
└── frontend
    ├── index.html
    ├── css
    │   └── style.css
    └── js
        └── app.js
```

## 📝 Instruções de Instalação

### 1. Clonando o Repositório
Para obter uma cópia do projeto em sua máquina, abra o terminal e execute o seguinte comando:

```
git clone https://github.com/seu-usuario/controle-de-ponto.git
```

### 2. Configurando o Backend (Spring Boot)
Acesse a pasta backend:

```
cd controle-de-ponto/backend
```

#### 2.1 Rodando o Projeto Spring Boot
Certifique-se de que o Java e o Maven estão instalados corretamente. Execute os seguintes comandos:

```
mvn clean install
mvn spring-boot:run
```

O servidor Spring Boot será iniciado em `http://localhost:8080`. Você pode testar as rotas utilizando o Postman.

#### 2.2 Banco de Dados H2
O projeto está configurado para usar o H2 Database. Para acessar o console do H2:

- Abra seu navegador e acesse: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (deixe em branco)

### 3. Configurando o Frontend
Abra uma nova aba do terminal e acesse a pasta frontend:

```
cd ../frontend
```

#### 3.1 Rodando o Frontend
Certifique-se de ter o Live Server instalado no VS Code. Abra o projeto no VS Code e clique em Go Live. O frontend estará acessível em:

```
http://127.0.0.1:5500/index.html
```

### 4. Testando o Sistema
- **Cadastrar Funcionário**: Acesse a página inicial (`index.html`) e utilize o formulário para cadastrar um novo funcionário.
- **Marcar Entrada/Saída**: Utilize os botões para registrar a entrada e saída do funcionário.
- **Consultar Registros**: Utilize a tabela para visualizar os registros de ponto.

## 🧪 Testando com Postman
Você pode testar o backend diretamente usando o Postman:

- **GET /api/pontos/funcionarios** - Listar todos os funcionários
- **POST /api/pontos/funcionarios** - Cadastrar um novo funcionário
- **POST /api/pontos/entrada/{id}** - Marcar entrada
- **POST /api/pontos/saida/{id}** - Marcar saída
- **GET /api/pontos/registros** - Listar todos os registros
- **DELETE /api/pontos/registro/{id}** - Excluir registro de ponto

## 🤝 Contribuindo
Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias.

## 📄 Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para mais detalhes.

## 💬 Contato
Criado por Grupo 3 - ADA BackEnd - Java 2024 - Programa Santander Coders.

