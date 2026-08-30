package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/dv;", "", "", "lastUpdateTimeInMills", "expirationThresholdInMillis", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "<init>", "(Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    public dv(com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.currentTimeProvider = currentTimeProvider;
    }

    public final boolean a(long lastUpdateTimeInMills, long expirationThresholdInMillis) {
        long jA = this.currentTimeProvider.a();
        return expirationThresholdInMillis <= 0 || lastUpdateTimeInMills <= 0 || jA < lastUpdateTimeInMills || jA - lastUpdateTimeInMills > expirationThresholdInMillis;
    }
}
