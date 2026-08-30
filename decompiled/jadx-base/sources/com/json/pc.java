package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ironsource/pc;", "Lcom/ironsource/pf;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pc implements com.json.pf {
    @Override // com.json.pf
    public boolean a() {
        try {
            androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
