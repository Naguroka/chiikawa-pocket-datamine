package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends android.widget.ImageView {
    private static final com.bytedance.adsdk.IL.VB<java.lang.Throwable> IL = new com.bytedance.adsdk.IL.VB<java.lang.Throwable>() { // from class: com.bytedance.adsdk.IL.ldr.1
        @Override // com.bytedance.adsdk.IL.VB
        public void bg(java.lang.Throwable th) {
            com.bytedance.adsdk.IL.ldr.ldr.bg(th);
        }
    };
    private static final java.lang.String bg = "ldr";
    private com.bytedance.adsdk.IL.ldr.IL DDQ;
    private long Fy;
    private int JAA;
    private java.lang.String Ja;
    private java.lang.String Kg;
    private com.bytedance.adsdk.IL.bX.bX.bX LZ;
    private final java.util.Set<java.lang.Object> Lq;
    private boolean PX;
    private boolean Ta;
    private com.bytedance.adsdk.IL.ldr.bg Uq;
    private final java.lang.Runnable Uw;
    private boolean VB;
    private final android.os.Handler VzQ;
    private int WR;
    private final com.bytedance.adsdk.IL.VB<com.bytedance.adsdk.IL.iR> bX;
    private com.bytedance.adsdk.ugeno.bX eo;
    private final com.bytedance.adsdk.IL.VB<java.lang.Throwable> eqN;
    private final com.bytedance.adsdk.IL.WR iR;
    private int kMt;
    private int ldr;
    private int rri;
    private int tC;
    private android.os.Handler tuV;
    private com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> vb;
    private com.bytedance.adsdk.IL.iR xxp;
    private final java.util.Set<com.bytedance.adsdk.IL.ldr.eqN> yDt;
    private com.bytedance.adsdk.IL.VB<java.lang.Throwable> zx;

    public interface IL {
    }

    public interface bg {
    }

    private enum eqN {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    static /* synthetic */ int Lq(com.bytedance.adsdk.IL.ldr ldrVar) {
        int i = ldrVar.tC;
        ldrVar.tC = i - 1;
        return i;
    }

    public ldr(android.content.Context context) {
        super(context);
        this.bX = new com.bytedance.adsdk.IL.VB<com.bytedance.adsdk.IL.iR>() { // from class: com.bytedance.adsdk.IL.ldr.5
            @Override // com.bytedance.adsdk.IL.VB
            public void bg(com.bytedance.adsdk.IL.iR iRVar) {
                com.bytedance.adsdk.IL.ldr.this.setComposition(iRVar);
            }
        };
        this.eqN = new com.bytedance.adsdk.IL.VB<java.lang.Throwable>() { // from class: com.bytedance.adsdk.IL.ldr.6
            @Override // com.bytedance.adsdk.IL.VB
            public void bg(java.lang.Throwable th) {
                if (com.bytedance.adsdk.IL.ldr.this.ldr != 0) {
                    com.bytedance.adsdk.IL.ldr ldrVar = com.bytedance.adsdk.IL.ldr.this;
                    ldrVar.setImageResource(ldrVar.ldr);
                }
                (com.bytedance.adsdk.IL.ldr.this.zx == null ? com.bytedance.adsdk.IL.ldr.IL : com.bytedance.adsdk.IL.ldr.this.zx).bg(th);
            }
        };
        this.ldr = 0;
        this.iR = new com.bytedance.adsdk.IL.WR();
        this.VB = false;
        this.PX = false;
        this.Ta = true;
        this.yDt = new java.util.HashSet();
        this.Lq = new java.util.HashSet();
        this.VzQ = new android.os.Handler(android.os.Looper.getMainLooper());
        this.Fy = 0L;
        this.Uw = new java.lang.Runnable() { // from class: com.bytedance.adsdk.IL.ldr.3
            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.i("TMe", "--==--- timer callback, timer: " + com.bytedance.adsdk.IL.ldr.this.tC + ", " + com.bytedance.adsdk.IL.ldr.this.rri);
                if (com.bytedance.adsdk.IL.ldr.this.tC <= com.bytedance.adsdk.IL.ldr.this.rri) {
                    if (com.bytedance.adsdk.IL.ldr.this.kMt >= 0 && com.bytedance.adsdk.IL.ldr.this.JAA >= 0) {
                        android.util.Log.i("TMe", "--==--- timer end, play anim, startframe: " + com.bytedance.adsdk.IL.ldr.this.kMt);
                        com.bytedance.adsdk.IL.ldr.this.bg();
                        com.bytedance.adsdk.IL.ldr ldrVar = com.bytedance.adsdk.IL.ldr.this;
                        ldrVar.setFrame(ldrVar.kMt);
                        com.bytedance.adsdk.IL.ldr.this.bg(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.3.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                                if (com.bytedance.adsdk.IL.ldr.this.getFrame() < com.bytedance.adsdk.IL.ldr.this.JAA - 1 || com.bytedance.adsdk.IL.ldr.this.getFrame() >= com.bytedance.adsdk.IL.ldr.this.JAA + 2) {
                                    return;
                                }
                                android.util.Log.i("TMe", "--==--- timer end, play anim, endframe: " + com.bytedance.adsdk.IL.ldr.this.JAA);
                                com.bytedance.adsdk.IL.ldr.this.IL(this);
                                com.bytedance.adsdk.IL.ldr.this.ldr();
                            }
                        });
                    } else {
                        android.util.Log.i("TMe", "--==--- timer end, frame invalid: " + com.bytedance.adsdk.IL.ldr.this.kMt + "," + com.bytedance.adsdk.IL.ldr.this.JAA);
                    }
                    if (android.text.TextUtils.isEmpty(com.bytedance.adsdk.IL.ldr.this.Ja) || com.bytedance.adsdk.IL.ldr.this.DDQ == null) {
                        return;
                    }
                    com.bytedance.adsdk.IL.ldr.IL unused = com.bytedance.adsdk.IL.ldr.this.DDQ;
                    java.lang.String unused2 = com.bytedance.adsdk.IL.ldr.this.Ja;
                    return;
                }
                com.bytedance.adsdk.IL.ldr.Lq(com.bytedance.adsdk.IL.ldr.this);
                com.bytedance.adsdk.IL.ldr.this.LZ.bg(new java.lang.StringBuilder().append(com.bytedance.adsdk.IL.ldr.this.tC).toString());
                com.bytedance.adsdk.IL.ldr.this.invalidate();
                com.bytedance.adsdk.IL.ldr.this.Lq();
            }
        };
        Kg();
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.eo = bXVar;
    }

    private void Kg() {
        setSaveEnabled(false);
        this.Ta = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        bg(0.0f, false);
        bg(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.iR.bg(java.lang.Boolean.valueOf(com.bytedance.adsdk.IL.ldr.ldr.bg(getContext()) != 0.0f));
        WR();
        eo();
        PX();
    }

    private void WR() {
        bg(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.adsdk.IL.ldr.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.bytedance.adsdk.IL.ldr.this.IL(this);
                com.bytedance.adsdk.IL.ldr.this.yDt();
            }
        });
    }

    private void eo() {
        bg(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof java.lang.Float) || ((java.lang.Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                com.bytedance.adsdk.IL.ldr.this.IL(this);
                com.bytedance.adsdk.IL.iR.bg globalConfig = com.bytedance.adsdk.IL.ldr.this.getGlobalConfig();
                if (globalConfig == null || globalConfig.bX == null || globalConfig.bX.isEmpty() || com.bytedance.adsdk.IL.ldr.this.Uq == null) {
                    return;
                }
                com.bytedance.adsdk.IL.ldr.bg unused = com.bytedance.adsdk.IL.ldr.this.Uq;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VB() {
        com.bytedance.adsdk.IL.iR.bg globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.IL == null) {
            return;
        }
        globalConfig.IL.isEmpty();
    }

    private void PX() {
        bg(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.adsdk.IL.ldr.9
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.bytedance.adsdk.IL.LZ lzTC;
                com.bytedance.adsdk.IL.ldr.this.IL(this);
                java.lang.String playDelayedELExpressTimeS = com.bytedance.adsdk.IL.ldr.this.getPlayDelayedELExpressTimeS();
                if (!android.text.TextUtils.isEmpty(playDelayedELExpressTimeS) && (lzTC = com.bytedance.adsdk.IL.ldr.this.iR.tC()) != null) {
                    try {
                        int i = java.lang.Integer.parseInt(lzTC.bg(playDelayedELExpressTimeS)) * 1000;
                        if (com.bytedance.adsdk.IL.ldr.this.Fy > 0) {
                            long jElapsedRealtime = (com.bytedance.adsdk.IL.ldr.this.Fy + ((long) i)) - android.os.SystemClock.elapsedRealtime();
                            android.util.Log.i("TMe", "--==-- lottie delayed time: ".concat(java.lang.String.valueOf(jElapsedRealtime)));
                            if (jElapsedRealtime > 0) {
                                com.bytedance.adsdk.IL.ldr.this.ldr();
                                com.bytedance.adsdk.IL.ldr.this.setVisibility(8);
                                if (com.bytedance.adsdk.IL.ldr.this.tuV == null) {
                                    com.bytedance.adsdk.IL.ldr.this.tuV = new android.os.Handler(android.os.Looper.getMainLooper());
                                }
                                com.bytedance.adsdk.IL.ldr.this.tuV.removeCallbacksAndMessages(null);
                                com.bytedance.adsdk.IL.ldr.this.tuV.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.adsdk.IL.ldr.9.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        android.util.Log.i("TMe", "--==-- lottie real start play");
                                        com.bytedance.adsdk.IL.ldr.this.setVisibility(0);
                                        com.bytedance.adsdk.IL.ldr.this.bg();
                                        com.bytedance.adsdk.IL.ldr.this.VB();
                                    }
                                }, jElapsedRealtime);
                                return;
                            }
                        }
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                com.bytedance.adsdk.IL.ldr.this.VB();
            }
        });
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Ta();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        Ta();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        Ta();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        com.bytedance.adsdk.IL.WR wr;
        if (!this.VB && drawable == (wr = this.iR) && wr.Fy()) {
            ldr();
        } else if (!this.VB && (drawable instanceof com.bytedance.adsdk.IL.WR)) {
            com.bytedance.adsdk.IL.WR wr2 = (com.bytedance.adsdk.IL.WR) drawable;
            if (wr2.Fy()) {
                wr2.Ja();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        android.graphics.drawable.Drawable drawable = getDrawable();
        if ((drawable instanceof com.bytedance.adsdk.IL.WR) && ((com.bytedance.adsdk.IL.WR) drawable).zx() == com.bytedance.adsdk.IL.Fy.SOFTWARE) {
            this.iR.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = getDrawable();
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (drawable2 == wr) {
            super.invalidateDrawable(wr);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getPlayDelayedELExpressTimeS() {
        com.bytedance.adsdk.IL.iR iRVarKMt;
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (wr == null || (iRVarKMt = wr.kMt()) == null) {
            return null;
        }
        return iRVarKMt.WR();
    }

    private com.bytedance.adsdk.IL.eo bg(java.lang.String str) {
        com.bytedance.adsdk.IL.WR wr;
        com.bytedance.adsdk.IL.iR iRVarKMt;
        java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> mapVb;
        if (android.text.TextUtils.isEmpty(str) || (wr = this.iR) == null || (iRVarKMt = wr.kMt()) == null || (mapVb = iRVarKMt.vb()) == null) {
            return null;
        }
        return mapVb.get(str);
    }

    private com.bytedance.adsdk.IL.iR.IL getGlobalEvent() {
        com.bytedance.adsdk.IL.iR iRVarKMt;
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (wr == null || (iRVarKMt = wr.kMt()) == null) {
            return null;
        }
        return iRVarKMt.eo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.adsdk.IL.iR.bg getGlobalConfig() {
        com.bytedance.adsdk.IL.iR iRVarKMt;
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (wr == null || (iRVarKMt = wr.kMt()) == null) {
            return null;
        }
        return iRVarKMt.VB();
    }

    private void bg(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            android.util.Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(java.lang.String.valueOf(i)));
            vb();
            bg();
            setFrame(i);
            bg(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.10
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    if (com.bytedance.adsdk.IL.ldr.this.getFrame() < i2 - 1 || com.bytedance.adsdk.IL.ldr.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    android.util.Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + com.bytedance.adsdk.IL.ldr.this.getFrame());
                    com.bytedance.adsdk.IL.ldr.this.IL(this);
                    com.bytedance.adsdk.IL.ldr.this.ldr();
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    private boolean bg(android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.IL.iR.IL globalEvent = getGlobalEvent();
        return (globalEvent == null || android.text.TextUtils.isEmpty(globalEvent.bg)) ? false : true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.IL.bX.bX.bg bgVarIL = IL(motionEvent);
        if (bgVarIL != null) {
            java.lang.String strWR = bgVarIL.WR();
            if (bgVarIL instanceof com.bytedance.adsdk.IL.bX.bX.IL) {
                if (getGlobalConfig() == null || getGlobalConfig().bg != 1) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
            if (strWR != null && strWR.startsWith("CSJCLOSE")) {
                vb();
            }
            com.bytedance.adsdk.IL.eo eoVarBg = bg(bgVarIL.zx());
            if (eoVarBg != null && motionEvent.getAction() == 1) {
                if (android.text.TextUtils.isEmpty(eoVarBg.zx()) && strWR != null && !strWR.endsWith("CSJNO")) {
                    bg(motionEvent);
                }
                int[][] iArrLdr = eoVarBg.ldr();
                if (iArrLdr != null) {
                    bg(iArrLdr);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().IL) != null) {
                    bg(iArr);
                }
            }
            if (strWR != null && strWR.startsWith("CSJNTP")) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (getGlobalConfig() == null || getGlobalConfig().bg != 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private com.bytedance.adsdk.IL.bX.bX.bg IL(android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.IL.bX.bX.IL ilBg;
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (wr == null || (ilBg = wr.bg()) == null) {
            return null;
        }
        return bg(ilBg, motionEvent);
    }

    private com.bytedance.adsdk.IL.bX.bX.bg bg(com.bytedance.adsdk.IL.bX.bX.IL il, android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.IL.bX.bX.bg bgVarBg;
        for (com.bytedance.adsdk.IL.bX.bX.bg bgVar : il.PX()) {
            if (bgVar instanceof com.bytedance.adsdk.IL.bX.bX.IL) {
                if (bgVar.Kg() && bgVar.ldr() > 0.0f) {
                    android.graphics.RectF rectF = new android.graphics.RectF();
                    bgVar.bg(rectF, bgVar.eqN(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (bgVarBg = bg((com.bytedance.adsdk.IL.bX.bX.IL) bgVar, motionEvent)) != null) {
                        return bgVarBg;
                    }
                }
            } else if (bgVar.Kg() && bgVar.ldr() > 0.0f) {
                android.graphics.RectF rectF2 = new android.graphics.RectF();
                bgVar.bg(rectF2, bgVar.eqN(), true);
                android.graphics.RectF rectF3 = new android.graphics.RectF();
                bg(rectF3, rectF2);
                if (bg(motionEvent, rectF3)) {
                    return bgVar;
                }
            }
        }
        return null;
    }

    private boolean bg(android.view.MotionEvent motionEvent, android.graphics.RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void bg(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.iR.getBounds().width();
        float fHeight = this.iR.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int i = com.bytedance.adsdk.IL.ldr.AnonymousClass4.bg[getScaleType().ordinal()];
        if (i == 1) {
            bg(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            IL(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            bX(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            eqN(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.ldr$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            bg = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                bg[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void bg(android.graphics.Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    private void IL(android.graphics.Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    private void bX(android.graphics.Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void eqN(android.graphics.Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.bytedance.adsdk.IL.ldr.bX bXVar = new com.bytedance.adsdk.IL.ldr.bX(super.onSaveInstanceState());
        bXVar.bg = this.Kg;
        bXVar.IL = this.WR;
        bXVar.bX = this.iR.Uw();
        bXVar.eqN = this.iR.LZ();
        bXVar.zx = this.iR.bX();
        bXVar.ldr = this.iR.VzQ();
        bXVar.iR = this.iR.tuV();
        return bXVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof com.bytedance.adsdk.IL.ldr.bX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.bytedance.adsdk.IL.ldr.bX bXVar = (com.bytedance.adsdk.IL.ldr.bX) parcelable;
        super.onRestoreInstanceState(bXVar.getSuperState());
        this.Kg = bXVar.bg;
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_ANIMATION) && !android.text.TextUtils.isEmpty(this.Kg)) {
            setAnimation(this.Kg);
        }
        this.WR = bXVar.IL;
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_ANIMATION) && (i = this.WR) != 0) {
            setAnimation(i);
        }
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_PROGRESS)) {
            bg(bXVar.bX, false);
        }
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.PLAY_OPTION) && bXVar.eqN) {
            bg();
        }
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bXVar.zx);
        }
        if (!this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_REPEAT_MODE)) {
            setRepeatMode(bXVar.ldr);
        }
        if (this.yDt.contains(com.bytedance.adsdk.IL.ldr.eqN.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bXVar.iR);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.PX) {
            this.iR.WR();
        }
        com.bytedance.adsdk.ugeno.bX bXVar = this.eo;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vb();
        android.os.Handler handler = this.tuV;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        bX();
        IL();
        com.bytedance.adsdk.ugeno.bX bXVar = this.eo;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.iR.iR(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.iR.Kg(z);
    }

    public void bg(boolean z, android.content.Context context) {
        this.iR.bg(z, context);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.iR.bg(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.iR.IL();
    }

    public void setCacheComposition(boolean z) {
        this.Ta = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.iR.eqN(z);
    }

    public void setAnimation(int i) {
        this.WR = i;
        this.Kg = null;
        setCompositionTask(bg(i));
    }

    private com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> bg(final int i) {
        if (isInEditMode()) {
            return new com.bytedance.adsdk.IL.Ta<>(new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.ldr.11
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                    return com.bytedance.adsdk.IL.ldr.this.Ta ? com.bytedance.adsdk.IL.Kg.IL(com.bytedance.adsdk.IL.ldr.this.getContext(), i) : com.bytedance.adsdk.IL.Kg.IL(com.bytedance.adsdk.IL.ldr.this.getContext(), i, (java.lang.String) null);
                }
            }, true);
        }
        return this.Ta ? com.bytedance.adsdk.IL.Kg.bg(getContext(), i) : com.bytedance.adsdk.IL.Kg.bg(getContext(), i, (java.lang.String) null);
    }

    public void setAnimation(java.lang.String str) {
        this.Kg = str;
        this.WR = 0;
        setCompositionTask(IL(str));
    }

    private com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> IL(final java.lang.String str) {
        if (isInEditMode()) {
            return new com.bytedance.adsdk.IL.Ta<>(new java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR>>() { // from class: com.bytedance.adsdk.IL.ldr.12
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> call() throws java.lang.Exception {
                    return com.bytedance.adsdk.IL.ldr.this.Ta ? com.bytedance.adsdk.IL.Kg.bX(com.bytedance.adsdk.IL.ldr.this.getContext(), str) : com.bytedance.adsdk.IL.Kg.bX(com.bytedance.adsdk.IL.ldr.this.getContext(), str, null);
                }
            }, true);
        }
        return this.Ta ? com.bytedance.adsdk.IL.Kg.IL(getContext(), str) : com.bytedance.adsdk.IL.Kg.IL(getContext(), str, (java.lang.String) null);
    }

    @java.lang.Deprecated
    public void setAnimationFromJson(java.lang.String str) {
        bg(str, (java.lang.String) null);
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        bg(new java.io.ByteArrayInputStream(str.getBytes()), str2);
    }

    public void bg(java.io.InputStream inputStream, java.lang.String str) {
        setCompositionTask(com.bytedance.adsdk.IL.Kg.bg(inputStream, str));
    }

    public void setAnimationFromUrl(java.lang.String str) {
        setCompositionTask(this.Ta ? com.bytedance.adsdk.IL.Kg.bg(getContext(), str) : com.bytedance.adsdk.IL.Kg.bg(getContext(), str, (java.lang.String) null));
    }

    public void setFailureListener(com.bytedance.adsdk.IL.VB<java.lang.Throwable> vb) {
        this.zx = vb;
    }

    public void setFallbackResource(int i) {
        this.ldr = i;
    }

    private void setCompositionTask(com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> ta) {
        this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.SET_ANIMATION);
        xxp();
        Ta();
        this.vb = ta.bg(this.bX).bX(this.eqN);
    }

    private void Ta() {
        com.bytedance.adsdk.IL.Ta<com.bytedance.adsdk.IL.iR> ta = this.vb;
        if (ta != null) {
            ta.IL(this.bX);
            this.vb.eqN(this.eqN);
        }
    }

    private com.bytedance.adsdk.IL.bX.bX.bX bg(com.bytedance.adsdk.IL.bX.bX.IL il, java.lang.String str) {
        for (com.bytedance.adsdk.IL.bX.bX.bg bgVar : il.PX()) {
            if (bgVar instanceof com.bytedance.adsdk.IL.bX.bX.IL) {
                com.bytedance.adsdk.IL.bX.bX.bX bXVarBg = bg((com.bytedance.adsdk.IL.bX.bX.IL) bgVar, str);
                if (bXVarBg != null) {
                    return bXVarBg;
                }
            } else if (android.text.TextUtils.equals(str, bgVar.WR()) && (bgVar instanceof com.bytedance.adsdk.IL.bX.bX.bX)) {
                return (com.bytedance.adsdk.IL.bX.bX.bX) bgVar;
            }
        }
        return null;
    }

    private com.bytedance.adsdk.IL.bX.bX.bX bX(java.lang.String str) {
        com.bytedance.adsdk.IL.bX.bX.IL ilBg;
        com.bytedance.adsdk.IL.WR wr = this.iR;
        if (wr == null || (ilBg = wr.bg()) == null) {
            return null;
        }
        return bg(ilBg, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yDt() {
        com.bytedance.adsdk.IL.WR wr;
        int i;
        int i2;
        final int i3;
        if (this.xxp == null || (wr = this.iR) == null) {
            return;
        }
        com.bytedance.adsdk.IL.LZ lzTC = wr.tC();
        com.bytedance.adsdk.IL.iR.bX bXVarKg = this.xxp.Kg();
        if (bXVarKg == null || lzTC == null) {
            return;
        }
        final int i4 = bXVarKg.bg;
        if (i4 < 0) {
            android.util.Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(java.lang.String.valueOf(i4)));
            return;
        }
        final int i5 = -1;
        if (bXVarKg.zx == null || bXVarKg.zx.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i = bXVarKg.zx[0];
            i2 = bXVarKg.zx[1];
        }
        java.lang.String strBg = lzTC.bg(bXVarKg.bX);
        java.lang.String strBg2 = lzTC.bg(bXVarKg.eqN);
        try {
            i3 = java.lang.Integer.parseInt(strBg);
            try {
                i5 = java.lang.Integer.parseInt(strBg2);
            } catch (java.lang.NumberFormatException unused) {
            }
        } catch (java.lang.NumberFormatException unused2) {
            i3 = -1;
        }
        android.util.Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        if (!android.text.TextUtils.isEmpty(bXVarKg.IL)) {
            android.util.Log.i("TMe", "--==--- timer, id:" + bXVarKg.IL);
            com.bytedance.adsdk.IL.bX.bX.bX bXVarBX = bX(bXVarKg.IL);
            if (bXVarBX != null) {
                android.util.Log.i("TMe", "--==--- timer success");
                this.Ja = bXVarKg.ldr;
                this.LZ = bXVarBX;
                this.tC = i3;
                this.rri = i3 - i5;
                this.kMt = i;
                this.JAA = i2;
                bg(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        if (com.bytedance.adsdk.IL.ldr.this.getFrame() < i4 - 1 || com.bytedance.adsdk.IL.ldr.this.getFrame() >= i4 + 2) {
                            return;
                        }
                        android.util.Log.i("TMe", "--==--- enter timer point, frame: " + com.bytedance.adsdk.IL.ldr.this.getFrame());
                        com.bytedance.adsdk.IL.ldr.this.IL(this);
                        if (i3 >= 0 && i5 >= 0) {
                            android.util.Log.i("TMe", "--==--- enter timer callback, start timer");
                            com.bytedance.adsdk.IL.ldr.this.Lq();
                        } else {
                            android.util.Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                        }
                        com.bytedance.adsdk.IL.ldr.this.ldr();
                    }
                });
                return;
            }
            return;
        }
        android.util.Log.i("TMe", "--==--- timer fail, id is invalid: " + bXVarKg.IL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lq() {
        this.VzQ.postDelayed(this.Uw, 1000L);
    }

    private void vb() {
        this.VzQ.removeCallbacksAndMessages(null);
    }

    public void setComposition(com.bytedance.adsdk.IL.iR iRVar) {
        if (com.bytedance.adsdk.IL.zx.bg) {
            android.util.Log.v(bg, "Set Composition \n".concat(java.lang.String.valueOf(iRVar)));
        }
        this.iR.setCallback(this);
        this.xxp = iRVar;
        this.VB = true;
        boolean zBg = this.iR.bg(iRVar, getContext().getApplicationContext());
        this.VB = false;
        if (getDrawable() != this.iR || zBg) {
            if (!zBg) {
                VzQ();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            java.util.Iterator<java.lang.Object> it = this.Lq.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public com.bytedance.adsdk.IL.iR getComposition() {
        return this.xxp;
    }

    public void bg() {
        this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.PLAY_OPTION);
        this.iR.WR();
        if (this.Fy == 0) {
            this.Fy = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void setMinFrame(int i) {
        this.iR.bg(i);
    }

    public float getMinFrame() {
        return this.iR.PX();
    }

    public void setMinProgress(float f) {
        this.iR.bg(f);
    }

    public void setMaxFrame(int i) {
        this.iR.IL(i);
    }

    public float getMaxFrame() {
        return this.iR.Ta();
    }

    public void setMaxProgress(float f) {
        this.iR.IL(f);
    }

    public void setMinFrame(java.lang.String str) {
        this.iR.IL(str);
    }

    public void setMaxFrame(java.lang.String str) {
        this.iR.bX(str);
    }

    public void setMinAndMaxFrame(java.lang.String str) {
        this.iR.eqN(str);
    }

    public void setSpeed(float f) {
        this.iR.bX(f);
    }

    public float getSpeed() {
        return this.iR.yDt();
    }

    public void bg(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.iR.bg(animatorUpdateListener);
    }

    public void IL(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.iR.IL(animatorUpdateListener);
    }

    public void IL() {
        this.iR.Lq();
    }

    public void bg(android.animation.Animator.AnimatorListener animatorListener) {
        this.iR.bg(animatorListener);
    }

    public void IL(android.animation.Animator.AnimatorListener animatorListener) {
        this.iR.IL(animatorListener);
    }

    public void bX() {
        this.iR.vb();
    }

    @java.lang.Deprecated
    public void bg(boolean z) {
        this.iR.zx(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.SET_REPEAT_MODE);
        this.iR.eqN(i);
    }

    public int getRepeatMode() {
        return this.iR.VzQ();
    }

    public void setRepeatCount(int i) {
        this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.SET_REPEAT_COUNT);
        this.iR.zx(i);
    }

    public int getRepeatCount() {
        return this.iR.tuV();
    }

    public boolean eqN() {
        return this.iR.Fy();
    }

    public void setImageAssetsFolder(java.lang.String str) {
        this.iR.bg(str);
    }

    public java.lang.String getImageAssetsFolder() {
        return this.iR.bX();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.iR.IL(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.iR.eqN();
    }

    public android.graphics.Bitmap bg(java.lang.String str, android.graphics.Bitmap bitmap) {
        return this.iR.bg(str, bitmap);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.IL.eqN eqn) {
        this.iR.bg(eqn);
    }

    public void setDefaultFontFileExtension(java.lang.String str) {
        this.iR.iR(str);
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.IL.bX bXVar) {
        this.iR.bg(bXVar);
    }

    public void setFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> map) {
        this.iR.bg(map);
    }

    public void setTextDelegate(com.bytedance.adsdk.IL.LZ lz) {
        this.iR.bg(lz);
    }

    public void zx() {
        this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.PLAY_OPTION);
        this.iR.JAA();
    }

    public void ldr() {
        this.PX = false;
        this.iR.Ja();
    }

    public void setFrame(int i) {
        this.iR.bX(i);
    }

    public int getFrame() {
        return this.iR.xxp();
    }

    public void setProgress(float f) {
        bg(f, true);
    }

    private void bg(float f, boolean z) {
        if (z) {
            this.yDt.add(com.bytedance.adsdk.IL.ldr.eqN.SET_PROGRESS);
        }
        this.iR.eqN(f);
    }

    public float getProgress() {
        return this.iR.Uw();
    }

    public long getDuration() {
        com.bytedance.adsdk.IL.iR iRVar = this.xxp;
        if (iRVar != null) {
            return (long) iRVar.zx();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.iR.bX(z);
    }

    public com.bytedance.adsdk.IL.tuV getPerformanceTracker() {
        return this.iR.ldr();
    }

    private void xxp() {
        this.xxp = null;
        this.iR.Kg();
    }

    public void setSafeMode(boolean z) {
        this.iR.ldr(z);
    }

    public void setRenderMode(com.bytedance.adsdk.IL.Fy fy) {
        this.iR.bg(fy);
    }

    public com.bytedance.adsdk.IL.Fy getRenderMode() {
        return this.iR.zx();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.iR.zx(z);
    }

    private void VzQ() {
        boolean zEqN = eqN();
        setImageDrawable(null);
        setImageDrawable(this.iR);
        if (zEqN) {
            this.iR.VB();
        }
    }

    private static class bX extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.IL.ldr.bX> CREATOR = new android.os.Parcelable.Creator<com.bytedance.adsdk.IL.ldr.bX>() { // from class: com.bytedance.adsdk.IL.ldr.bX.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.ldr.bX createFromParcel(android.os.Parcel parcel) {
                return new com.bytedance.adsdk.IL.ldr.bX(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.adsdk.IL.ldr.bX[] newArray(int i) {
                return new com.bytedance.adsdk.IL.ldr.bX[i];
            }
        };
        int IL;
        float bX;
        java.lang.String bg;
        boolean eqN;
        int iR;
        int ldr;
        java.lang.String zx;

        bX(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private bX(android.os.Parcel parcel) {
            super(parcel);
            this.bg = parcel.readString();
            this.bX = parcel.readFloat();
            this.eqN = parcel.readInt() == 1;
            this.zx = parcel.readString();
            this.ldr = parcel.readInt();
            this.iR = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.bg);
            parcel.writeFloat(this.bX);
            parcel.writeInt(this.eqN ? 1 : 0);
            parcel.writeString(this.zx);
            parcel.writeInt(this.ldr);
            parcel.writeInt(this.iR);
        }
    }

    public void setLottieClicklistener(com.bytedance.adsdk.IL.ldr.IL il) {
        this.DDQ = il;
    }

    public void setLottieAnimListener(com.bytedance.adsdk.IL.ldr.bg bgVar) {
        this.Uq = bgVar;
    }
}
