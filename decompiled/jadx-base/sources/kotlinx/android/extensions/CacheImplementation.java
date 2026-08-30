package kotlinx.android.extensions;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlinx.android.extensions.CacheImplementation, still in use, count: 1, list:
  (r0v1 kotlinx.android.extensions.CacheImplementation) from 0x0034: SPUT (r0v1 kotlinx.android.extensions.CacheImplementation) (LINE:33) kotlinx.android.extensions.CacheImplementation.DEFAULT kotlinx.android.extensions.CacheImplementation
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: CacheImplementation.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "(Ljava/lang/String;I)V", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "Companion", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheImplementation {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;

    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.android.extensions.CacheImplementation.Companion INSTANCE = new kotlinx.android.extensions.CacheImplementation.Companion(null);
    private static final kotlinx.android.extensions.CacheImplementation DEFAULT = new kotlinx.android.extensions.CacheImplementation();

    public static kotlin.enums.EnumEntries<kotlinx.android.extensions.CacheImplementation> getEntries() {
        return $ENTRIES;
    }

    public static kotlinx.android.extensions.CacheImplementation valueOf(java.lang.String str) {
        return (kotlinx.android.extensions.CacheImplementation) java.lang.Enum.valueOf(kotlinx.android.extensions.CacheImplementation.class, str);
    }

    public static kotlinx.android.extensions.CacheImplementation[] values() {
        return (kotlinx.android.extensions.CacheImplementation[]) $VALUES.clone();
    }

    private CacheImplementation() {
        super(str, i);
    }

    static {
    }

    /* JADX INFO: compiled from: CacheImplementation.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "()V", "DEFAULT", "Lkotlinx/android/extensions/CacheImplementation;", "getDEFAULT", "()Lkotlinx/android/extensions/CacheImplementation;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.android.extensions.CacheImplementation getDEFAULT() {
            return kotlinx.android.extensions.CacheImplementation.DEFAULT;
        }
    }
}
