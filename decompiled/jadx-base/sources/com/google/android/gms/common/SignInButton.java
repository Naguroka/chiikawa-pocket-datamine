package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SignInButton extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private android.view.View zac;
    private android.view.View.OnClickListener zad;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(android.content.Context context) {
        this(context, null);
    }

    private final void zaa(android.content.Context context) {
        android.view.View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = com.google.android.gms.common.internal.zaz.zaa(context, this.zaa, this.zab);
        } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException unused) {
            android.util.Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.zaa;
            int i2 = this.zab;
            com.google.android.gms.common.internal.zaaa zaaaVar = new com.google.android.gms.common.internal.zaaa(context, null);
            zaaaVar.zaa(context.getResources(), i, i2);
            this.zac = zaaaVar;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.zad;
        if (onClickListener == null || view != this.zac) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) {
        setStyle(this.zaa, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zac.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        android.view.View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @java.lang.Deprecated
    public void setScopes(com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i) {
        setStyle(i, this.zab);
    }

    public void setStyle(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
        zaa(getContext());
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @java.lang.Deprecated
    public void setStyle(int i, int i2, com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(i, i2);
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zad = null;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.zaa = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.zab = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
