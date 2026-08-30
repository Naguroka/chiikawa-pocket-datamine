package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class Descriptor {
    public final java.lang.String id;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;

    public Descriptor(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.id = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = (androidx.media3.exoplayer.dash.manifest.Descriptor) obj;
        return androidx.media3.common.util.Util.areEqual(this.schemeIdUri, descriptor.schemeIdUri) && androidx.media3.common.util.Util.areEqual(this.value, descriptor.value) && androidx.media3.common.util.Util.areEqual(this.id, descriptor.id);
    }

    public int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode() * 31;
        java.lang.String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
