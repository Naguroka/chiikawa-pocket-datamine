package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class kn extends com.applovin.impl.mn {
    private final com.applovin.impl.sdk.ad.b h;
    private final com.applovin.sdk.AppLovinAdRewardListener i;

    @Override // com.applovin.impl.in
    public java.lang.String f() {
        return "2.0/vr";
    }

    public kn(com.applovin.impl.sdk.ad.b bVar, com.applovin.sdk.AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateAppLovinReward", jVar);
        this.h = bVar;
        this.i = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.mn
    protected void a(com.applovin.impl.eh ehVar) {
        this.h.a(ehVar);
        java.lang.String strB = ehVar.b();
        java.util.Map<java.lang.String, java.lang.String> mapA = ehVar.a();
        if (strB.equals("accepted")) {
            this.i.userRewardVerified(this.h, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.i.userOverQuota(this.h, mapA);
        } else if (strB.equals("rejected")) {
            this.i.userRewardRejected(this.h, mapA);
        } else {
            this.i.validationRequestFailed(this.h, com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.mn
    protected boolean h() {
        return this.h.S0();
    }

    @Override // com.applovin.impl.in
    protected void a(int i) {
        java.lang.String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.i.userRewardRejected(this.h, java.util.Collections.emptyMap());
            str = "rejected";
        } else {
            this.i.validationRequestFailed(this.h, i);
            str = "network_timeout";
        }
        this.h.a(com.applovin.impl.eh.a(str));
    }

    @Override // com.applovin.impl.in
    protected void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.getAdZone().e());
        java.lang.String clCode = this.h.getClCode();
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
