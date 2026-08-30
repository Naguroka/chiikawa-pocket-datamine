package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public interface AppCompatCallback {
    void onSupportActionModeFinished(androidx.appcompat.view.ActionMode actionMode);

    void onSupportActionModeStarted(androidx.appcompat.view.ActionMode actionMode);

    androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback);
}
