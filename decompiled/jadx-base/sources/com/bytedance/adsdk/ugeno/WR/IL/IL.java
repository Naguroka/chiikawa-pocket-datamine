package com.bytedance.adsdk.ugeno.WR.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.IL.bg<com.bytedance.adsdk.ugeno.WR.IL.bg> {
    private com.bytedance.adsdk.ugeno.WR.IL.bg IL;

    public IL(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: Pae, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.WR.IL.bg eqN() {
        com.bytedance.adsdk.ugeno.WR.IL.bg bgVar = new com.bytedance.adsdk.ugeno.WR.IL.bg(this.bX);
        this.IL = bgVar;
        bgVar.bg(this);
        return this.IL;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        this.IL.setEventMap(this.jf);
        super.IL();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    public com.bytedance.adsdk.ugeno.IL.bg.C0081bg bX() {
        return new com.bytedance.adsdk.ugeno.WR.IL.IL.bg();
    }

    public static class bg extends com.bytedance.adsdk.ugeno.IL.bg.C0081bg {
        protected int tC = -1;

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        public void bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            super.bg(context, str, str2);
            if (android.text.TextUtils.equals(str, "layoutGravity")) {
                this.tC = bg(str2);
            }
        }

        private int bg(java.lang.String str) {
            java.lang.String[] strArrSplit;
            if (android.text.TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iIL = 0;
            for (java.lang.String str2 : strArrSplit) {
                iIL |= IL(str2);
            }
            return iIL;
        }

        private int IL(java.lang.String str) {
            str.hashCode();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
        public android.widget.FrameLayout.LayoutParams bg() {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) this.bg, (int) this.IL);
            layoutParams.leftMargin = (int) this.eqN;
            layoutParams.rightMargin = (int) this.zx;
            layoutParams.topMargin = (int) this.ldr;
            layoutParams.bottomMargin = (int) this.iR;
            layoutParams.gravity = this.tC;
            return layoutParams;
        }
    }
}
