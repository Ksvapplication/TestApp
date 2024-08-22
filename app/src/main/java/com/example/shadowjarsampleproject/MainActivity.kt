package com.example.shadowjarsampleproject



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shadowjarsampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

    }

/*    private fun setListeners() {
        binding!!.viewUserID.setText(Constant.loginUser)

        binding!!.viewRegister.setOnClickListener {
            registerAccount()
        }
    }

    private fun registerAccount(forceRegister: Boolean = false) {
        FlyCore.registerUser(Constant.loginUser, forceRegister = forceRegister) { isSuccess, throwable, data ->
            if (isSuccess) {
                val isNewUser = data["is_new_user"] as Boolean
                val userJid = data["userJid"] as String
                val responseObject = data.get("data") as JSONObject
                val username = responseObject.getString("username")
                val password = responseObject.getString("password")
                LogMessage.e(
                    "MainActivity",
                    "registerUser Success userJid $userJid \n responseObject $responseObject \n username $username \n password $password"
                )
                LogMessage.e("MainActivity", "registerUser Success  isNewUser $isNewUser")
                updateFCMToken()
                connectToChatServer()
            } else {
                showErrorResponse(data)
                LogMessage.e(
                    "MainActivity",
                    "registerUser Failure Error ${throwable!!.message}"
                )
            }
        }
    }

    private fun updateFCMToken(){
        PushNotificationManager.updateFcmToken(
            "token",
            object : ChatActionListener {
                override fun onResponse(isSuccess: Boolean, message: String) {
                    if (isSuccess)
                        LogMessage.e("MainActivity", "Token updated successfully")
                }
            })
    }

    private fun connectToChatServer() {
        ChatManager.setConnectionListener(object : ChatConnectionListener {
            override fun onConnected() {
                LogMessage.e("MainActivity", "setConnectionListener onConnected")
            }

            override fun onDisconnected() {
                LogMessage.e("MainActivity", "setConnectionListener onDisconnected")
            }

            override fun onConnectionFailed(e: FlyException) {
                LogMessage.e("MainActivity", "setConnectionListener onConnectionFailed")
            }

            override fun onReconnecting() {
                LogMessage.e("MainActivity", "setConnectionListener onReconnecting")
            }
        })

    }

    private fun showErrorResponse(data: HashMap<String, Any>) {
        if (data.getHttpStatusCode() == 403) {
            // admin blocked
            LogMessage.e("MainActivity", "Admin Blocked")
            finish()

        } else if(data.getHttpStatusCode() == 405) {
            // session time out
            LogMessage.e("MainActivity", "Session Timed Out for 1st Login")
            registerAccount(true)
        } else {
            LogMessage.e("MainActivity", "Login Error data.message ${data.getMessage()}")
            // error response toast
        }
    }*/
}