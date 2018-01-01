package id.co.imastudio.thirdkotlinanko

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LayoutActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MyActivityUI().setContentView(this)

    }

    class MyActivityUI : AnkoComponent<LayoutActivity> {
        override fun createView(ui: AnkoContext<LayoutActivity>) = ui.apply {
            verticalLayout {
                val name = editText()
                button("Say Hello") {
                    onClick { ctx.toast("Hello, ${name.text}!") }
                }
            }
        }.view
    }
}
