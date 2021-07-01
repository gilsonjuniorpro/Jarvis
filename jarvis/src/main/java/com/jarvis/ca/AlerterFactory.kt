package com.jarvis.ca

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.annotation.*
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import java.lang.ref.WeakReference


class AlerterFactory private constructor() {

    private var alert: JarvisAlert? = null

    private val activityDecorView: ViewGroup?
        get() {
            var decorView: ViewGroup? = null

            activityWeakReference?.get()?.let {
                decorView = it.window.decorView as ViewGroup
            }

            return decorView
        }

    fun show(): JarvisAlert? {
        activityWeakReference?.get()?.let {
            it.runOnUiThread {
                activityDecorView?.addView(alert)
            }
        }

        return alert
    }

    fun setTitle(@StringRes titleId: Int): AlerterFactory {
        alert?.setTitle(titleId)

        return this
    }

    fun setTitle(title: CharSequence): AlerterFactory {
        alert?.setTitle(title)

        return this
    }

    fun setTitleTypeface(typeface: Typeface): AlerterFactory {
        alert?.setTitleTypeface(typeface)

        return this
    }

    fun setTitleAppearance(@StyleRes textAppearance: Int): AlerterFactory {
        alert?.setTitleAppearance(textAppearance)

        return this
    }

    fun setContentGravity(gravity: Int): AlerterFactory {
        alert?.contentGravity = gravity

        return this
    }

    fun setText(@StringRes textId: Int): AlerterFactory {
        alert?.setText(textId)

        return this
    }

    fun setText(text: CharSequence): AlerterFactory {
        alert?.setText(text)

        return this
    }

    fun setTextTypeface(typeface: Typeface): AlerterFactory {
        alert?.setTextTypeface(typeface)

        return this
    }

    fun setTextAppearance(@StyleRes textAppearance: Int): AlerterFactory {
        alert?.setTextAppearance(textAppearance)

        return this
    }

    fun setBackgroundColorInt(@ColorInt colorInt: Int): AlerterFactory {
        alert?.setAlertBackgroundColor(colorInt)

        return this
    }

    fun setBackgroundColorRes(@ColorRes colorResId: Int): AlerterFactory {
        activityWeakReference?.get()?.let {
            alert?.setAlertBackgroundColor(ContextCompat.getColor(it, colorResId))
        }

        return this
    }

    fun setBackgroundDrawable(drawable: Drawable): AlerterFactory {
        alert?.setAlertBackgroundDrawable(drawable)

        return this
    }

    fun setBackgroundResource(@DrawableRes drawableResId: Int): AlerterFactory {
        alert?.setAlertBackgroundResource(drawableResId)

        return this
    }

    fun setIcon(@DrawableRes iconId: Int): AlerterFactory {
        alert?.setIcon(iconId)

        return this
    }

    fun setIcon(bitmap: Bitmap): AlerterFactory {
        alert?.setIcon(bitmap)

        return this
    }

    fun setIcon(drawable: Drawable): AlerterFactory {
        alert?.setIcon(drawable)

        return this
    }

    fun setIconSize(@DimenRes size: Int): AlerterFactory {
        alert?.setIconSize(size)

        return this
    }

    fun setIconPixelSize(@Px size: Int): AlerterFactory {
        alert?.setIconPixelSize(size)

        return this
    }

    fun setIconColorFilter(@ColorInt color: Int): AlerterFactory {
        alert?.setIconColorFilter(color)

        return this
    }

    fun setIconColorFilter(colorFilter: ColorFilter): AlerterFactory {
        alert?.setIconColorFilter(colorFilter)

        return this
    }

    fun setIconColorFilter(@ColorInt color: Int, mode: PorterDuff.Mode): AlerterFactory {
        alert?.setIconColorFilter(color, mode)

        return this
    }

    fun hideIcon(): AlerterFactory {
        alert?.showIcon(false)

        return this
    }

    fun setOnClickListener(onClickListener: View.OnClickListener): AlerterFactory {
        alert?.setOnClickListener(onClickListener)

        return this
    }

    fun setDuration(milliseconds: Long): AlerterFactory {
        alert?.duration = milliseconds

        return this
    }

    fun enableIconPulse(pulse: Boolean): AlerterFactory {
        alert?.pulseIcon(pulse)

        return this
    }

    fun showIcon(showIcon: Boolean): AlerterFactory {
        alert?.showIcon(showIcon)

        return this
    }

    fun enableInfiniteDuration(infiniteDuration: Boolean): AlerterFactory {
        alert?.setEnableInfiniteDuration(infiniteDuration)

        return this
    }

    fun setOnShowListener(listener: OnShowJarvisAlertListener): AlerterFactory {
        alert?.setOnShowListener(listener)

        return this
    }

    fun setOnHideListener(listener: OnHideJarvisAlertListener): AlerterFactory {
        alert?.onHideListener = listener

        return this
    }

    fun enableSwipeToDismiss(): AlerterFactory {
        alert?.enableSwipeToDismiss()

        return this
    }

    fun enableVibration(enable: Boolean): AlerterFactory {
        alert?.setVibrationEnabled(enable)

        return this
    }

    fun enableSound(enable: Boolean): AlerterFactory {
        alert?.setSoundEnabled(enable)

        return this
    }

    fun disableOutsideTouch(): AlerterFactory {
        alert?.disableOutsideTouch()

        return this
    }

    fun enableProgress(enable: Boolean): AlerterFactory {
        alert?.setEnableProgress(enable)

        return this
    }

    fun setProgressColorRes(@ColorRes color: Int): AlerterFactory {
        alert?.setProgressColorRes(color)

        return this
    }

    fun setProgressColorInt(@ColorInt color: Int): AlerterFactory {
        alert?.setProgressColorInt(color)

        return this
    }

    fun setDismissable(dismissable: Boolean): AlerterFactory {
        alert?.setDismissible(dismissable)

        return this
    }

    fun setEnterAnimation(@AnimRes animation: Int): AlerterFactory {
        alert?.enterAnimation = AnimationUtils.loadAnimation(alert?.context, animation)

        return this
    }

    fun setExitAnimation(@AnimRes animation: Int): AlerterFactory {
        alert?.exitAnimation = AnimationUtils.loadAnimation(alert?.context, animation)

        return this
    }

    fun addButton(
        text: CharSequence, @StyleRes style: Int = R.style.AlertButton,
        onClick: View.OnClickListener
    ): AlerterFactory {
        alert?.addButton(text, style, onClick)

        return this
    }

    fun setButtonTypeface(typeface: Typeface): AlerterFactory {
        alert?.buttonTypeFace = typeface

        return this
    }

    fun getLayoutContainer(): View? {
        return alert?.layoutContainer
    }

    private fun setActivity(activity: Activity) {
        activityWeakReference = WeakReference(activity)
    }

    companion object {

        private var activityWeakReference: WeakReference<Activity>? = null

        @JvmStatic
        fun create(activity: Activity?): AlerterFactory {
            return create(activity, R.layout.alerter_alert_default_layout)
        }

        @JvmStatic
        fun create(activity: Activity?, @LayoutRes layoutId: Int): AlerterFactory {
            if (activity == null) {
                throw IllegalArgumentException("Activity cannot be null!")
            }

            val alerter = AlerterFactory()

            //Hide current JarvisAlert, if one is active
            clearCurrent(activity)

            alerter.setActivity(activity)
            alerter.alert = JarvisAlert(activity, layoutId)

            return alerter
        }

        @JvmStatic
        fun clearCurrent(activity: Activity?) {
            (activity?.window?.decorView as? ViewGroup)?.let {
                //Find all JarvisAlert Views in Parent layout
                for (i in 0..it.childCount) {
                    val childView = if (it.getChildAt(i) is JarvisAlert) it.getChildAt(i) as JarvisAlert else null
                    if (childView != null && childView.windowToken != null) {
                        ViewCompat.animate(childView).alpha(0f).withEndAction(getRemoveViewRunnable(childView))
                    }
                }
            }
        }

        @JvmStatic
        fun hide() {
            activityWeakReference?.get()?.let {
                clearCurrent(it)
            }
        }

        @JvmStatic
        val isShowing: Boolean
            get() {
                var isShowing = false

                activityWeakReference?.get()?.let {
                    isShowing = it.findViewById<View>(R.id.llAlertBackground) != null
                }

                return isShowing
            }

        private fun getRemoveViewRunnable(childView: JarvisAlert?): Runnable {
            return Runnable {
                childView?.let {
                    (childView.parent as? ViewGroup)?.removeView(childView)
                }
            }
        }
    }
}