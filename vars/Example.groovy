def readPOM() {
    POM = sh ( script: 'cat build.gradle', returnStdout: true)
    def list = readGradleBuild file: 'build.gradle'

    assert list instanceof groovy.util.Node
    assert list.technology.name.text() == 'Groovy'

    println "Step Read POM"
    return POM;



}
return this