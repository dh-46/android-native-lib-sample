package tw.dh46.app.nativelibtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import tw.dh46.nativelib.KeyHelper
import tw.dh46.nativelib.NativeLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_hello_world).text = NativeLib().stringFromJNI()

        findViewById<TextView>(R.id.tv_key).text = NativeLib().getDecodedSecretKey()
        // 靜態方法呼叫
        findViewById<TextView>(R.id.tv_key_2).text = KeyHelper.secretKey
    }
}