package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaaa extends android.widget.Button {
    public zaaa(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, android.R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new java.lang.IllegalStateException("Unknown color scheme: " + i);
    }

    public final void zaa(android.content.res.Resources resources, int i, int i2) {
        setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int iZab = zab(i2, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light);
        int iZab2 = zab(i2, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            throw new java.lang.IllegalStateException("Unknown button size: " + i);
        }
        android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(resources.getDrawable(iZab));
        androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableWrap, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableWrap, android.graphics.PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableWrap);
        setTextColor((android.content.res.ColorStateList) com.google.android.gms.common.internal.Preconditions.checkNotNull(resources.getColorStateList(zab(i2, com.google.android.gms.base.R.color.common_google_signin_btn_text_dark, com.google.android.gms.base.R.color.common_google_signin_btn_text_light, com.google.android.gms.base.R.color.common_google_signin_btn_text_light))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("Unknown button size: " + i);
            }
            setText((java.lang.CharSequence) null);
        }
        setTransformationMethod(null);
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
