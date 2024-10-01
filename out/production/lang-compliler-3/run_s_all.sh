#!/bin/bash

# Caminho para a pasta onde estão os arquivos .lan
DIR="./testes/semantica/certo/"

# Loop através de todos os arquivos .lan na pasta
for file in "$DIR"*.lan; do
    java -cp library/antlr-4.13.2-complete.jar:library/ST-4.3.4.jar:. lang/LangCompiler -s "$file"
done

echo "Execução Finalizada"
