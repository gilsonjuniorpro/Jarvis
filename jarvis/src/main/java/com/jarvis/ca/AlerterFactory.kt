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

    /**
     * Sets the JarvisAlert
     *
     * @param alert The JarvisAlert to be references and maintained
     */
    private var alert: JarvisAlert? = null

    /**
     * Get the enclosing Decor View
     *
     * @return The Decor View of the Activity the Alerter was called from
     */
    private val activityDecorView: ViewGroup?
        get() {
            var decorView: ViewGroup? = null

            activityWeakReference?.get()?.let {
                decorView = it.window.decorView as ViewGroup
            }

            return decorView
        }

    /**
     * Shows the JarvisAlert, after it's built
     *
     * @return An JarvisAlert object check can be altered or hidden
     */
    fun show(): JarvisAlert? {
        //This will get the Activity Window's DecorView
        activityWeakReference?.get()?.let {
            it.runOnUiThread {
                //Add the new JarvisAlert to the View Hierarchy
                activityDecorView?.addView(alert)
            }
        }

        return alert
    }

    /**
     * Sets the title of the JarvisAlert
     *
     * @param titleId Title String Resource
     * @return This Alerter
     */
    fun setTitle(@StringRes titleId: Int): AlerterFactory {
        alert?.setTitle(titleId)

        return this
    }

    /**
     * Set Title of the JarvisAlert
     *
     * @param title Title as a CharSequence
     * @return This Alerter
     */
    fun setTitle(title: CharSequence): AlerterFactory {
        alert?.setTitle(title)

        return this
    }

    /**
     * Set the Title's Typeface
     *
     * @param typeface Typeface to use
     * @return This Alerter
     */
    fun setTitleTypeface(typeface: Typeface): AlerterFactory {
        alert?.setTitleTypeface(typeface)

        return this
    }

    /**
     * Set the Title's text appearance
     *
     * @param textAppearance The style resource id
     * @return This Alerter
     */
    fun setTitleAppearance(@StyleRes textAppearance: Int): AlerterFactory {
        alert?.setTitleAppearance(textAppearance)

        return this
    }

    /**
     * Set Gravity of the JarvisAlert
     *
     * @param gravity Gravity of JarvisAlert
     * @return This Alerter
     */
    fun setContentGravity(gravity: Int): AlerterFactory {
        alert?.contentGravity = gravity

        return this
    }

    /**
     * Sets the JarvisAlert Text
     *
     * @param textId Text String Resource
     * @return This Alerter
     */
    fun setText(@StringRes textId: Int): AlerterFactory {
        alert?.setText(textId)

        return this
    }

    /**
     * Sets the JarvisAlert Text
     *
     * @param text CharSequence of JarvisAlert Text
     * @return This Alerter
     */
    fun setText(text: CharSequence): AlerterFactory {
        alert?.setText(text)

        return this
    }

    /**
     * Set the Text's Typeface
     *
     * @param typeface Typeface to use
     * @return This Alerter
     */
    fun setTextTypeface(typeface: Typeface): AlerterFactory {
        alert?.setTextTypeface(typeface)

        return this
    }

    /**
     * Set the Text's text appearance
     *
     * @param textAppearance The style resource id
     * @return This Alerter
     */
    fun setTextAppearance(@StyleRes textAppearance: Int): AlerterFactory {
        alert?.setTextAppearance(textAppearance)

        return this
    }

    /**
     * Set the JarvisAlert's Background Colour
     *
     * @param colorInt Colour int value
     * @return This Alerter
     */
    fun setBackgroundColorInt(@ColorInt colorInt: Int): AlerterFactory {
        alert?.setAlertBackgroundColor(colorInt)

        return this
    }

    /**
     * Set the JarvisAlert's Background Colour
     *
     * @param colorResId Colour Resource Id
     * @return This Alerter
     */
    fun setBackgroundColorRes(@ColorRes colorResId: Int): AlerterFactory {
        activityWeakReference?.get()?.let {
            alert?.setAlertBackgroundColor(ContextCompat.getColor(it, colorResId))
        }

        return this
    }

    /**
     * Set the JarvisAlert's Background Drawable
     *
     * @param drawable Drawable
     * @return This Alerter
     */
    fun setBackgroundDrawable(drawable: Drawable): AlerterFactory {
        alert?.setAlertBackgroundDrawable(drawable)

        return this
    }

    /**
     * Set the JarvisAlert's Background Drawable Resource
     *
     * @param drawableResId Drawable Resource Id
     * @return This Alerter
     */
    fun setBackgroundResource(@DrawableRes drawableResId: Int): AlerterFactory {
        alert?.setAlertBackgroundResource(drawableResId)

        return this
    }

    /**
     * Set the JarvisAlert's Icon
     *
     * @param iconId The Drawable's Resource Idw
     * @return This Alerter
     */
    fun setIcon(@DrawableRes iconId: Int): AlerterFactory {
        alert?.setIcon(iconId)

        return this
    }

    /**
     * Set the JarvisAlert's Icon
     *
     * @param bitmap The Bitmap object to use for the icon.
     * @return This Alerter
     */
    fun setIcon(bitmap: Bitmap): AlerterFactory {
        alert?.setIcon(bitmap)

        return this
    }

    /**
     * Set the JarvisAlert's Icon
     *
     * @param drawable The Drawable to use for the icon.
     * @return This Alerter
     */
    fun setIcon(drawable: Drawable): AlerterFactory {
        alert?.setIcon(drawable)

        return this
    }

    /**
     * Set the JarvisAlert's Icon size
     *
     * @param size Dimension int.
     * @return This Alerter
     */
    fun setIconSize(@DimenRes size: Int): AlerterFactory {
        alert?.setIconSize(size)

        return this
    }

    /**
     * Set the JarvisAlert's Icon size
     *
     * @param size Icon size in pixel.
     * @return This Alerter
     */
    fun setIconPixelSize(@Px size: Int): AlerterFactory {
        alert?.setIconPixelSize(size)

        return this
    }

    /**
     * Set the icon color for the JarvisAlert
     *
     * @param color Color int
     * @return This Alerter
     */
    fun setIconColorFilter(@ColorInt color: Int): AlerterFactory {
        alert?.setIconColorFilter(color)

        return this
    }

    /**
     * Set the icon color for the JarvisAlert
     *
     * @param colorFilter ColorFilter
     * @return This Alerter
     */
    fun setIconColorFilter(colorFilter: ColorFilter): AlerterFactory {
        alert?.setIconColorFilter(colorFilter)

        return this
    }

    /**
     * Set the icon color for the JarvisAlert
     *
     * @param color Color int
     * @param mode  PorterDuff.Mode
     * @return This Alerter
     */
    fun setIconColorFilter(@ColorInt color: Int, mode: PorterDuff.Mode): AlerterFactory {
        alert?.setIconColorFilter(color, mode)

        return this
    }

    /**
     * Hide the Icon
     *
     * @return This Alerter
     */
    fun hideIcon(): AlerterFactory {
        alert?.showIcon(false)

        return this
    }

    /**
     * Set the onClickListener for the JarvisAlert
     *
     * @param onClickListener The onClickListener for the JarvisAlert
     * @return This Alerter
     */
    fun setOnClickListener(onClickListener: View.OnClickListener): AlerterFactory {
        alert?.setOnClickListener(onClickListener)

        return this
    }

    /**
     * Set the on screen duration of the alert
     *
     * @param milliseconds The duration in milliseconds
     * @return This Alerter
     */
    fun setDuration(milliseconds: Long): AlerterFactory {
        alert?.duration = milliseconds

        return this
    }

    /**
     * Enable or Disable Icon Pulse Animations
     *
     * @param pulse True if the icon should pulse
     * @return This Alerter
     */
    fun enableIconPulse(pulse: Boolean): AlerterFactory {
        alert?.pulseIcon(pulse)

        return this
    }

    /**
     * Set whether to show the icon in the alert or not
     *
     * @param showIcon True to show the icon, false otherwise
     * @return This Alerter
     */
    fun showIcon(showIcon: Boolean): AlerterFactory {
        alert?.showIcon(showIcon)

        return this
    }

    /**
     * Enable or disable infinite duration of the alert
     *
     * @param infiniteDuration True if the duration of the alert is infinite
     * @return This Alerter
     */
    fun enableInfiniteDuration(infiniteDuration: Boolean): AlerterFactory {
        alert?.setEnableInfiniteDuration(infiniteDuration)

        return this
    }

    /**
     * Sets the JarvisAlert Shown Listener
     *
     * @param listener OnShowJarvisAlertListener of JarvisAlert
     * @return This Alerter
     */
    fun setOnShowListener(listener: OnShowJarvisAlertListener): AlerterFactory {
        alert?.setOnShowListener(listener)

        return this
    }

    /**
     * Sets the JarvisAlert Hidden Listener
     *
     * @param listener OnHideJarvisAlertListener of JarvisAlert
     * @return This Alerter
     */
    fun setOnHideListener(listener: OnHideJarvisAlertListener): AlerterFactory {
        alert?.onHideListener = listener

        return this
    }

    /**
     * Enables swipe to dismiss
     *
     * @return This Alerter
     */
    fun enableSwipeToDismiss(): AlerterFactory {
        alert?.enableSwipeToDismiss()

        return this
    }

    /**
     * Enable or Disable Vibration
     *
     * @param enable True to enable, False to disable
     * @return This Alerter
     */
    fun enableVibration(enable: Boolean): AlerterFactory {
        alert?.setVibrationEnabled(enable)

        return this
    }

    /**
     * Enable or Disable Sound
     *
     * @param enable True to enable, False to disable
     * @return This Alerter
     */
    fun enableSound(enable: Boolean): AlerterFactory {
        alert?.setSoundEnabled(enable)

        return this
    }

    /**
     * Disable touch events outside of the JarvisAlert
     *
     * @return This Alerter
     */
    fun disableOutsideTouch(): AlerterFactory {
        alert?.disableOutsideTouch()

        return this
    }

    /**
     * Enable or disable progress bar
     *
     * @param enable True to enable, False to disable
     * @return This Alerter
     */
    fun enableProgress(enable: Boolean): AlerterFactory {
        alert?.setEnableProgress(enable)

        return this
    }

    /**
     * Set the Progress bar color from a color resource
     *
     * @param color The color resource
     * @return This Alerter
     */
    fun setProgressColorRes(@ColorRes color: Int): AlerterFactory {
        alert?.setProgressColorRes(color)

        return this
    }

    /**
     * Set the Progress bar color from a color resource
     *
     * @param color The color resource
     * @return This Alerter
     */
    fun setProgressColorInt(@ColorInt color: Int): AlerterFactory {
        alert?.setProgressColorInt(color)

        return this
    }

    /**
     * Set if the JarvisAlert is dismissable or not
     *
     * @param dismissable true if it can be dismissed
     * @return This Alerter
     */
    fun setDismissable(dismissable: Boolean): AlerterFactory {
        alert?.setDismissible(dismissable)

        return this
    }

    /**
     * Set a Custom Enter Animation
     *
     * @param animation The enter animation to play
     * @return This Alerter
     */
    fun setEnterAnimation(@AnimRes animation: Int): AlerterFactory {
        alert?.enterAnimation = AnimationUtils.loadAnimation(alert?.context, animation)

        return this
    }

    /**
     * Set a Custom Exit Animation
     *
     * @param animation The exit animation to play
     * @return This Alerter
     */
    fun setExitAnimation(@AnimRes animation: Int): AlerterFactory {
        alert?.exitAnimation = AnimationUtils.loadAnimation(alert?.context, animation)

        return this
    }

    /**
     * Show a button with the given text, and on click listener
     *
     * @param text The text to display on the button
     * @param onClick The on click listener
     */
    fun addButton(
        text: CharSequence, @StyleRes style: Int = R.style.AlertButton,
        onClick: View.OnClickListener
    ): AlerterFactory {
        alert?.addButton(text, style, onClick)

        return this
    }

    /**
     * Set the Button's Typeface
     *
     * @param typeface Typeface to use
     * @return This Alerter
     */
    fun setButtonTypeface(typeface: Typeface): AlerterFactory {
        alert?.buttonTypeFace = typeface

        return this
    }

    fun getLayoutContainer(): View? {
        return alert?.layoutContainer
    }

    /**
     * Creates a weak reference to the calling Activity
     *
     * @param activity The calling Activity
     */
    private fun setActivity(activity: Activity) {
        activityWeakReference = WeakReference(activity)
    }

    companion object {

        private var activityWeakReference: WeakReference<Activity>? = null

        /**
         * Creates the JarvisAlert, and maintains a reference to the calling Activity
         *
         * @param activity The calling Activity
         * @return This Alerter
         */
        @JvmStatic
        fun create(activity: Activity?): AlerterFactory {
            return create(activity, R.layout.alerter_alert_default_layout)
        }

        /**
         * Creates the JarvisAlert with custom view, and maintains a reference to the calling Activity
         *
         * @param activity The calling Activity
         * @param customLayoutId Custom view layout res id
         * @return This Alerter
         */
        @JvmStatic
        fun create(activity: Activity?, @LayoutRes layoutId: Int): AlerterFactory {
            if (activity == null) {
                throw IllegalArgumentException("Activity cannot be null!")
            }

            val alerter = AlerterFactory()

            //Hide current JarvisAlert, if one is active
            AlerterFactory.clearCurrent(activity)

            alerter.setActivity(activity)
            alerter.alert = JarvisAlert(activity, layoutId)

            return alerter
        }

        /**
         * Cleans up the currently showing alert view, if one is present
         *
         * @param activity The current Activity
         */
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

        /**
         * Hides the currently showing alert view, if one is present
         */
        @JvmStatic
        fun hide() {
            activityWeakReference?.get()?.let {
                clearCurrent(it)
            }
        }

        /**
         * Check if an JarvisAlert is currently showing
         *
         * @return True if an JarvisAlert is showing, false otherwise
         */
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