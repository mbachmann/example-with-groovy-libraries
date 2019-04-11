def call() {
    (readFile('build.gradle') =~ '<version>(.+)-SNAPSHOT</version>')[0][1]
}
