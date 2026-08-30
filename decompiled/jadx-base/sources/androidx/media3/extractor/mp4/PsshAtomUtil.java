package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class PsshAtomUtil {
    private static final java.lang.String TAG = "PsshAtomUtil";

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, java.util.UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(androidx.media3.extractor.mp4.Atom.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (java.util.UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        } else {
            byteBufferAllocate.putInt(0);
        }
        return byteBufferAllocate.array();
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    public static java.util.UUID parseUuid(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.version;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, java.util.UUID uuid) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        if (!uuid.equals(psshAtom.uuid)) {
            androidx.media3.common.util.Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + psshAtom.uuid + ".");
            return null;
        }
        return psshAtom.schemeData;
    }

    public static androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom(byte[] bArr) {
        java.util.UUID[] uuidArr;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        int iBytesLeft = parsableByteArray.bytesLeft();
        int i = parsableByteArray.readInt();
        if (i != iBytesLeft) {
            androidx.media3.common.util.Log.w(TAG, "Advertised atom size (" + i + ") does not match buffer size: " + iBytesLeft);
            return null;
        }
        int i2 = parsableByteArray.readInt();
        if (i2 != 1886614376) {
            androidx.media3.common.util.Log.w(TAG, "Atom type is not pssh: " + i2);
            return null;
        }
        int fullAtomVersion = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (fullAtomVersion > 1) {
            androidx.media3.common.util.Log.w(TAG, "Unsupported pssh version: " + fullAtomVersion);
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (fullAtomVersion == 1) {
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            uuidArr = new java.util.UUID[unsignedIntToInt];
            for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
                uuidArr[i3] = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
            }
        } else {
            uuidArr = null;
        }
        int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        int iBytesLeft2 = parsableByteArray.bytesLeft();
        if (unsignedIntToInt2 != iBytesLeft2) {
            androidx.media3.common.util.Log.w(TAG, "Atom data size (" + unsignedIntToInt2 + ") does not match the bytes left: " + iBytesLeft2);
            return null;
        }
        byte[] bArr2 = new byte[unsignedIntToInt2];
        parsableByteArray.readBytes(bArr2, 0, unsignedIntToInt2);
        return new androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom(uuid, fullAtomVersion, bArr2, uuidArr);
    }

    public static final class PsshAtom {
        public final java.util.UUID[] keyIds;
        public final byte[] schemeData;
        public final java.util.UUID uuid;
        public final int version;

        PsshAtom(java.util.UUID uuid, int i, byte[] bArr, java.util.UUID[] uuidArr) {
            this.uuid = uuid;
            this.version = i;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }
}
