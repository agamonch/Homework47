package kg.unicapp.myreceiver



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    private var myAction = "myAction"
    private var myMessage = "This is my Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sendMessage(view: View) {
        val intent = Intent()
        intent.action= myAction
        intent.putExtra("messageId", myMessage)
        sendBroadcast(intent)
    }
}