package johnny.com.geracpf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById<TextView>(R.id.txtfield)

        val buttonGera = findViewById<Button>(R.id.btn_Gera)

        buttonGera.setOnClickListener{
            geraCPF()
        }

    }

    private fun geraCPF()
    {



        result.text =  cpf()
    }
}


private fun randomiza(n: Int): Int {
    return (Math.random() * n).toInt()
}

private fun mod(dividendo: Int, divisor: Int): Int {
    return Math.round(dividendo - Math.floor((dividendo / divisor).toDouble()) * divisor)
        .toInt()
}

fun cpf(): String? {
    var comPontos: Boolean = true
    val n = 9
    val n1 = randomiza(n)
    val n2 = randomiza(n)
    val n3 = randomiza(n)
    val n4 = randomiza(n)
    val n5 = randomiza(n)
    val n6 = randomiza(n)
    val n7 = randomiza(n)
    val n8 = randomiza(n)
    val n9 = randomiza(n)
    var d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10
    d1 = 11 - mod(d1, 11)
    if (d1 >= 10) d1 = 0
    var d2 =
        d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11
    d2 = 11 - mod(d2, 11)
    var retorno: String? = null
    if (d2 >= 10) d2 = 0
    retorno = ""
    retorno =
        if (comPontos) "$n1$n2$n3.$n4$n5$n6.$n7$n8$n9-$d1$d2" else "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2
    return retorno

    println(retorno)

}