package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zai extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private com.google.android.gms.internal.base.zag zai;
    private android.graphics.drawable.Drawable zaj;
    private android.graphics.drawable.Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zai(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this(null);
        drawable = drawable == null ? com.google.android.gms.internal.base.zaf.zaa : drawable;
        this.zaj = drawable;
        drawable.setCallback(this);
        com.google.android.gms.internal.base.zag zagVar = this.zai;
        zagVar.zab = drawable.getChangingConfigurations() | zagVar.zab;
        drawable2 = drawable2 == null ? com.google.android.gms.internal.base.zaf.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        com.google.android.gms.internal.base.zag zagVar2 = this.zai;
        zagVar2.zab = drawable2.getChangingConfigurations() | zagVar2.zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        com.google.android.gms.internal.base.zag zagVar = this.zai;
        return changingConfigurations | zagVar.zaa | zagVar.zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        this.zai.zaa = getChangingConfigurations();
        return this.zai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return java.lang.Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return java.lang.Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = android.graphics.drawable.Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        if (!this.zah && super.mutate() == this) {
            if (!zac()) {
                throw new java.lang.IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zaj.mutate();
            this.zak.mutate();
            this.zah = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.zaf == this.zad) {
            this.zaf = i;
        }
        this.zad = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final android.graphics.drawable.Drawable zaa() {
        return this.zak;
    }

    public final void zab(int i) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.zal) {
            boolean z = false;
            if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z = true;
            }
            this.zam = z;
            this.zal = true;
        }
        return this.zam;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.zaa;
        int i3 = 0;
        if (i2 == 1) {
            this.zab = android.os.SystemClock.uptimeMillis();
            this.zaa = 2;
            z = false;
        } else if (i2 == 2 && this.zab >= 0) {
            float fUptimeMillis = (android.os.SystemClock.uptimeMillis() - this.zab) / this.zae;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.zaa = 0;
            }
            this.zaf = (int) ((this.zac * java.lang.Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z = true;
        }
        int i4 = this.zaf;
        boolean z2 = this.zag;
        android.graphics.drawable.Drawable drawable = this.zaj;
        android.graphics.drawable.Drawable drawable2 = this.zak;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.zad - i4);
                i3 = 1;
            }
            drawable.draw(canvas);
            if (i3 != 0) {
                drawable.setAlpha(this.zad);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.zad);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.zad;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.zad;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    zai(com.google.android.gms.internal.base.zag zagVar) {
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        this.zai = new com.google.android.gms.internal.base.zag(zagVar);
    }
}
