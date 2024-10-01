#!/bin/bash

# Caminho para a pasta onde estão os arquivos .java
DIR="./lang/codeGen/fileGen/"

# Cria o diretório de output caso não exista (não é estritamente necessário para Java)
OUTPUT_DIR="./lang/codeGen/fileGen/"
mkdir -p "$OUTPUT_DIR"

# Loop através de todos os arquivos .java na pasta
for file in "$DIR"*.java; do
    # Pega o nome do arquivo sem a extensão
    filename=$(basename -- "$file")
    classname="${filename%.*}"

    # Compila o arquivo .java
    javac -d "$OUTPUT_DIR" "$file"

    # Verifica se a compilação foi bem-sucedida
    if [ $? -eq 0 ]; then
        echo "Compilado com sucesso: $file"

        # Executa o arquivo compilado
        java -cp "$OUTPUT_DIR" "$classname"

        # Verifica se a execução foi bem-sucedida
        if [ $? -eq 0 ]; then
            echo "Executado com sucesso: $classname"
        else
            echo "Erro na execução: $classname"
        fi
    else
        echo "Erro na compilação: $file"
    fi
done

echo "Processo Finalizado"
