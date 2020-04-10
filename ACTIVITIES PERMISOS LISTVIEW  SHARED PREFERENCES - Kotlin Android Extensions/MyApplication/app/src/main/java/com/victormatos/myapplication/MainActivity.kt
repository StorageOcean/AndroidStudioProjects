package com.victormatos.myapplication

import android.arch.lifecycle.Lifecycle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import com.victormatos.myapplication.activities.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLifeCycle = findViewById<Button>(R.id.button_to_cycle)
        var btnClickEvents = findViewById<Button>(R.id.button_to_click)
        var btnAndroidExt = findViewById<Button>(R.id.button_to_android_extension)
        var btnPicasso = findViewById<Button>(R.id.button_to_picasso)
        var btnListView = findViewById<Button>(R.id.button_to_list_view)
        var btnIntents = findViewById<Button>(R.id.button_to_intents)
        var btnPermissions = findViewById<Button>(R.id.button_to_permissions)
        var btnSharedPreferences = findViewById<Button>(R.id.button_to_shared_preferences)
        var btnExtensionFunctions = findViewById<Button>(R.id.button_to_extension_functions)

        btnLifeCycle.setOnClickListener{ goToLifeCycleActivity() }
        btnClickEvents.setOnClickListener{ goToClickEventsActivity() }
        btnAndroidExt.setOnClickListener{ goToKotlinAndroidExtensionsActivity() }
        btnPicasso.setOnClickListener{ goToPicassoActivity() }
        btnListView.setOnClickListener{ goToListViewActivity() }
        btnIntents.setOnClickListener{ goToIntentsActivity() }
        btnPermissions.setOnClickListener{ goToPermissionsActivity() }
        btnSharedPreferences.setOnClickListener{ goToSharedPreferencesActivity() }
        btnExtensionFunctions.setOnClickListener{ goToExtensionFunctionsActivity() }


        fun showToast() {
            Toast.makeText(this,"Hello from the Toast!", Toast.LENGTH_LONG).show()
        }

        fun showSnackbar() {
            var layout = findViewById<ConstraintLayout>(R.id.myLayout)
            Snackbar.make(layout,"Hello from the Snackbar!",Snackbar.LENGTH_LONG).show()

            Snackbar.make(layout,"Hello from the Snackbar 2!",Snackbar.LENGTH_LONG).setAction("UNDO"){
                Snackbar.make(layout,"Email has been restored2!",Snackbar.LENGTH_LONG).show()
            }.show()
        }



    }


    private fun goToLifeCycleActivity() = startActivity(Intent(this,LifeCycleActivity::class.java))
    private fun goToClickEventsActivity() = startActivity(Intent(this,ClickEventsActivity::class.java))
    private fun goToKotlinAndroidExtensionsActivity() = startActivity(Intent(this,KotlinAndroidExtensionsActivity::class.java))
    private fun goToPicassoActivity() = startActivity(Intent(this,PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this,ListViewActivity::class.java))
    private fun goToIntentsActivity() = startActivity(Intent(this,IntentsActivity::class.java))
    private fun goToPermissionsActivity() = startActivity(Intent(this,PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity() = startActivity(Intent(this,SharedPreferencesActivity::class.java))
    private fun goToExtensionFunctionsActivity() = startActivity(Intent(this,ExtensionFunctionsActivity::class.java))

}
