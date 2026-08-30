package androidx.window.core;

/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, d2 = {"Landroidx/window/core/Version;", "", "major", "", "minor", "patch", "description", "", "(IIILjava/lang/String;)V", "bigInteger", "Ljava/math/BigInteger;", "getBigInteger", "()Ljava/math/BigInteger;", "bigInteger$delegate", "Lkotlin/Lazy;", "getDescription", "()Ljava/lang/String;", "getMajor", "()I", "getMinor", "getPatch", "compareTo", "other", "equals", "", "", "hashCode", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Version implements java.lang.Comparable<androidx.window.core.Version> {
    private static final androidx.window.core.Version CURRENT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.Version.Companion INSTANCE = new androidx.window.core.Version.Companion(null);
    private static final androidx.window.core.Version UNKNOWN = new androidx.window.core.Version(0, 0, 0, "");
    private static final androidx.window.core.Version VERSION_0_1 = new androidx.window.core.Version(0, 1, 0, "");
    private static final androidx.window.core.Version VERSION_1_0;
    private static final java.lang.String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* JADX INFO: renamed from: bigInteger$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy bigInteger;
    private final java.lang.String description;
    private final int major;
    private final int minor;
    private final int patch;

    public /* synthetic */ Version(int i, int i2, int i3, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.core.Version parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    private Version(int i, int i2, int i3, java.lang.String str) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.description = str;
        this.bigInteger = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.math.BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.math.BigInteger invoke() {
                return java.math.BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(java.math.BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(java.math.BigInteger.valueOf(this.this$0.getPatch()));
            }
        });
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    private final java.math.BigInteger getBigInteger() {
        java.lang.Object value = this.bigInteger.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (java.math.BigInteger) value;
    }

    public java.lang.String toString() {
        return this.major + '.' + this.minor + '.' + this.patch + (kotlin.text.StringsKt.isBlank(this.description) ^ true ? kotlin.jvm.internal.Intrinsics.stringPlus("-", this.description) : "");
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.window.core.Version other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.window.core.Version)) {
            return false;
        }
        androidx.window.core.Version version = (androidx.window.core.Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return ((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    /* JADX INFO: compiled from: Version.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "()V", "CURRENT", "Landroidx/window/core/Version;", "getCURRENT", "()Landroidx/window/core/Version;", "UNKNOWN", "getUNKNOWN", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "VERSION_PATTERN_STRING", "", "parse", "versionString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.window.core.Version getUNKNOWN() {
            return androidx.window.core.Version.UNKNOWN;
        }

        public final androidx.window.core.Version getVERSION_0_1() {
            return androidx.window.core.Version.VERSION_0_1;
        }

        public final androidx.window.core.Version getVERSION_1_0() {
            return androidx.window.core.Version.VERSION_1_0;
        }

        public final androidx.window.core.Version getCURRENT() {
            return androidx.window.core.Version.CURRENT;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.core.Version parse(java.lang.String versionString) {
            if (versionString != null) {
                java.lang.String str = versionString;
                if (!kotlin.text.StringsKt.isBlank(str)) {
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(androidx.window.core.Version.VERSION_PATTERN_STRING).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    java.lang.String strGroup = matcher.group(1);
                    java.lang.Integer numValueOf = strGroup == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(strGroup));
                    if (numValueOf == null) {
                        return null;
                    }
                    int iIntValue = numValueOf.intValue();
                    java.lang.String strGroup2 = matcher.group(2);
                    java.lang.Integer numValueOf2 = strGroup2 == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(strGroup2));
                    if (numValueOf2 == null) {
                        return null;
                    }
                    int iIntValue2 = numValueOf2.intValue();
                    java.lang.String strGroup3 = matcher.group(3);
                    java.lang.Integer numValueOf3 = strGroup3 == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(strGroup3));
                    if (numValueOf3 == null) {
                        return null;
                    }
                    int iIntValue3 = numValueOf3.intValue();
                    java.lang.String description = matcher.group(4) != null ? matcher.group(4) : "";
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(description, "description");
                    return new androidx.window.core.Version(iIntValue, iIntValue2, iIntValue3, description, null);
                }
            }
            return null;
        }
    }

    static {
        androidx.window.core.Version version = new androidx.window.core.Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }
}
