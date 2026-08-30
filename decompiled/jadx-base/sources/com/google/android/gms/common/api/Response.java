package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public Response() {
    }

    protected Response(T t) {
        this.zza = t;
    }

    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t) {
        this.zza = t;
    }
}
