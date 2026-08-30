package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/hg;", "T", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "", "instanceId", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;)Ljava/lang/Object;", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface hg<T> {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/hg$a;", "Lcom/ironsource/hg;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "instanceId", "b", "Lcom/ironsource/gg;", "Lcom/ironsource/gg;", "defaultListener", "", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private com.json.gg defaultListener = new com.json.gg();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, com.json.gg> listenerWrappers = new java.util.HashMap();

        @Override // com.json.hg
        public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.defaultListener.a(listener);
            java.util.Iterator<java.lang.String> it = this.listenerWrappers.keySet().iterator();
            while (it.hasNext()) {
                com.json.gg ggVar = this.listenerWrappers.get(it.next());
                if (ggVar != null) {
                    ggVar.a(listener);
                }
            }
        }

        @Override // com.json.hg
        public void a(java.lang.String instanceId, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.listenerWrappers.containsKey(instanceId)) {
                this.listenerWrappers.put(instanceId, new com.json.gg(listener));
                return;
            }
            com.json.gg ggVar = this.listenerWrappers.get(instanceId);
            if (ggVar != null) {
                ggVar.a(listener);
            }
        }

        @Override // com.json.hg
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            com.json.gg ggVar = this.listenerWrappers.get(instanceId);
            return ggVar != null ? ggVar : this.defaultListener;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/hg$b;", "Lcom/ironsource/hg;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "instanceId", "b", "Lcom/ironsource/jg;", "Lcom/ironsource/jg;", "defaultListener", "", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private com.json.jg defaultListener = new com.json.jg();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, com.json.jg> listenerWrappers = new java.util.HashMap();

        @Override // com.json.hg
        public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.defaultListener.a(listener);
            java.util.Iterator<java.lang.String> it = this.listenerWrappers.keySet().iterator();
            while (it.hasNext()) {
                com.json.jg jgVar = this.listenerWrappers.get(it.next());
                if (jgVar != null) {
                    jgVar.a(listener);
                }
            }
        }

        @Override // com.json.hg
        public void a(java.lang.String instanceId, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (!this.listenerWrappers.containsKey(instanceId)) {
                this.listenerWrappers.put(instanceId, new com.json.jg(listener));
                return;
            }
            com.json.jg jgVar = this.listenerWrappers.get(instanceId);
            if (jgVar != null) {
                jgVar.a(listener);
            }
        }

        @Override // com.json.hg
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            com.json.jg jgVar = this.listenerWrappers.get(instanceId);
            return jgVar != null ? jgVar : this.defaultListener;
        }
    }

    T a(java.lang.String instanceId);

    void a(T listener);

    void a(java.lang.String instanceId, T listener);
}
