package com.json;

/* JADX INFO: renamed from: com.ironsource.je, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/os/Handler;", "Lcom/ironsource/ie$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class Handler {

    /* JADX INFO: renamed from: com.ironsource.je$a */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/ironsource/je$a", "Lcom/ironsource/ie$a;", "Ljava/lang/Runnable;", "runnable", "", "delay", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.ironsource.ie.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f2820a;

        a(android.os.Handler handler) {
            this.f2820a = handler;
        }

        @Override // com.ironsource.ie.a
        public void a(java.lang.Runnable runnable, long delay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f2820a.postDelayed(runnable, delay);
        }
    }

    public static final com.ironsource.ie.a a(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "<this>");
        return new com.json.Handler.a(handler);
    }
}
