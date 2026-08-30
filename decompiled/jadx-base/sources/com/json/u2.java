package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/u2;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lcom/ironsource/ce$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.u2 f3458a = new com.json.u2();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3459a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f3459a = iArr;
        }
    }

    private u2() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.ce.a a(com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = com.ironsource.u2.a.f3459a[adUnit.ordinal()];
        if (i == 1) {
            return com.ironsource.ce.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return com.ironsource.ce.a.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.ce.a.BANNER;
        }
        if (i == 4) {
            return com.ironsource.ce.a.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
