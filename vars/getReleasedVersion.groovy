def call() {

    println "Hallo das script chani lässe"
    //readFile 'build.gradle'


        POM = sh ( script: 'cat build.gradle', returnStdout: true)
        def list = readGradleBuild file: 'build.gradle'

        assert list instanceof groovy.util.Node
        assert list.technology.name.text() == 'Groovy'

        echo " Halloi ha hallo"
        //println "Step Read POM"
        return POM;

    return this




    //(readFile('build.gradle') =~ '<version>(.+)-SNAPSHOT</version>')[0][1]
}
