package androidx.datastore.preferences;

/* JADX INFO: compiled from: PreferencesMapCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat;", "", "()V", "Companion", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesMapCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.preferences.PreferencesMapCompat.Companion INSTANCE = new androidx.datastore.preferences.PreferencesMapCompat.Companion(null);

    /* JADX INFO: compiled from: PreferencesMapCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat$Companion;", "", "()V", "readFrom", "Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;", "input", "Ljava/io/InputStream;", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.datastore.preferences.PreferencesProto.PreferenceMap readFrom(java.io.InputStream input) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
            try {
                androidx.datastore.preferences.PreferencesProto.PreferenceMap from = androidx.datastore.preferences.PreferencesProto.PreferenceMap.parseFrom(input);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "{\n                Prefer…From(input)\n            }");
                return from;
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                throw new androidx.datastore.core.CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
