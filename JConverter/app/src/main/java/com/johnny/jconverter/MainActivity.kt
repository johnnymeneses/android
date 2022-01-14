package com.johnny.jconverter



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import org.json.JSONObject
import java.io.BufferedReader
import java.lang.RuntimeException
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView
    val dec = DecimalFormat("#,###.00")
    var service: Int = 99

    fun statusServico(){

        lateinit var status: TextView
        status = findViewById<TextView>(R.id.txtStatus)
        status.text = "Status do Serviço: Online"

        lateinit var dolarhoje: TextView
        dolarhoje = findViewById<TextView>(R.id.txt_dolarhoje)


        Thread()
        {
            val url = URL("https://free.currconv.com/api/v7/convert?q=USD_BRL&compact=ultra&apiKey=f962b34363554556087b")
            val con = url.openConnection() as HttpsURLConnection


            try {
                val data = con.inputStream.bufferedReader().readText()
                val obj = JSONObject(data)

                runOnUiThread() {
                    val res = obj.getDouble("USD_BRL")
                    status.text = "Status do Serviço: Online"

                    dolarhoje.text = "US$1 vale hoje R$ ${dec.format(res)}"
                    dolarhoje.visibility = View.VISIBLE
                    service = 1


                }
            } catch (t: InternalError) {
                status.text = "Status do Serviço: Offline"
                service = 0



            }
            finally {
                con.disconnect()
            }

        }.start()



    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Verifica Status do Serviço e Cotação atual

        statusServico()


        result = findViewById<TextView>(R.id.txt_result)



        val buttonConverter = findViewById<Button>(R.id.btn_converter)

        buttonConverter.setOnClickListener{
            converterValor()
        }

    }

    /*
    * Here's your free API key: f962b34363554556087b
    * https://free.currconv.com/api/v7/convert?q=USD_BRL&compact=ultra&apiKey=f962b34363554556087b
    * */



    private fun converterValor()
    {

        val selectedCurrency = findViewById<RadioGroup>(R.id.radiogroup)
        val checked = selectedCurrency.checkedRadioButtonId


        val currency = when(checked) {
            R.id.radio_USD->    "USD"
            R.id.radio_EUR->    "EUR"
            else->              "NZD"

        }

        val editField = findViewById<EditText>(R.id.edit_field)
        val value = editField.text.toString()

        if(value.isEmpty())
        {
            return
        }
        //Executar em paralelo
        Thread()
        {
            val url =
                URL("https://free.currconv.com/api/v7/convert?q=${currency}_BRL&compact=ultra&apiKey=f962b34363554556087b")
            val con = url.openConnection() as HttpsURLConnection

            try {

                val data = con.inputStream.bufferedReader().readText()

                val obj = JSONObject(data)




                runOnUiThread()
                {
                    val res = obj.getDouble("${currency}_BRL")
                    result.text = " R$ ${dec.format(value.toDouble() * res)}"
                    result.visibility = View.VISIBLE

                }


            } catch (t: InternalError) {
                println("Erro: $t")

            } finally {
                con.disconnect()
            }


        }.start()





    }

}
