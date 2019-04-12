def call() {
    def pom = sh ( script: 'cat build.gradle', returnStdout: true)
    def list = readGradleBuild file: 'build.gradle'

    assert list instanceof groovy.util.Node
    assert list.technology.name.text() == 'Groovy'

    echo " Halloi ha hallo"
    //println "Step Read POM"
    return pom;

}
