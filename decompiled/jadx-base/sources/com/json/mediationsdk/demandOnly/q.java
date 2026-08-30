package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0003\u0004J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q;", "", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface q {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q$a;", "", "Lcom/ironsource/mediationsdk/demandOnly/h;", "loadParams", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/lang/String;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String adFormat;

        public a(java.lang.String adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        public final com.json.mediationsdk.logger.IronSourceError a(com.json.mediationsdk.demandOnly.h loadParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            com.ironsource.mediationsdk.demandOnly.h.b bVar = (com.ironsource.mediationsdk.demandOnly.h.b) loadParams;
            if (bVar.getActivity() == null) {
                return new com.json.mediationsdk.logger.IronSourceError(1060, this.adFormat + " was initialized and loaded without Activity");
            }
            if (bVar.getBanner() == null) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing banner layout");
            }
            if (bVar.getBanner().isDestroyed()) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Banner layout is destroyed");
            }
            com.json.mediationsdk.ISBannerSize size = bVar.getBanner().getSize();
            if (size == null) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing banner size");
            }
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.getInstanceId() == null) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing instance Id");
            }
            java.lang.String strB = bVar.getAdMarkup();
            if ((strB == null || strB.length() == 0) && loadParams.getBidding()) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q$b;", "", "Lcom/ironsource/mediationsdk/demandOnly/h$d;", "loadParams", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Ljava/lang/String;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String adFormat;

        public b(java.lang.String adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        public final com.json.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.demandOnly.h.d loadParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.getActivity() == null) {
                return new com.json.mediationsdk.logger.IronSourceError(1060, this.adFormat + " was initialized and loaded without Activity");
            }
            if (loadParams.getInstanceId() == null) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing instance Id");
            }
            java.lang.String strB = loadParams.getAdMarkup();
            if ((strB == null || strB.length() == 0) && loadParams.getBidding()) {
                return new com.json.mediationsdk.logger.IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    com.json.mediationsdk.logger.IronSourceError a();
}
