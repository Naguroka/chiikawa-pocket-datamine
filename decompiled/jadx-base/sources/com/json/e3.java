package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/e3;", "Lcom/ironsource/bt;", "Lorg/json/JSONArray;", "", "Lcom/ironsource/d3;", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "Lcom/ironsource/at;", com.ironsource.y8.a.t, "", "Ljava/util/List;", "records", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class e3 implements com.json.bt<org.json.JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.List<com.json.d3> records = new java.util.ArrayList();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2605a;

        static {
            int[] iArr = new int[com.json.at.values().length];
            try {
                iArr[com.json.at.FullHistory.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.at.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f2605a = iArr;
        }
    }

    private final java.util.List<com.json.d3> a() {
        java.util.List<com.json.d3> list = this.records;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.json.d3 d3Var = (com.json.d3) next;
            if ((d3Var.getRecordType() == com.json.ys.LoadSuccess || d3Var.getRecordType() == com.json.ys.LoadRequest) ? false : true) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.json.d3) it2.next()).getAdInstanceId());
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList2);
        java.util.List<com.json.d3> list2 = this.records;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            com.json.d3 d3Var2 = (com.json.d3) obj;
            if (d3Var2.getRecordType() == com.json.ys.LoadSuccess && !set.contains(d3Var2.getAdInstanceId())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    private final java.util.List<com.json.d3> b() {
        java.util.List<com.json.d3> list = this.records;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.json.d3) obj).getRecordType() != com.json.ys.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(com.json.d3 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.records.add(event);
    }

    @Override // com.json.te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONArray a(com.json.at mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        int i = com.ironsource.e3.a.f2605a[mode.ordinal()];
        if (i == 1) {
            java.util.List<com.json.d3> listB = b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listB, 10));
            java.util.Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.json.d3) it.next()).d());
            }
            return new org.json.JSONArray((java.util.Collection) arrayList);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.json.d3> listA = a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listA, 10));
        java.util.Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.json.d3) it2.next()).c());
        }
        return new org.json.JSONArray((java.util.Collection) arrayList2);
    }
}
