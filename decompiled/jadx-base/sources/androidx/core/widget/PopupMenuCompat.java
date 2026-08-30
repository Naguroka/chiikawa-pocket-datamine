package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class PopupMenuCompat {
    private PopupMenuCompat() {
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(java.lang.Object obj) {
        return androidx.core.widget.PopupMenuCompat.Api19Impl.getDragToOpenListener((android.widget.PopupMenu) obj);
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static android.view.View.OnTouchListener getDragToOpenListener(android.widget.PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }
}
