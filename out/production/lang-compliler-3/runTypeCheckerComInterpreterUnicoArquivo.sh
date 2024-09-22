echo "----  EXECUTANDO O TYPE-CHECK COM BASE NOS TESTES ----"
java -cp library/antlr-4.13.2-complete.jar:. lang/LangCompiler -ti ./testes/semantica/errado/main_missing.lan
echo "----  EXECUCAO CONCLUIDA COM SUCESSO ----"