package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0006H&R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u0007\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/ironsource/oh;", "", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "loadParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ph;", "viewHolder", "destroy", "Lcom/ironsource/oh$a;", "()Lcom/ironsource/oh$a;", "(Lcom/ironsource/oh$a;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/mh;", "b", "()Lcom/ironsource/mh;", "adData", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface oh {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/oh$a;", "", "Lcom/ironsource/mh;", "adData", "", "onNativeAdLoadSuccess", "", "reason", "onNativeAdLoadFailed", "onNativeAdClicked", "onNativeAdShown", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(java.lang.String reason);

        void onNativeAdLoadSuccess(com.json.mh adData);

        void onNativeAdShown();
    }

    com.ironsource.oh.a a();

    void a(android.app.Activity activity, org.json.JSONObject loadParams);

    void a(com.ironsource.oh.a aVar);

    void a(com.json.ph viewHolder);

    com.json.mh b();

    void destroy();
}
