# O desafio (Consulta de Solicitações de Viagens)

Criar uma aplicação consumidora da API de webservice para consultar solicitações de viagens e persistir em banco de dados os dados de produtos Aéreos.

Endpoint: https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl

Método a ser utilizado: `pesquisarSolicitacao`.

### Requisito

- Consultar as solicitações de viagens filtrando pelos últimos 3 meses e separar apenas as que contenham produtos Aéreos.

- Criar um banco de dados / tabela para persistir as informações da solicitação de viagem com as infromações básicas: Nome do Passageiro, CIA Aérea, Data/Hora de Saída e Chegada, Cidades de Origem e Destino.

- Segregar o serviço de consulta ao WS e o de persistência no BD, imaginando que poderiam estar em um ambiente distribuído e após consulta ao Webservice a viagem possa ser enviada de alguma forma para um local onde o serviço que fará a persistência faça a leitura desses objetos e efetive a gravação no banco de dados.

- Propor solução utilizando padrões e funcionalidades JavaEE.

# Solução

A seguir será apresentada a solução proposta para o desafio.

## Ambiente
- **Java**: 17
- **Node.js**: 20
- **NPM**: 10

## Backend

No backend, a solução foi estruturada para garantir a separação das responsabilidades entre os módulos.

- *TravelRequest*: Entidade que representa a solicitação de viagem com as informações básicas: Nome do Passageiro, CIA Aérea, Data/Hora de Saída e Chegada, Cidades de Origem e Destino.
- *TravelRequestRepository*: Responsável por realizar a persistência das informações no banco de dados.
- *TravelRequestController*: Responsável por receber as requisições HTTP e delegar a execução do serviço de consulta de solicitações de viagens.
- *TravelApiService*: Responsável por realizar a consulta ao webservice externo de solicitações de viagens.
- *TravelRequestService*: Responsável por persistir as informações das solicitações de viagens no banco de dados. 

### Tecnologias

- **Spring Boot**: Framework Java para criação de aplicações web.
- **Spring Data JPA**: Framework Java para facilitar a persistência das informações no banco de dados.
- **Spring Web**: Conjunto de bibliotecas para criar e expor APIs RESTful de maneira simplificada.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar as informações da aplicação.
- **Apache CXF (JAX-WS)**: Framework para criar e consumir webservices SOAP.
- **Apache CXF (JAX-RS)**: Framework para criar e consumir webservices RESTful.

### Execução

Para executar a aplicação, primeiro faça o clone do repositório:

```bash
git clone git@github.com:sofiarovaris/fullstack-java-teste.git
```

Em seguida, acesse o diretório do projeto:

```bash
cd fullstack-java-teste/backend
```
Configure as variáveis de ambiente do modo que preferir, no Eclipse, por exemplo, você pode configurar as variáveis de ambiente da seguinte forma:

- Clique com o botão direito no projeto e vá em `Run As` -> `Run Configurations...`
- Na aba `Environment`, clique em `New...` e adicione as variáveis de ambiente necessárias.
- Clique em `Apply` e depois em `Run`.

As variáveis de ambiente necessárias são:

- **POSTGRES_URL**: URL de conexão com o banco de dados.
- **POSTGRES_USER**: Usuário do banco de dados.
- **POSTGRES_PASSWORD**: Senha do banco de dados.

- **LEMONTECH_API_CLIENT_KEY**: Chave de autenticação do cliente para acessar o webservice.
- **LEMONTECH_API_USERNAME**: Usuário para autenticação no webservice.
- **LEMONTECH_API_PASSWORD**: Senha para autenticação no webservice.

- **CORS_ORIGINS**: URL de origem permitida para acessar a API.

Após configurar as variáveis de ambiente, execute a aplicação.

## Frontend

No frontend, a solução foi implementada usando a estrutura bem definida de componentes do React.

Existe apenas uma página, a que exibe a lista de solicitações de viagens. Os componentes, tipos, servicos e views estão organizados em pastas separadas.

### Tecnologias

- **React**: Biblioteca JavaScript para criar interfaces de usuário.
- **Next.js**: Framework React para criar aplicações web.
- **DayJs**: Biblioteca JavaScript para manipulação de datas.
- **Ant Design**: Biblioteca de componentes React.

### Configuração

Para configurar a aplicação, copie o arquivo `.env.example` e renomeie para `.env`. Em seguida, configure a variável de ambiente `NEXT_PUBLIC_API_URL` com a URL da API do backend.

### Execução

Como o clone do repositorio já foi feito, acesse o diretório do projeto:

```bash
cd fullstack-java-teste/frontend
```

Instale as dependências do projeto:

```bash
npm install
```

Execute a aplicação:

```bash
npm run dev
```

A aplicação estará disponível em `http://localhost:3000`.