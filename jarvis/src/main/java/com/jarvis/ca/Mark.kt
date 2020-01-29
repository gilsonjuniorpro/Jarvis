package com.jarvis.ca

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class Mark {

    companion object{
        fun showAlertSuccess(activity: Activity, title: String, message: String){
            Alerter.create(activity, R.layout.layout_with_title)
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

        fun showAlertSuccess(context: Context, title: String, message: String){
            Alerter.create(context as Activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertSuccess(activity: Activity, message: String){
            Alerter.create(activity, R.layout.layout_no_title)
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

        fun showAlertSuccess(context: Context, message: String){
            Alerter.create(context as Activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertError(activity: Activity, title: String, message: String){
            Alerter.create(activity, R.layout.layout_with_title)
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

        fun showAlertError(context: Context, title: String, message: String){
            Alerter.create(context as Activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertError(activity: Activity, message: String){
            Alerter.create(activity, R.layout.layout_no_title)
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

        fun showAlertError(context: Context, message: String){
            Alerter.create(context as Activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertWarning(activity: Activity, title: String?, message: String){
            Alerter.create(activity, R.layout.layout_with_title)
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

        fun showAlertWarning(context: Context, title: String?, message: String){
            Alerter.create(context as Activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertWarning(activity: Activity, message: String){
            Alerter.create(activity, R.layout.layout_no_title)
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

        fun showAlertWarning(context: Context, message: String){
            Alerter.create(context as Activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                    tvMessage.text = message
                }
                .show()
        }
    }
}