# memo-app-java
* docker-compose 起動シェル
    ~~~shell
    $ docker-compose up -d
    ~~~
* dockerサーバにおいてjavaシェルへログイン
    ~~~shell
    $ docker-compose exec java bash
    ~~~
* gradle（Javaプロジェクト）のビルド
    ~~~shell
    $ sh gradlew build
    ~~~
* Spring bootアプリの起動
    ~~~shell
    $ java -jar build/libs/p_history-0.0.1-SNAPSHOT.jar
    ~~~
    アクセスURL
    > http://localhost:8080/hello