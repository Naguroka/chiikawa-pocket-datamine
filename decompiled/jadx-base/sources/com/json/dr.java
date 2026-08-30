package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/ironsource/dr;", "Ljava/lang/Runnable;", "", "run", "", "t", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class dr implements java.lang.Runnable {
    public abstract void a() throws java.lang.Exception;

    public void a(java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        com.json.rt.a(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            try {
                a(th);
            } catch (java.lang.Throwable th2) {
                com.json.l9.d().a(th2);
            }
        }
    }
}
