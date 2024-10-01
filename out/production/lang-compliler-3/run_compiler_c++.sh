#!/bin/bash

# Caminho para a pasta onde estão os arquivos .cpp gerados
DIR="./lang/codeGen/fileGen/"

# Caminho para a pasta onde o output dos binários será salvo
OUTPUT_DIR="./lang/codeGen/fileGen/"

# Cria a pasta de output se não existir
mkdir -p "$OUTPUT_DIR"

# Loop através de todos os arquivos .cpp na pasta
for file in "$DIR"*.cpp; do
    # Pega o nome do arquivo sem a extensão
    filename=$(basename -- "$file")
    output_name="${filename%.*}"

    # Compila o arquivo .cpp
    g++ -o "$OUTPUT_DIR$output_name" "$file"

    # Verifica se a compilação foi bem-sucedida
    if [ $? -eq 0 ]; then
        echo "Compilado com sucesso: $file -> $OUTPUT_DIR$output_name"
    else
        echo "Erro na compilação: $file"
    fi
done

echo "Compilação Finalizada"
