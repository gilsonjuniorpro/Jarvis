package com.jarvis.ca

import android.app.Activity
import android.text.TextUtils
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.lang.Exception

class Mark {

    companion object{

        @JvmStatic
        fun showAlert(activity: Activity, title: String? = null, message: String? = null,
                      color: Int? = null, time: Long? = 3000L, icon: Int? = null){
            var mainLayout = if(TextUtils.isEmpty(title)){
                R.layout.layout_no_title
            }else{
                R.layout.layout_with_title
            }
            AlerterFactory.create(activity, mainLayout)
                .setBackgroundColorRes(color!!)
                .enableSwipeToDismiss()
                .setDuration(time!!)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView
                    if(!TextUtils.isEmpty(title)) {
                        val tvTitle: TextView = layout!!.findViewById<View>(R.id.tvTitle) as TextView
                        tvTitle.text = title
                    }
                    try {
                        ivIcon.setImageResource(icon!!)
                    }catch (e: Exception){
                        ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    }

                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlert(activity: Activity, title: String? = null, message: String? = null,
                      color: Int? = null, time: Long? = 3000L){
            var mainLayout = if(TextUtils.isEmpty(title)){
                R.layout.layout_no_title
            }else{
                R.layout.layout_with_title
            }
            AlerterFactory.create(activity, mainLayout)
                .setBackgroundColorRes(color!!)
                .enableSwipeToDismiss()
                .setDuration(time!!)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView
                    if(!TextUtils.isEmpty(title)) {
                        val tvTitle: TextView = layout!!.findViewById<View>(R.id.tvTitle) as TextView
                        tvTitle.text = title
                    }
                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertSuccess(activity: Activity, title: String, message: String){
            AlerterFactory.create(activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvTitle: TextView = layout!!.findViewById<View>(R.id.tvTitle) as TextView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertSuccess(activity: Activity, message: String){
            AlerterFactory.create(activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_success))
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertError(activity: Activity, title: String, message: String){
            AlerterFactory.create(activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvTitle: TextView = layout!!.findViewById<View>(R.id.tvTitle) as TextView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_error))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertError(activity: Activity, message: String){
            AlerterFactory.create(activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_error))
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertWarning(activity: Activity, title: String, message: String){
            AlerterFactory.create(activity, R.layout.layout_with_title)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvTitle: TextView = layout!!.findViewById<View>(R.id.tvTitle) as TextView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_info))
                    tvTitle.text = title
                    tvMessage.text = message
                }
                .show()
        }

        @JvmStatic
        fun showAlertWarning(activity: Activity, message: String){
            AlerterFactory.create(activity, R.layout.layout_no_title)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    val ivIcon: ImageView = layout!!.findViewById<View>(R.id.ivIcon) as ImageView
                    val tvMessage: TextView = layout!!.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_info))
                    tvMessage.text = message
                }
                .show()
        }
    }
}