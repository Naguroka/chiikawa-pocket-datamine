package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/js;", "Ljava/lang/Runnable;", "", "run", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "timeInForeground", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class js implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.lang.Long timeInForeground;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Long getTimeInForeground() {
        return this.timeInForeground;
    }

    public final void a(java.lang.Long l) {
        this.timeInForeground = l;
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
