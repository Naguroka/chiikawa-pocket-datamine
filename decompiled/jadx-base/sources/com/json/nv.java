package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ironsource/nv;", "Lcom/ironsource/cp;", "", "e", "", "b", "com/ironsource/nv$b", "d", "Lcom/ironsource/nv$b;", "visibilityChangeListener", "Lcom/ironsource/pv;", "Lcom/ironsource/pv;", "visibilityChangeObserver", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "f", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nv extends com.json.cp {
    private static final java.lang.String g = "ViewVisibilityTrigger";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.ironsource.nv.b visibilityChangeListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.pv visibilityChangeObserver;

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/nv$b", "Lcom/ironsource/no;", "", com.json.pg.k, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.no {
        b() {
        }

        @Override // com.json.no
        public void a(boolean isVisible) {
            com.json.nv.this.a(!isVisible);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(android.view.View view) {
        super(false, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.ironsource.nv.b bVar = new com.ironsource.nv.b();
        this.visibilityChangeListener = bVar;
        com.json.pv pvVar = new com.json.pv(bVar);
        this.visibilityChangeObserver = pvVar;
        pvVar.a(view);
        a(!pvVar.c());
    }

    @Override // com.json.cp
    public java.lang.String b() {
        return g;
    }

    public final void e() {
        this.visibilityChangeObserver.b();
    }
}
