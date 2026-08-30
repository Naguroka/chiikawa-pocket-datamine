package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface TintableBackgroundView {
    android.content.res.ColorStateList getSupportBackgroundTintList();

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList);

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode);
}
