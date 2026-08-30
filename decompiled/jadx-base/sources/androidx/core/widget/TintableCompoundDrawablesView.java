package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public interface TintableCompoundDrawablesView {
    android.content.res.ColorStateList getSupportCompoundDrawablesTintList();

    android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode);
}
