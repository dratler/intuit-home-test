installation manual
===========================
1.Install docker
2 Install Kafka (With Zookeeper):
    run the following command
    '
    bin/zookeeper-server-start.sh config/zookeeper.properties
    bin/kafka-server-start.sh config/server.properties
         ~/development/kafka/bin/kafka-console-consumer.sh --zookeeper localhost:9092 --topic payment-topic --from-beginning
    '
3.Create topic 'payment-topic'
4.Install Mysql via docker :
    run the following command
    `
    sudo docker run --name=payment  -e MYSQL_ROOT_PASSWORD='one' -e MYSQL_USER='one' -e MYSQL_PASSWORD='one' -e MYSQL_DATABASE='paymentdb'  -p 3306:3306 -p 33060:33060 -d mysql/mysql-server
    `
5.Run Sql Scrip: db_init.sql
6.