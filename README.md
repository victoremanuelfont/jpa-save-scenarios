# Estudo de Caso: Mapeamento de Relacionamentos e DTOs no Spring Boot

Este repositório contém implementações práticas de persistência de dados em APIs REST com Spring Boot, focando especificamente nas estratégias de inserção (INSERT) para relacionamentos entre entidades.

O projeto explora como diferentes formatos de JSON (Entrada) influenciam a construção de DTOs (Data Transfer Objects) e a lógica da camada de Serviço.

## 🚀 Tópicos Abordados

O código apresenta soluções para três cenários comuns de associação:

* **Relacionamento Many-to-One (N:1):**
    * **Abordagem Aninhada (Nested):** Recebendo um objeto completo (ex: `Person` com `Department` dentro).
    * **Abordagem Plana (Flat):** Recebendo apenas a referência do ID (ex: `departmentId`).
* **Relacionamento Many-to-Many (N:N):**
    * **Listas de Objetos:** Como iterar e associar listas de categorias a um produto.

## 📚 Artigo Completo (Documentação & Análise)

Para entender a teoria e as decisões de design por trás deste código, escrevi um artigo detalhado onde explico o passo a passo de cada implementação.
https://www.linkedin.com/pulse/estudo-de-caso-persist%C3%AAncia-relacionamentos-e-padr%C3%B5es-victor-emanuel-mjbgf/?trackingId=A8%2BZHa%2B9ROqWOnkZcCsubA%3D%3D

### Resumo do Artigo:
Neste texto, apresento minha interpretação técnica sobre como lidar com a complexidade de associações em APIs. Discuto as vantagens de simplificar DTOs, a diferença entre usar objetos aninhados versus referências de ID, e como manipular coleções no Java para persistir dados corretamente no banco. É um material focado em transformar a teoria de relacionamentos JPA em prática de código limpo.

## 🛠 Tecnologias Utilizadas
* Java 17+
* Spring Boot 3
* Spring Data JPA
* H2 Database (Banco em memória para testes)
* Maven

## ⚡ Créditos e Referências

Este material foi desenvolvido com base nos estudos realizados no curso do **Professor Nélio Alves**, minha principal referência no ecossistema Java/Spring. O código reflete minhas adaptações e interpretações pessoais sobre os casos de uso propostos em suas aulas, visando aprofundar o entendimento sobre modelagem de dados e arquitetura em camadas.

---
Feito com ☕ por **Victor Emanuel**
