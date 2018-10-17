package com.example.shikhark.empoweru

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.shikhark.empoweru.Fragments.CoursesFragment
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlinx.android.synthetic.main.activity_login_alt.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import org.json.JSONObject
import java.util.*

class LoginActivity : AppCompatActivity() {

    var callbackManager:CallbackManager = CallbackManager.Factory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_alt)


        loginButton.setOnClickListener {
            toast("Login Clicked")
            Login()
        }


        loginButtonFacebook.setOnClickListener(View.OnClickListener {

            callbackManager = CallbackManager.Factory.create()
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile", "email"))
            LoginManager.getInstance().registerCallback(callbackManager,
                    object : FacebookCallback<LoginResult> {
                        override fun onSuccess(loginResult: LoginResult) {
                            Log.d("MainActivity", "Facebook Logged In")
                            startActivity(Intent(applicationContext, MainActivity::class.java))
                        }

                        override fun onCancel() {
                            Log.d("MainActivity", "Facebook Cancelled")

                        }

                        override fun onError(error: FacebookException) {
                            Log.d("MainActivity", "Facebook Error")

                        }
                    })
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        callbackManager?.onActivityResult(requestCode, resultCode, data)
        toast("First Näme : ${Profile.getCurrentProfile().firstName} Last Name: ${Profile.getCurrentProfile().lastName}")

    }

    fun Login()
    {
        var username = editTextUID.getText().toString();
        var password = editTextPassword.getText().toString();


        doAsync {
            //Execute all the lon running tasks here
            uiThread {
                loginButton.visibility = View.INVISIBLE;
                progressBar.visibility = View.VISIBLE;
            }

            if(username.toLowerCase().equals("shiven"))
            {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                Log.v("MyActivity", "switch to new Activity");

            }
            else
                loginButton.setVisibility(View.VISIBLE);
        }


    }
}



