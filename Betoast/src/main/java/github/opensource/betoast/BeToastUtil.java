package github.opensource.betoast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;

import github.opensource.betoast.sneaker.Sneaker;
import github.opensource.betoast.toast.TastyToast;

/**
 * Project :  BeToast.
 * Package name: com.irozon.sneaker
 * Created by :  Benjamin.
 * Created time: 2017/10/30 15:35
 * Changed by :  Benjamin.
 * Changed time: 2017/10/30 15:35
 * Class description:
 */

public class BeToastUtil {
    public static void showCustomerSnaker(Context a, String text) {
        Sneaker.with((Activity) a)
                .setTitle("系统提示", R.color.color_white) // Title and title color
                .setMessage(text, R.color.color_white) // Message and message color
                .setDuration(2000) // Time duration to show
                .setIcon(R.mipmap.ic_launcher_round, R.color.color_gray, false)
                .autoHide(true) // Auto hide Sneaker view
                .setHeight(100)
                .sneak(R.color.color_blue);
    }
    public static void showErrorSnaker(Context a, String text) {
        Sneaker.with((Activity) a)
                .setTitle("系统提示", R.color.color_white) // Title and title color
                .setMessage(text, R.color.color_white) // Message and message color
                .setDuration(2000) // Time duration to show
                .setIcon(R.drawable.ic_error, R.color.color_gray, false)
                .autoHide(true) // Auto hide Sneaker view
                .sneak(R.color.color_blue);
    }

    public static void showSuccessSnaker(Context a, String text) {
        Sneaker.with((Activity) a)
                .setTitle("系统提示", R.color.color_white) // Title and title color
                .setMessage(text, R.color.color_white) // Message and message color
                .setDuration(2000) // Time duration to show
                .setIcon(R.drawable.ic_success, R.color.color_green, false)
                .autoHide(true) // Auto hide Sneaker view
                .sneak(R.color.color_blue);
    }

    public static void showInfoSnaker(Context a, String text) {
        if (!TextUtils.isEmpty(text))
            Sneaker.with((Activity) a)
                    .setTitle("系统提示", R.color.color_white) // Title and title color
                    .setMessage(text, R.color.color_white) // Message and message color
                    .setDuration(2000) // Time duration to show
                    .setIcon(R.drawable.ic_warning, R.color.color_red, false)
                    .autoHide(true) // Auto hide Sneaker view
                    .sneak(R.color.color_blue);
    }

    public static void showDownToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.SUCCESS);
    }

    public static void showWaringToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.WARNING);
    }

    public static void showErrorToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.ERROR);
    }

    public static void showInfoToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.INFO);
    }

    public static void showDefaultToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.DEFAULT);
    }

    public static void showConfusionToast(Context a, String text) {
        TastyToast.makeText(a, text, TastyToast.LENGTH_SHORT,
                TastyToast.CONFUSING);
    }


}
