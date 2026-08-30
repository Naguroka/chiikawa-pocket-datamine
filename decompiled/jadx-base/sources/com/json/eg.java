package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/eg;", "Lcom/ironsource/k4;", "Lcom/ironsource/ik;", "observer", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class eg implements com.json.k4 {
    @Override // com.json.k4
    public void a(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.json.lifecycle.b.d().a(observer);
    }

    @Override // com.json.k4
    public void b(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.json.lifecycle.b.d().b(observer);
    }
}
