package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final java.lang.String referenceUri;
    public final long start;

    public RangedUri(java.lang.String str, long j, long j2) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j2;
    }

    public android.net.Uri resolveUri(java.lang.String str) {
        return androidx.media3.common.util.UriUtil.resolveToUri(str, this.referenceUri);
    }

    public java.lang.String resolveUriString(java.lang.String str) {
        return androidx.media3.common.util.UriUtil.resolve(str, this.referenceUri);
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri attemptMerge(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, java.lang.String str) {
        java.lang.String strResolveUriString = resolveUriString(str);
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            if (j != -1) {
                long j2 = this.start;
                if (j2 + j == rangedUri.start) {
                    long j3 = rangedUri.length;
                    return new androidx.media3.exoplayer.dash.manifest.RangedUri(strResolveUriString, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = rangedUri.length;
            if (j4 != -1) {
                long j5 = rangedUri.start;
                if (j5 + j4 == this.start) {
                    return new androidx.media3.exoplayer.dash.manifest.RangedUri(strResolveUriString, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri = (androidx.media3.exoplayer.dash.manifest.RangedUri) obj;
        return this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri);
    }

    public java.lang.String toString() {
        return "RangedUri(referenceUri=" + this.referenceUri + ", start=" + this.start + ", length=" + this.length + ")";
    }
}
