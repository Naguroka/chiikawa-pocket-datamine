package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0004\u0007\u0004\u0003\u0006J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/h;", "Lcom/ironsource/mediationsdk/demandOnly/q;", "", "c", "b", "", "d", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface h extends com.json.mediationsdk.demandOnly.q {

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B#\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/h$a;", "Lcom/ironsource/mediationsdk/demandOnly/h;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "b", "", "d", "Ljava/lang/String;", "instanceId", "adMarkup", "Z", "bidding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a implements com.json.mediationsdk.demandOnly.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String instanceId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.String adMarkup;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean bidding;

        public a(java.lang.String str, java.lang.String str2, boolean z) {
            this.instanceId = str;
            this.adMarkup = str2;
            this.bidding = z;
        }

        @Override // com.json.mediationsdk.demandOnly.q
        public abstract com.json.mediationsdk.logger.IronSourceError a();

        @Override // com.json.mediationsdk.demandOnly.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public java.lang.String getAdMarkup() {
            return this.adMarkup;
        }

        @Override // com.json.mediationsdk.demandOnly.h
        /* JADX INFO: renamed from: c, reason: from getter */
        public java.lang.String getInstanceId() {
            return this.instanceId;
        }

        @Override // com.json.mediationsdk.demandOnly.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getBidding() {
            return this.bidding;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/h$b;", "Lcom/ironsource/mediationsdk/demandOnly/h$a;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "d", "Ljava/lang/String;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Landroid/app/Activity;", "e", "Landroid/app/Activity;", "f", "()Landroid/app/Activity;", "activity", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "g", "()Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "banner", "instanceId", "adMarkup", "", "bidding", "<init>", "(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;Ljava/lang/String;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.ironsource.mediationsdk.demandOnly.h.a {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final java.lang.String adFormat;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final android.app.Activity activity;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String adFormat, android.app.Activity activity, java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str2, boolean z) {
            super(str, str2, z);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
            this.activity = activity;
            this.banner = iSDemandOnlyBannerLayout;
        }

        public /* synthetic */ b(java.lang.String str, android.app.Activity activity, java.lang.String str2, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.json.mediationsdk.demandOnly.q
        public com.json.mediationsdk.logger.IronSourceError a() {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = new com.ironsource.mediationsdk.demandOnly.q.a(this.adFormat).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final android.app.Activity getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout getBanner() {
            return this.banner;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0004\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0004\u001a\u00020\u0010J\u0006\u0010\u0007\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/h$c;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "instanceId", "b", "Landroid/app/Activity;", "activity", "defaultActivity", "", "bidding", "adMarkup", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "banner", "Lcom/ironsource/mediationsdk/demandOnly/h$b;", "Lcom/ironsource/mediationsdk/demandOnly/h$d;", "Ljava/lang/String;", "Landroid/app/Activity;", "c", "d", "Z", "e", "f", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private java.lang.String adFormat = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private android.app.Activity activity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private java.lang.String instanceId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean bidding;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private java.lang.String adMarkup;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner;

        public final com.ironsource.mediationsdk.demandOnly.h.b a() {
            return new com.ironsource.mediationsdk.demandOnly.h.b(this.adFormat, this.activity, this.instanceId, this.banner, this.adMarkup, this.bidding);
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(android.app.Activity activity) {
            this.activity = activity;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(android.app.Activity activity, android.app.Activity defaultActivity) {
            if (activity == null) {
                activity = defaultActivity;
            }
            this.activity = activity;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            java.lang.String string = adFormat.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "adFormat.toString()");
            this.adFormat = string;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner) {
            this.banner = banner;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(java.lang.String adMarkup) {
            this.adMarkup = adMarkup;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(boolean bidding) {
            this.bidding = bidding;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c b(java.lang.String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.d b() {
            return new com.ironsource.mediationsdk.demandOnly.h.d(this.adFormat, this.activity, this.instanceId, this.adMarkup, this.bidding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/h$d;", "Lcom/ironsource/mediationsdk/demandOnly/h$a;", "Lcom/ironsource/k;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "e", "", "d", "Ljava/lang/String;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Landroid/app/Activity;", "activity", "instanceId", "adMarkup", "", "bidding", "<init>", "(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends com.ironsource.mediationsdk.demandOnly.h.a implements com.json.k {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final java.lang.String adFormat;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final android.app.Activity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.String adFormat, android.app.Activity activity, java.lang.String str, java.lang.String str2, boolean z) {
            super(str, str2, z);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
            this.activity = activity;
        }

        public /* synthetic */ d(java.lang.String str, android.app.Activity activity, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.json.mediationsdk.demandOnly.q
        public com.json.mediationsdk.logger.IronSourceError a() {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = new com.ironsource.mediationsdk.demandOnly.q.b(this.adFormat).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.json.k
        /* JADX INFO: renamed from: e, reason: from getter */
        public android.app.Activity getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: renamed from: b */
    java.lang.String getAdMarkup();

    /* JADX INFO: renamed from: c */
    java.lang.String getInstanceId();

    /* JADX INFO: renamed from: d */
    boolean getBidding();
}
