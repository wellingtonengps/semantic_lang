echo "----  LIMPA, CONSTROI E COMPILA TODO O PROJETO(PROCESSO COMPLETO)----"
cd lang
cd parser
echo "----  Limpando o projeto"
rm .antlr\* 
rm .antlr
rm *.interp
rm *.tokens
rm *.class
rm LangLexer.class
rm LangParser.class
rm LangBaseListener.*
rm LangBaseVisitor.*
rm LangParserBaseListener.*
rm LangParserBaseVisitor.*
rm LangListener.*
rm LangParserListener.*
rm LangParserVisitor.*
rm 

echo "----  Gera as classes java do interpretador"
java -jar ../../library/antlr-4.13.2-complete.jar -visitor LangLexer.g4 LangParser.g4
echo "\n\n----  COMPILACAO ------------\n\n"
cd ..
cd ..
echo "----  Compila as classes do AST"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/ast/*.java
echo "----  Compila as classes do PARSER"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/parser/*.java
echo "----  Compila as classes do INTERPRETER"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/interpreter/*.java
echo "----  Compila as classes do SEMANTIC"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/semantic/*.java
echo "----  Compila a classe LangCompiler"
javac -cp library/antlr-4.13.2-complete.jar:. -d . lang/LangCompiler.java
echo "----  PROCESSO DE BUILD CONCLUIDO"