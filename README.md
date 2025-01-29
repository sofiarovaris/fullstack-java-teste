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

Após configurar as variáveis de ambiente, execute a aplicação.