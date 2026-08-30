package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class UtcTimingElement {
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;

    public UtcTimingElement(java.lang.String str, java.lang.String str2) {
        this.schemeIdUri = str;
        this.value = str2;
    }

    public java.lang.String toString() {
        return this.schemeIdUri + ", " + this.value;
    }
}
