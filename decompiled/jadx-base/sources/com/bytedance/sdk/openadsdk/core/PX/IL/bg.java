package com.bytedance.sdk.openadsdk.core.PX.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.PX.IL.bX implements java.lang.Comparable<com.bytedance.sdk.openadsdk.core.PX.IL.bg> {
    public long bg;

    protected bg(long j, java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX enumC0135bX, java.lang.Boolean bool) {
        super(str, enumC0135bX, bool);
        this.bg = j;
    }

    public static int bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        java.lang.String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((java.lang.Integer.parseInt(strArrSplit[0]) * 60 * 60 * 1000) + (java.lang.Integer.parseInt(strArrSplit[1]) * 60 * 1000) + (java.lang.Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (java.lang.Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean bg(long j) {
        return this.bg <= j && !zx();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.openadsdk.core.PX.IL.bg bgVar) {
        if (bgVar == null) {
            return 1;
        }
        long j = this.bg;
        long j2 = bgVar.bg;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bg$bg, reason: collision with other inner class name */
    public static class C0136bg {
        private final long IL;
        private final java.lang.String bg;
        private com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX bX = com.bytedance.sdk.openadsdk.core.PX.IL.bX.EnumC0135bX.TRACKING_URL;
        private boolean eqN = false;

        public C0136bg(java.lang.String str, long j) {
            this.bg = str;
            this.IL = j;
        }

        public com.bytedance.sdk.openadsdk.core.PX.IL.bg bg() {
            return new com.bytedance.sdk.openadsdk.core.PX.IL.bg(this.IL, this.bg, this.bX, java.lang.Boolean.valueOf(this.eqN));
        }
    }

    public org.json.JSONObject bg() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("content", bX());
        jSONObject.put("trackingMilliseconds", this.bg);
        return jSONObject;
    }
}
