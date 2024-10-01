/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package lang;

import lang.codeGen.CPlusPlusVisitor;
import lang.codeGen.JavaVisitor;
import lang.parser.*;
import lang.ast.*;
import lang.interpreter.*;
import lang.semantic.*;

import java.io.FileWriter;
import java.io.IOException;

public class LangCompiler {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Lang compiler v 0.0.1 - Agosto de 2021");
            System.out.println("Use java -cp . Lang ação <Caminho para código Fonte> ");
            System.out.println("Ação (uma das seguintes possibilidades): ");

            System.out.println(" -bs : Executa uma bateria de testes sintáticos");
            System.out.println(" -bsm : Executa uma bateria de testes no interpretador");
            System.out.println(" -byt : Executa uma bateria de testes no sistemas de tipos na analise semantica");

            System.out.println(" -pp: Pretty print program.");
            System.out.println(" -tp: Verificar tipos e imprimir o ambiente de tipos");
            System.out.println(" -i : Apenas interpretar");

            System.out.println(" -ti: Verificar tipos e depois interpretar");
            System.out.println(" -dti: Verificar tipos, imprimir o ambiente de tipos e depois interpretar");
            System.out.println(
                    " -gvz: Create a dot file. (Feed it to graphviz dot tool to generate graphical representation of the AST)");
            System.out.println(" -s: Gerar código de alto nível");
            System.out.println(" -j: Gerar código para JVM (Via Jasmin");
        }
        try {
            if(args.length < 1){
                System.out.println("Não foi passado parametros");
                return;
            }
            LangParserImpl parserImplementation = new LangParserImpl();
            LangInterpreterImpl interpreterImplementation = new LangInterpreterImpl();
            LangSemanticImpl semanticImplementation = new LangSemanticImpl();

            if (args[0].equals("-bs")) {
                System.out.println("Executando bateria de testes sintáticos:");
                TestParser tp = new TestParser(parserImplementation);
                return;
            }
            if (args[0].equals("-bsm")) {
                System.out.println("\nExecuta uma bateria de testes no interpretador:\n");
                TestInterpreter tp = new TestInterpreter(interpreterImplementation);
                System.out.println("\nFim da execucao.\n");
                return;
            }
            if (args[0].equals("-byt")) {
                System.out.println("Executando bateria de testes de tipos na analise semantica:\n");
                TestSemantic tp = new TestSemantic(semanticImplementation);
                System.out.println("\nFim da execucao.\n");
                return;
            }

            if (args.length != 2) {
                System.out.println("Para usar essa opção, especifique um nome de arquivo");
                return;
            }
            SuperNode result = parserImplementation.parseFile(args[1]);
            if (result == null) {
                System.err.println("Error na sintaxe");
                System.exit(1);
            } else if (args[0].equals("-i")) {
                InterpreterVisitor interpreter = new InterpreterVisitor();
                ((Node)result).accept(interpreter);
            } else if (args[0].equals("-ii")) {
                // iv = new InteractiveInterpreterVisitor();
                // result.accept(iv);
            } else if (args[0].equals("-tp")) {
                TypeCheckVisitor typeCheck = new TypeCheckVisitor();
                ((Node)result).accept(typeCheck);
                if(typeCheck.getNumErrors() > 0){
                    typeCheck.printErrors();
                 }else{
                    System.out.println("Checagem de tipo realizada");
                 }
            } 
            else if (args[0].equals("-ti")) {
                TypeCheckVisitor typeCheck = new TypeCheckVisitor();
                ((Node)result).accept(typeCheck);               
                
                if(typeCheck.getNumErrors() > 0){
                    typeCheck.printErrors();
                 }else{
                    InterpreterVisitor interpreter = new InterpreterVisitor();
                    ((Node)result).accept(interpreter);
                 }
            }
            else if(args[0].equals("-s")){
                TypeCheckVisitor typeCheck = new TypeCheckVisitor();
                ((Node)result).accept(typeCheck);

                //Verifica se tem se encontra error no Parser
                if(typeCheck.getNumErrors() != 0){
                    System.out.println("Error na analise semantica.\n");
                    typeCheck.printErrors();
                    System.exit(1);
                }

                Env<LocalAmbiente<SType>> env = typeCheck.getEnv();
                String fileName = getFileName(args[1]);

                CPlusPlusVisitor cPlusPlusVisitor;

                cPlusPlusVisitor = new CPlusPlusVisitor(fileName, env, typeCheck.getDatas());
                ((Node)result).accept(cPlusPlusVisitor);

                //mostrar na tela o código gerado
                //System.out.println(cPlusPlusVisitor.getTemplate());

                String filePath = "lang/codeGen/fileGen/" + fileName + ".cpp";
                System.out.println("Arquivo gerado salvo: " + filePath);
                writeFile(filePath, cPlusPlusVisitor.getTemplate());
            }
            else if(args[0].equals("-j")) {
                TypeCheckVisitor typeCheck = new TypeCheckVisitor();
                ((Node)result).accept(typeCheck);

                if(typeCheck.getNumErrors() != 0) {
                    System.out.println("Error na analise semantica.\n");
                    typeCheck.printErrors();
                    System.exit(1);
                }

                Env<LocalAmbiente<SType>> env = typeCheck.getEnv();
                String fileName = getFileName(args[1]);
                JavaVisitor javaVisitor;

                javaVisitor = new JavaVisitor(fileName, env, typeCheck.getDatas());
                ((Node)result).accept(javaVisitor);

                String filePath = "lang/codeGen/fileGen/" + fileName + ".java";
                System.out.println("Arquivo gerado salvo: " + filePath);
                writeFile(filePath, javaVisitor.getTemplate());
            }
            else if (args[0].equals("-pp")) {
                // iv = new PPrint();
                // result.accept(iv);
                // ((PPrint)iv).print();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFileName(String path){
        String fileName = path.substring(path.lastIndexOf('/') != -1 ? path.lastIndexOf('/') + 1 : 0,
                path.lastIndexOf('.') != -1 ? path.lastIndexOf('.') : path.length());
        return fileName;
    }


    public static void writeFile(String pathFile, String information){
        try {
            FileWriter myWriter = new FileWriter(pathFile);
            myWriter.write(information);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro no metodo \'writeFile()\'");
            e.printStackTrace();
        }
    }
}

