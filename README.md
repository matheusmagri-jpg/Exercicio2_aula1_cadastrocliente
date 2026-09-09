# 📋 Cadastro de Clientes — Exercício 2 (Aula 1)

Aplicação de console desenvolvida em **Java** que realiza o cadastro básico de um cliente, capturando dados essenciais via terminal e exibindo um resumo formatado da operação.

Projeto desenvolvido como exercício introdutório da disciplina de programação, com foco em **entrada e saída de dados** e **manipulação de variáveis**.

<img width="1536" height="1024" alt="ChatGPT Image 9_09_2026, 10_59_12" src="https://github.com/user-attachments/assets/4d9729a1-49d4-48ff-b52b-4f77ce0f26b6" />


## ✨ Funcionalidades

- 📥 Captura de dados pelo terminal:
  - Nome do cliente
  - Idade
  - E-mail
- 📤 Exibição de um resumo formatado após o cadastro
- 🧹 Tratamento de buffer de entrada (`nextLine()` após `nextInt()`)
- ✅ Mensagem de confirmação de sucesso

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Finalidade                        |
|------------|-----------------------------------|
| Java       | Linguagem principal do projeto    |
| `Scanner`  | Leitura de dados do teclado       |

> **Observação:** os demais imports estão comentados no código-fonte, disponíveis para expansões futuras (listas, mapas, datas, números decimais, etc.).

---

## 📦 Estrutura do Projeto

exercicio2_aula1_cadastrocliente/ 
  └── src/ 
  └── exercicio2_aula1_cadastrocliente/ 
  └── Exercicio2_aula1_cadastrocliente.java


---

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) — versão 8 ou superior
- Uma IDE de sua preferência ([NetBeans](https://netbeans.apache.org/), [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/)) **ou** o terminal

---

## ▶️ Como Executar

### Via IDE
1. Importe o projeto na sua IDE preferida.
2. Localize a classe `Exercicio2_aula1_cadastrocliente`.
3. Execute o método `main`.

### Via Terminal
```bash
# Compile o arquivo
javac Exercicio2_aula1_cadastrocliente.java

# Execute o programa
java Exercicio2_aula1_cadastrocliente

Digite o nome do cliente: Matheus Magri
Digite a idade: 30
Digite o email: matheus<img width="1536" height="1024" alt="ChatGPT Image 9_09_2026, 10_59_12" src="https://github.com/user-attachments/assets/335b497d-3c0e-46ef-90a2-b1e0cb4d8cd5" />
<img width="1536" height="1024" alt="ChatGPT Image 9_09_2026, 10_59_12" src="https://github.com/user-attachments/assets/605e9ad4-f0d6-456c-8656-98dcfa67794e" />
@email.com

======= USUARIO CADASTRADO COM SUCESSO =======

O nome do cliente e: Maria Silva
A idade e: 30
O email do cliente e: maria.silva@email.com
================================================

🔍 Detalhes Técnicos
Utilização da classe Scanner para leitura de dados do teclado.
Uso de in.nextLine() extra após in.nextInt() para consumir a quebra de linha residual e evitar conflitos de leitura.
Estrutura simples e didática, ideal para fixação dos conceitos de I/O em Java.

👤 Autor
Matheus — Desenvolvedor do projeto
📄 Licença
Este projeto é de uso educacional e está disponível para fins de estudo.
