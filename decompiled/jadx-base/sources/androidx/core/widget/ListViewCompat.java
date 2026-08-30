package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ListViewCompat {
    public static void scrollListBy(android.widget.ListView listView, int i) {
        androidx.core.widget.ListViewCompat.Api19Impl.scrollListBy(listView, i);
    }

    public static boolean canScrollList(android.widget.ListView listView, int i) {
        return androidx.core.widget.ListViewCompat.Api19Impl.canScrollList(listView, i);
    }

    private ListViewCompat() {
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void scrollListBy(android.widget.ListView listView, int i) {
            listView.scrollListBy(i);
        }

        static boolean canScrollList(android.widget.ListView listView, int i) {
            return listView.canScrollList(i);
        }
    }
}
