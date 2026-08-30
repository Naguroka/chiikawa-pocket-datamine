package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/xs;", "Lcom/ironsource/hm;", "Lcom/ironsource/rs;", "Lcom/ironsource/u;", "input", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xs implements com.json.hm<com.json.rs, com.json.u> {
    @Override // com.json.hm
    public com.json.u a(com.json.rs input) {
        com.json.dg adProvider;
        java.lang.String strC;
        java.lang.String strG;
        java.lang.String strI;
        java.lang.String advertiserBundleId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        com.json.ys ysVarB = input.b();
        com.json.l0 adInternalInfo = input.getAdInternalInfo();
        java.lang.String str = (adInternalInfo == null || (advertiserBundleId = adInternalInfo.getAdvertiserBundleId()) == null) ? "0" : advertiserBundleId;
        com.json.l0 adInternalInfo2 = input.getAdInternalInfo();
        java.lang.String str2 = (adInternalInfo2 == null || (strI = adInternalInfo2.i()) == null) ? "0" : strI;
        com.json.l0 adInternalInfo3 = input.getAdInternalInfo();
        java.lang.String str3 = (adInternalInfo3 == null || (strG = adInternalInfo3.g()) == null) ? "0" : strG;
        com.json.l0 adInternalInfo4 = input.getAdInternalInfo();
        if (adInternalInfo4 == null || (adProvider = adInternalInfo4.getAdProvider()) == null) {
            adProvider = com.json.dg.UnknownProvider;
        }
        com.json.dg dgVar = adProvider;
        com.json.l0 adInternalInfo5 = input.getAdInternalInfo();
        if (adInternalInfo5 == null || (strC = adInternalInfo5.c()) == null) {
            strC = "0";
        }
        return new com.json.u(ysVarB, str, str2, str3, dgVar, strC);
    }
}
