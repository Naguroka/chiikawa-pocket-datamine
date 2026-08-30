package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\n\f\rJ7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/na;", "", "Landroid/content/Context;", "context", "", "appKey", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.v2.c, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface na {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&J&\u0010\u0007\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J0\u0010\u0007\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/na$a;", "", "Landroid/app/Activity;", "activity", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "instanceId", "", "c", "banner", "adm", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout a(android.app.Activity activity, com.json.mediationsdk.ISBannerSize size);

        void a(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner, java.lang.String instanceId);

        void a(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout banner, java.lang.String instanceId, java.lang.String adm);

        void c(java.lang.String instanceId);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/na$b;", "", "", "instanceId", "", "f", "Landroid/app/Activity;", "activity", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "adm", "b", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(android.app.Activity activity, java.lang.String instanceId);

        void a(com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener listener);

        void b(android.app.Activity activity, java.lang.String instanceId, java.lang.String adm);

        void b(java.lang.String instanceId);

        boolean f(java.lang.String instanceId);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/na$c;", "", "", "instanceId", "", "j", "Landroid/app/Activity;", "activity", "", "b", "adm", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        void a(android.app.Activity activity, java.lang.String instanceId, java.lang.String adm);

        void a(com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener listener);

        void a(java.lang.String instanceId);

        void b(android.app.Activity activity, java.lang.String instanceId);

        boolean j(java.lang.String instanceId);
    }

    java.lang.String a(android.content.Context context);

    void a(android.content.Context context, java.lang.String appKey, com.ironsource.mediationsdk.IronSource.AD_UNIT... adUnits);
}
