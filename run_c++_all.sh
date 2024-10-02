#!/bin/bash

# Caminho para a pasta onde os binários estão localizados
OUTPUT_DIR="./lang/codeGen/fileGen/"

# Loop através de todos os arquivos no diretório de saída
for binary in "$OUTPUT_DIR"*; do
    # Verifica se o arquivo é um binário executável e não um arquivo .cpp ou outro tipo
    if [[ -x "$binary" && ! -d "$binary" && "${binary##*.}" != "cpp" ]]; then
        echo "Executando: $binary"

        # Executa o binário
        "$binary"

        echo ""

        # Verifica se a execução foi bem-sucedida
        if [ $? -eq 0 ]; then
            echo "Executado com sucesso: $binary"
        else
            echo "Erro durante a execução: $binary"
        fi
    fi
done

echo "Execução dos binários finalizada"
