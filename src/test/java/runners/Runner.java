package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html"},
        features = "src/test/resources/features",
        glue ="stepdefinitions",
tags = "@WebU",
        dryRun=false
)

public class Runner {
    // runner class inin body sine hicbir kod yazmiyoruz
    // bu class icin onemli olan kullanacagimiz iki adet notasyon
    // dryRun_false yazildiginda yukarida belirlenen tag la etiketlenen tum scenerio lari
    //sirasiyla calistirir
    // dryRun=true dersek ise kodlari calistirmadan eksik stepler olup olmadigini kontrol eder
    // ve varsa  bize eksik stepleri rapor eder

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz
}
