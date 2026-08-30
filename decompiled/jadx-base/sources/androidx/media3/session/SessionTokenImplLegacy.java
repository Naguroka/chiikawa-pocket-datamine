package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplLegacy implements androidx.media3.session.SessionToken.SessionTokenImpl {
    private final android.content.ComponentName componentName;
    private final android.os.Bundle extras;
    private final androidx.media3.session.legacy.MediaSessionCompat.Token legacyToken;
    private final java.lang.String packageName;
    private final int type;
    private final int uid;
    private static final java.lang.String FIELD_LEGACY_TOKEN = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_UID = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_COMPONENT_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getInterfaceVersion() {
        return 0;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getLibraryVersion() {
        return 0;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public boolean isLegacySession() {
        return true;
    }

    public SessionTokenImplLegacy(androidx.media3.session.legacy.MediaSessionCompat.Token token, java.lang.String str, int i, android.os.Bundle bundle) {
        this((androidx.media3.session.legacy.MediaSessionCompat.Token) androidx.media3.common.util.Assertions.checkNotNull(token), i, 100, null, androidx.media3.common.util.Assertions.checkNotEmpty(str), (android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
    }

    public SessionTokenImplLegacy(android.content.ComponentName componentName, int i) {
        this(null, i, 101, (android.content.ComponentName) androidx.media3.common.util.Assertions.checkNotNull(componentName), componentName.getPackageName(), android.os.Bundle.EMPTY);
    }

    private SessionTokenImplLegacy(androidx.media3.session.legacy.MediaSessionCompat.Token token, int i, int i2, android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle) {
        this.legacyToken = token;
        this.uid = i;
        this.type = i2;
        this.componentName = componentName;
        this.packageName = str;
        this.extras = bundle;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.type), this.componentName, this.legacyToken);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.session.SessionTokenImplLegacy)) {
            return false;
        }
        androidx.media3.session.SessionTokenImplLegacy sessionTokenImplLegacy = (androidx.media3.session.SessionTokenImplLegacy) obj;
        int i = this.type;
        if (i != sessionTokenImplLegacy.type) {
            return false;
        }
        if (i == 100) {
            return androidx.media3.common.util.Util.areEqual(this.legacyToken, sessionTokenImplLegacy.legacyToken);
        }
        if (i != 101) {
            return false;
        }
        return androidx.media3.common.util.Util.areEqual(this.componentName, sessionTokenImplLegacy.componentName);
    }

    public java.lang.String toString() {
        return "SessionToken {legacyToken=" + this.legacyToken + "}";
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getUid() {
        return this.uid;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public java.lang.String getPackageName() {
        return this.packageName;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public java.lang.String getServiceName() {
        android.content.ComponentName componentName = this.componentName;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.content.ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getType() {
        return this.type != 101 ? 0 : 2;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.os.Bundle getExtras() {
        return new android.os.Bundle(this.extras);
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public java.lang.Object getBinder() {
        return this.legacyToken;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = FIELD_LEGACY_TOKEN;
        androidx.media3.session.legacy.MediaSessionCompat.Token token = this.legacyToken;
        bundle.putBundle(str, token == null ? null : token.toBundle());
        bundle.putInt(FIELD_UID, this.uid);
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putParcelable(FIELD_COMPONENT_NAME, this.componentName);
        bundle.putString(FIELD_PACKAGE_NAME, this.packageName);
        bundle.putBundle(FIELD_EXTRAS, this.extras);
        return bundle;
    }

    public static androidx.media3.session.SessionTokenImplLegacy fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_LEGACY_TOKEN);
        androidx.media3.session.legacy.MediaSessionCompat.Token tokenFromBundle = bundle2 == null ? null : androidx.media3.session.legacy.MediaSessionCompat.Token.fromBundle(bundle2);
        java.lang.String str = FIELD_UID;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str), "uid should be set.");
        int i = bundle.getInt(str);
        java.lang.String str2 = FIELD_TYPE;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str2), "type should be set.");
        int i2 = bundle.getInt(str2);
        android.content.ComponentName componentName = (android.content.ComponentName) bundle.getParcelable(FIELD_COMPONENT_NAME);
        java.lang.String strCheckNotEmpty = androidx.media3.common.util.Assertions.checkNotEmpty(bundle.getString(FIELD_PACKAGE_NAME), "package name should be set.");
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_EXTRAS);
        if (bundle3 == null) {
            bundle3 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionTokenImplLegacy(tokenFromBundle, i, i2, componentName, strCheckNotEmpty, bundle3);
    }
}
