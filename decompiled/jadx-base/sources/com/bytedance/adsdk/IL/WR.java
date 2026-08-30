package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable, android.graphics.drawable.Drawable.Callback {
    private android.graphics.Matrix CQc;
    private android.graphics.Bitmap DDQ;
    private com.bytedance.adsdk.IL.bX.bX.IL Fy;
    com.bytedance.adsdk.IL.bX IL;
    private com.bytedance.adsdk.IL.Fy JAA;
    private boolean Ja;
    private boolean Kg;
    private android.graphics.RectF LKE;
    private int LZ;
    private com.bytedance.adsdk.IL.IL.bg Lq;
    private com.bytedance.adsdk.IL.IL.IL PX;
    private java.lang.String Ta;
    private android.graphics.Canvas Uq;
    private final android.graphics.Matrix Uw;
    private final android.animation.ValueAnimator.AnimatorUpdateListener VB;
    private android.graphics.Paint VJ;
    private android.graphics.RectF VW;
    private boolean VzQ;
    private com.bytedance.adsdk.IL.WR.IL WR;
    private android.graphics.RectF ZQc;
    private android.graphics.Rect aGH;
    private android.graphics.Rect ayS;
    com.bytedance.adsdk.IL.LZ bX;
    java.lang.String bg;
    private android.graphics.Rect daV;
    private final java.util.ArrayList<com.bytedance.adsdk.IL.WR.bg> eo;
    private com.bytedance.adsdk.IL.iR eqN;
    private boolean iR;
    private boolean kMt;
    private boolean ldr;
    private boolean qC;
    private boolean rri;
    private boolean tC;
    private boolean tuV;
    private android.graphics.Matrix uu;
    private java.util.Map<java.lang.String, android.graphics.Typeface> vb;
    private boolean xxp;
    private com.bytedance.adsdk.IL.eqN yDt;
    private final com.bytedance.adsdk.IL.ldr.bX zx;

    private enum IL {
        NONE,
        PLAY,
        RESUME
    }

    private interface bg {
        void bg(com.bytedance.adsdk.IL.iR iRVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public WR() {
        com.bytedance.adsdk.IL.ldr.bX bXVar = new com.bytedance.adsdk.IL.ldr.bX();
        this.zx = bXVar;
        this.ldr = true;
        this.iR = false;
        this.Kg = false;
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
        this.eo = new java.util.ArrayList<>();
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.WR.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                if (com.bytedance.adsdk.IL.WR.this.Fy != null) {
                    com.bytedance.adsdk.IL.WR.this.Fy.bg(com.bytedance.adsdk.IL.WR.this.zx.ldr());
                }
            }
        };
        this.VB = animatorUpdateListener;
        this.VzQ = false;
        this.tuV = true;
        this.LZ = 255;
        this.JAA = com.bytedance.adsdk.IL.Fy.AUTOMATIC;
        this.Ja = false;
        this.Uw = new android.graphics.Matrix();
        this.qC = false;
        bXVar.addUpdateListener(animatorUpdateListener);
    }

    public void bg(boolean z, android.content.Context context) {
        if (this.xxp == z) {
            return;
        }
        this.xxp = z;
        if (this.eqN != null) {
            bg(context);
        }
    }

    public void bg(boolean z) {
        if (z != this.tuV) {
            this.tuV = z;
            com.bytedance.adsdk.IL.bX.bX.IL il = this.Fy;
            if (il != null) {
                il.IL(z);
            }
            invalidateSelf();
        }
    }

    public com.bytedance.adsdk.IL.bX.bX.IL bg() {
        return this.Fy;
    }

    public boolean IL() {
        return this.tuV;
    }

    public void bg(java.lang.String str) {
        this.Ta = str;
    }

    public java.lang.String bX() {
        return this.Ta;
    }

    public void IL(boolean z) {
        this.VzQ = z;
    }

    public boolean eqN() {
        return this.VzQ;
    }

    public boolean bg(com.bytedance.adsdk.IL.iR iRVar, android.content.Context context) {
        if (this.eqN == iRVar) {
            return false;
        }
        this.qC = true;
        Kg();
        this.eqN = iRVar;
        bg(context);
        this.zx.bg(iRVar);
        eqN(this.zx.getAnimatedFraction());
        java.util.Iterator it = new java.util.ArrayList(this.eo).iterator();
        while (it.hasNext()) {
            com.bytedance.adsdk.IL.WR.bg bgVar = (com.bytedance.adsdk.IL.WR.bg) it.next();
            if (bgVar != null) {
                bgVar.bg(iRVar);
            }
            it.remove();
        }
        this.eo.clear();
        iRVar.IL(this.tC);
        DDQ();
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void bg(com.bytedance.adsdk.IL.Fy fy) {
        this.JAA = fy;
        DDQ();
    }

    public com.bytedance.adsdk.IL.Fy zx() {
        return this.Ja ? com.bytedance.adsdk.IL.Fy.SOFTWARE : com.bytedance.adsdk.IL.Fy.HARDWARE;
    }

    private void DDQ() {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            return;
        }
        this.Ja = this.JAA.bg(android.os.Build.VERSION.SDK_INT, iRVar.bg(), iRVar.IL());
    }

    public void bX(boolean z) {
        this.tC = z;
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar != null) {
            iRVar.IL(z);
        }
    }

    public void eqN(boolean z) {
        if (this.rri == z) {
            return;
        }
        this.rri = z;
        com.bytedance.adsdk.IL.bX.bX.IL il = this.Fy;
        if (il != null) {
            il.bg(z);
        }
    }

    public com.bytedance.adsdk.IL.tuV ldr() {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar != null) {
            return iRVar.bX();
        }
        return null;
    }

    public void zx(boolean z) {
        this.kMt = z;
    }

    public boolean iR() {
        return this.kMt;
    }

    private void bg(android.content.Context context) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            return;
        }
        com.bytedance.adsdk.IL.bX.bX.IL il = new com.bytedance.adsdk.IL.bX.bX.IL(this, com.bytedance.adsdk.IL.zx.rri.bg(iRVar), iRVar.Ta(), iRVar, context);
        this.Fy = il;
        if (this.rri) {
            il.bg(true);
        }
        this.Fy.IL(this.tuV);
    }

    public void Kg() {
        if (this.zx.isRunning()) {
            this.zx.cancel();
            if (!isVisible()) {
                this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
            }
        }
        this.eqN = null;
        this.Fy = null;
        this.PX = null;
        this.zx.Kg();
        invalidateSelf();
    }

    public void ldr(boolean z) {
        this.Kg = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.qC) {
            return;
        }
        this.qC = true;
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.LZ = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.LZ;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.IL.zx.bg("Drawable#draw");
        try {
            if (this.Ja) {
                bg(canvas, this.Fy);
            } else {
                bg(canvas);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.qC = false;
        com.bytedance.adsdk.IL.zx.IL("Drawable#draw");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if ((callback instanceof android.view.View) && ((android.view.View) callback).isInEditMode()) {
            return;
        }
        WR();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        eo();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Fy();
    }

    public void WR() {
        if (this.Fy == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.6
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.WR();
                }
            });
            return;
        }
        DDQ();
        if (Uq() || tuV() == 0) {
            if (isVisible()) {
                this.zx.VB();
                this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
            } else {
                this.WR = com.bytedance.adsdk.IL.WR.IL.PLAY;
            }
        }
        if (Uq()) {
            return;
        }
        bX((int) (yDt() < 0.0f ? PX() : Ta()));
        this.zx.PX();
        if (isVisible()) {
            return;
        }
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
    }

    public void eo() {
        this.eo.clear();
        this.zx.PX();
        if (isVisible()) {
            return;
        }
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
    }

    public void VB() {
        if (this.Fy == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.7
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.VB();
                }
            });
            return;
        }
        DDQ();
        if (Uq() || tuV() == 0) {
            if (isVisible()) {
                this.zx.yDt();
                this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
            } else {
                this.WR = com.bytedance.adsdk.IL.WR.IL.RESUME;
            }
        }
        if (Uq()) {
            return;
        }
        bX((int) (yDt() < 0.0f ? PX() : Ta()));
        this.zx.PX();
        if (isVisible()) {
            return;
        }
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
    }

    public void bg(final int i) {
        if (this.eqN == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.8
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.bg(i);
                }
            });
        } else {
            this.zx.bg(i);
        }
    }

    public float PX() {
        return this.zx.Lq();
    }

    public void bg(final float f) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.9
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar2) {
                    com.bytedance.adsdk.IL.WR.this.bg(f);
                }
            });
        } else {
            bg((int) com.bytedance.adsdk.IL.ldr.zx.bg(iRVar.ldr(), this.eqN.iR(), f));
        }
    }

    public void IL(final int i) {
        if (this.eqN == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.10
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.IL(i);
                }
            });
        } else {
            this.zx.IL(i + 0.99f);
        }
    }

    public float Ta() {
        return this.zx.vb();
    }

    public void IL(final float f) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.11
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar2) {
                    com.bytedance.adsdk.IL.WR.this.IL(f);
                }
            });
        } else {
            this.zx.IL(com.bytedance.adsdk.IL.ldr.zx.bg(iRVar.ldr(), this.eqN.iR(), f));
        }
    }

    public void IL(final java.lang.String str) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.12
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar2) {
                    com.bytedance.adsdk.IL.WR.this.IL(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.IL.bX.ldr ldrVarBX = iRVar.bX(str);
        if (ldrVarBX == null) {
            throw new java.lang.IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        bg((int) ldrVarBX.bg);
    }

    public void bX(final java.lang.String str) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.13
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar2) {
                    com.bytedance.adsdk.IL.WR.this.bX(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.IL.bX.ldr ldrVarBX = iRVar.bX(str);
        if (ldrVarBX == null) {
            throw new java.lang.IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        IL((int) (ldrVarBX.bg + ldrVarBX.IL));
    }

    public void eqN(final java.lang.String str) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.2
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar2) {
                    com.bytedance.adsdk.IL.WR.this.eqN(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.IL.bX.ldr ldrVarBX = iRVar.bX(str);
        if (ldrVarBX == null) {
            throw new java.lang.IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) ldrVarBX.bg;
        bg(i, ((int) ldrVarBX.IL) + i);
    }

    public void bg(final int i, final int i2) {
        if (this.eqN == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.3
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.bg(i, i2);
                }
            });
        } else {
            this.zx.bg(i, i2 + 0.99f);
        }
    }

    public void bX(float f) {
        this.zx.bX(f);
    }

    public float yDt() {
        return this.zx.eo();
    }

    public void bg(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zx.addUpdateListener(animatorUpdateListener);
    }

    public void IL(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zx.removeUpdateListener(animatorUpdateListener);
    }

    public void Lq() {
        this.zx.removeAllUpdateListeners();
        this.zx.addUpdateListener(this.VB);
    }

    public void bg(android.animation.Animator.AnimatorListener animatorListener) {
        this.zx.addListener(animatorListener);
    }

    public void IL(android.animation.Animator.AnimatorListener animatorListener) {
        this.zx.removeListener(animatorListener);
    }

    public void vb() {
        this.zx.removeAllListeners();
    }

    public void bX(final int i) {
        if (this.eqN == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.4
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.bX(i);
                }
            });
        } else {
            this.zx.bg(i);
        }
    }

    public int xxp() {
        return (int) this.zx.iR();
    }

    public void eqN(final float f) {
        if (this.eqN == null) {
            this.eo.add(new com.bytedance.adsdk.IL.WR.bg() { // from class: com.bytedance.adsdk.IL.WR.5
                @Override // com.bytedance.adsdk.IL.WR.bg
                public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                    com.bytedance.adsdk.IL.WR.this.eqN(f);
                }
            });
            return;
        }
        com.bytedance.adsdk.IL.zx.bg("Drawable#setProgress");
        this.zx.bg(this.eqN.bg(f));
        com.bytedance.adsdk.IL.zx.IL("Drawable#setProgress");
    }

    public void eqN(int i) {
        this.zx.setRepeatMode(i);
    }

    public int VzQ() {
        return this.zx.getRepeatMode();
    }

    public void zx(int i) {
        this.zx.setRepeatCount(i);
    }

    public int tuV() {
        return this.zx.getRepeatCount();
    }

    public boolean Fy() {
        com.bytedance.adsdk.IL.ldr.bX bXVar = this.zx;
        if (bXVar == null) {
            return false;
        }
        return bXVar.isRunning();
    }

    boolean LZ() {
        if (isVisible()) {
            return this.zx.isRunning();
        }
        return this.WR == com.bytedance.adsdk.IL.WR.IL.PLAY || this.WR == com.bytedance.adsdk.IL.WR.IL.RESUME;
    }

    private boolean Uq() {
        return this.ldr || this.iR;
    }

    public void bg(java.lang.Boolean bool) {
        this.ldr = bool.booleanValue();
    }

    public void iR(boolean z) {
        this.iR = z;
    }

    public void Kg(boolean z) {
        this.zx.bX(z);
    }

    public void bg(com.bytedance.adsdk.IL.eqN eqn) {
        this.yDt = eqn;
        com.bytedance.adsdk.IL.IL.IL il = this.PX;
        if (il != null) {
            il.bg(eqn);
        }
    }

    public void bg(com.bytedance.adsdk.IL.bX bXVar) {
        this.IL = bXVar;
        com.bytedance.adsdk.IL.IL.bg bgVar = this.Lq;
        if (bgVar != null) {
            bgVar.bg(bXVar);
        }
    }

    public void bg(java.util.Map<java.lang.String, android.graphics.Typeface> map) {
        if (map == this.vb) {
            return;
        }
        this.vb = map;
        invalidateSelf();
    }

    public void bg(com.bytedance.adsdk.IL.LZ lz) {
        this.bX = lz;
    }

    public com.bytedance.adsdk.IL.LZ tC() {
        return this.bX;
    }

    public boolean rri() {
        return this.vb == null && this.bX == null && this.eqN.yDt().size() > 0;
    }

    public com.bytedance.adsdk.IL.iR kMt() {
        return this.eqN;
    }

    public void JAA() {
        this.eo.clear();
        this.zx.cancel();
        if (isVisible()) {
            return;
        }
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
    }

    public void Ja() {
        this.eo.clear();
        this.zx.Ta();
        if (isVisible()) {
            return;
        }
        this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
    }

    public float Uw() {
        return this.zx.ldr();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            return -1;
        }
        return iRVar.eqN().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            return -1;
        }
        return iRVar.eqN().height();
    }

    public android.graphics.Bitmap bg(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.bytedance.adsdk.IL.IL.IL ilAGH = aGH();
        if (ilAGH == null) {
            return null;
        }
        android.graphics.Bitmap bitmapBg = ilAGH.bg(str, bitmap);
        invalidateSelf();
        return bitmapBg;
    }

    public android.graphics.Bitmap zx(java.lang.String str) {
        com.bytedance.adsdk.IL.IL.IL ilAGH = aGH();
        if (ilAGH != null) {
            return ilAGH.bg(str);
        }
        return null;
    }

    public com.bytedance.adsdk.IL.eo ldr(java.lang.String str) {
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (iRVar == null) {
            return null;
        }
        return iRVar.vb().get(str);
    }

    private com.bytedance.adsdk.IL.IL.IL aGH() {
        com.bytedance.adsdk.IL.IL.IL il = this.PX;
        if (il != null && !il.bg(VJ())) {
            this.PX = null;
        }
        if (this.PX == null) {
            this.PX = new com.bytedance.adsdk.IL.IL.IL(getCallback(), this.Ta, this.yDt, this.eqN.vb());
        }
        return this.PX;
    }

    public android.graphics.Typeface bg(com.bytedance.adsdk.IL.bX.bX bXVar) {
        java.util.Map<java.lang.String, android.graphics.Typeface> map = this.vb;
        if (map != null) {
            java.lang.String strBg = bXVar.bg();
            if (map.containsKey(strBg)) {
                return map.get(strBg);
            }
            java.lang.String strIL = bXVar.IL();
            if (map.containsKey(strIL)) {
                return map.get(strIL);
            }
            java.lang.String str = bXVar.bg() + "-" + bXVar.bX();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.IL.IL.bg bgVarVW = VW();
        if (bgVarVW != null) {
            return bgVarVW.bg(bXVar);
        }
        return null;
    }

    private com.bytedance.adsdk.IL.IL.bg VW() {
        if (getCallback() == null) {
            return null;
        }
        if (this.Lq == null) {
            com.bytedance.adsdk.IL.IL.bg bgVar = new com.bytedance.adsdk.IL.IL.bg(getCallback(), this.IL);
            this.Lq = bgVar;
            java.lang.String str = this.bg;
            if (str != null) {
                bgVar.bg(str);
            }
        }
        return this.Lq;
    }

    public void iR(java.lang.String str) {
        this.bg = str;
        com.bytedance.adsdk.IL.IL.bg bgVarVW = VW();
        if (bgVarVW != null) {
            bgVarVW.bg(str);
        }
    }

    private android.content.Context VJ() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof android.view.View)) {
            return ((android.view.View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.WR == com.bytedance.adsdk.IL.WR.IL.PLAY) {
                WR();
            } else if (this.WR == com.bytedance.adsdk.IL.WR.IL.RESUME) {
                VB();
            }
        } else if (this.zx.isRunning()) {
            Ja();
            this.WR = com.bytedance.adsdk.IL.WR.IL.RESUME;
        } else if (!z3) {
            this.WR = com.bytedance.adsdk.IL.WR.IL.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void bg(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.IL.bX.bX.IL il = this.Fy;
        com.bytedance.adsdk.IL.iR iRVar = this.eqN;
        if (il == null || iRVar == null) {
            return;
        }
        this.Uw.reset();
        android.graphics.Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.Uw.preScale(bounds.width() / iRVar.eqN().width(), bounds.height() / iRVar.eqN().height());
            this.Uw.preTranslate(bounds.left, bounds.top);
        }
        il.bg(canvas, this.Uw, this.LZ);
    }

    private void bg(android.graphics.Canvas canvas, com.bytedance.adsdk.IL.bX.bX.IL il) {
        if (this.eqN == null || il == null) {
            return;
        }
        daV();
        canvas.getMatrix(this.CQc);
        canvas.getClipBounds(this.aGH);
        bg(this.aGH, this.VW);
        this.CQc.mapRect(this.VW);
        bg(this.VW, this.aGH);
        if (this.tuV) {
            this.LKE.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            il.bg(this.LKE, (android.graphics.Matrix) null, false);
        }
        this.CQc.mapRect(this.LKE);
        android.graphics.Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        bg(this.LKE, fWidth, fHeight);
        if (!ayS()) {
            this.LKE.intersect(this.aGH.left, this.aGH.top, this.aGH.right, this.aGH.bottom);
        }
        int iCeil = (int) java.lang.Math.ceil(this.LKE.width());
        int iCeil2 = (int) java.lang.Math.ceil(this.LKE.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        IL(iCeil, iCeil2);
        if (this.qC) {
            this.Uw.set(this.CQc);
            this.Uw.preScale(fWidth, fHeight);
            this.Uw.postTranslate(-this.LKE.left, -this.LKE.top);
            this.DDQ.eraseColor(0);
            il.bg(this.Uq, this.Uw, this.LZ);
            this.CQc.invert(this.uu);
            this.uu.mapRect(this.ZQc, this.LKE);
            bg(this.ZQc, this.ayS);
        }
        this.daV.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.DDQ, this.daV, this.ayS, this.VJ);
    }

    private void daV() {
        if (this.Uq != null) {
            return;
        }
        this.Uq = new android.graphics.Canvas();
        this.LKE = new android.graphics.RectF();
        this.CQc = new android.graphics.Matrix();
        this.uu = new android.graphics.Matrix();
        this.aGH = new android.graphics.Rect();
        this.VW = new android.graphics.RectF();
        this.VJ = new com.bytedance.adsdk.IL.bg.bg();
        this.daV = new android.graphics.Rect();
        this.ayS = new android.graphics.Rect();
        this.ZQc = new android.graphics.RectF();
    }

    private void IL(int i, int i2) {
        android.graphics.Bitmap bitmap = this.DDQ;
        if (bitmap == null || bitmap.getWidth() < i || this.DDQ.getHeight() < i2) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
            this.DDQ = bitmapCreateBitmap;
            this.Uq.setBitmap(bitmapCreateBitmap);
            this.qC = true;
            return;
        }
        if (this.DDQ.getWidth() > i || this.DDQ.getHeight() > i2) {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(this.DDQ, 0, 0, i, i2);
            this.DDQ = bitmapCreateBitmap2;
            this.Uq.setBitmap(bitmapCreateBitmap2);
            this.qC = true;
        }
    }

    private void bg(android.graphics.RectF rectF, android.graphics.Rect rect) {
        rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
    }

    private void bg(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void bg(android.graphics.RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean ayS() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (!(callback instanceof android.view.View)) {
            return false;
        }
        android.view.ViewParent parent = ((android.view.View) callback).getParent();
        return (parent instanceof android.view.ViewGroup) && !((android.view.ViewGroup) parent).getClipChildren();
    }
}
