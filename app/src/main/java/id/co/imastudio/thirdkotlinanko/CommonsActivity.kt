package id.co.imastudio.thirdkotlinanko

import android.Manifest
import android.os.Bundle
import android.util.Log
import io.vrinda.kotlinpermissions.PermissionCallBack
import io.vrinda.kotlinpermissions.PermissionsActivity
import kotlinx.android.synthetic.main.activity_commons.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class CommonsActivity : PermissionsActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commons)

        var a = intent.getIntExtra("dataangka", 0)
        var b = intent.getStringExtra("datastring")

        toast(a.toString())

        debug { b }

        requestPermissions(arrayOf(Manifest.permission.CALL_PHONE, Manifest.permission.SEND_SMS), object : PermissionCallBack {
            override fun permissionGranted() {
                super.permissionGranted()
                Log.v("Call permissions", "Granted")
            }

            override fun permissionDenied() {
                super.permissionDenied()
                Log.v("Call permissions", "Denied")
            }
        })

        btnCall.onClick {
            makeCall("085740482440")

        }

        btnSms.onClick {
            sendSMS("085740482440", "Tes gaes")
        }

        btnWeb.onClick {
            browse("http://idn.id")
        }

        btnShare.onClick {
            share("Download ini ya", "Share")
        }

        btnEmail.onClick {
            email("faizin.arief@gmail.com", "Subject", "Isi pesan")
        }

        btnAlert.onClick {
            alert ("alert with anko", "Title"){
                noButton { toast("no") }
                yesButton { toast("yes") }
                cancelButton { toast("cancel") }
            }.show()
        }
    }
}
