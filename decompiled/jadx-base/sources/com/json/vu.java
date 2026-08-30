package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\f"}, d2 = {"Lcom/ironsource/vu;", "Lcom/ironsource/f;", "Lcom/ironsource/vu$a;", "", "b", "timeoutListener", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "e", "", "duration", "<init>", "(J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class vu extends com.json.f<com.ironsource.vu.a> {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/ironsource/vu$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();
    }

    public vu(long j) {
        super(j);
    }

    public final void a(com.ironsource.vu.a timeoutListener) {
        a(timeoutListener);
    }

    @Override // com.json.f
    protected void b() {
        com.ironsource.vu.a aVar = (com.ironsource.vu.a) this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
