package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0011\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0011\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/o7;", "Lcom/ironsource/b3;", "Lcom/ironsource/up;", "providerName", "Lcom/ironsource/pi;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/p8;", "Lcom/ironsource/p8;", "adFormatConfigurations", "Lcom/ironsource/yp;", "b", "Lcom/ironsource/yp;", "providerSettingsHolder", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "c", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "<init>", "(Lcom/ironsource/p8;Lcom/ironsource/yp;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class o7 implements com.json.b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.p8 adFormatConfigurations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.yp providerSettingsHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3112a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3112a = iArr;
        }
    }

    public o7(com.json.p8 adFormatConfigurations, com.json.yp ypVar, com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.adFormatConfigurations = adFormatConfigurations;
        this.providerSettingsHolder = ypVar;
        this.adFormat = adFormat;
    }

    @Override // com.json.b3
    public com.json.pi a(com.json.up providerName) {
        com.json.mediationsdk.model.NetworkSettings networkSettingsB;
        com.json.uq rewardedVideoConfigurations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        com.json.yp ypVar = this.providerSettingsHolder;
        if (ypVar == null || (networkSettingsB = ypVar.b(providerName.value())) == null) {
            return null;
        }
        int i = com.ironsource.o7.a.f3112a[this.adFormat.ordinal()];
        if (i == 1) {
            com.json.r6 bannerConfigurations = this.adFormatConfigurations.getBannerConfigurations();
            if (bannerConfigurations != null) {
                return new com.json.w6(new com.json.z2(networkSettingsB, networkSettingsB.getBannerSettings(), this.adFormat), bannerConfigurations);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (rewardedVideoConfigurations = this.adFormatConfigurations.getRewardedVideoConfigurations()) != null) {
                return new com.json.hq(new com.json.z2(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.adFormat), rewardedVideoConfigurations);
            }
            return null;
        }
        com.json.hj interstitialConfigurations = this.adFormatConfigurations.getInterstitialConfigurations();
        if (interstitialConfigurations != null) {
            return new com.json.kj(new com.json.z2(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.adFormat), interstitialConfigurations);
        }
        return null;
    }
}
