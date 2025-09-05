# 🚀 Spring Boot MCP Server

📖 **Descrição**  
Este projeto é um exemplo de implementação de um MCP (Model Context Protocol) Server utilizando Spring Boot 3.5.5 e Spring AI 1.0.1. O servidor fornece ferramentas (tools) que podem ser utilizadas por aplicações de IA para interagir com fluxos de negócio.

## 🎯 **Objetivo**

Demonstrar como criar um servidor MCP usando Spring Boot que expõe ferramentas específicas através de anotações, permitindo que sistemas de IA consumam essas funcionalidades de forma padronizada.

## ⚡ **Tecnologias Utilizadas**

- ☕ **Java 21**
- 🍃 **Spring Boot 3.5.5**
- 🤖 **Spring AI 1.0.1**
- 📦 **Maven**
- 🔧 **Spring Actuator**

## 🛠️ **Funcionalidades**

- 📋 **Lista de Fluxos**: Obtenção de lista de fluxos cadastrados no sistema
- 🔌 **Tools API**: Exposição de ferramentas através do protocolo MCP
- 📊 **Monitoramento**: Endpoints de health check via Spring Actuator

## 🚀 **Como Executar**

### 📋 **Pré-requisitos**

- Java 21 ou superior
- Maven 3.6+

### 🔧 **Instalação e Execução**

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repositorio>
   cd spring-boot-mcp-server
   ```

2. **Compile o projeto:**
   ```bash
   mvn clean compile
   ```

3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

4. **Ou execute o JAR:**
   ```bash
   mvn clean package
   java -jar target/mcp-server-example-0.0.1-SNAPSHOT.jar
   ```

## 🔗 **Endpoints Disponíveis**

- 🏠 **Health Check**: `/actuator/health`
- 📊 **Métricas**: `/actuator/metrics`
- 🛠️ **Tools MCP**: Expostos automaticamente pelo Spring AI

## 🎛️ **Configuração**

As configurações da aplicação estão no arquivo `src/main/resources/application.properties`.

## 📁 **Estrutura do Projeto**

```
src/
├── main/
│   ├── java/
│   │   └── com/example/mcpserver/
│   │       ├── McpServerApplication.java     # 🏁 Classe principal
│   │       └── FluxosService.java            # 🔧 Service com tools
│   └── resources/
│       └── application.properties            # ⚙️ Configurações
└── test/                                     # 🧪 Testes
```

## 🔧 **Como Adicionar Novas Tools**

Para adicionar novas ferramentas ao servidor MCP:

1. Crie um novo método em uma classe de serviço
2. Anote o método com `@Tool(description = "descrição da tool")`
3. Registre o service como bean no `McpServerApplication`

**Exemplo:**
```java
@Service
public class MinhaNovaService {
    
    @Tool(description = "Descrição da minha nova tool")
    public String minhaNovaFuncao(String parametro) {
        // Implementação da funcionalidade
        return "Resultado";
    }
}
```

## 📝 **Licença**

Este projeto está licenciado sob a [MIT License](LICENSE).

## 🤝 **Contribuição**

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📞 **Contato**

Para dúvidas ou sugestões, entre em contato através das issues do GitHub.

---

⭐ **Se este projeto foi útil para você, considere dar uma estrela!**