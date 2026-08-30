package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OU extends android.widget.ImageView {
    public static java.lang.String[] A04 = {"Kc8JibrER9cs", "6Wp6BEbZPT212ACykXyq", "O0Hoe", "baZKEFvTxoHzeItuM7o3AXmynaYxTYwd", "xn1t1phU", "0uUoxvDF5neMvwmx1nt40mKgR1ymbUJ1", "GF6FLq8961WfPcMwM9rdoNQLfzsndhBQ", "oIRkeIv6PHjnfLhlAQ7Y"};
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final float[] A06 = {A05, A05, A05, A05, A05, A05, A05, A05};
    public boolean A00;
    public float[] A01;
    public final android.graphics.Path A02;
    public final android.graphics.RectF A03;

    public OU(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A01 = A06;
        this.A00 = false;
        this.A02 = new android.graphics.Path();
        this.A03 = new android.graphics.RectF();
        if (android.os.Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int radiusForCircle = java.lang.Math.min(getWidth(), getHeight()) / 2;
        return new float[]{radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle};
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        float[] radiiForCircularImage = this.A00 ? getRadiiForCircularImage() : this.A01;
        android.graphics.Path path = this.A02;
        java.lang.String[] strArr = A04;
        if (strArr[6].charAt(16) != strArr[3].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[6] = "ZxWhoSIa4o5yXhIxMh2nNae8eEoL0rG0";
        strArr2[3] = "aU5wM7Ngl7vhZDd4M0TRPmCvUiPnnlll";
        path.addRoundRect(this.A03, radiiForCircularImage, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z) {
        this.A00 = z;
    }

    public void setRadius(int i) {
        int densityAdjustedRadius = (int) (i * com.facebook.ads.redexgen.core.LP.A02);
        this.A01 = new float[]{densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
