package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a;", "", "", "b", "", "isEmpty", "instanceName", "Lcom/ironsource/j5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "get", "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a$a;", "Lcom/ironsource/mediationsdk/demandOnly/a;", "", "b", "", "isEmpty", "instanceName", "Lcom/ironsource/j5;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "get", "", "Ljava/util/List;", com.json.mediationsdk.d.h, "<init>", "(Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0238a implements com.json.mediationsdk.demandOnly.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.List<com.json.j5> waterfall;

        /* JADX WARN: Multi-variable type inference failed */
        public C0238a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public C0238a(java.util.List<com.json.j5> waterfall) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.waterfall = waterfall;
        }

        public /* synthetic */ C0238a(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.ArrayList() : list);
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public com.json.j5 a(java.lang.String instanceName) {
            java.lang.Object next;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            java.util.Iterator<T> it = this.waterfall.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.json.j5) next).c(), instanceName)) {
                    return (com.json.j5) next;
                }
            }
            next = null;
            return (com.json.j5) next;
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public java.util.List<com.json.j5> a() {
            return this.waterfall;
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public java.lang.String b() {
            return this.waterfall.isEmpty() ? "" : "1" + ((com.json.j5) kotlin.collections.CollectionsKt.first((java.util.List) this.waterfall)).c();
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public com.json.j5 get(int index) {
            if (index < 0 || index >= this.waterfall.size()) {
                return null;
            }
            return this.waterfall.get(index);
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.waterfall.isEmpty();
        }
    }

    com.json.j5 a(java.lang.String instanceName);

    java.util.List<com.json.j5> a();

    java.lang.String b();

    com.json.j5 get(int index);

    boolean isEmpty();
}
