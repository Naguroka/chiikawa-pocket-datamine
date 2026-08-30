package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplBase implements androidx.media3.session.SessionToken.SessionTokenImpl {
    private final android.content.ComponentName componentName;
    private final android.os.Bundle extras;
    private final android.os.IBinder iSession;
    private final int interfaceVersion;
    private final int libraryVersion;
    private final java.lang.String packageName;
    private final java.lang.String serviceName;
    private final int type;
    private final int uid;
    private static final java.lang.String FIELD_UID = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_LIBRARY_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_SERVICE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_COMPONENT_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_ISESSION = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String FIELD_INTERFACE_VERSION = androidx.media3.common.util.Util.intToStringMaxRadix(8);

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public boolean isLegacySession() {
        return false;
    }

    public SessionTokenImplBase(android.content.ComponentName componentName, int i, int i2) {
        this(i, i2, 0, 0, ((android.content.ComponentName) androidx.media3.common.util.Assertions.checkNotNull(componentName)).getPackageName(), componentName.getClassName(), componentName, null, android.os.Bundle.EMPTY);
    }

    public SessionTokenImplBase(int i, int i2, int i3, int i4, java.lang.String str, androidx.media3.session.IMediaSession iMediaSession, android.os.Bundle bundle) {
        this(i, i2, i3, i4, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str), "", null, iMediaSession.asBinder(), (android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
    }

    private SessionTokenImplBase(int i, int i2, int i3, int i4, java.lang.String str, java.lang.String str2, android.content.ComponentName componentName, android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.uid = i;
        this.type = i2;
        this.libraryVersion = i3;
        this.interfaceVersion = i4;
        this.packageName = str;
        this.serviceName = str2;
        this.componentName = componentName;
        this.iSession = iBinder;
        this.extras = bundle;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.uid), java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(this.libraryVersion), java.lang.Integer.valueOf(this.interfaceVersion), this.packageName, this.serviceName, this.componentName, this.iSession);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.session.SessionTokenImplBase)) {
            return false;
        }
        androidx.media3.session.SessionTokenImplBase sessionTokenImplBase = (androidx.media3.session.SessionTokenImplBase) obj;
        return this.uid == sessionTokenImplBase.uid && this.type == sessionTokenImplBase.type && this.libraryVersion == sessionTokenImplBase.libraryVersion && this.interfaceVersion == sessionTokenImplBase.interfaceVersion && android.text.TextUtils.equals(this.packageName, sessionTokenImplBase.packageName) && android.text.TextUtils.equals(this.serviceName, sessionTokenImplBase.serviceName) && androidx.media3.common.util.Util.areEqual(this.componentName, sessionTokenImplBase.componentName) && androidx.media3.common.util.Util.areEqual(this.iSession, sessionTokenImplBase.iSession);
    }

    public java.lang.String toString() {
        return "SessionToken {pkg=" + this.packageName + " type=" + this.type + " libraryVersion=" + this.libraryVersion + " interfaceVersion=" + this.interfaceVersion + " service=" + this.serviceName + " IMediaSession=" + this.iSession + " extras=" + this.extras + "}";
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
        return this.serviceName;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.content.ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getType() {
        return this.type;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getLibraryVersion() {
        return this.libraryVersion;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public int getInterfaceVersion() {
        return this.interfaceVersion;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.os.Bundle getExtras() {
        return new android.os.Bundle(this.extras);
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public java.lang.Object getBinder() {
        return this.iSession;
    }

    @Override // androidx.media3.session.SessionToken.SessionTokenImpl
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_UID, this.uid);
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        bundle.putString(FIELD_PACKAGE_NAME, this.packageName);
        bundle.putString(FIELD_SERVICE_NAME, this.serviceName);
        androidx.core.app.BundleCompat.putBinder(bundle, FIELD_ISESSION, this.iSession);
        bundle.putParcelable(FIELD_COMPONENT_NAME, this.componentName);
        bundle.putBundle(FIELD_EXTRAS, this.extras);
        bundle.putInt(FIELD_INTERFACE_VERSION, this.interfaceVersion);
        return bundle;
    }

    public static androidx.media3.session.SessionTokenImplBase fromBundle(android.os.Bundle bundle) {
        java.lang.String str = FIELD_UID;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str), "uid should be set.");
        int i = bundle.getInt(str);
        java.lang.String str2 = FIELD_TYPE;
        androidx.media3.common.util.Assertions.checkArgument(bundle.containsKey(str2), "type should be set.");
        int i2 = bundle.getInt(str2);
        int i3 = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        int i4 = bundle.getInt(FIELD_INTERFACE_VERSION, 0);
        java.lang.String strCheckNotEmpty = androidx.media3.common.util.Assertions.checkNotEmpty(bundle.getString(FIELD_PACKAGE_NAME), "package name should be set.");
        java.lang.String string = bundle.getString(FIELD_SERVICE_NAME, "");
        android.os.IBinder binder = androidx.core.app.BundleCompat.getBinder(bundle, FIELD_ISESSION);
        android.content.ComponentName componentName = (android.content.ComponentName) bundle.getParcelable(FIELD_COMPONENT_NAME);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_EXTRAS);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionTokenImplBase(i, i2, i3, i4, strCheckNotEmpty, string, componentName, binder, bundle2);
    }
}
