You can use Maven with Docker by setting up this alias in your shell.

```bash
alias mvn='docker run -it --rm -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.9.11 mvn'
```

Read more about Maven here

https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
