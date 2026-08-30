package com.google.android.material.circularreveal;

/* JADX INFO: loaded from: classes5.dex */
public interface CircularRevealWidget extends com.google.android.material.circularreveal.CircularRevealHelper.Delegate {
    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(android.graphics.Canvas canvas);

    android.graphics.drawable.Drawable getCircularRevealOverlayDrawable();

    int getCircularRevealScrimColor();

    com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo);

    public static class RevealInfo {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        private RevealInfo() {
        }

        public RevealInfo(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public RevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
            this(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }

        public void set(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        public void set(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
            set(revealInfo.centerX, revealInfo.centerY, revealInfo.radius);
        }

        public boolean isInvalid() {
            return this.radius == Float.MAX_VALUE;
        }
    }

    public static class CircularRevealProperty extends android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo> {
        public static final android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo> CIRCULAR_REVEAL = new com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty("circularReveal");

        private CircularRevealProperty(java.lang.String str) {
            super(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo.class, str);
        }

        @Override // android.util.Property
        public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo get(com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealEvaluator implements android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo> {
        public static final android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo> CIRCULAR_REVEAL = new com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator();
        private final com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo();

        @Override // android.animation.TypeEvaluator
        public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo evaluate(float f, com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo, com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo2) {
            this.revealInfo.set(com.google.android.material.math.MathUtils.lerp(revealInfo.centerX, revealInfo2.centerX, f), com.google.android.material.math.MathUtils.lerp(revealInfo.centerY, revealInfo2.centerY, f), com.google.android.material.math.MathUtils.lerp(revealInfo.radius, revealInfo2.radius, f));
            return this.revealInfo;
        }
    }

    public static class CircularRevealScrimColorProperty extends android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> {
        public static final android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty("circularRevealScrimColor");

        private CircularRevealScrimColorProperty(java.lang.String str) {
            super(java.lang.Integer.class, str);
        }

        @Override // android.util.Property
        public java.lang.Integer get(com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget) {
            return java.lang.Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget, java.lang.Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }
}
