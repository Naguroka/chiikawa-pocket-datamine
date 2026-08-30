package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: PreferencesSerializer.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/preferences/core/Preferences;", "()V", "defaultValue", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "fileExtension", "", "addProtoEntryToPreferences", "", "name", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "mutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "getValueProto", "", "readFrom", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "t", "sink", "Lokio/BufferedSink;", "(Landroidx/datastore/preferences/core/Preferences;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesSerializer implements androidx.datastore.core.okio.OkioSerializer<androidx.datastore.preferences.core.Preferences> {
    public static final androidx.datastore.preferences.core.PreferencesSerializer INSTANCE = new androidx.datastore.preferences.core.PreferencesSerializer();
    public static final java.lang.String fileExtension = "preferences_pb";

    /* JADX INFO: compiled from: PreferencesSerializer.jvm.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public /* bridge */ /* synthetic */ java.lang.Object writeTo(androidx.datastore.preferences.core.Preferences preferences, okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation continuation) {
        return writeTo2(preferences, bufferedSink, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.okio.OkioSerializer
    public androidx.datastore.preferences.core.Preferences getDefaultValue() {
        return androidx.datastore.preferences.core.PreferencesFactory.createEmpty();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public java.lang.Object readFrom(okio.BufferedSource bufferedSource, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> continuation) throws java.io.IOException {
        androidx.datastore.preferences.PreferencesProto.PreferenceMap from = androidx.datastore.preferences.PreferencesMapCompat.INSTANCE.readFrom(bufferedSource.inputStream());
        androidx.datastore.preferences.core.MutablePreferences mutablePreferencesCreateMutable = androidx.datastore.preferences.core.PreferencesFactory.createMutable(new androidx.datastore.preferences.core.Preferences.Pair[0]);
        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = from.getPreferencesMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (java.util.Map.Entry<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            java.lang.String name = entry.getKey();
            androidx.datastore.preferences.PreferencesProto.Value value = entry.getValue();
            androidx.datastore.preferences.core.PreferencesSerializer preferencesSerializer = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, mutablePreferencesCreateMutable);
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public java.lang.Object writeTo2(androidx.datastore.preferences.core.Preferences preferences, okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.io.IOException {
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> mapAsMap = preferences.asMap();
        androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder builderNewBuilder = androidx.datastore.preferences.PreferencesProto.PreferenceMap.newBuilder();
        for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : mapAsMap.entrySet()) {
            builderNewBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        builderNewBuilder.build().writeTo(bufferedSink.outputStream());
        return kotlin.Unit.INSTANCE;
    }

    private final androidx.datastore.preferences.PreferencesProto.Value getValueProto(java.lang.Object value) {
        if (value instanceof java.lang.Boolean) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setBoolean(((java.lang.Boolean) value).booleanValue()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setBoolean(value).build()");
            return valueBuild;
        }
        if (value instanceof java.lang.Float) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild2 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setFloat(((java.lang.Number) value).floatValue()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild2, "newBuilder().setFloat(value).build()");
            return valueBuild2;
        }
        if (value instanceof java.lang.Double) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild3 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setDouble(((java.lang.Number) value).doubleValue()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild3, "newBuilder().setDouble(value).build()");
            return valueBuild3;
        }
        if (value instanceof java.lang.Integer) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild4 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setInteger(((java.lang.Number) value).intValue()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild4, "newBuilder().setInteger(value).build()");
            return valueBuild4;
        }
        if (value instanceof java.lang.Long) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild5 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setLong(((java.lang.Number) value).longValue()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild5, "newBuilder().setLong(value).build()");
            return valueBuild5;
        }
        if (value instanceof java.lang.String) {
            androidx.datastore.preferences.PreferencesProto.Value valueBuild6 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setString((java.lang.String) value).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild6, "newBuilder().setString(value).build()");
            return valueBuild6;
        }
        if (value instanceof java.util.Set) {
            androidx.datastore.preferences.PreferencesProto.Value.Builder builderNewBuilder = androidx.datastore.preferences.PreferencesProto.Value.newBuilder();
            androidx.datastore.preferences.PreferencesProto.StringSet.Builder builderNewBuilder2 = androidx.datastore.preferences.PreferencesProto.StringSet.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            androidx.datastore.preferences.PreferencesProto.Value valueBuild7 = builderNewBuilder.setStringSet(builderNewBuilder2.addAllStrings((java.util.Set) value)).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild7, "newBuilder().setStringSe…                ).build()");
            return valueBuild7;
        }
        if (!(value instanceof byte[])) {
            throw new java.lang.IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
        }
        androidx.datastore.preferences.PreferencesProto.Value valueBuild8 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setBytes(androidx.datastore.preferences.protobuf.ByteString.copyFrom((byte[]) value)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
        return valueBuild8;
    }

    private final void addProtoEntryToPreferences(java.lang.String name, androidx.datastore.preferences.PreferencesProto.Value value, androidx.datastore.preferences.core.MutablePreferences mutablePreferences) throws androidx.datastore.core.CorruptionException {
        androidx.datastore.preferences.PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        switch (valueCase == null ? -1 : androidx.datastore.preferences.core.PreferencesSerializer.WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new androidx.datastore.core.CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.booleanKey(name), java.lang.Boolean.valueOf(value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.floatKey(name), java.lang.Float.valueOf(value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.doubleKey(name), java.lang.Double.valueOf(value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.intKey(name), java.lang.Integer.valueOf(value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(androidx.datastore.preferences.core.PreferencesKeys.longKey(name), java.lang.Long.valueOf(value.getLong()));
                return;
            case 6:
                androidx.datastore.preferences.core.Preferences.Key<java.lang.String> keyStringKey = androidx.datastore.preferences.core.PreferencesKeys.stringKey(name);
                java.lang.String string = value.getString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "value.string");
                mutablePreferences.set(keyStringKey, string);
                return;
            case 7:
                androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> keyStringSetKey = androidx.datastore.preferences.core.PreferencesKeys.stringSetKey(name);
                java.util.List<java.lang.String> stringsList = value.getStringSet().getStringsList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                mutablePreferences.set(keyStringSetKey, kotlin.collections.CollectionsKt.toSet(stringsList));
                return;
            case 8:
                androidx.datastore.preferences.core.Preferences.Key<byte[]> keyByteArrayKey = androidx.datastore.preferences.core.PreferencesKeys.byteArrayKey(name);
                byte[] byteArray = value.getBytes().toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "value.bytes.toByteArray()");
                mutablePreferences.set(keyByteArrayKey, byteArray);
                return;
            case 9:
                throw new androidx.datastore.core.CorruptionException("Value not set.", null, 2, null);
        }
    }
}
