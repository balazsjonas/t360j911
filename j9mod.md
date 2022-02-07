```shell
java -cp .;j9\target\classes t360.j9.SafeVarArgsMain

java -cp .;j9frontend\target\classes;j9backend\target\classes org.example.frontend.FrontMain

java -p j9backend\target\classes;j9frontend\target\classes -m bookmarks.j9frontend/org.example.frontend.FrontMain

jdeps --module-path j9backend\target\j9backend-1.0-SNAPSHOT.jar;j9frontend\target\j9frontend-1.0-SNAPSHOT.jar -m bo
okmarks.j9frontend

jlink --module-path j9backend\target\j9backend-1.0-SNAPSHOT.jar;j9frontend\target\j9frontend-1.0-SNAPSHOT.jar;%JAVA
_HOME%\jmods --add-modules bookmarks.j9frontend --launcher customjrelauncher=bookmarks.j9frontend/org.example.frontend.FrontMain --output app


```