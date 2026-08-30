package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR*\u0010\u0013\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u0011\u0012\b\u0012\u00060\u0002j\u0002`\b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R*\u0010\u0016\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u0011\u0012\b\u0012\u00060\tj\u0002`\u00140\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ironsource/ft;", "Lcom/ironsource/zh;", "", "count", "", "identifier", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/services/capping/showcount/ShowCount;", "", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "threshold", "Lcom/ironsource/d8;", "Lcom/ironsource/d8;", com.ironsource.y8.a.k, "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/services/capping/Identifier;", "Ljava/util/concurrent/ConcurrentHashMap;", "showCountCache", "Lcom/ironsource/services/capping/showcount/TimeThreshold;", "c", "timeThresholdCache", "<init>", "(Lcom/ironsource/d8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ft implements com.json.zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.d8 storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> showCountCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> timeThresholdCache;

    public ft(com.json.d8 storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.showCountCache = new java.util.concurrent.ConcurrentHashMap<>();
        this.timeThresholdCache = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.json.zh
    public int a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Integer num = this.showCountCache.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        java.lang.Integer numC = this.storage.c(identifier);
        if (numC == null) {
            this.showCountCache.put(identifier, 0);
            return 0;
        }
        int iIntValue = numC.intValue();
        this.showCountCache.put(identifier, java.lang.Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // com.json.zh
    public void a(int count, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.showCountCache.put(identifier, java.lang.Integer.valueOf(count));
        this.storage.a(identifier, count);
    }

    @Override // com.json.zh
    public void a(long threshold, java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.timeThresholdCache.put(identifier, java.lang.Long.valueOf(threshold));
        this.storage.a(identifier, threshold);
    }

    @Override // com.json.zh
    public java.lang.Long b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        java.lang.Long l = this.timeThresholdCache.get(identifier);
        if (l != null) {
            return l;
        }
        java.lang.Long lA = this.storage.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.timeThresholdCache.put(identifier, java.lang.Long.valueOf(jLongValue));
        return java.lang.Long.valueOf(jLongValue);
    }
}
