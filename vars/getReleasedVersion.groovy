def call() {

    println "Hallo das script chani lässe"
    readFile 'build.gradle'
    //(readFile('build.gradle') =~ '<version>(.+)-SNAPSHOT</version>')[0][1]
}
