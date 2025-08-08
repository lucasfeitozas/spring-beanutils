# Spring BeanUtils POC

Este é um projeto de prova de conceito (POC) que demonstra o uso do Spring BeanUtils para cópia de propriedades entre objetos Java.

## 📋 Descrição

O projeto demonstra como utilizar a classe `BeanUtils` do Spring Framework para realizar conversões entre entidades (Entity) e objetos de transferência de dados (DTO). É uma biblioteca útil para reduzir código boilerplate ao copiar propriedades entre objetos com estruturas similares.

## 🚀 Funcionalidades

- Cópia simples de propriedades entre Entity e DTO
- Conversão de entidades com collections para DTOs
- Demonstração de diferentes cenários de mapeamento

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal
- **Spring Framework**: Versão 4.2.5.RELEASE (spring-beans)
- **Maven**: Gerenciamento de dependências e build
- **JUnit**: Framework de testes

## 📁 Estrutura do Projeto

```
src/
├── test/
│   └── java/
│       └── br/
│           └── com/
│               └── teste/
│                   └── framework/
│                       └── beanutils/
│                           ├── BeanUtilsTest.java
│                           ├── dto/
│                           │   ├── AgendaDTO.java
│                           │   ├── BarcoDTO.java
│                           │   ├── PassageiroDTO.java
│                           │   └── PessoaDTO.java
│                           └── entity/
│                               ├── Agenda.java
│                               ├── Barco.java
│                               ├── EnumTipoDocumento.java
│                               ├── Passageiro.java
│                               └── Pessoa.java
```

## 🧪 Testes

O projeto inclui testes unitários que demonstram:

1. **beanUtilsTest001**: Teste simples de cópia entre entity e DTO
2. **beanUtilsTest002**: Conversão de entity com collections para DTO

### Como executar os testes

```bash
mvn test
```

## 📦 Como usar

### 1. Clone o repositório
```bash
git clone <url-do-repositorio>
cd spring-beanutils
```

### 2. Compile o projeto
```bash
mvn compile
```

### 3. Execute os testes
```bash
mvn test
```

## 💡 Exemplo de Uso

```java
// Criando uma entidade
Agenda agenda = new Agenda("UTIL AGENDA", new BigDecimal("10.00"), new Date(), 1);

// Criando o DTO
AgendaDTO agendaDTO = new AgendaDTO();

// Copiando propriedades da entidade para o DTO
BeanUtils.copyProperties(agenda, agendaDTO);
```

## 📝 Observações

- Este é um projeto de demonstração/POC
- O Spring BeanUtils copia propriedades com nomes idênticos
- Propriedades com tipos incompatíveis são ignoradas silenciosamente
- Collections precisam ser tratadas manualmente

## 👨‍💻 Autor

**Lucas Feitozas**
- Email: lucasfeitozas@gmail.com
- LinkedIn: [lucas-feitozas-60594324](https://www.linkedin.com/in/lucas-feitozas-60594324)

## 📄 Licença

Este projeto é uma POC para fins educacionais e de demonstração.
