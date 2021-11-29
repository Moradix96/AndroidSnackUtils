package ir.samiantec.SnackUtils;

import android.graphics.Color;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

//Sina Moradi
//2021 Nov 23
public class SnackUtil {

    private static final int COLOR_SUCCESS = Color.parseColor("#188753");
    private static final int COLOR_ERROR = Color.parseColor("#dc3546");
    //private static final int COLOR_WARNING = Color.parseColor("#fec007");
    //private static final int COLOR_INFO = Color.parseColor("#0dcaf0");
    private static final int COLOR_WHITE = Color.parseColor("#FFFFFF");

    public static void show(View root, String text, Type type) {
        final Snackbar snackbar = Snackbar.make(root, text, Snackbar.LENGTH_LONG);
        switch (type) {
            case SUCCESS:
                snackbar.setBackgroundTint(COLOR_SUCCESS);
                break;
            case ERROR:
                snackbar.setBackgroundTint(COLOR_ERROR);
                break;
        }
        snackbar.show();
    }

    public static void show(View root, String text) {
        final Snackbar snackbar = Snackbar.make(root, text, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public static void show(View root, String text, Type type, String actionText) {
        final Snackbar snackbar = Snackbar.make(root, text, Snackbar.LENGTH_INDEFINITE);

        switch (type) {
            case SUCCESS:
                snackbar.setBackgroundTint(COLOR_SUCCESS);
                snackbar.setActionTextColor(COLOR_WHITE);
                break;
            case ERROR:
                snackbar.setBackgroundTint(COLOR_ERROR);
                snackbar.setActionTextColor(COLOR_WHITE);
                break;
        }

        snackbar.setAction(actionText, view -> {
            /* Dismiss Snackbar */
        });

        snackbar.show();
    }

    public static void show(View root, String text, Type type, String actionText, View.OnClickListener onClickListener) {
        final Snackbar snackbar = Snackbar.make(root, text, Snackbar.LENGTH_INDEFINITE);

        switch (type) {
            case SUCCESS:
                snackbar.setBackgroundTint(COLOR_SUCCESS);
                snackbar.setActionTextColor(COLOR_WHITE);
                break;
            case ERROR:
                snackbar.setBackgroundTint(COLOR_ERROR);
                snackbar.setActionTextColor(COLOR_WHITE);
                break;
        }

        snackbar.setAction(actionText, onClickListener);
        snackbar.show();
    }

    public enum Type {ERROR, SUCCESS, INFO}

}