package id.co.imastudio.thirdkotlinanko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCommons.onClick {
            startActivity(intentFor<CommonsActivity>("dataangka" to 1, "datastring" to "abcd"))
        }

        btnLayout.onClick {
            startActivity(intentFor<LayoutActivity>())
        }
    }
}
