package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/le;", "Lcom/ironsource/me;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/pe;", "b", "J", "timeoutInMills", "Lcom/ironsource/pe;", "recoveryStrategy", "<init>", "(JLcom/ironsource/pe;)V", "Lcom/ironsource/oe;", "feature", "(Lcom/ironsource/oe;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class le implements com.json.me {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeoutInMills;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.pe recoveryStrategy;

    public le(long j, com.json.pe recoveryStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.timeoutInMills = j;
        this.recoveryStrategy = recoveryStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public le(com.json.oe feature) {
        this(feature.a(), feature.b());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
    }

    @Override // com.json.me
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTimeoutInMills() {
        return this.timeoutInMills;
    }

    @Override // com.json.me
    /* JADX INFO: renamed from: b, reason: from getter */
    public com.json.pe getRecoveryStrategy() {
        return this.recoveryStrategy;
    }
}
