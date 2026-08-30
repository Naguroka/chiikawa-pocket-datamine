package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\tH\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ironsource/ms;", "Lcom/ironsource/uh;", "Lcom/ironsource/uh$a;", "", "Lcom/ironsource/uh$b;", "smashes", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "smash", "", "b", "", "", "", "Ljava/util/Map;", "mShowCountMap", "mMaxAdsPerSessionMap", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ms implements com.json.uh, com.ironsource.uh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> mShowCountMap = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> mMaxAdsPerSessionMap = new java.util.HashMap();

    @Override // com.ironsource.uh.a
    public void a(com.ironsource.uh.b smash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            java.lang.String strC = smash.c();
            if (this.mShowCountMap.containsKey(strC)) {
                java.util.Map<java.lang.String, java.lang.Integer> map = this.mShowCountMap;
                java.lang.Integer num = map.get(strC);
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                map.put(strC, java.lang.Integer.valueOf(num.intValue() + 1));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.ironsource.uh.a
    public void a(java.util.List<? extends com.ironsource.uh.b> smashes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (com.ironsource.uh.b bVar : smashes) {
            this.mShowCountMap.put(bVar.c(), 0);
            this.mMaxAdsPerSessionMap.put(bVar.c(), java.lang.Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.json.uh
    public boolean a() {
        for (java.lang.String str : this.mMaxAdsPerSessionMap.keySet()) {
            java.lang.Integer num = this.mShowCountMap.get(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            java.lang.Integer num2 = this.mMaxAdsPerSessionMap.get(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.json.uh
    public boolean b(com.ironsource.uh.b smash) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            java.lang.String strC = smash.c();
            if (this.mShowCountMap.containsKey(strC)) {
                java.lang.Integer num = this.mShowCountMap.get(strC);
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                if (num.intValue() >= smash.b()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }
}
