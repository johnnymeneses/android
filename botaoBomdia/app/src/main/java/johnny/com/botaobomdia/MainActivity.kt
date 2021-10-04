package johnny.com.botaobomdia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText as EditText

class MainActivity : AppCompatActivity() {

    //Campo de Título
    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        result = findViewById<TextView>(R.id.txt_campo)

        //Botão
        val botao = findViewById<Button>(R.id.btn_botao)

        // Campo de texto
        val campoTexto = findViewById<EditText>(R.id.txt_edit)
//        O problema está aqui. Não estou conseguindo tirar o campo daqui
        var value = campoTexto.text.toString()



        value= "JOhnny"

        botao.setOnClickListener()
        {

            try{
                result.text = " R$ $value"
//                result.visibility = View.VISIBLE

            }catch (t: InternalError)
            {
                println("Error $t")
            }



        }
    }


    private fun bomDia(){

       try{
           result.text = "oi"
//           println(value)

       }catch (t: InternalError)
       {
           println("Error $t")
       }

    }


}








    //label
//





    //variavel que recebe o campo de texto


//    variavel que recebe o label
//    val value = editField.text.toString()


//    lateinit var result: TextView
//
//    //Pegando o valor digitado em um campo de texto
//




//        result.text = "Programa em andamento"


//        buttonConverter.setOnClickListener{
//                bomdia()
//        }



/*


    fun bomdia(){
//        result.text = "Bom dia!"

    }
* */