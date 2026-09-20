# 🧾 Módulo Contábil

Projeto desenvolvido em **Java** para simular um pequeno sistema de gerenciamento e cálculo de impostos empresariais.

A aplicação permite cadastrar uma empresa, adicionar diferentes tipos de impostos e calcular automaticamente os valores utilizando regras específicas para cada imposto.

O projeto foi desenvolvido como parte dos meus estudos em **Desenvolvimento de Sistemas**, com foco na prática de **Programação Orientada a Objetos (POO)**.

---

## 🚀 Funcionalidades

* 🏢 Cadastro do nome da empresa
* 💰 Cadastro de impostos
* 📊 Cálculo de **PIS**
* 📦 Cálculo de **IPI**
* 📋 Listagem dos impostos cadastrados
* 🧮 Cálculo automático dos valores
* 💻 Interação através do terminal
* 🛑 Comando `pare` para encerrar o programa

---

## 🛠️ Tecnologias utilizadas

* **Java**
* `Scanner`
* `ArrayList`
* `List`
* Interfaces
* Programação Orientada a Objetos

---

## 📚 Conceitos de Java praticados

Este projeto foi desenvolvido para colocar em prática conceitos importantes da linguagem Java:

* **Programação Orientada a Objetos**
* **Encapsulamento**
* **Interfaces**
* **Polimorfismo**
* **Construtores**
* **Herança de comportamento através de interfaces**
* **Sobrescrita de métodos (`@Override`)**
* **Coleções (`List` e `ArrayList`)**
* **Estruturas condicionais (`if / else`)**
* **Laços de repetição (`while`)**
* **Entrada de dados com `Scanner`**
* **Organização de responsabilidades entre classes**

---

## 🏗️ Estrutura do projeto

```text
src/
└── main/
    └── java/
        └── com/
            └── mycompany/
                └── modulocontabil/
                    ├── Main.java
                    ├── Pagamentos.java
                    ├── Imposto.java
                    ├── PIS.java
                    └── IPI.java
```

### 📌 `Main.java`

Responsável pela interação com o usuário e pelo fluxo principal da aplicação.

Permite informar:

* Nome da empresa
* Tipo de imposto
* Valores necessários para o cálculo
* Encerramento do programa

---

### 📌 `Pagamentos.java`

Responsável pelo gerenciamento dos impostos cadastrados.

Utiliza:

```java
List<Imposto>
```

e:

```java
ArrayList<>()
```

para armazenar diferentes tipos de impostos.

---

### 📌 `Imposto.java`

Interface que define um contrato para os impostos:

```java
public interface Imposto {
    double calcular();
    String getDescricao();
}
```

Isso permite que diferentes impostos tenham seus próprios métodos de cálculo, mantendo uma estrutura comum.

---

### 📌 `PIS.java`

Implementa a interface `Imposto` e realiza o cálculo do PIS com base no débito e no crédito informados.

```java
return (debito - credito) * 0.0165;
```

---

### 📌 `IPI.java`

Implementa a interface `Imposto` e calcula o IPI considerando:

* Valor do produto
* Frete
* Seguro
* Outras despesas
* Alíquota informada

A base de cálculo é obtida através de:

```java
double baseCalculo =
    valorProduto + frete + seguro + outrasDespesas;
```

---

## 🧠 Exemplo de execução

```text
Nome da empresa: Empresa Exemplo

Tipo de imposto (PIS, IPI) ou 'pare' para encerrar: PIS

Valor de débito:
10000

Valor do crédito:
2000

Tipo de imposto (PIS, IPI) ou 'pare' para encerrar: IPI

Alíquota (%):
10

Valor do produto:
5000

Valor do frete:
500

Valor do seguro:
100

Outras despesas:
200

Tipo de imposto (PIS, IPI) ou 'pare' para encerrar: pare

=== Impostos de Empresa Exemplo ===
PIS: R$ 132,00
IPI: R$ 580,00
```

---

## 🎯 Objetivo do projeto

O principal objetivo deste projeto é aplicar conceitos estudados durante minha formação em **Desenvolvimento de Sistemas**, transformando conhecimentos teóricos de Java em uma aplicação prática.

Também representa uma etapa da minha evolução no aprendizado de **Programação Orientada a Objetos**, especialmente no uso de interfaces e polimorfismo.

---

## 📈 Próximos passos

Algumas melhorias que podem ser implementadas futuramente:

* [ ] Adicionar novos tipos de impostos
* [ ] Criar tratamento de erros para entradas inválidas
* [ ] Melhorar a interface do terminal
* [ ] Separar melhor as regras de negócio
* [ ] Criar testes automatizados
* [ ] Implementar persistência de dados
* [ ] Criar uma interface gráfica
* [ ] Adicionar banco de dados

---

## 👨‍💻 Autor

**Samuel Covalski**

Estudante de **Desenvolvimento de Sistemas**, atualmente aprofundando meus conhecimentos em Java, Programação Orientada a Objetos, banco de dados e desenvolvimento de aplicações.

🔗 **GitHub:** [Sajoco-afk](https://github.com/Sajoco-afk)

---

⭐ Este projeto faz parte da minha jornada de aprendizado e evolução na área de tecnologia.
