
dicas-macetes-ferramentas

> [!IMPORTANT]
> Lista de dicas, macetes e ferramentas que podem ser úteis no dia a dia de um desenvolvedor.

- Implementando leitura de variaveis do pom.xml dentro do `application.properties` ou `application.yaml`:
    - Add o plugin abaixo na seção de plugins:
      ```xml
       <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-resources-plugin</artifactId>
            <version>3.3.1</version>
            <configuration>
                <delimiters>
                    <delimiter>@</delimiter>
                </delimiters>
                <useDefaultDelimiters>false</useDefaultDelimiters>
            </configuration>
      </plugin>
      ```
    - Add o recurso abaixo na seção do `build`:
      ```xml
          <resources>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
            </resource>
        </resources>
      ```
    - Sempre lembrar de pegar a versão mais atualizada do plugin:
        - https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-resources-plugin
        - https://docs.spring.io/spring-boot/docs/1.4.x/reference/html/howto-properties-and-configuration.html
    - Abaixo exemplo de uso no `application.yaml`:
      ```yaml
        versao:
          mobile: @versao.mobile@
          api: @versao.api@
      ```
  
- Install `vim` on MacOS
    - Define `vim` default editor in GIT
        - ```bash git config --global core.editor "vim" ```

- Arquitetura Hexagonal
    - https://reflectoring.io/spring-hexagonal/
    - https://www.baeldung.com/hexagonal-architecture-ddd-spring

- Aventurando no GraalVM
    - https://medium.com/codex/optimising-performance-with-graalvm-a-guide-to-migrating-a-spring-boot-project-to-native-image-fbb2dcf5d405 

- [Pilares XP](#pilares-xp)

- [Pilares TDD](#pilares-tdd)

- [Falhas de Serialização e Deserialização](#falhas-de-serializacão-e-deserializacão)

- Implementando circuit break em ms springboot
   - https://medium.com/@truongbui95/circuit-breaker-pattern-in-spring-boot-d2d258b75042 

- Pesquisar solução de código em vários repositórios do git, a partir de um único ponto?
   - https://sourcegraph.com/search (indexed)
     
- Configurar Swagger SpringBoot usando SpringDoc (SpringFox Descontinuado)
   - https://www.bezkoder.com/spring-boot-swagger-3/
     
- Dicas MacOS:
   - Instalar SDKMan for MacOS - Gerenciar instalações JAVA
   -  https://sdkman.io/install
   -  Repetição de teclas:
      - Executar no terminal
         - defaults write -g ApplePressAndHoldEnabled -bool false
   - Instalar Shottr (PrintScreen, ScreenShots)
      - https://shottr.cc/ 
   - Trabalhar com Clipboard (Instalar o Maccy)
      - https://maccy.app/
   - Instalar rectangle para gestão de janelas
      - https://rectangleapp.com/
   - Configuração do ohMyzsh + PowerLevel(p10k)
      - [https://github.com/sfidencio/my-study-projects/tree/master/explorando-configuracao-ambiente-windows-wsl2-ubuntu-shell-zshrc (procure](https://v-char.medium.com/now-let-customize-your-native-macos-terminal-with-oh-my-zsh-and-powerlevel10k-b48b9c30d39f)
   - Configurando iTerm (Enable Transparency)
      - https://iterm2.com/
   - Atalhos
      - `Option + E` Acento agudo
      - `Shift + 6` Acento circunflexo
      - `Option + N` Til
      - `Option + C` Cedilha 

- [Instalação e Configuração do IntelliJ embarcado no WSL2](#instalação-e-configuração-do-intellij-embarcado-no-wsl2)
- [Quer evoluir funcionalidades em uma aplicação por meio de features?](#quer-evoluir-funcionalidades-em-uma-aplicação-por-meio-de-features)
- [Como eu envio a URI do recurso recém-criado via verbo POST, e o status CREATED/201 no springboot?](#como-eu-envio-a-uri-do-recurso-recém-criado-via-verbo-post-e-o-status-created201-no-springboot)
- [Como gravar json em um campo do tipo json do banco de dados. (Uso)](#como-gravar-json-em-um-campo-do-tipo-json-do-banco-de-dados-uso)
- [Implementando um Mapper pra converter Map<?,?> para campo tipo json/text, usando JPA/hibernate:](#implementando-um-mapper-pra-converter-map-para-campo-tipo-jsontext-usando-jpahibernate)
- [Dicas Lombok:](#dicas-lombok)
- [Dicas sobre Logging no java](#dicas-sobre-logging-no-java)
- [Lombok não funciona corretamente com MapStruct, quando envolve a feature record do java 17+? então veja o artigo abaixo:](#lombok-não-funciona-corretamente-com-mapstruct-quando-envolve-a-feature-record-do-java-17-então-veja-o-artigo-abaixo)
- [Dicas IntelliJ - Manipulação de arquivos json por exemplo](#dicas-intellij---manipulação-de-arquivos-json-por-exemplo)
- [Dicas de como designar um tipo ENUM para deserializar uma string vazia (Spring Boot)](#dicas-de-como-designar-um-tipo-enum-para-deserializar-uma-string-vazia-spring-boot)
- [Básico do GIT](#básico-do-git)
- [Implementando flyway](#implementando-flyway)
- [Criando projeto springcloud em modulos](#criando-projeto-springcloud-em-modulos)
- Use o jetbrainsToolbox, facita a gestão de ferramentas e permite usar a versão EAP do intelliJ ultimate.
    - https://www.jetbrains.com/toolbox-app/download/download-thanks.html?platform=windows
- [Padrões de URI](#padrões-de-uri)
- [Entendendo Idempotência](#entendendo-idempotência)
- Instale o Git Copilot, e o tema Git Copilot Dark Them no InteliiJ, na seção plugins.
- Considere o uso do SDKMAN para gestão de versões da JDK no java.
    - https://sdkman.io/
- Deploy continuo na AWS via github actions
    - https://www.youtube.com/watch?v=mIuFF_ZP_60
- Gerenciamento usuário com KeyCloak
    - https://www.youtube.com/watch?v=wgdo5I53GQo
- [Dicas GIT](#dicas-git)
- [Paginacao Spring Data](#paginacao-spring-data)
- [Respeitar ordem de execução dos testes unitários no Junit5](#respeitar-ordem-de-execução-dos-testes-unitários-no-junit5)
- Implementando validação no jacoco (SpringBoot)
     - https://www.baeldung.com/jacoco  
   ```xml
      <plugin>
                        <groupId>org.jacoco</groupId>
                        <artifactId>jacoco-maven-plugin</artifactId>
                        <version>0.8.7</version>
                        <executions>
                            <execution>
                                <id>default-prepare-agent</id>
                                <goals>
                                    <goal>prepare-agent</goal>
                                </goals>
                            </execution>
                            <execution>
                                <id>default-report</id>
                                <phase>prepare-package</phase>
                                <goals>
                                    <goal>report</goal>
                                </goals>
                            </execution>
                            <execution>
                                <id>default-check</id>
                                <goals>
                                    <goal>check</goal>
                                </goals>
                                <configuration>
                                    <rules>
                                        <rule>
                                            <element>BUNDLE</element>
                                            <limits>
                                                <limit>
                                                    <counter>COMPLEXITY</counter>
                                                    <value>COVEREDRATIO</value>
                                                    <minimum>0.60</minimum>
                                                </limit>
                                            </limits>
                                        </rule>
                                    </rules>
                                </configuration>
                            </execution>
                        </executions>
                    </plugin>
   ```
- Com a configuração acima, é possível validar a cobertura mínima de código:   
   - Ao executar um `mvn verify`, no cenário acima, teremos uma exigência mínima de 60% de cobertura de código:
      - `Rule violated for bundle api-livros: complexity covered ratio is 0.55, but expected minimum is 0.60`
   
- Load @Configuration based in config property in `YAML`
  ```java
      @Configuration
      @ConditionalOnProperty(name = "myapp.feature.enabled", havingValue = "true")
      public class MyConfiguration {
          // Beans and configurations
      }
  ```

  
- Implementando LogInterceptor

```java
public class LogInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Request URL: " + request.getRequestURL());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("Response Status: " + response.getStatus());
    }
}

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor());
    }
}

```

       


# Instalação e Configuração do IntelliJ embarcado no WSL2
    - https://dev.to/janetmutua/installing-jetbrains-toolbox-on-ubuntu-527f
    - https://github.com/AppImage/AppImageKit/wiki/FUSE
    - https://dev.to/wesleyotio/configurando-wsl2-com-intellij-2pl7
        - Dica interessante sobre a disponibilização dos atalhos no windows. 
    - https://learn.microsoft.com/en-us/windows/wsl/tutorials/gui-apps#install-support-for-linux-gui-apps
        - Instalar o `x11-apps`.     
# Implementação de Spring-HATEOS
    - https://grapeup.com/blog/how-to-build-hypermedia-api-with-spring-hateoas/#

# Quer evoluir funcionalidades em uma aplicação por meio de features?
    - https://openfeature.dev/specification/

# Como eu envio a URI do recurso recém-criado via verbo POST, e o status CREATED/201 no springboot?
```java
  @PostMapping("/mesas/{id}/reservas")
    @Transactional
    public ResponseEntity<?> reservar(
            @PathVariable(value = "id") Long mesaId,
            @RequestBody ReservaMesaRequest request,
            UriComponentsBuilder uriBuilder
    ) {
        // lógica para reservar a mesa

        URI location = uriBuilder.path("/mesas/{id}/reservas/{reservaId}")
                .buildAndExpand(mesa.getId(), reserva.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
    
```
  - Neste exemplo, a URI é construída com base no padrão /mesas/{id}/reservas/{reservaId}, onde {id} é o identificador da mesa e {reservaId} é o identificador da reserva. Ao chamar uriBuilder.path(...).buildAndExpand(...).toUri(), a URI é construída substituindo os placeholders pelos valores reais.
  Ao retornar ResponseEntity.created(location).build(), você está enviando uma resposta 201 CREATED com o cabeçalho Location contendo a URI do recurso recém-criado.
  Esse é um exemplo comum de uso de URI na resposta CREATED no Spring Boot para indicar a localização do recurso criado.

# Como gravar json em um campo do tipo json do banco de dados. (Uso)
  ```java
    @ColumnTransformer(write = "?::jsonb")
    @Column(name = "field_json", nullable = false, columnDefinition = "jsonb")
    private Map<String, String> valores;
  ```

# Implementando um Mapper pra converter Map<?,?> para campo tipo json/text, usando JPA/hibernate: 

```java

//Uso
@Convert(converter = MapConverter.class)
private Map<String, String> valores;

//Implementação do converter
public class MapConverter implements AttributeConverter<Map<String, String>, String> {
    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, String> attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Map<String, String> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, Map.class);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
```

# Dicas Lombok:
    - O Lombok é uma biblioteca muito útil para reduzir a verbosidade do código Java, evitando a escrita de getters, setters, construtores, entre outros métodos padrão. Além das funcionalidades básicas, o Lombok oferece recursos avançados que podem ser configurados para atender às necessidades específicas do seu projeto.
Aqui estão algumas configurações avançadas do Lombok que você pode utilizar:

          - @Builder: A anotação @Builder gera um padrão Builder para a classe, permitindo a criação de objetos de forma mais fluente e legível.

          - @SneakyThrows: A anotação @SneakyThrows permite lançar exceções verificadas sem a necessidade de declará-las no método ou no throws clause.

          - @Synchronized: A anotação @Synchronized adiciona sincronização ao método ou bloco de código em que é aplicada.

          - @Cleanup: A anotação @Cleanup é usada para garantir a limpeza de recursos automaticamente, como fechamento de streams.

          - @AllArgsConstructor: A anotação @AllArgsConstructor gera um construtor que inicializa todos os campos da classe.

    - Para habilitar esses recursos avançados do Lombok, você precisa configurar adequadamente o plugin do Lombok em sua IDE e adicionar as dependências corretas em seu projeto. Além disso, é importante estar ciente de como cada recurso funciona e como aplicá-los corretamente em suas classes.

# Dicas sobre Logging no java

> Caso queira visualizar os log's em niveis de DEBUG e TRACE, sem a necessidade de configurar detalhadamente cada pacote, pasta setar no root.
```yaml
logging:
  level:
    # Default é INFO, mas pra facilitar troubleshooting, usa DEBUG e TRACE
    # Principalmente pra checar valores setados no banco de dados
    # Nesse cenário mostra tudo de todos pacotes, nao precisa configurar detalhadamente cada pacote
    # TRACE ja inclui DEBUG e INFO
    root: ${LOG_LEVEL_ROOT:TRACE}
```

# Lombok não funciona corretamente com MapStruct, quando envolve a feature `record` do java 17+? então veja o artigo abaixo:
 - https://springframework.guru/using-mapstruct-with-project-lombok/

# Dicas IntelliJ - Manipulação de arquivos json por exemplo

  - https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html
  - Selecionar todas as ocorrencias de uma palavra: `ctrl + shift + alt + j`
  - Pressupomos que precisamos extrair apenas o campo "id" do arquivo abaixo, com ajuda da IDE + Regex podemos fazer isso facilmente:

```json
[
  {
    "id": 1,
    "nome": "João",
    "idade": 20
  },
  {
    "id": 2,
    "nome": "Maria",
    "idade": 30
  },
  {
    "id": 3,
    "nome": "José",
    "idade": 40
  }
]
```

- Com arquivo acima aberto na IDE podemos fazer o seguinte:
-  selecione com mouse o campo "id" de um dos objetos, da seguinte forma:
  - ![img_1.png](img/img_1.png)
  - O segredo é, tem que ter um padrão, e esse padrão tem que se repetir em todos os objetos, no caso acima o padrão
      é: `"id".
 - Caso esse padrão não se repita, não tem como fazer isso, pois a IDE não vai conseguir identificar o padrão.
 - pressione `ctrl + shift + alt + j` para selecionar todas as ocorrencias de "id"
 - Deve ficar da seguinte forma a seleção:
 - ![img_2.png](img/img_2.png)
 - Uma vez que o padrão de seleção foi identificado, então com `shift` pressionado, continue a seleção usando as setas do
  teclado, para cima ou para baixo, até que todas as ocorrencias sejam selecionadas.
 - pressione `ctrl + c` para copiar, e cole em outro arquivo, deve ficar da seguinte forma:
  ```text
   "id": 1
   "id": 2
   "id": 3
  ```
 - Pressione `ctrl + r` para abrir a janela de substituição, e no campo "Text to find" digite: `$`, em expressão
    regular, esse caracter indica que a ocorrência está no final da linha e no campo "Replace with" digite por
    exemplo: `;`, ou seja vamos inserir virgula no final.
 - Deve ficar da seguinte forma:
  ```text
   "id": 1,
   "id": 2,
   "id": 3,
  ```
 - Finalmente, selecione todo texto e faça um "join" de linha, pressionando `ctrl + shift + j`, deve ficar daseguinte forma:
  ```text
   "id": 1, "id": 2, "id": 3,
  ```
 - Pronto, agora é só copiar e colar onde precisar.

### Dicas de como designar um tipo ENUM para deserializar uma string vazia (Spring Boot)

> 1. Primeiro crie um tipo ENUM com um atributo do tipo String, e um construtor que recebe esse atributo, exemplo:

```java
 public enum TipoEnum {
    TIPO_1("tipo_1"),
    EMPTY("");

    private String tipo;

    TipoEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
 ```

> 2. Agora crie um deserializer para esse tipo ENUM, que espera uma string vazia da response, exemplo:

```java
@Component
public class TipoEnumDeserializer extends JsonDeserializer<TipoEnum> {
    @Override
    public TipoEnum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String tipo = jsonParser.getValueAsString();
        if (StringUtils.isEmpty(tipo)) {
            return TipoEnum.EMPTY;
        }
        return TipoEnum.valueOf(tipo);
    }
}
```

> 3. Agora vamos registrar esse deserializer ObjectMapper para ser injetado no contexto, exemplo:

```java
@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(TipoEnum.class, new TipoEnumDeserializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
```

> 5. Pronto, agora é só usar o tipo ENUM no seu DTO que vai ser feito "binding" na `response`, exemplo:

```java
   public class MyDTO {
    @JsonDeserialize(using = TipoEnumDeserializer.class)
    private TipoEnum tipo;
}
```

> 6. E o tipo ENUM será deserializado corretamente, mesmo que a response venha com uma string vazia.
```json
{
  "tipo": ""
}
```

# Básico do GIT

### Comandos git para associar o repositório local ao repositório remoto
```bash
git remote add origin URL_DO_REPOSITORIO
git remote -v 
git branch -M main
git push -u origin main
```
### Comandos git para atualizar o repositório local com o repositório remoto
```bash
git pull origin main
```
### Comandos git para atualizar o repositório remoto com o repositório local
```bash
git add .
git commit -m "Mensagem do commit"
git push origin main/master
```
### Comandos git para criar uma nova branch
```bash
git checkout -b nome_da_branch
```
### Comandos git para listar as branches
```bash
git branch
```
### Comandos git para mudar de branch
```bash
git checkout nome_da_branch
```
### Comandos git para deletar uma branch
```bash
git branch -d nome_da_branch
```
### Comandos git para deletar uma branch remota
```bash
git push origin --delete nome_da_branch
```

#### Links sobre git
    - https://github.com/joshnh/Git-Commands

### Padrões de Commit(Semântico)
- https://blog.geekhunter.com.br/o-que-e-commit-e-como-usar-commits-semanticos/
- https://luby.com.br/desenvolvimento/software/commits/

Claro! Aqui estão alguns exemplos de como você pode fazer commits semânticos usando o Git:

Adicionar uma nova funcionalidade:
```bash
git add .
```
```bash
git commit -m "feat(login): Adiciona validação de e-mail no formulário de login"
```
Corrigir um bug:
```bash
git add .
```
```bash
git commit -m "fix(api): Corrige erro de rota na API de usuários"
```
Atualizar a documentação:
```bash
git add .
```
```bash
git commit -m "docs(readme): Atualiza instruções de instalação no README"
```
Fazer uma refatoração no código:
```bash
git add .
git commit -m "refactor: Extrai lógica de autenticação para um novo serviço"
```

# Implementando flyway
 -  [Implementando flayway](https://medium.com/hprog99/set-up-flyway-with-spring-boot-1b24b8abe56e)https://medium.com/hprog99/set-up-flyway-with-spring-boot-1b24b8abe56e
 -  https://www.baeldung.com/database-migrations-with-flyway
```yaml
spring:
  flyway:
    enabled: true
    baseline-on-migrate: true
    #url: jdbc:postgresql://localhost:5432/db
    #user: postgres
    #password: '1234'
    baseline-version: 1
    baseline-description: 'Baseline version'
    locations: classpath:db/migration
    schemas: public
    table: schema_version
    validate-on-migrate: true
```

```xml
         <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
            <version>${flyway.version}</version>
        </dependency>
```

![image](https://github.com/sfidencio/my-study-projects/assets/660615/597247d5-77be-4294-8639-ffc5ca0836d8)

```text
V<version>__<description>.sql for versioned scripts
U<version>__<description>.sql for undo scripts
R__<description>.sql for repeatable scripts
```


# Criando projeto springcloud em modulos

- https://medium.com/@AlexanderObregon/step-by-step-creating-your-first-spring-cloud-application-ef4dcfe277a4
  

# Padrões de URI

Sure! Here are some common URI patterns used in RESTful APIs along with examples:

1. *Resource Collection URI:*
   - Pattern: /resource
   - Example: /users
   - Description: Represents a collection of a specific type of resource.

2. *Resource Element URI:*
   - Pattern: /resource/{id}
   - Example: /users/123
   - Description: Represents a specific element within a collection, identified by its unique identifier.

3. *Nested Resource URI:*
   - Pattern: /resource/{id}/nested-resource
   - Example: /users/123/orders
   - Description: Represents a nested resource related to a specific resource element.

4. *Resource Sub-collection URI:*
   - Pattern: /resource/{id}/sub-resource
   - Example: /users/123/addresses
   - Description: Represents a sub-collection of resources related to a specific resource element.

5. *Resource Action URI (Custom Actions):*
   - Pattern: /resource/{id}/action
   - Example: /users/123/reset-password
   - Description: Represents a custom action or operation that can be performed on a specific resource element.

6. *Search or Filter URI:*
   - Pattern: /resource?parameter=value
   - Example: /users?role=admin
   - Description: Represents a search or filter operation on a collection of resources based on specified criteria.

7. *Paginated Resource URI:*
   - Pattern: /resource?page={page}&size={size}
   - Example: /users?page=1&size=10
   - Description: Represents paginated results for a collection of resources, allowing clients to navigate through large result sets.

These URI patterns provide a structured and consistent way to design the endpoints of your RESTful API. By following these patterns, you can create a clear and intuitive API structure that is easy to understand and use. Remember to choose URI patterns that best fit the resources and operations of your API and document them properly for API consumers.

# Entendendo Idempotência

Os verbos HTTP que são idempotentes são GET, HEAD, PUT e DELETE. Isso significa que esses verbos podem ser executados várias vezes sem alterar o estado do servidor além da primeira requisição. Vou exemplificar o uso desses verbos idempotentes no Spring Boot:

1. *GET*:
   - O verbo GET é usado para recuperar informações do servidor e é idempotente, ou seja, fazer várias solicitações GET para o mesmo recurso não deve alterar o estado do servidor. Um exemplo de uso no Spring Boot seria:

java
@GetMapping("/api/books/{id}")
public ResponseEntity<Book> getBookById(@PathVariable Long id) {
    // Lógica para recuperar um livro com o ID fornecido
    Book book = bookService.getBookById(id);
    return ResponseEntity.ok(book);
}


2. *HEAD*:
   - O verbo HEAD é semelhante ao GET, mas retorna apenas os cabeçalhos da resposta, sem o corpo da resposta. Também é idempotente. Um exemplo no Spring Boot seria semelhante ao método GET acima, mas retornando apenas os cabeçalhos.

3. *PUT*:
   - O verbo PUT é usado para atualizar um recurso no servidor e é idempotente, ou seja, a mesma solicitação PUT pode ser feita várias vezes sem efeitos colaterais. Um exemplo de uso no Spring Boot seria:

java
@PutMapping("/api/books/{id}")
public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
    // Lógica para atualizar o livro com o ID fornecido
    Book book = bookService.updateBook(id, updatedBook);
    return ResponseEntity.ok(book);
}


4. *DELETE*:
   - O verbo DELETE é usado para remover um recurso do servidor e é idempotente, ou seja, excluir um recurso várias vezes não deve alterar o estado do servidor após a primeira requisição. Um exemplo de uso no Spring Boot seria:

java
@DeleteMapping("/api/books/{id}")
public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
    // Lógica para excluir o livro com o ID fornecido
    bookService.deleteBook(id);
    return ResponseEntity.noContent().build();
}


Esses são exemplos de como os verbos HTTP idempotentes (GET, HEAD, PUT e DELETE) podem ser utilizados no Spring Boot para realizar operações de leitura, atualização e exclusão de recursos de forma segura e consistente, sem causar efeitos colaterais indesejados no servidor.
O método POST no protocolo HTTP não é considerado idempotente devido à sua natureza de criação ou modificação de recursos no servidor. A característica de idempotência de um método HTTP significa que realizar a mesma operação várias vezes produzirá o mesmo resultado, sem efeitos colaterais adicionais além da primeira requisição.

Aqui estão algumas razões pelas quais o método POST não é idempotente:

1. *Criação de Recursos*: O método POST é comumente usado para criar novos recursos no servidor. Cada vez que uma requisição POST é feita com os mesmos dados, um novo recurso é criado no servidor, resultando em um estado diferente a cada vez.

2. *Efeitos Colaterais*: Uma requisição POST pode ter efeitos colaterais, como a geração de um identificador único para o recurso criado, a atualização de contadores ou a execução de ações específicas associadas à criação do recurso. Esses efeitos colaterais podem tornar as requisições POST não idempotentes.

3. *Operações de Modificação*: Além da criação de recursos, o método POST também pode ser usado para realizar operações de modificação em recursos existentes, como atualizações parciais ou a execução de ações específicas. Essas operações podem alterar o estado do recurso a cada requisição.

4. *Segurança e Integridade dos Dados*: Em alguns casos, é importante que certas operações não sejam idempotentes para garantir a segurança e a integridade dos dados. Por exemplo, uma transação financeira não deve ser idempotente para evitar cobranças duplicadas.

Em resumo, o método POST no protocolo HTTP não é idempotente porque cada requisição POST pode resultar em uma mudança de estado no servidor, seja criando um novo recurso, modificando um recurso existente ou realizando ações específicas associadas à requisição. Portanto, é importante ter cuidado ao usar o método POST para garantir que as operações realizadas sejam apropriadas e não causem efeitos colaterais indesejados.

# Dicas GIT
https://www.horadecodar.com.br/2021/07/23/como-desfazer-um-git-merge-no-repositorio-local/ 

### Como remover arquivos da área de stage 
```bash
git status 
git reset 
```

### script .bashrc para log in mais rápido nas rotinas git:  
```bash
var1=" https://USUARIO:SENHA@github/PROJETO.git" 
```

### Update pode ser qualquer nome, função do git fetch e git pull 
```bash
alias update='git fetch $var1 && git pull $var1' 
```

push pode ser qualquer nome, função do git push 
```bash
alias push='git push $var1' 
```

like 1 
 
### Como desfazer modificações não salvas 

```bash
git status 
git reset 
git clean -df 
git checkout -- . 
```

### Como desfazer o último commit  - desfazer último commit sem desfazer as modificações nos arquivos: 

```bash
git status 
git reset --soft HEAD~1 
```

### Como deletar commits e também 

### Modificações nos arquivos 
### Voltar o projeto ao estado de um dado commit (deletar commits e alterações posteriores a esse commit) 

```bash
git status 
git reset --hard <código do commit> 
```

### ATENÇÃO: ação destrutiva! 


### Como atualizar o repositório local em relação ao remoto 

```bash
git status 
git pull <nome do remote> <nome do branch> 
```

### Como resolver push rejeitado 
### Não é permitido enviar um push se seu repositório local está atrasado em 
### Relação ao histórico do repositório remoto! Por exemplo: 

```bash
git pull <nome do remote> <nome do branch> 
```

### Você tem que atualizar o repositório local: 

### Resolvendo conflito 

 - Analise o código fonte 
 - Faça as edições necessárias 
 - Faça um novo commit 

 

### Como sobrescrever um histórico no Github 
```bash
git push -f <nome do remote> <nome do branch> 
```

### ATENÇÃO: ação destrutiva! 
   - Como apontar o projeto para outro 
   - repositório remoto 

```bash
git remote set-url origin git@github.com:seuusuario/seurepositorio.git 
```

### Stash - Backup de Workspace  
```bash
git stash push -m "my_stash" 
git stash list 
git stash pop stash@{n} 
git stash apply stash@{n} -> aplicar stash e manter salvo 
git stash apply my_stash 
git restore . 
```

   - https://ohshitgit.com/ 

### Como alterar mensagens antigas de commit 
```bash
git rebase -i HEAD~n 
```

### Onde n e o numero de commits q deseja voltar 
 
### Para altera o commit inicial e todos os outros 
```bash
git rebase -i --root  
```

### Continuar edição dos commits 
```bash
git rebase --edit-todo 
 ```

### Vai aparecer "pick"...e so alterar para "reword"..o texto do commit que deseja alterar,..fazendo isso salve, (ESC^wq!).. Logo, vai ser aberto o arquivo do commit especifico que colocaste "reword"..entao proceda com a alteracao. 
 

### Caso queira alterar, somente o ultimo commit,..utilizo o --amend no commit assim: 

git commit --amend  

### Voltar commit preservando as modificações atuais. 
```bash
git log –oneline  
```

### Pega o hash md5 do commit desejado 

```bash
git reset –mixed HASH_COMMIT  
git add . && git commit –m "NUMERO_CAD: ...." --amend –no-edit 0362804
```

### Apagando e persistindo credenciais de acessos git 
```bash
git config --global --unset credential.helper 
git config --global credential.helper store
```

# Vinculando repository GIT e empurrando codigo

```bash
git init
git remote add origin <URL_do_repositorio_remoto>
git add .
git commit -m "Mensagem do commit"
git push -u origin main
```

# Paginacao Spring Data
![image](https://github.com/sfidencio/my-study-projects/assets/660615/23d09292-31ff-44ef-a0d6-2cd0f34301aa)

![image](https://github.com/sfidencio/my-study-projects/assets/660615/1e726608-241d-4e68-b6c2-a8cb4ddb2310)

![image](https://github.com/sfidencio/my-study-projects/assets/660615/28ed5092-986b-4f9c-9b59-c330448549c1)

![image](https://github.com/sfidencio/my-study-projects/assets/660615/8de31309-ad8c-4202-a9b4-4c73dbe27ab3)

> Observe que o `findByTituloContainingIgnoreCase`, pode incluir mais campos concatenando com `And` ou `Or`, temos essa flexibilidade usando QueryMethod.


# Respeitar ordem de execução dos testes unitários no Junit5

```java

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClassXPTOTest {

   @Test
   @Order(1)
   @DispplayName("My first method execution")
   void test1() {
     ....
   }

}

```


# Pilares XP

😀


A metodologia XP (Extreme Programming) é uma abordagem ágil de desenvolvimento de software que enfatiza a colaboração, a comunicação, a simplicidade e a adaptação a mudanças. Aqui estão algumas práticas e princípios do XP que você pode aplicar ao programar em Java:

### 1. **Programação em Pares (Pair Programming):**
   - Trabalhe em equipe com outro programador para escrever código em conjunto.
   - Compartilhe conhecimento, revise o código um do outro e resolva problemas em conjunto.

### 2. **Test-Driven Development (TDD):**
   - Escreva testes automatizados antes de implementar o código.
   - Refatore e melhore o código continuamente para passar nos testes.

### 3. **Integração Contínua (Continuous Integration):**
   - Integre o código frequentemente para detectar problemas rapidamente.
   - Utilize ferramentas de integração contínua, como Jenkins ou Travis CI.

### 4. **Design Simples (Simple Design):**
   - Mantenha o código simples e fácil de entender.
   - Refatore o código regularmente para eliminar duplicação e manter a coesão.

### 5. **Refatoração (Refactoring):**
   - Melhore a estrutura do código sem alterar seu comportamento.
   - Identifique e corrija código duplicado, complexo ou mal organizado.

### 6. **Propriedade Coletiva do Código (Collective Code Ownership):**
   - Todos os membros da equipe são responsáveis pelo código e podem modificá-lo.
   - Encoraje a colaboração e revisão de código entre os membros da equipe.

### 7. **Iterações Curtas (Short Iterations):**
   - Trabalhe em iterações curtas e entregue valor de forma incremental.
   - Receba feedback regularmente e ajuste o plano conforme necessário.

### 8. **Comunicação Efetiva:**
   - Mantenha uma comunicação clara e aberta com os membros da equipe.
   - Realize reuniões curtas diárias (stand-ups) para compartilhar progresso e identificar obstáculos.

Ao aplicar essas práticas e princípios do XP ao programar em Java, você pode melhorar a qualidade do código, aumentar a colaboração da equipe e entregar valor de forma mais eficiente. Lembre-se de adaptar as práticas do XP de acordo com as necessidades e contexto do seu projeto.

# Pilares TDD
    - https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html
    - https://junit.org/junit5/docs/snapshot/user-guide/index.html#overview-getting-started-example-projects
    - https://docs.spring.io/spring-boot/docs/current/reference/html/test-auto-configuration.html
    - https://www.valuehost.com.br/blog/testes-unitarios/
    - https://www.freecodecamp.org/portuguese/news/como-testar-servicos-endpoints-e-repositorios-com-o-springboot/

### Conceitos

Trata-se da verificação da menor parte testável de um software. Se o código for desenvolvido em uma linguagem que suporta um paradigma funcional, por exemplo, a menor parte será qualquer função. Já se tiver base na orientação a objetos, será um método de seu objeto/classe.

### Boas Práticas
Para escrever testes com qualidade, precisamos ter em mente três ideias centrais:

Testes precisam ser confiáveis.

Seus testes precisam dar a certeza de que eles não possuem bugs.

Testes precisam ser legíveis.

Os testes devem indicar claramente o que está acontecendo à primeira vista. Um teste que não dá pra saber o que está sendo testado não serve para nada.

Testes precisam ser sustentáveis

Os testes precisam seguir a escalabilidade do software que eles testam. Idealmente os testes devem ser imutáveis, portanto é importante garantir que eles se comportem da forma intencionada conforme o código é escalado

### Primeiro Teste deve Falhar (TDD)

Escreva um teste que falhe e faça ter sucesso com o código de produção, assim seus testes sempre devem ser escritos antes dos métodos de produção.
É muito comum "furar" o TDD quando a implementação é algo muito simples. A verdade é que "furar" o TDD é uma má prática e acaba deixando o software vulnerável a erros que poderiam ter sido evitados. Isso auxilia a criação de testes confiáveis já que você sempre vai ver seu teste falhar e ter sucesso.

### Nomes Auto Explicativos
Código de testes deve ser mais legível que código de produção, então não há necessidade de nomear os métodos de teste de forma minimalista.
Prefira nomear os testes da forma que fique o mais claro possível o que o teste está fazendo, mesmo que o nome fique grande e/ou não siga convenções nominais de métodos.

Ex:  

```java
    @Test
    @DisplayName("Dado que o pedido nao existe, quando tentar realizar pedido informando uma quantidade maior que o estoque disponivel, entao o sistema deve impedir o lancamento do pedido retornado erro")
    void DadoQuePedidoNaoExisteQuandoTentarRealizarPedidoInformandoQuantidadeMaiorEstoqueDisponivelEntaoSistemaDeveImpedirLancamentoPedidoRetornandoErro(){
        ...
    }
```

### Rodar Varias Vezes
Teste antes de codificar, após codificar e teste mais uma vez após refatorar o código, não importa o quão pequena for a alteração.
Adotando esse tipo de prática, você assegura que seu código não vai quebrar em nenhum momento e passar despercebido.

### Teste uma Coisa por Vez
Existem ferramentas de Teste Unitário que permitem que os métodos de teste tenham mais de um assert em si.
Isso é considerado uma má prática porque prejudica a clareza do teste, aumenta a chance de ter bugs nos seus testes e torna debugar mais trabalhoso.

Teste uma coisa só por vez.


### Não Insira Lógica nos Testes
Testes não devem conter lógica.
Se o seu teste possui um if ou switch é porque você, provavelmente, está testando mais de uma coisa, e aumenta muito a chance de ter bugs no seu código de teste.

### Simplicidade
Quanto mais simples for a implementação, mais fácil e melhor será de manter em produção.
Isso quer dizer que a maioria das aplicações funcionam melhor quando são mantidas simples ao invés de desnecessariamente complexas.

### Testes Independentes
Cada teste deve executar independentemente de outros.
Haver dependências entre os testes os tornam mais propícios a bugs com a introdução de novos testes.

### Mantenha Testes Antigos Inalterados
Evite alterar ou remover qualquer teste que já esteja passando.
A grande vantagem de utilizar o Teste Unitário, e por consequência o TDD, é a manutenção do código de testes que é executado após cada alteração no código de produção. Alterar ou remover testes que funcionam faz perder totalmente o propósito dos testes que foram construídos.

### Ciclo de Desenvolvimento Red, Green, Refactor (TDD)
Red — o desenvolvedor cria um teste que inicialmente não passará;
ele adiciona a nova funcionalidade ao código;
Green — o teste passa;
Refactor — é feita a refatoração do código;
passa para o próximo teste.
Esse tipo de estratégia promove um feedback rápido sobre essa nova funcionalidade, além de dar um retorno sobre a possível quebra de outras funcionalidades do sistema. Dessa forma, o desenvolvedor ganha muito mais segurança para fazer as refatorações e para adicionar funcionalidades.

### Anatomia
Os testes devem ser criados levando em consideração que dadas tais condições (arrange), ao executar tal ação (act), tais resultados devem ser retornados (assert). Isso é chamado de AAA onde:

Arrange: são definidos os parâmetros de entrada do teste.
Act: ação executada com os parâmetros.
Assert: validação dos resultados gerados pela ação.
Esta forma de desenvolver o teste unitário é bem intuitiva, deixando claro cada passo do teste.

# Falhas de Serialização e Deserialização

- Em caso de falhas na serialização de um objeto java no spring, deve criar uma classe de configuração com um método @Bean que retorne uma instância personalizada do ObjectMapper onde desabilita ou habilita certas  configurações, exemplo:
```java 
@Configuration
public class JacksonConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        return objectMapper;
    }
} 
```

