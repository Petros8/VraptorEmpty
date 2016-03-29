# VraptorEmpty

Projeto exemplificando várias coisas sobre o Vraptor 4 e Hibernate 5.

Criado com a ajuda do http://setupmyproject.com

#Requerimentos

Maven 3.3+ instalado e rodando no prompt de comando/terminal

Eclipse IDE para Java EE ou Equivalente

Jetty 8+ ou Tomcat 8 para rodar a aplicação

#Instalação

1 - Criar uma pasta no workspace do Eclipse com o nome do projeto que você deseja.

2 - Colocar os arquivos nessa pasta(O pom.xml tem que estar nesta pasta).

3 - No Eclipse você aperta botão direito na aba de projetos e escolhe Import -> Existing Maven Project.

4 - Espere o Eclipse Carregar o projeto e depois feche ele.

5 - Abra o Prompt de Comando/Terminal na pasta do projeto e digite os seguintes comandos na ordem: "mvn clean",
    "mvn dependency:resolve","mvn eclipse:eclipse".(O Ultimo comando pode mudar dependendo da IDE)

6 - Abra o Eclipse novamente , espere o projeto carregar , depois selecione ele e pressione Alt+F5, marque a opção 
    "Force Update of Snapshots/Releases" e espere o processo terminar.

7 - Pronto você ja pode rodar o projeto no Tomcat/Jetty.
