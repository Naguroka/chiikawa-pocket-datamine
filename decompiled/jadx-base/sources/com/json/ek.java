package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/ek;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Ljava/lang/Thread;", "newThread", "Ljava/util/concurrent/atomic/AtomicInteger;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final class ek implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(java.util.Locale.ENGLISH, "%s-%d", java.util.Arrays.copyOf(new java.lang.Object[]{"IronSourceThread", java.lang.Integer.valueOf(this.counter.incrementAndGet())}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return new java.lang.Thread(r, str);
    }
}
