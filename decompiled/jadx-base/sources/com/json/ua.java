package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0003\u0010\u0007R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\u000b\u0010\u0007R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010\"\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/ua;", "", "", "b", "Z", "c", "()Z", "(Z)V", "shouldUseAppSet", "shouldUseAdvertisingId", "d", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "shouldReuseAdvertisingId", "", "e", "I", "()I", "(I)V", "userAgentExpirationThresholdInHours", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.ua f3466a = new com.json.ua();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean shouldUseAppSet = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean shouldUseAdvertisingId = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static boolean shouldReuseAdvertisingId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static int userAgentExpirationThresholdInHours;

    private ua() {
    }

    public final void a(int i) {
        userAgentExpirationThresholdInHours = i;
    }

    public final void a(boolean z) {
        shouldReuseAdvertisingId = z;
    }

    public final boolean a() {
        return shouldReuseAdvertisingId;
    }

    public final void b(boolean z) {
        shouldUseAdvertisingId = z;
    }

    public final boolean b() {
        return shouldUseAdvertisingId;
    }

    public final void c(boolean z) {
        shouldUseAppSet = z;
    }

    public final boolean c() {
        return shouldUseAppSet;
    }

    public final int d() {
        return userAgentExpirationThresholdInHours;
    }
}
