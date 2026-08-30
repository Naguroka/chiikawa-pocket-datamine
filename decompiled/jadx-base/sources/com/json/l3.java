package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\t\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/l3;", "Lcom/ironsource/m3;", "Lcom/ironsource/i3;", "eventBaseData", "Lcom/ironsource/n3;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class l3 implements com.json.m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2873a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2873a = iArr;
        }
    }

    public l3(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.adFormat = adFormat;
    }

    @Override // com.json.m3
    public com.json.n3 a(com.json.i3 eventBaseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = com.ironsource.l3.a.f2873a[this.adFormat.ordinal()];
        if (i == 1) {
            return new com.json.gj(eventBaseData);
        }
        if (i == 2) {
            return new com.json.tq(eventBaseData);
        }
        if (i == 3) {
            return new com.json.o6(eventBaseData);
        }
        throw new java.lang.IllegalArgumentException("Unsupported ad format: " + this.adFormat);
    }
}
