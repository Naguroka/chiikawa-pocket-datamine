package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class CLSUUID {
    private static final java.lang.String ID_SHA = com.google.firebase.crashlytics.internal.common.CommonUtils.sha1(java.util.UUID.randomUUID().toString() + java.lang.System.currentTimeMillis());
    private static final java.util.concurrent.atomic.AtomicLong sequenceNumber = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.lang.String sessionId;

    CLSUUID() {
        byte[] bArr = new byte[10];
        populateTime(bArr);
        populateSequenceNumber(bArr);
        populatePID(bArr);
        java.lang.String strHexify = com.google.firebase.crashlytics.internal.common.CommonUtils.hexify(bArr);
        this.sessionId = java.lang.String.format(java.util.Locale.US, "%s%s%s%s", strHexify.substring(0, 12), strHexify.substring(12, 16), strHexify.subSequence(16, 20), ID_SHA.substring(0, 12)).toUpperCase(java.util.Locale.US);
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    private void populateTime(byte[] bArr) {
        long time = new java.util.Date().getTime();
        byte[] bArrConvertLongToFourByteBuffer = convertLongToFourByteBuffer(time / 1000);
        bArr[0] = bArrConvertLongToFourByteBuffer[0];
        bArr[1] = bArrConvertLongToFourByteBuffer[1];
        bArr[2] = bArrConvertLongToFourByteBuffer[2];
        bArr[3] = bArrConvertLongToFourByteBuffer[3];
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(time % 1000);
        bArr[4] = bArrConvertLongToTwoByteBuffer[0];
        bArr[5] = bArrConvertLongToTwoByteBuffer[1];
    }

    private void populateSequenceNumber(byte[] bArr) {
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(sequenceNumber.incrementAndGet());
        bArr[6] = bArrConvertLongToTwoByteBuffer[0];
        bArr[7] = bArrConvertLongToTwoByteBuffer[1];
    }

    private void populatePID(byte[] bArr) {
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(java.lang.Integer.valueOf(android.os.Process.myPid()).shortValue());
        bArr[8] = bArrConvertLongToTwoByteBuffer[0];
        bArr[9] = bArrConvertLongToTwoByteBuffer[1];
    }

    private static byte[] convertLongToFourByteBuffer(long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public java.lang.String toString() {
        return this.sessionId;
    }
}
