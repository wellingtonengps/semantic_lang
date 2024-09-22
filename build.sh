#!/bin/bash
echo "----  LIMPA, CONSTROI E COMPILA TODO O PROJETO(PROCESSO COMPLETO) ----"

# Limpando os arquivos antigos
echo "----  Limpando o projeto ----"
rm -f lang/*.class
rm -f lang/interpreter/*.class
rm -f lang/semantic/*.class
rm -f lang/parser/.antlr/*
rm -f lang/parser/*.interp
rm -f lang/parser/*.tokens
rm -f lang/parser/*.class
rm -f lang/parser/LangLexer.class
rm -f lang/parser/LangParser.class
rm -f lang/parser/LangBaseListener.*
rm -f lang/parser/LangBaseVisitor.*
rm -f lang/parser/LangParserBaseListener.*
rm -f lang/parser/LangParserBaseVisitor.*
rm -f lang/parser/LangListener.*
rm -f lang/parser/LangParserListener.*
rm -f lang/parser/LangParserVisitor.*
rm -f lang/ast/*.class

# Gera as classes java do interpretador
echo "----  Gera as classes java do interpretador ----"
java -jar library/antlr-4.13.2-complete.jar -visitor lang/parser/LangLexer.g4 lang/parser/LangParser.g4

# Compilação das classes AST, PARSER, INTERPRETER e SEMANTIC
echo "----  Compilacao das classes ----"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/ast/*.java
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/parser/*.java
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/interpreter/*.java
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/semantic/*.java

# Compila a classe LangCompiler
echo "----  Compila a classe LangCompiler ----"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/LangCompiler.java

echo "----  PROCESSO DE BUILD CONCLUIDO ----"
