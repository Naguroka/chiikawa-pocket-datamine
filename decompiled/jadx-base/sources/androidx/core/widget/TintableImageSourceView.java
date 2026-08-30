package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public interface TintableImageSourceView {
    android.content.res.ColorStateList getSupportImageTintList();

    android.graphics.PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(android.content.res.ColorStateList colorStateList);

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode);
}
