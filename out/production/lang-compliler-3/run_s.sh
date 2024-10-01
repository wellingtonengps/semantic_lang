echo "Verificar tipos e imprimir o ambiente de tipos"
java -cp library/antlr-4.13.2-complete.jar:library/ST-4.3.4.jar:. lang/LangCompiler -s ./testes/semantica/certo/teste0.lan
echo "Execução Finalizada"