package kg.unicapp.myreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MessageReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val msg = intent.getStringExtra("messageId")
        Toast.makeText(context, "Сообщение: $msg", Toast.LENGTH_LONG).show()


    }
}