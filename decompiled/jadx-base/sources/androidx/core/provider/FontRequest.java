package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {
    private final java.util.List<java.util.List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final java.lang.String mIdentifier;
    private final java.lang.String mProviderAuthority;
    private final java.lang.String mProviderPackage;
    private final java.lang.String mQuery;

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.util.List<byte[]>> list) {
        this.mProviderAuthority = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mProviderPackage = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.mQuery = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.mCertificates = (java.util.List) androidx.core.util.Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.mProviderAuthority = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mProviderPackage = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.mQuery = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.mCertificates = null;
        androidx.core.util.Preconditions.checkArgument(i != 0);
        this.mCertificatesArray = i;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }

    private java.lang.String createIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public java.lang.String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public java.lang.String getProviderPackage() {
        return this.mProviderPackage;
    }

    public java.lang.String getQuery() {
        return this.mQuery;
    }

    public java.util.List<java.util.List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @java.lang.Deprecated
    public java.lang.String getIdentifier() {
        return this.mIdentifier;
    }

    java.lang.String getId() {
        return this.mIdentifier;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i = 0; i < this.mCertificates.size(); i++) {
            sb.append(" [");
            java.util.List<byte[]> list = this.mCertificates.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb.toString();
    }
}
