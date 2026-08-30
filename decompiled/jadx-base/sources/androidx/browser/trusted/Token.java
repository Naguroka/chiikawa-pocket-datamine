package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class Token {
    private static final java.lang.String TAG = "Token";
    private final androidx.browser.trusted.TokenContents mContents;

    public static androidx.browser.trusted.Token create(java.lang.String str, android.content.pm.PackageManager packageManager) {
        java.util.List<byte[]> fingerprintsForPackage = androidx.browser.trusted.PackageIdentityUtils.getFingerprintsForPackage(str, packageManager);
        if (fingerprintsForPackage == null) {
            return null;
        }
        try {
            return new androidx.browser.trusted.Token(androidx.browser.trusted.TokenContents.create(str, fingerprintsForPackage));
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "Exception when creating token.", e);
            return null;
        }
    }

    public static androidx.browser.trusted.Token deserialize(byte[] bArr) {
        return new androidx.browser.trusted.Token(androidx.browser.trusted.TokenContents.deserialize(bArr));
    }

    private Token(androidx.browser.trusted.TokenContents tokenContents) {
        this.mContents = tokenContents;
    }

    public byte[] serialize() {
        return this.mContents.serialize();
    }

    public boolean matches(java.lang.String str, android.content.pm.PackageManager packageManager) {
        return androidx.browser.trusted.PackageIdentityUtils.packageMatchesToken(str, packageManager, this.mContents);
    }
}
