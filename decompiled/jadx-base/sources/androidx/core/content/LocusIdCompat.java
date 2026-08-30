package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class LocusIdCompat {
    private final java.lang.String mId;
    private final android.content.LocusId mWrapped;

    public LocusIdCompat(java.lang.String str) {
        this.mId = (java.lang.String) androidx.core.util.Preconditions.checkStringNotEmpty(str, "id cannot be empty");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mWrapped = androidx.core.content.LocusIdCompat.Api29Impl.create(str);
        } else {
            this.mWrapped = null;
        }
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public int hashCode() {
        java.lang.String str = this.mId;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.core.content.LocusIdCompat locusIdCompat = (androidx.core.content.LocusIdCompat) obj;
        java.lang.String str = this.mId;
        if (str == null) {
            return locusIdCompat.mId == null;
        }
        return str.equals(locusIdCompat.mId);
    }

    public java.lang.String toString() {
        return "LocusIdCompat[" + getSanitizedId() + com.ironsource.y8.i.e;
    }

    public android.content.LocusId toLocusId() {
        return this.mWrapped;
    }

    public static androidx.core.content.LocusIdCompat toLocusIdCompat(android.content.LocusId locusId) {
        androidx.core.util.Preconditions.checkNotNull(locusId, "locusId cannot be null");
        return new androidx.core.content.LocusIdCompat((java.lang.String) androidx.core.util.Preconditions.checkStringNotEmpty(androidx.core.content.LocusIdCompat.Api29Impl.getId(locusId), "id cannot be empty"));
    }

    private java.lang.String getSanitizedId() {
        return this.mId.length() + "_chars";
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static android.content.LocusId create(java.lang.String str) {
            return new android.content.LocusId(str);
        }

        static java.lang.String getId(android.content.LocusId locusId) {
            return locusId.getId();
        }
    }
}
