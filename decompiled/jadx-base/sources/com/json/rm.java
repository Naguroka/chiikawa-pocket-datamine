package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0006H&R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0007\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/ironsource/rm;", "", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "loadParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "destroy", "Lcom/ironsource/ph;", "viewHolder", "Lcom/ironsource/mv;", "viewVisibilityParams", "clickParams", "b", "Lcom/ironsource/rm$a;", "()Lcom/ironsource/rm$a;", "(Lcom/ironsource/rm$a;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface rm {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/rm$a;", "", "Lcom/ironsource/mh;", "adData", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "reason", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();

        void a(com.json.mh adData);

        void a(java.lang.String reason);

        void c();
    }

    com.ironsource.rm.a a();

    void a(android.app.Activity activity, org.json.JSONObject loadParams);

    void a(com.json.mv viewVisibilityParams);

    void a(com.json.ph viewHolder);

    void a(com.ironsource.rm.a aVar);

    void a(org.json.JSONObject clickParams);

    void b();

    void destroy();
}
