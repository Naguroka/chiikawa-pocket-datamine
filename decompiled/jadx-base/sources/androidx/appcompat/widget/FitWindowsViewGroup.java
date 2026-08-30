package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public interface FitWindowsViewGroup {

    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(android.graphics.Rect rect);
    }

    void setOnFitSystemWindowsListener(androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener);
}
