package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/bg;", "", "", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bg {
    public final java.lang.String a() {
        java.lang.String OMID_LIB_VERSION = com.json.Cdo.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    public final java.lang.String b() {
        return com.json.Cdo.e;
    }

    public final java.lang.String c() {
        java.lang.String sDKVersion = com.json.sdk.utils.SDKUtils.getSDKVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
