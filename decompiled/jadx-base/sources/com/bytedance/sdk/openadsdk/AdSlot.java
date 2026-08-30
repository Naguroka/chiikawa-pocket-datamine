package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private java.util.Map<java.lang.String, java.lang.Object> DDQ;
    private int Fy;
    private int IL;
    private android.os.Bundle JAA;
    private java.lang.String Ja;
    private java.lang.String Kg;
    private int LZ;
    private java.lang.String Lq;
    private int PX;
    private boolean Ta;
    private boolean Uw;
    private java.lang.String VB;
    private java.lang.String VzQ;
    private int WR;
    private int bX;
    private java.lang.String bg;
    private java.lang.String eo;
    private float eqN;
    private boolean iR;
    private org.json.JSONArray kMt;
    private int ldr;
    private int rri;
    private int tC;
    private java.lang.String tuV;
    private java.lang.String vb;
    private java.lang.String xxp;
    private boolean yDt;
    private float zx;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.Ta = true;
        this.yDt = false;
        this.Fy = 0;
        this.LZ = 0;
        this.tC = 0;
    }

    public void setUserData(java.lang.String str) {
        this.tuV = str;
    }

    public java.lang.String getUserData() {
        return this.tuV;
    }

    public java.lang.String getCodeId() {
        return this.bg;
    }

    public boolean isAutoPlay() {
        return this.Ta;
    }

    public boolean isExpressAd() {
        return this.yDt;
    }

    public java.lang.String getBidAdm() {
        return this.Lq;
    }

    public int getImgAcceptedWidth() {
        return this.IL;
    }

    public int getImgAcceptedHeight() {
        return this.bX;
    }

    public float getExpressViewAcceptedWidth() {
        return this.eqN;
    }

    public float getExpressViewAcceptedHeight() {
        return this.zx;
    }

    public boolean isSupportDeepLink() {
        return this.iR;
    }

    public int getAdCount() {
        return this.ldr;
    }

    public void setAdCount(int i) {
        this.ldr = i;
    }

    @java.lang.Deprecated
    public java.lang.String getRewardName() {
        return this.Kg;
    }

    @java.lang.Deprecated
    public int getRewardAmount() {
        return this.WR;
    }

    public java.lang.String getMediaExtra() {
        return this.eo;
    }

    public java.lang.String getUserID() {
        return this.VB;
    }

    public int getNativeAdType() {
        return this.PX;
    }

    public void setNativeAdType(int i) {
        this.PX = i;
    }

    public java.lang.String getAdId() {
        return this.vb;
    }

    public java.lang.String getCreativeId() {
        return this.xxp;
    }

    public java.lang.String getExt() {
        return this.VzQ;
    }

    public int getIsRotateBanner() {
        return this.Fy;
    }

    public void setIsRotateBanner(int i) {
        this.Fy = i;
    }

    public int getRotateTime() {
        return this.LZ;
    }

    public void setRotateTime(int i) {
        this.LZ = i;
    }

    public int getRotateOrder() {
        return this.tC;
    }

    public void setRotateOrder(int i) {
        this.tC = i;
    }

    public void setDurationSlotType(int i) {
        this.rri = i;
    }

    public int getDurationSlotType() {
        return this.rri;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getRequestExtraMap() {
        return this.DDQ;
    }

    public org.json.JSONArray getBiddingTokens() {
        return this.kMt;
    }

    public void setBiddingTokens(org.json.JSONArray jSONArray) {
        this.kMt = jSONArray;
    }

    public android.os.Bundle getNetworkExtrasBundle() {
        return this.JAA;
    }

    public java.lang.String getLinkId() {
        return this.Ja;
    }

    public void setPreload(boolean z) {
        this.Uw = z;
    }

    public boolean isPreload() {
        return this.Uw;
    }

    public java.lang.String toString() {
        return super.toString();
    }

    public org.json.JSONObject toJsonObj() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mCodeId", this.bg);
            jSONObject.put("mAdCount", this.ldr);
            jSONObject.put("mIsAutoPlay", this.Ta);
            jSONObject.put("mImgAcceptedWidth", this.IL);
            jSONObject.put("mImgAcceptedHeight", this.bX);
            jSONObject.put("mExpressViewAcceptedWidth", this.eqN);
            jSONObject.put("mExpressViewAcceptedHeight", this.zx);
            jSONObject.put("mSupportDeepLink", this.iR);
            jSONObject.put("mRewardName", this.Kg);
            jSONObject.put("mRewardAmount", this.WR);
            jSONObject.put("mMediaExtra", this.eo);
            jSONObject.put("mUserID", this.VB);
            jSONObject.put("mNativeAdType", this.PX);
            jSONObject.put("mIsExpressAd", this.yDt);
            jSONObject.put("mAdId", this.vb);
            jSONObject.put("mCreativeId", this.xxp);
            jSONObject.put("mExt", this.VzQ);
            jSONObject.put("mBidAdm", this.Lq);
            jSONObject.put("mUserData", this.tuV);
            jSONObject.put("mDurationSlotType", this.rri);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public static com.bytedance.sdk.openadsdk.AdSlot getSlot(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.AdSlot.Builder builder = new com.bytedance.sdk.openadsdk.AdSlot.Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(java.lang.Double.valueOf(dOptDouble).floatValue(), java.lang.Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (java.lang.Exception unused) {
        }
        com.bytedance.sdk.openadsdk.AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public static class Builder {
        private java.lang.String Kg;
        private android.os.Bundle LZ;
        private java.lang.String Lq;
        private float PX;
        private boolean Ta;
        private float VB;
        private java.lang.String VzQ;
        private java.lang.String bg;
        private int eo;
        private int rri;
        private java.lang.String tC;
        private java.lang.String vb;
        private java.lang.String xxp;
        private java.lang.String yDt;
        private int IL = 640;
        private int bX = 320;
        private final boolean eqN = true;
        private int zx = 1;
        private final java.lang.String ldr = "";
        private final int iR = 0;
        private java.lang.String WR = "defaultUser";
        private boolean tuV = true;
        private java.util.Map<java.lang.String, java.lang.Object> Fy = null;

        @java.lang.Deprecated
        public com.bytedance.sdk.openadsdk.AdSlot.Builder setRewardAmount(int i) {
            return this;
        }

        @java.lang.Deprecated
        public com.bytedance.sdk.openadsdk.AdSlot.Builder setRewardName(java.lang.String str) {
            return this;
        }

        @java.lang.Deprecated
        public com.bytedance.sdk.openadsdk.AdSlot.Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setAdId(java.lang.String str) {
            this.Lq = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setCreativeId(java.lang.String str) {
            this.vb = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setExt(java.lang.String str) {
            this.xxp = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setIsAutoPlay(boolean z) {
            this.tuV = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setCodeId(java.lang.String str) {
            this.bg = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder isExpressAd(boolean z) {
            this.Ta = z;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setImageAcceptedSize(int i, int i2) {
            this.IL = i;
            this.bX = i2;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setExpressViewAcceptedSize(float f, float f2) {
            this.VB = f;
            this.PX = f2;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setDurationSlotType(int i) {
            this.rri = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.zx = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setMediaExtra(java.lang.String str) {
            this.Kg = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setUserID(java.lang.String str) {
            this.WR = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setNativeAdType(int i) {
            this.eo = i;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder withBid(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return this;
            }
            if (com.bytedance.sdk.component.utils.PX.eqN()) {
                com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(str);
            }
            this.yDt = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setUserData(java.lang.String str) {
            this.VzQ = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setRequestExtraMap(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.Fy = map;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setNetworkExtrasBundle(android.os.Bundle bundle) {
            this.LZ = bundle;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot.Builder setLinkId(java.lang.String str) {
            this.tC = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.AdSlot build() {
            com.bytedance.sdk.openadsdk.AdSlot adSlot = new com.bytedance.sdk.openadsdk.AdSlot();
            adSlot.bg = this.bg;
            adSlot.ldr = this.zx;
            adSlot.iR = true;
            adSlot.IL = this.IL;
            adSlot.bX = this.bX;
            float f = this.VB;
            if (f <= 0.0f) {
                adSlot.eqN = this.IL;
                adSlot.zx = this.bX;
            } else {
                adSlot.eqN = f;
                adSlot.zx = this.PX;
            }
            adSlot.Kg = "";
            adSlot.WR = 0;
            adSlot.eo = this.Kg;
            adSlot.VB = this.WR;
            adSlot.PX = this.eo;
            adSlot.Ta = this.tuV;
            adSlot.yDt = this.Ta;
            adSlot.Lq = this.yDt;
            adSlot.vb = this.Lq;
            adSlot.xxp = this.vb;
            adSlot.VzQ = this.xxp;
            adSlot.tuV = this.VzQ;
            adSlot.DDQ = this.Fy;
            adSlot.Ja = this.tC;
            adSlot.rri = this.rri;
            return adSlot;
        }
    }
}
