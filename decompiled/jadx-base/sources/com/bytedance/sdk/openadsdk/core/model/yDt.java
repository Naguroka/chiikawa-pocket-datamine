package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class yDt implements com.bytedance.sdk.component.adexpress.bX {
    public final float IL;
    public final int Kg;
    public final boolean Lq;
    public int PX;
    public org.json.JSONObject Ta;
    public final java.lang.String VB;
    public boolean VzQ;
    public final int WR;
    public final float bX;
    public final float bg;
    public final int eo;
    public final float eqN;
    public final int iR;
    public final long ldr;
    public int vb;
    public org.json.JSONObject xxp;
    public android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> yDt;
    public final long zx;

    private yDt(com.bytedance.sdk.openadsdk.core.model.yDt.bg bgVar) {
        this.VzQ = false;
        this.bg = bgVar.iR;
        this.IL = bgVar.ldr;
        this.bX = bgVar.zx;
        this.eqN = bgVar.eqN;
        this.zx = bgVar.bX;
        this.ldr = bgVar.IL;
        this.iR = bgVar.Kg;
        this.Kg = bgVar.WR;
        this.WR = bgVar.eo;
        this.eo = bgVar.VB;
        this.VB = bgVar.PX;
        this.yDt = bgVar.bg;
        this.Lq = bgVar.VzQ;
        this.PX = bgVar.Ta;
        this.Ta = bgVar.yDt;
        this.vb = bgVar.Lq;
        this.xxp = bgVar.vb;
        this.VzQ = bgVar.xxp;
    }

    public static class bg {
        private long IL;
        private int Kg;
        private int Lq;
        private java.lang.String PX;
        private int Ta;
        private int VB;
        private boolean VzQ;
        private int WR;
        private long bX;
        private int eo;
        private float eqN;
        private float iR;
        private float ldr;
        private org.json.JSONObject vb;
        private org.json.JSONObject yDt;
        private float zx;
        private boolean xxp = false;
        protected android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> bg = new android.util.SparseArray<>();

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(int i) {
            this.Lq = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg IL(int i) {
            this.Ta = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(org.json.JSONObject jSONObject) {
            this.yDt = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(boolean z) {
            this.VzQ = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(long j) {
            this.IL = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg IL(long j) {
            this.bX = j;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(float f) {
            this.eqN = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg IL(float f) {
            this.zx = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bX(float f) {
            this.ldr = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg eqN(float f) {
            this.iR = f;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bX(int i) {
            this.Kg = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg eqN(int i) {
            this.WR = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg zx(int i) {
            this.eo = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg ldr(int i) {
            this.VB = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(java.lang.String str) {
            this.PX = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg bg(android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray) {
            this.bg = sparseArray;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg IL(org.json.JSONObject jSONObject) {
            this.vb = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt.bg IL(boolean z) {
            this.xxp = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.core.model.yDt bg() {
            return new com.bytedance.sdk.openadsdk.core.model.yDt(this);
        }
    }
}
