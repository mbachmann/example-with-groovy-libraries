def call() {
    (readFile('build.gradle') =~ '<version>(.+)-SNAPSHOT</version>')[1][1]
}
