package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public android.content.res.ColorStateList mTintList;
    public android.graphics.PorterDuff.Mode mTintMode;

    void clear() {
        this.mTintList = null;
        this.mHasTintList = false;
        this.mTintMode = null;
        this.mHasTintMode = false;
    }
}
