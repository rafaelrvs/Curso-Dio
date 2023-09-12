# Tipos de Banco de dados:

[] relacionais/ sql;
[] não relacionais/ NoSQL;  
[] Orientado a objetos;
[] Hierarquico;


SGBD = fornece conjunto de ferramentas e  recursos para trabalhar com banco de dados;

Funcionalidades Basicas; CRUD
CERATE, READ,  UPDATE, DELETE

# ACID: 
conjunuto que garante a consistencia do banco

Atomicidade = garante que o processo finalize sem erros
Consistencia = garante que saia de um estato consistente para outro consistente
Isolamento = cada transação é executada de forma isolada; 
Durabilidade 

# Organização sql 

[] DQL = select
[] DML = insert, update, delete
[] DDL = create, alter, drop
[] DCL = grant, revoke
[] DTL = begin, commit, rollback  : garantindo a execução da transação.



# sintaxe:

 > os nomes devem começar com letra ou caracter sublinhado _

 >os nomes podem conter caracter de sublinhado e letra
 >case sensitive


 # mer e der 

 > MER = MODELO ENTIDADE-RELACIONAMENTO É REPRESENTADO  ATRAVÉS DE DIAGRAMAS  CHAMADOS DIAGRAMAS ENTIDADE-RELACIONAMENTO (DER!)



 REPRESENTAÇÃO GRAFICA;

 # ENTIDADE:

  Representação da tabela 
# ATRIBUTOS:
 
  Caracteristica ou propriedade da entidade;

#SINTAXE:

CREATE TABLE usuarios (
	id INt,
    nome VARCHAR(255) NOT NULL COMMENT 'Nomw do usuario',
    email VARCHAR(100) NOT NULL UNIQUE COMMENT 'E-mail do usuario',
    endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do usuario',
    data_nascimento DATE NOT NULL COMMENT ' Data de nascimento');



1 FN primeira forma de dados 

atomicidade o valor da tabela deve ser atomicas, não podendo ser separadas de forma diferentes;

2 FN  é preciso que esteja de acordo com a primeira fn, 



3f nenhuma coluna deve depender de outra coluna



# joins:

> combinar dados
>retorna linha com correspondencia

exemplo:

select* from  tabela1

inner join tabela2 on tabela1.coluna =tabela2.coluna;



O que são subconsultas em um banco de dados relacional?

é uma consulta aninhada dentro de uma SELECT instrução , , INSERT UPDATE ou DELETE dentro de outra subconsulta.


Na modelagem de dados relacionais, a cardinalidade representa:a quantidade de vezes que um elemento de um conjunto de entidades pode, em um determinado instante, estar associado em um dado relacionamento, a outros elementos de outras entidades.



# NOSQL

ESCALABILIDADE:

  AUMENTO CONFORME A DEMANDA DE ACESSO;
  AMPLAMENTE UTILIZADOS PARA DADOS NÃO CRITICOS;
  CONSISTENCIA IMEDIATAS;


|  SQL| NoSQL
| ----|------
| MODELO DE DADOS FIXO | MODELO DE DADOS FLEXIVEL
| ESCALABILIDADE VERTICAL(HARDWARE) |  ESCALABILIDADE HORIZONTAL
| TRANSAÇÕES ACID 100% | TRANSAÇÕES ACID AUSENTES TOTAL OU PARCIAL
| LINGUAGEM DE CONSULTA SQL | CADA SGBD TEM SUA PRORIA



# Tipos:
[x] key-values = cada chave é indentificador unico; "Redis", "Riak", "Amazon"; 
[x] Documento = Documentos semi estruturados; MongoDb, CouchBase,Apache; "Utilizado em catalogo de e-commerce.
[x] coluna baseado em colunas, Apache Cassandra, ScullaDb, HBase= usado registro de logs.
[x] Grafos  Utilizando em  Redes Sociais.

* tolerancia a falha 
* alta disponibilidade
* Tamanho  documento 16MB
* GeoJSON

# ESTRUTURA DE DOCUMENTO:

  > INICIA E FECHA COM CHAVES " DELIMITADOR DE INICIO E FIM"

  {
    "_id":01,
    "nome": "nome",
    "idade": 30,
    "data_nascimento": "1999-10-05",
    "endereco":{
      "lougradouro": "rua123",
      "numero":123,
    }
  }

  # Operações CRUD no banco:

  Criação de collection:
  >bd.createCollection("usuario")
  >bd.createCollection("destino")
  >bd.usuarioInsertOne({})
  >bd.usuarioInserMany([{}]) -> inserção em massa


  # Consulta:

  bd.usuarios.find({})
  bd.usuarios.findOne({}) -> primeiro que localizar
  bd.usuarios.findOneAndUpdate({},{})
  bd.usuarios.findOneAndDelet({})












