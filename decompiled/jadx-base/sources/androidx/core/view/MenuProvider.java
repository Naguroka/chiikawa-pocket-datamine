package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface MenuProvider {
    void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater);

    default void onMenuClosed(android.view.Menu menu) {
    }

    boolean onMenuItemSelected(android.view.MenuItem menuItem);

    default void onPrepareMenu(android.view.Menu menu) {
    }
}
