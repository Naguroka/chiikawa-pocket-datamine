package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionRegistryLite {
    static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = new androidx.datastore.preferences.protobuf.ExtensionRegistryLite(true);
    static final java.lang.String EXTENSION_CLASS_NAME = "androidx.datastore.preferences.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile androidx.datastore.preferences.protobuf.ExtensionRegistryLite emptyRegistry;
    private final java.util.Map<androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    private static class ExtensionClassHolder {
        static final java.lang.Class<?> INSTANCE = resolveExtensionClass();

        private ExtensionClassHolder() {
        }

        static java.lang.Class<?> resolveExtensionClass() {
            try {
                return java.lang.Class.forName(androidx.datastore.preferences.protobuf.ExtensionRegistryLite.EXTENSION_CLASS_NAME);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static void setEagerlyParseMessageSets(boolean isEagerlyParse) {
        eagerlyParseMessageSets = isEagerlyParse;
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite newInstance() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return new androidx.datastore.preferences.protobuf.ExtensionRegistryLite();
        }
        return androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.create();
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return EMPTY_REGISTRY_LITE;
        }
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLiteCreateEmpty = emptyRegistry;
        if (extensionRegistryLiteCreateEmpty == null) {
            synchronized (androidx.datastore.preferences.protobuf.ExtensionRegistryLite.class) {
                extensionRegistryLiteCreateEmpty = emptyRegistry;
                if (extensionRegistryLiteCreateEmpty == null) {
                    extensionRegistryLiteCreateEmpty = androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.createEmpty();
                    emptyRegistry = extensionRegistryLiteCreateEmpty;
                }
            }
        }
        return extensionRegistryLiteCreateEmpty;
    }

    public androidx.datastore.preferences.protobuf.ExtensionRegistryLite getUnmodifiable() {
        return new androidx.datastore.preferences.protobuf.ExtensionRegistryLite(this);
    }

    public <ContainingType extends androidx.datastore.preferences.protobuf.MessageLite> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair(containingTypeDefaultInstance, fieldNumber));
    }

    public final void add(final androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension) {
        this.extensionsByNumber.put(new androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair(extension.getContainingTypeDefaultInstance(), extension.getNumber()), extension);
    }

    public final void add(androidx.datastore.preferences.protobuf.ExtensionLite<?, ?> extension) {
        if (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extension.getClass())) {
            add((androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>) extension);
        }
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime || !androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.isFullRegistry(this)) {
            return;
        }
        try {
            getClass().getMethod("add", androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ExtensionClassHolder.INSTANCE).invoke(this, extension);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not invoke ExtensionRegistry#add for %s", extension), e);
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new java.util.HashMap();
    }

    ExtensionRegistryLite(androidx.datastore.preferences.protobuf.ExtensionRegistryLite other) {
        if (other == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = java.util.Collections.emptyMap();
        } else {
            this.extensionsByNumber = java.util.Collections.unmodifiableMap(other.extensionsByNumber);
        }
    }

    ExtensionRegistryLite(boolean empty) {
        this.extensionsByNumber = java.util.Collections.emptyMap();
    }

    private static final class ObjectIntPair {
        private final int number;
        private final java.lang.Object object;

        ObjectIntPair(final java.lang.Object object, final int number) {
            this.object = object;
            this.number = number;
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.object) * 65535) + this.number;
        }

        public boolean equals(final java.lang.Object obj) {
            if (!(obj instanceof androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }
    }
}
