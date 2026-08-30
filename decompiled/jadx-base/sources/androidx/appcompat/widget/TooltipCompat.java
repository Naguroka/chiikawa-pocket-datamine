package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {
    public static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.widget.TooltipCompat.Api26Impl.setTooltipText(view, charSequence);
        } else {
            androidx.appcompat.widget.TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    private TooltipCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setTooltipText(android.view.View view, java.lang.CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }
}
