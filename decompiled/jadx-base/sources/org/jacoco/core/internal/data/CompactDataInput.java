package org.jacoco.core.internal.data;

/* JADX INFO: loaded from: classes6.dex */
public class CompactDataInput extends java.io.DataInputStream {
    public CompactDataInput(java.io.InputStream inputStream) {
        super(inputStream);
    }

    public int readVarInt() throws java.io.IOException {
        int i = readByte() & 255;
        return (i & 128) == 0 ? i : (i & 127) | (readVarInt() << 7);
    }

    public boolean[] readBooleanArray() throws java.io.IOException {
        int varInt = readVarInt();
        boolean[] zArr = new boolean[varInt];
        int i = 0;
        for (int i2 = 0; i2 < varInt; i2++) {
            if (i2 % 8 == 0) {
                i = readByte();
            }
            zArr[i2] = (i & 1) != 0;
            i >>>= 1;
        }
        return zArr;
    }
}
