package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/pk;", "Lcom/ironsource/gs;", "Lorg/json/JSONObject;", "b", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/gs;", "serverResponse", "<init>", "(Lcom/ironsource/gs;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pk implements com.json.gs<org.json.JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.gs<java.lang.String> serverResponse;

    public pk(com.json.gs<java.lang.String> serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.serverResponse = serverResponse;
    }

    @Override // com.json.gs
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a() {
        return new org.json.JSONObject(this.serverResponse.a());
    }
}
