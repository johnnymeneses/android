package johnny.com.monetario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import org.json.JSONObject

import java.net.URL
import javax.net.ssl.HttpsURLConnection
import java.text.DecimalFormat

class ConverterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        supportActionBar!!.hide()

    }


}