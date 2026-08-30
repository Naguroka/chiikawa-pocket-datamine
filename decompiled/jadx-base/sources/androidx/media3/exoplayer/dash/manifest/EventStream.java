package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class EventStream {
    public final androidx.media3.extractor.metadata.emsg.EventMessage[] events;
    public final long[] presentationTimesUs;
    public final java.lang.String schemeIdUri;
    public final long timescale;
    public final java.lang.String value;

    public EventStream(java.lang.String str, java.lang.String str2, long j, long[] jArr, androidx.media3.extractor.metadata.emsg.EventMessage[] eventMessageArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.timescale = j;
        this.presentationTimesUs = jArr;
        this.events = eventMessageArr;
    }

    public java.lang.String id() {
        return this.schemeIdUri + "/" + this.value;
    }
}
