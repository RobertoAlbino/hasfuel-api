git add --all
git commit -m "Deploy Controle Java Backend Heroku"
gradlew build
heroku war:deploy --app controle-java-backend C:\Projetos\Controle-java-backend\build\libs\controle-0.0.1-SNAPSHOT.war
pause

