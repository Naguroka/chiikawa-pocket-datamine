package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/qs;", "Lcom/ironsource/wh;", "Lcom/ironsource/wh$a;", "", "b", "Lcom/ironsource/rs;", "historyRecord", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/at;", com.ironsource.y8.a.t, "Lorg/json/JSONObject;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "", "", "", "Lcom/ironsource/os;", "configuration", "", "", "Lcom/ironsource/w;", "Ljava/util/Map;", "adFormatsHistory", "Lcom/ironsource/ln;", "Lcom/ironsource/ln;", "networkGlobalDataWriter", "Ljava/util/concurrent/locks/ReadWriteLock;", "c", "Ljava/util/concurrent/locks/ReadWriteLock;", "lock", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qs implements com.json.wh, com.ironsource.wh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.util.Map<java.lang.String, com.json.w> adFormatsHistory = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ln networkGlobalDataWriter = new com.json.ln();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.concurrent.locks.ReadWriteLock lock = new java.util.concurrent.locks.ReentrantReadWriteLock();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3224a;

        static {
            int[] iArr = new int[com.json.ps.values().length];
            try {
                iArr[com.json.ps.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.ps.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.ps.Off.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3224a = iArr;
        }
    }

    private final void b() {
        com.json.os configuration = com.json.sdk.controller.FeaturesManager.getInstance().getSessionHistoryConfig();
        com.json.ln lnVar = this.networkGlobalDataWriter;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        lnVar.a(a(configuration));
        this.networkGlobalDataWriter.a(a());
    }

    @Override // com.json.wh
    public int a(com.ironsource.mediationsdk.IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.lock.readLock().lock();
        try {
            com.json.w wVar = this.adFormatsHistory.get(adFormat.toString());
            return wVar != null ? wVar.get_currentlyLoadedAds() : 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.json.wh
    public java.util.List<java.lang.String> a() {
        this.lock.readLock().lock();
        try {
            java.util.Map<java.lang.String, com.json.w> map = this.adFormatsHistory;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, com.json.w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return kotlin.collections.CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.json.wh
    public java.util.Map<java.lang.String, org.json.JSONObject> a(com.json.os configuration) {
        java.util.Map<java.lang.String, org.json.JSONObject> mapMutableMapOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.lock.readLock().lock();
        try {
            int i = com.ironsource.qs.a.f3224a[configuration.getHistoryMode().ordinal()];
            if (i == 1) {
                mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.json.ce.o1, a(com.json.at.FullHistory)), kotlin.TuplesKt.to(com.json.ce.p1, a(com.json.at.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.json.ce.p1, a(com.json.at.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                mapMutableMapOf = kotlin.collections.MapsKt.emptyMap();
            }
            this.lock.readLock().unlock();
            return mapMutableMapOf;
        } catch (java.lang.Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.json.wh
    public org.json.JSONObject a(com.json.at mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.lock.readLock().lock();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry<java.lang.String, com.json.w> entry : this.adFormatsHistory.entrySet()) {
                java.lang.String key = entry.getKey();
                org.json.JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            this.lock.readLock().unlock();
            return jSONObject;
        } catch (java.lang.Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.wh.a
    public void a(com.json.rs historyRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.lock.writeLock().lock();
        try {
            com.json.l0 adInternalInfo = historyRecord.getAdInternalInfo();
            java.lang.String strValueOf = java.lang.String.valueOf(adInternalInfo != null ? adInternalInfo.b() : null);
            java.util.Map<java.lang.String, com.json.w> map = this.adFormatsHistory;
            com.json.w wVar = map.get(strValueOf);
            if (wVar == null) {
                wVar = new com.json.w();
                map.put(strValueOf, wVar);
            }
            wVar.a(historyRecord.a(new com.json.xs()));
            this.lock.writeLock().unlock();
            b();
        } catch (java.lang.Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }
}
