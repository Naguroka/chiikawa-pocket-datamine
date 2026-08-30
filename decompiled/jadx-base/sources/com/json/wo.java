package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR*\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\r\u0012\b\u0012\u00060\u0004j\u0002`\u000e0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/wo;", "Lcom/ironsource/tf;", "", "identifier", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/Long;", "time", "", "Lcom/ironsource/d8;", "Lcom/ironsource/d8;", com.ironsource.y8.a.k, "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/services/capping/Identifier;", "Lcom/ironsource/services/capping/pacing/ShowTime;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "lastShowTimeCache", "<init>", "(Lcom/ironsource/d8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wo implements com.json.tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.d8 storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> lastShowTimeCache;

    public wo(com.json.d8 storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.lastShowTimeCache = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.json.tf
    public java.lang.Long a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Long l = this.lastShowTimeCache.get(identifier);
        if (l != null) {
            return l;
        }
        java.lang.Long lB = this.storage.b(identifier);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.lastShowTimeCache.put(identifier, java.lang.Long.valueOf(jLongValue));
        return java.lang.Long.valueOf(jLongValue);
    }

    @Override // com.json.tf
    public void a(long time, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.lastShowTimeCache.put(identifier, java.lang.Long.valueOf(time));
        this.storage.b(identifier, time);
    }
}
