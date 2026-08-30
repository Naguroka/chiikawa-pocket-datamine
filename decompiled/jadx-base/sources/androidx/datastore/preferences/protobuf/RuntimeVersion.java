package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeVersion {
    public static final androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final java.lang.String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final java.lang.String SUFFIX = "";
    private static final java.lang.String VERSION_STRING;
    private static final java.util.logging.Logger logger;

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain = androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.RuntimeVersion.class.getName());
    }

    public static void validateProtobufGencodeVersion(androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain domain, int major, int minor, int patch, java.lang.String suffix, java.lang.String location) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(domain, major, minor, patch, suffix, location);
    }

    private static void validateProtobufGencodeVersionImpl(androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain domain, int major, int minor, int patch, java.lang.String suffix, java.lang.String location) {
        if (checkDisabled()) {
            return;
        }
        java.lang.String strVersionString = versionString(major, minor, patch, suffix);
        if (major < 0 || minor < 0 || patch < 0) {
            throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException("Invalid gencode version: " + strVersionString);
        }
        androidx.datastore.preferences.protobuf.RuntimeVersion.RuntimeDomain runtimeDomain = DOMAIN;
        if (domain != runtimeDomain) {
            throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", location, domain, runtimeDomain));
        }
        if (major != 4) {
            if (major == 3) {
                logger.warning(java.lang.String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strVersionString, VERSION_STRING, location));
            } else {
                throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", location, strVersionString, VERSION_STRING));
            }
        }
        if (28 < minor || (minor == 28 && 2 < patch)) {
            throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", location, strVersionString, VERSION_STRING));
        }
        if (28 > minor || 2 > patch) {
            logger.warning(java.lang.String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", strVersionString, VERSION_STRING, location));
        }
        if (!suffix.equals("")) {
            throw new androidx.datastore.preferences.protobuf.RuntimeVersion.ProtobufRuntimeVersionException(java.lang.String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", location, strVersionString, VERSION_STRING));
        }
    }

    public static final class ProtobufRuntimeVersionException extends java.lang.RuntimeException {
        public ProtobufRuntimeVersionException(java.lang.String message) {
            super(message);
        }
    }

    private static java.lang.String versionString(int major, int minor, int patch, java.lang.String suffix) {
        return java.lang.String.format("%d.%d.%d%s", java.lang.Integer.valueOf(major), java.lang.Integer.valueOf(minor), java.lang.Integer.valueOf(patch), suffix);
    }

    private static boolean checkDisabled() {
        java.lang.String str = java.lang.System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals(com.json.mediationsdk.metadata.a.g);
    }

    private RuntimeVersion() {
    }
}
