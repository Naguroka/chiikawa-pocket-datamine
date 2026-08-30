package com.unity3d.mediation;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lcom/unity3d/mediation/a;", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.unity3d.mediation.a f3849a = new com.unity3d.mediation.a();

    /* JADX INFO: renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class C0262a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3850a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f3850a = iArr;
        }
    }

    private a() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.mediationsdk.IronSource.AD_UNIT a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = com.unity3d.mediation.a.C0262a.f3850a[adFormat.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 4) {
            return com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
