package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.component.WR.bX {
    private final com.bytedance.sdk.openadsdk.core.zx.Kg Lq;
    private final com.bytedance.sdk.openadsdk.core.zx.bX Ta;
    private final com.bytedance.sdk.openadsdk.core.zx.eqN vb;
    private final com.bytedance.sdk.openadsdk.core.zx.zx xxp;
    private final com.bytedance.sdk.openadsdk.core.widget.xxp yDt;

    public eqN(android.content.Context context) {
        super(context);
        setId(520093753);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 9.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f);
        this.PX = new com.bytedance.sdk.openadsdk.core.widget.bX(context);
        this.PX.setPadding(iBX2, 0, iBX2, 0);
        this.PX.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 32.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iBX3, iBX3);
        this.PX.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        this.Ta = bXVar;
        bXVar.setBackgroundColor(-1);
        bXVar.setId(520093758);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 107.0f));
        layoutParams2.addRule(12);
        bXVar.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(0);
        zxVar.setGravity(16);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        zxVar.setLayoutParams(layoutParams3);
        bXVar.addView(zxVar);
        this.ldr = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.ldr.setId(520093759);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(iBX4, iBX4);
        layoutParams4.rightMargin = iBX;
        layoutParams4.setMarginEnd(iBX);
        this.ldr.setLayoutParams(layoutParams4);
        this.iR = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.iR.setId(520093761);
        this.iR.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.iR.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.iR.setMaxLines(2);
        this.iR.setTextColor(android.graphics.Color.parseColor("#161823"));
        this.iR.setTextSize(30.0f);
        zxVar.addView(this.ldr);
        zxVar.addView(this.iR);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, bXVar.getId());
        layoutParams5.addRule(10);
        bXVar2.setLayoutParams(layoutParams5);
        this.bg = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.bg.setId(520093754);
        this.bg.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        bXVar2.addView(this.bg, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.IL = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        this.IL.setId(520093755);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        bXVar2.addView(this.IL, layoutParams6);
        this.bX = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.bX.setId(520093756);
        bXVar2.addView(this.bX, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.zx = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.zx.setId(520093717);
        this.zx.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, android.graphics.Color.parseColor("#b3000000"), 24));
        this.zx.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.zx.setGravity(17);
        this.zx.setSingleLine(true);
        this.zx.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        this.zx.setTextColor(-1);
        this.zx.setTextSize(1, 16.0f);
        this.zx.setTag("open_ad_click_button_tag");
        android.widget.FrameLayout.LayoutParams layoutParams7 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 236.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 32.0f);
        bXVar2.addView(this.zx, layoutParams7);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        this.xxp = zxVar2;
        zxVar2.setOrientation(0);
        zxVar2.setGravity(16);
        zxVar2.setBackground(new com.bytedance.sdk.openadsdk.component.WR.eqN.bg(context));
        zxVar2.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f));
        android.widget.RelativeLayout.LayoutParams layoutParams8 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 90.0f);
        zxVar2.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.vb = vzQ;
        zxVar2.addView(vzQ, new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar3.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar2.addView(zxVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.Lq = kg;
        kg.setTextColor(-1);
        zxVar3.addView(kg, new android.widget.LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context, true);
        this.yDt = xxpVar;
        zxVar3.addView(xxpVar, new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.eqN = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        this.eqN.setId(520093757);
        android.widget.FrameLayout.LayoutParams layoutParams10 = new android.widget.FrameLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams10.gravity = 83;
        bXVar2.addView(this.eqN, layoutParams10);
        addView(bXVar2);
        addView(this.PX);
        addView(bXVar);
        addView(this.Kg);
        addView(zxVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public android.view.View getUserInfo() {
        return this.Ta;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.Kg getAdTitleTextView() {
        return this.Lq;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.eqN getAdIconView() {
        return this.vb;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.widget.xxp getScoreBar() {
        return this.yDt;
    }

    private static final class bg extends android.graphics.drawable.Drawable {
        private final boolean eqN;
        private static final int zx = android.graphics.Color.parseColor("#b0000000");
        private static final int ldr = android.graphics.Color.parseColor("#40000000");
        private final android.graphics.RectF bg = new android.graphics.RectF();
        private final android.graphics.Paint IL = new android.graphics.Paint();
        private final android.graphics.Path bX = new android.graphics.Path();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        }

        public bg(android.content.Context context) {
            this.eqN = com.bytedance.sdk.component.adexpress.eqN.IL.bg(context);
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(android.graphics.Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.bg.set(rect);
            this.bX.reset();
            int iHeight = rect.height() / 2;
            android.graphics.Path path = this.bX;
            android.graphics.RectF rectF = this.bg;
            if (this.eqN) {
                float f = iHeight;
                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            } else {
                float f2 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
            float f3 = rect.right;
            int[] iArr = new int[2];
            boolean z = this.eqN;
            iArr[0] = z ? ldr : zx;
            iArr[1] = z ? zx : ldr;
            this.IL.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f3, 0.0f, iArr, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            canvas.drawPath(this.bX, this.IL);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.zx getOverlayLayout() {
        return this.xxp;
    }
}
