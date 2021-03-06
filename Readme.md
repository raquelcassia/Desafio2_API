# Desafio 2 - OMDB API
> Projeto de automação para API OMDB em Java utilizando Maven Framework e REST Assured.		


---	


Criar um projeto de automação para API utilizando framework de sua preferência os cenários
para as duas funcionalidades abaixo:

```
EndPoint:    http://www.omdbapi.com/?i=[ID_DO_FILME]&apikey=[API_KEY]
Parâmetros:  ID_DO_FILME: tt1285016 API_KEY= 52ec71bf

ID_DO_FILME e API_KEY deverão ser passados por variáveis GLOBAIS
```




1 - No endpoint validar o response para:

```
• Titulo do Filme
• Ano do Filme
• Idioma do filme
```

2 - No endpoint validar o response para:

```
• Busca filme inexistente
```
---
## Casos de Teste

```
 1. Validação do Titulo, Ano e Idioma do Filme retornado.
 2. Validação de Filme Inexistente através de Key inválida.
 3. Validação de Filme Inexistente através de Id inválido.
```
---

## Requisitos


- [JDK install +8](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Eclipse IDE install](http://www.eclipse.org/downloads/)
- [Maven](https://dicasdejava.com.br/como-instalar-o-maven-no-windows/)

---

## Como rodar

```
• mvn clean test
```
![CONTINUOUS INTEGRATION](https://github.com/raquelcassia/Desafio2_API/workflows/CONTINUOUS%20INTEGRATION/badge.svg)

