package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sr;", "", "", "c", "Lcom/ironsource/ir;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ir;", "()Lcom/ironsource/ir;", "error", "Lcom/ironsource/or;", "b", "Lcom/ironsource/or;", "()Lcom/ironsource/or;", "sdkInitResponse", "<init>", "(Lcom/ironsource/ir;)V", "(Lcom/ironsource/or;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.ir error;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.or sdkInitResponse;

    public sr(com.json.ir error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.sdkInitResponse = null;
    }

    public sr(com.json.or sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.sdkInitResponse = sdkInitResponse;
        this.error = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.ir getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.or getSdkInitResponse() {
        return this.sdkInitResponse;
    }

    public final boolean c() {
        com.json.or orVar;
        if (this.error == null && (orVar = this.sdkInitResponse) != null) {
            return orVar.getFullResponse().p();
        }
        return false;
    }
}
