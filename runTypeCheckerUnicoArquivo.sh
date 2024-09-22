echo "----  EXECUTANDO O TYPE-CHECK COM BASE NOS TESTES ----"
java -cp library/antlr-4.13.2-complete.jar:. lang/LangCompiler -tp ./testes/semantica/certo/teste1.lan
echo "----  EXECUCAO CONCLUIDA COM SUCESSO ----"