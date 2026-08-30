package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0005\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0017"}, d2 = {"Lcom/ironsource/oi;", "", "Ljava/lang/Runnable;", "runnable", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "callback", "b", "", "Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "adFormats", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "(Ljava/util/List;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/ir;", "error", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "", "duration", "Lcom/ironsource/hs$a;", "responseOrigin", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class oi {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3120a;

        static {
            int[] iArr = new int[com.unity3d.ironsourceads.IronSourceAds.AdFormat.values().length];
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ironsourceads.IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3120a = iArr;
        }
    }

    public final com.json.mediationsdk.logger.IronSourceError a(com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() == 2070 || error.c() == 2110) {
            return com.json.tb.f3430a.b();
        }
        if (error.c() == 2080 || error.c() == 2100) {
            return com.json.tb.f3430a.c();
        }
        return error.c() == 2090 ? com.json.tb.f3430a.a() : new com.json.mediationsdk.logger.IronSourceError(510, error.d());
    }

    public final void a(long duration, com.ironsource.hs.a responseOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, responseOrigin.a());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    public final void a(com.json.ir error, long duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            mediationAdditionalData.put("reason", error.d());
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_FAILED, mediationAdditionalData));
    }

    public final void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.json.cg.a(com.json.cg.f2559a, runnable, 0L, 2, (java.lang.Object) null);
    }

    public final com.ironsource.mediationsdk.IronSource.AD_UNIT[] a(java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> adFormats) {
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = com.ironsource.oi.a.f3120a[it.next().ordinal()];
            if (i == 1) {
                ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
            } else if (i == 2) {
                ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i == 3) {
                ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) arrayList.toArray(new com.ironsource.mediationsdk.IronSource.AD_UNIT[0]);
    }

    public final void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.json.cg.f2559a.a(callback);
    }
}
