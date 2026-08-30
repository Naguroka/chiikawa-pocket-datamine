package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: ProtobufExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\t\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"URL_SAFE_AND_NO_WRAP", "", "fromBase64", "Lcom/google/protobuf/ByteString;", "", "urlSafe", "", "toBase64", "toByteString", "Ljava/util/UUID;", "toISO8859ByteString", "toISO8859String", "toUUID", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final com.google.protobuf.ByteString toByteString(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "<this>");
        com.google.protobuf.ByteString byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(java.nio.ByteBuffer.wrap(new byte[16]).order(java.nio.ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(bytes.array())");
        return byteStringCopyFrom;
    }

    public static final java.util.UUID toUUID(com.google.protobuf.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        java.nio.ByteBuffer byteBufferAsReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 36) {
            java.util.UUID uuidFromString = java.util.UUID.fromString(byteString.toStringUtf8());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(uuidString)");
            return uuidFromString;
        }
        if (byteBufferAsReadOnlyByteBuffer.remaining() != 16) {
            throw new java.lang.IllegalArgumentException("Expected 16 byte ByteString or UUID string");
        }
        return new java.util.UUID(byteBufferAsReadOnlyByteBuffer.getLong(), byteBufferAsReadOnlyByteBuffer.getLong());
    }

    public static /* synthetic */ java.lang.String toBase64$default(com.google.protobuf.ByteString byteString, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    public static final java.lang.String toBase64(com.google.protobuf.ByteString byteString, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(byteString.toByteArray(), z ? 10 : 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(this.toByteArray(), flag)");
        return strEncodeToString;
    }

    public static /* synthetic */ com.google.protobuf.ByteString fromBase64$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    public static final com.google.protobuf.ByteString fromBase64(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.google.protobuf.ByteString byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(android.util.Base64.decode(str, z ? 10 : 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return byteStringCopyFrom;
    }

    public static final com.google.protobuf.ByteString toISO8859ByteString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.ISO_8859_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        com.google.protobuf.ByteString byteStringCopyFrom = com.google.protobuf.ByteString.copyFrom(bytes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return byteStringCopyFrom;
    }

    public static final java.lang.String toISO8859String(com.google.protobuf.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        java.lang.String string = byteString.toString(kotlin.text.Charsets.ISO_8859_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "this.toString(Charsets.ISO_8859_1)");
        return string;
    }
}
