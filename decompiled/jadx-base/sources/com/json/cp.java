package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H&R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\u0005\u0010\bR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/ironsource/cp;", "", "", "b", "Lcom/ironsource/dp;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/dp;", "()Lcom/ironsource/dp;", "(Lcom/ironsource/dp;)V", "countdown", "", "<set-?>", "J", "c", "()J", "pausedTimeStamp", "", "value", "Z", "d", "()Z", "(Z)V", "isPaused", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.dp countdown;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long pausedTimeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isPaused;

    public cp() {
        this(false, 1, null);
    }

    public cp(boolean z) {
        this.isPaused = z;
    }

    public /* synthetic */ cp(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.dp getCountdown() {
        return this.countdown;
    }

    public final void a(com.json.dp dpVar) {
        this.countdown = dpVar;
    }

    public final void a(boolean z) {
        this.isPaused = z;
        if (!z) {
            com.json.dp dpVar = this.countdown;
            if (dpVar != null) {
                dpVar.b(this);
                return;
            }
            return;
        }
        this.pausedTimeStamp = java.lang.System.currentTimeMillis();
        com.json.dp dpVar2 = this.countdown;
        if (dpVar2 != null) {
            dpVar2.a(this);
        }
    }

    public abstract java.lang.String b();

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPausedTimeStamp() {
        return this.pausedTimeStamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }
}
