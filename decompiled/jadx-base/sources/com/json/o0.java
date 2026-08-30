package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/ironsource/o0;", "Lcom/ironsource/m0;", "Lcom/ironsource/m0$a;", "", com.ironsource.sdk.controller.f.b.AD_ID, "Lcom/ironsource/l0;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "adInfo", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/k1;", "adStatus", "Ljava/util/concurrent/locks/ReadWriteLock;", "Ljava/util/concurrent/locks/ReadWriteLock;", "readWriteLock", "", "b", "Ljava/util/Map;", "adInternalInfoMap", "<init>", "(Ljava/util/concurrent/locks/ReadWriteLock;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class o0 implements com.json.m0, com.ironsource.m0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.concurrent.locks.ReadWriteLock readWriteLock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.l0> adInternalInfoMap;

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public o0(java.util.concurrent.locks.ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.readWriteLock = readWriteLock;
        this.adInternalInfoMap = new java.util.LinkedHashMap();
    }

    public /* synthetic */ o0(java.util.concurrent.locks.ReadWriteLock readWriteLock, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.locks.ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.json.m0
    public com.json.l0 a(java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.readWriteLock.readLock().lock();
        try {
            return this.adInternalInfoMap.get(adId);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    @Override // com.json.m0
    public java.util.List<com.json.l0> a() {
        this.readWriteLock.readLock().lock();
        java.util.List<com.json.l0> list = kotlin.collections.CollectionsKt.toList(this.adInternalInfoMap.values());
        this.readWriteLock.readLock().unlock();
        return list;
    }

    @Override // com.ironsource.m0.a
    public void a(com.json.k1 adStatus, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.readWriteLock.writeLock().lock();
        try {
            com.json.l0 l0Var = this.adInternalInfoMap.get(adId);
            if (l0Var != null) {
                l0Var.a(adStatus);
                l0Var.a(java.lang.System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    @Override // com.ironsource.m0.a
    public void a(com.json.l0 adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.readWriteLock.writeLock().lock();
        try {
            if (this.adInternalInfoMap.get(adInfo.c()) == null) {
                this.adInternalInfoMap.put(adInfo.c(), adInfo);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    @Override // com.ironsource.m0.a
    public void a(org.json.JSONObject json, com.json.k1 adStatus, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.readWriteLock.writeLock().lock();
        try {
            com.json.l0 l0Var = this.adInternalInfoMap.get(adId);
            if (l0Var != null) {
                java.lang.String bundleId = json.optString("bundleId");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
                boolean z = true;
                if (bundleId.length() > 0) {
                    l0Var.a(bundleId);
                }
                java.lang.String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() <= 0) {
                    z = false;
                }
                if (z) {
                    l0Var.a(com.json.dg.INSTANCE.a(dynamicDemandSourceId));
                }
                l0Var.a(adStatus);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }
}
