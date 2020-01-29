package com.jarvis.ca

import android.app.Activity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class Mark {

    companion object{
        fun showAlertSuccess(activity: Activity, title: String, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertSuccess(activity: Activity, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertError(activity: Activity, title: String, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_error))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertError(activity: Activity, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_error))
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertWarning(activity: Activity, title: String?, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_info))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertWarning(activity: Activity, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_info))
                    tvMessage.text = message
                }
                .show()
        }
    }
}