# Workshop Spring Boot com MongoDB - Curso de Java do Professor Nélio Alves
Este repositório contém o código-fonte do projeto desenvolvido durante o Workshop de Spring Boot para o curso de Java do Professor Nélio Alves. O objetivo deste workshop é fornecer uma introdução prática ao desenvolvimento de aplicativos web utilizando o framework Spring Boot.

## Descrição
O projeto consiste em um sistema de rede social, onde os usuários podem criar posts e interagir por meio de comentários nos posts. O backend foi construído utilizando o Spring Boot e o MongoDB para fornecer endpoints RESTful para criar, atualizar, recuperar e excluir posts, usuários e comentários.
## Pré-requisitos
Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em sua máquina:

* Java Development Kit (JDK) 8 ou superior
* Maven
* MongoDB

## Configuração
Siga as etapas abaixo para configurar o projeto em sua máquina local:

1. Clone este repositório usando o seguinte comando:
`git clone https://github.com/pablovvoliveira/workshop-springboot-mongodb.git`

2. Navegue até o diretório raiz do projeto:
`cd workshop-springboot-mongodb`

3. Compile o projeto usando o Maven:
`mvn clean install`

## Executando o projeto
Após a conclusão da etapa de configuração, você pode executar o projeto usando o seguinte comando:

shell
Copy code
mvn spring-boot:run
O aplicativo será iniciado e estará acessível em http://localhost:8080.

## Recursos disponíveis
O projeto oferece os seguintes recursos:

* API RESTful para gerenciamento de pedidos, produtos e categorias.
* Implementação de camada de persistência utilizando JPA com o banco de dados H2 embutido.
* Endpoints para criar, atualizar, recuperar e excluir pedidos, produtos e categorias.
* Autenticação básica de usuário para proteger os endpoints.

## Autor
Este projeto foi desenvolvido por Pablo Oliveira, baseado nas aulas do curso de Java do professor Nélio Alves.
