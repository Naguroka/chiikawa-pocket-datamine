package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/hd;", "Lcom/ironsource/g0;", "Lcom/ironsource/fd;", "fullscreenAdInstance", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class hd implements com.json.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.app.Activity activity;

    public hd(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    @Override // com.json.g0
    public void a(com.json.fd fullscreenAdInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.activity);
    }
}
