package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object obj, android.view.View view) {
        return createDragToOpenListener((android.widget.ListPopupWindow) obj, view);
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow listPopupWindow, android.view.View view) {
        return androidx.core.widget.ListPopupWindowCompat.Api19Impl.createDragToOpenListener(listPopupWindow, view);
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow listPopupWindow, android.view.View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }
}
