# Fix Trading Simulator

## Versions

- Java 21
- Maven (multi-module: `core`, `market`, `router`, `broker`, `transaction-db`)
- PostgreSQL 15

## Running

Start the 3 services in 3 separate terminals, in this order (Router first):

**Terminal 1 — Router**
```bash
mvn -pl router -am org.codehaus.mojo:exec-maven-plugin:3.1.0:java \
  -Dexec.mainClass=com.router.Main
```

**Terminal 2 — Market**
```bash
mvn -pl market -am org.codehaus.mojo:exec-maven-plugin:3.1.0:java \
  -Dexec.mainClass=com.market.Main
```

**Terminal 3 — Broker**
```bash
mvn -pl broker -am org.codehaus.mojo:exec-maven-plugin:3.1.0:java \
  -Dexec.mainClass=com.broker.Main
```
