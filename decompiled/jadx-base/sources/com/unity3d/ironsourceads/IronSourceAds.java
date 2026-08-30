package com.unity3d.ironsourceads;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lcom/unity3d/ironsourceads/IronSourceAds;", "", "()V", com.ironsource.y8.a.f, "", "context", "Landroid/content/Context;", "initRequest", "Lcom/unity3d/ironsourceads/InitRequest;", "initializationListener", "Lcom/unity3d/ironsourceads/InitListener;", "AdFormat", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IronSourceAds {
    public static final com.unity3d.ironsourceads.IronSourceAds INSTANCE = new com.unity3d.ironsourceads.IronSourceAds();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.json.mediationsdk.l.f2983a, "INTERSTITIAL", "REWARDED", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        AdFormat(java.lang.String str) {
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }
    }

    private IronSourceAds() {
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context, com.unity3d.ironsourceads.InitRequest initRequest, com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        com.json.pj.f3163a.a(context, initRequest, initializationListener);
    }
}
