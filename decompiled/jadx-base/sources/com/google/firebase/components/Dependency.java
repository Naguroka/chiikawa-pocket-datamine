package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public final class Dependency {
    private final com.google.firebase.components.Qualified<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(java.lang.Class<?> cls, int i, int i2) {
        this((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.unqualified(cls), i, i2);
    }

    private Dependency(com.google.firebase.components.Qualified<?> qualified, int i, int i2) {
        this.anInterface = (com.google.firebase.components.Qualified) com.google.firebase.components.Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }

    @java.lang.Deprecated
    public static com.google.firebase.components.Dependency optional(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 0, 0);
    }

    public static com.google.firebase.components.Dependency deferred(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 0, 2);
    }

    public static com.google.firebase.components.Dependency deferred(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 0, 2);
    }

    public static com.google.firebase.components.Dependency required(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 1, 0);
    }

    public static com.google.firebase.components.Dependency required(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 1, 0);
    }

    public static com.google.firebase.components.Dependency setOf(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 2, 0);
    }

    public static com.google.firebase.components.Dependency setOf(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 2, 0);
    }

    public static com.google.firebase.components.Dependency optionalProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 0, 1);
    }

    public static com.google.firebase.components.Dependency optionalProvider(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 0, 1);
    }

    public static com.google.firebase.components.Dependency requiredProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 1, 1);
    }

    public static com.google.firebase.components.Dependency requiredProvider(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 1, 1);
    }

    public static com.google.firebase.components.Dependency setOfProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 2, 1);
    }

    public static com.google.firebase.components.Dependency setOfProvider(com.google.firebase.components.Qualified<?> qualified) {
        return new com.google.firebase.components.Dependency(qualified, 2, 1);
    }

    public com.google.firebase.components.Qualified<?> getInterface() {
        return this.anInterface;
    }

    public boolean isRequired() {
        return this.type == 1;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean isDeferred() {
        return this.injection == 2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.firebase.components.Dependency)) {
            return false;
        }
        com.google.firebase.components.Dependency dependency = (com.google.firebase.components.Dependency) obj;
        return this.anInterface.equals(dependency.anInterface) && this.type == dependency.type && this.injection == dependency.injection;
    }

    public int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Dependency{anInterface=").append(this.anInterface).append(", type=");
        int i = this.type;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        return sbAppend.append(str).append(", injection=").append(describeInjection(this.injection)).append("}").toString();
    }

    private static java.lang.String describeInjection(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i == 2) {
            return "deferred";
        }
        throw new java.lang.AssertionError("Unsupported injection: " + i);
    }
}
