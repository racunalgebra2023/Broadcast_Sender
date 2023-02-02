package hr.algebra.broadcastsender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        findViewById< Button >( R.id.bSendMessage ).setOnClickListener {
            val intent = Intent( )
            intent.action = "hr.algebra.broadcastreceiver.Broadcast"
            intent.putExtra(
                "hr.algebra.broadcastreceiver.Extra",
                "Just Hello..."
            )
            sendBroadcast( intent )
        }

        findViewById< Button >( R.id.bInvokeNotification ).setOnClickListener {
            val intent = Intent( )
            intent.action = "hr.algebra.Notts"
            sendBroadcast( intent )
        }
    }
}